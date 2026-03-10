//PROBLEMAS PROPUESTOS
//
//6. Mostrar los primeros 10 cubos (1³, 2³, …).

package Tema_2.Ejercicios_Tema2;


public class Ejercicio45 {
    public static void main(String[] args) {
        //Definimos las variables necesarias
        int resultado = 1;
        for (int numero = 1; numero <= 10; numero += 1){
            for (int cubo = 1; cubo <=3; cubo +=1) {
                resultado = resultado * numero;
            }
            System.out.println("El cubo de " + numero + " es: " + resultado);
            resultado = 1;
        }
    }
}
