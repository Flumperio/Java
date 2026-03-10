//Ejercicio 1: Cajero automático y saldo insuficiente
//        Situación
//Un banco quiere simular el funcionamiento básico de un cajero automático. Si un cliente intenta
//retirar más dinero del que tiene en su cuenta, el sistema debe lanzar una excepción y mostrar
//un mensaje claro sin “romper” el programa.
//Orden para el alumnado
//1. Crea una excepción personalizada llamada SaldoInsuficienteException que herede
//de Exception.
//        2. Crea una clase CuentaBancaria con:
//        • Atributo privado double saldo.
//        • Constructor que reciba el saldo inicial.
//        • Método depositar(double monto) que sume al saldo.
//        • Método retirar(double monto) que:
//        • Lance SaldoInsuficienteException si monto es mayor que el saldo.
//        • Descuente el monto del saldo en caso contrario.
//        • Método getSaldo() para consultar el saldo.
//        3. Crea una clase Cajero con un main que:
//        • Cree una cuenta con saldo inicial de 200.
//        • Intente retirar 100 (debe funcionar).
//        • Intente retirar 150 (debe lanzar la excepción).
//        • Capture la excepción y muestre el mensaje al usuario.

package Tema_3.Ejercicios_Intregales;

import java.util.HashMap;
import java.util.Map;

public class Cajero {
    public static void main (String[] args) {
        //Definimos las variables
        Map<String, CuentaBancaria> clientesBanco= new HashMap<>();
        clientesBanco.put("Carlos", new CuentaBancaria(200));
        //Logica del programa
        try {
            clientesBanco.forEach((k, v) -> {
                System.out.println(k + "-->" + v.getSaldo());
            });
            clientesBanco.get("Carlos").retirar(100);
            clientesBanco.get("Carlos").retirar(1000);
            System.out.println(clientesBanco.get("Carlos").getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
