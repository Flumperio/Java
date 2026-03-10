package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_String_Array_Clases;

public class ContadorVocales {
    //Atributos o Variables
    char [] vocales;
    //Constuctor - Se llama a la ejecución de la clase. Se tiene que llamar igual que la clase
    public ContadorVocales () {
    vocales = new char[]{'a', 'e', 'i', 'o', 'u'};
    }
    public int CntVocales (String entada){
        int numeroVocales = 0;
        entada = entada.toLowerCase();
        for (char cnt : entada.toCharArray()){
            for (char vocal : vocales){
                if (cnt == vocal)
                    numeroVocales++;
            }
        }
    return numeroVocales;
    }
}
