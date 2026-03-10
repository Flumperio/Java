package Tema_3.Ejercicios_Excepciones;

public class EdadInvalida extends Exception {
    public EdadInvalida (String mensajeError){
        super(mensajeError);
    }
}
