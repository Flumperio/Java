package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_String_Array_Clases;

public class Main_Ejercicio6 {
    public static void main(String[] args){
        //Definimos variables
        boolean resultado = true; //Definimos esta variable para un posible control de errores.
        //Definimos los objetos de clase
        Agenda agendaDirectivos = new Agenda(1);

        //Logica del programa
        agendaDirectivos.agregarContacto(new Contacto("Ana", "676300300"));
        agendaDirectivos.agregarContacto(new Contacto("Carlos", "6766767676"));
        agendaDirectivos.agregarContacto(new Contacto("Paco", "788899766"));
        agendaDirectivos.agregarContacto(new Contacto("Lola", "7599399459"));

        agendaDirectivos.imprimirAgenda();

        resultado = agendaDirectivos.borrarContacto("Paco");

        agendaDirectivos.imprimirAgenda();

        agendaDirectivos.agregarContacto(new Contacto("Alfonso", "7599399459"));

        agendaDirectivos.imprimirAgenda();

        resultado = agendaDirectivos.buscarContacto("Ana");
        resultado = agendaDirectivos.buscarContacto("Lucia");

    }
}
