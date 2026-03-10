//Ejercicio 4 – Uso combinado de Math y time
//Genera automáticamente un array de 6 números aleatorios entre 1 y 60, indicando:
//        • Fecha y hora del sorteo
//• Valor máximo (Math.max)
//• Valor mínimo (Math.min)
//• Suma total

package Tema_3.Ejercicios_Librerias;

//Importamos librerias.
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period; // Esto es solo para fechas
import java.time.Duration; //Esto es solo para la duración entre horas.
import java.util.Arrays;
import java.util.Scanner;
//La clase Math, ya está incorporada en java.lang. por lo que no hay que importarla.


public class Ejercicio_4 {
    public static void main(String[] args){
        //Definimos las variables.
        Scanner         teclado = new Scanner(System.in);
        int[]           numerosSorteo = new int[6];
        int             valorMaximo = 60;
        int             valorMinimo = 1;
        LocalDateTime   fechaSorteo;
        int             numeroMaximo = 0;
        int             numeroMinimo = 0;
        //Introducción de datos
        for (int cnt = 0; cnt < 6; cnt++){
            numerosSorteo[cnt] = (int) (Math.random() * valorMaximo) + valorMinimo;
            for (int duplicado = 0; duplicado < cnt; duplicado++){
                if (numerosSorteo[duplicado] ==  numerosSorteo[cnt])
                    cnt--;
            }
            if (numeroMaximo < numerosSorteo[cnt])
                numeroMaximo = numerosSorteo[cnt];
            if ((numeroMinimo > numerosSorteo[cnt]) || (cnt == 0))
                numeroMinimo = numerosSorteo[cnt];
        }
        fechaSorteo = LocalDateTime.now();
        //Impresión de datos
        System.out.println("Los números para el sorteo del día: " + fechaSorteo.getDayOfMonth() + " de " +
                fechaSorteo.getMonth() + " de " + fechaSorteo.getYear() + ": ");
        System.out.println(Arrays.toString(numerosSorteo));
        System.out.println("El número máximo ha sido el: " + numeroMaximo + " y el mínimo: " + numeroMinimo + ".");
    }
}
