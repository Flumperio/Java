//PROBLEMAS PROPUESTOS
//
//5. Mostrar los primeros 10 cuadrados (1², 2², …).

package Tema_2.Ejercicios_Tema2;


public class Ejercicio44 {
    public static void main(String[] args) {
        //Definimos las variables necesarias
        int resultado = 1;
        for (int numero = 1; numero <= 10; numero += 1){
            for (int cuadrado = 1; cuadrado <=2; cuadrado +=1) {
                resultado = resultado * numero;
            }
            System.out.println("El cuadrado de " + numero + " es: " + resultado);
            resultado = 1;
        }
    }
}
