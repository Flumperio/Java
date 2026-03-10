package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_String_Array_Clases;

public class PromedioArreglo {
    //Atributos o Variables
    double promedio;

    //Constuctor - Se llama a la ejecución de la clase. Se tiene que llamar igual que la clase
    public PromedioArreglo() {
        promedio = 0;
    }

    public double promedio(int[] entrada) {
        double  sumaTotal = 0;
        int     cnt = 0;
        while (cnt < entrada.length){
            sumaTotal += entrada[cnt];
            cnt++;
        }
        promedio = sumaTotal / cnt;
    return promedio;
    }
}
