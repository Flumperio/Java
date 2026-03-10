package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_String_Array_Clases;

public class MayorElemento {
    //Atributos o Variables
    int numeroMayor;
    //Constructor, inicializamos las variables
    //o lo que necesitemos a la hora de crear el objeto
    public MayorElemento(){
        numeroMayor = 0;
    }
    //Metodo publico, definimos los metodos

    public int getNumeroMayor(int[] entrada) {
        for (int cnt : entrada){
            if (cnt > numeroMayor)
                numeroMayor = cnt;
        }
        return numeroMayor;
    }
}
