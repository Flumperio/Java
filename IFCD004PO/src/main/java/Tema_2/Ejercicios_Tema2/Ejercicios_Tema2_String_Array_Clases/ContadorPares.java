package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_String_Array_Clases;

public class ContadorPares {
    //Atributos o Variables
    int contador;

    //Constuctor - Se llama a la ejecución de la clase. Se tiene que llamar igual que la clase

    public ContadorPares(int[] entrada) {
        int cnt = 0;
        while (cnt < entrada.length) {
            if (entrada[cnt] % 2 == 0)
                this.contador++;
            cnt++;
        }
    }
    public int getContador() {
        return contador;
    }
}
