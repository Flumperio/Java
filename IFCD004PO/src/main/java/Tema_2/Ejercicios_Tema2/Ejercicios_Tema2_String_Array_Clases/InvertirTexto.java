package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_String_Array_Clases;

public class InvertirTexto {
    //Atributos o Variables
    String resultado;

    //Constuctor - Se llama a la ejecución de la clase. Se tiene que llamar igual que la clase
    public InvertirTexto(String entrada) {
        int cnt1 = entrada.length() - 1;
        int cnt2 = 0;
        char [] invertido = new char[entrada.length()];
        while (cnt1 >= 0){
            invertido[cnt2] = entrada.charAt(cnt1);
            cnt1--;
            cnt2++;
        }
        this.resultado = new String(invertido);
    }
    public String getResultado() {
        return resultado;
    }
}
