package com.colegio;

import com.colegio.model.*;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    private static final int PORT = 8080;
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) throws IOException {
        System.out.println("🚀 Servidor MVC http://localhost:" + PORT);
        var server = com.sun.net.httpserver.HttpServer.create();
        server.bind(new InetSocketAddress(PORT), 0);

        // API REST
        server.createContext("/api/", new ApiHandler());
        // Frontend estático
        server.createContext("/", new StaticHandler());

        server.start();
        System.out.println("✅ Listo! Abre http://localhost:" + PORT);
    }

    // CONTROLLER + SERVICE INTEGRADO
    static class ApiHandler implements com.sun.net.httpserver.HttpHandler {
        @Override
        public void handle(com.sun.net.httpserver.HttpExchange exchange) throws IOException {
            String path = exchange.getRequestURI().getPath();
            String response = "{}";

            try {
                if ("/api/alumnos".equals(path)) {
                    response = gson.toJson(cargarAlumnos());
                } else if (path.startsWith("/api/alumno/")) {
                    int idx = Integer.parseInt(path.split("/")[2]);
                    response = gson.toJson(getAlumnoPorIndice(idx));
                } else if ("/api/admins".equals(path)) {
                    response = gson.toJson(cargarAdmins());
                } else if (path.startsWith("/api/admin/")) {
                    int idx = Integer.parseInt(path.split("/")[2]);
                    response = gson.toJson(getAdminPorIndice(idx));
                } else if ("/api/profesores".equals(path)) {
                    response = gson.toJson(cargarProfesores());
                } else if (path.startsWith("/api/profesor/")) {
                    int idx = Integer.parseInt(path.split("/")[2]);
                    response = gson.toJson(getProfesorPorIndice(idx));
                }
            } catch (Exception e) {
                response = "{\"error\":\"" + e.getMessage() + "\"}";
            }

            exchange.getResponseHeaders().set("Content-Type", "application/json; charset=UTF-8");
            exchange.getResponseHeaders().set("Access-Control-Allow-Origin", "*");
            exchange.sendResponseHeaders(200, response.getBytes(StandardCharsets.UTF_8).length);
            try (var os = exchange.getResponseBody()) {
                os.write(response
