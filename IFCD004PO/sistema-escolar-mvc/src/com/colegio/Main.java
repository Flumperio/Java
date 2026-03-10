package com.colegio;

import com.colegio.model.*;
import com.colegio.service.EscolarService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    private static final int PORT = 8080;
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final EscolarService service = new EscolarService();

    public static void main(String[] args) throws IOException {
        System.out.println("🚀 Servidor MVC http://localhost:" + PORT);
        com.sun.net.httpserver.HttpServer server = com.sun.net.httpserver.HttpServer.create();
        server.bind(new InetSocketAddress(PORT), 0);

        // API REST
        server.createContext("/api/escolar/", new ApiHandler());

        // Frontend estático
        server.createContext("/", new StaticHandler());

        server.start();
        System.out.println("✅ Listo! Abre http://localhost:" + PORT);
    }

    static class ApiHandler implements com.sun.net.httpserver.HttpHandler {
        @Override
        public void handle(com.sun.net.httpserver.HttpExchange exchange) throws IOException {
            String path = exchange.getRequestURI().getPath();
            String response = "{}";
            int status = 200;

            try {
                if ("/api/escolar/alumnos".equals(path)) {
                    response = gson.toJson(service.getAlumnos());
                } else if (path.startsWith("/api/escolar/alumno/")) {
                    int idx = Integer.parseInt(path.split("/")[3]);
                    response = gson.toJson(service.getAlumnoPorIndice(idx));
                } // ... igual para admins/profesores
                // (copia el resto del servlet anterior)
            } catch (Exception e) {
                status = 500;
                response = "{\"error\":\"" + e.getMessage() + "\"}";
            }

            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(status, response.getBytes().length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }

    static class StaticHandler implements com.sun.net.httpserver.HttpHandler {
        @Override
        public void handle(com.sun.net.httpserver.HttpExchange exchange) throws IOException {
            String path = exchange.getRequestURI().getPath();
            if (path.equals("/")) path = "/index.html";

            Path file = Paths.get("web" + path);
            if (Files.exists(file)) {
                byte[] content = Files.readAllBytes(file);
                String contentType = getContentType(path);
                exchange.getResponseHeaders().set("Content-Type", contentType);
                exchange.sendResponseHeaders(200, content.length);
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(content);
                }
            } else {
                exchange.sendResponseHeaders(404, -1);
            }
        }
    }

    private static String getContentType(String path) {
        if (path.endsWith(".html")) return "text/html";
        if (path.endsWith(".css")) return "text/css";
        if (path.endsWith(".js")) return "application/javascript";
        return "text/plain";
    }
}
