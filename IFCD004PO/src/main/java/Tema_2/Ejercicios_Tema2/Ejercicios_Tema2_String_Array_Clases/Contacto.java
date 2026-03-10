package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_String_Array_Clases;

public class Contacto {
    //Definimos las variables de la clase contacto
    private String nombreContacto;
    private String telefonoContacto;
    //Constructor del contacto que tiene de entrada el nombre y el telefono.
    public Contacto (String nombre, String telefono){
        this.nombreContacto = nombre;
        this.telefonoContacto = telefono;
    }
    //Getters y/o Setter de contactos
    public String getNombreContacto() {
        return nombreContacto;
    }
    public String getTelefonoContacto() {
        return telefonoContacto;
    }
    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }
    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
}

