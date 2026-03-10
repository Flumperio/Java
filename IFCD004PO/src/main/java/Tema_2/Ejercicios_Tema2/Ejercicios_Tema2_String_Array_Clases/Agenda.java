package Tema_2.Ejercicios_Tema2.Ejercicios_Tema2_String_Array_Clases;

public class Agenda {
    //Definimos las variables de la clase agenda. Usamos un array de contactos para almacenar los contactos.
    private Contacto[] contactosAgenda;
    //Constructor. inicializamos el array de la agenda.
    public Agenda(int size){
        this.contactosAgenda = new Contacto[size];
    }
    //Métodos privados
    private void aumentarContactos(){
        int cnt = this.contactosAgenda.length;
        Contacto[] nuevaAgenda = new Contacto[cnt + 1];
        for (int cnt1 = 0; cnt1 < cnt; cnt1++){
            nuevaAgenda[cnt1] = this.contactosAgenda[cnt1];
        }
        this.contactosAgenda = nuevaAgenda;
    }

    //Métodos públicos.
    public void agregarContacto(Contacto entradaContacto){
        int cnt = 0;
        boolean full = true;
        //Buscamos un null para ver si tenemos posición de insertado
        for (int contact = 0; contact < this.contactosAgenda.length; contact++){
            if (this.contactosAgenda[contact] == null)
                full = false;
        }
        //Si no hay aumentamos uno
        if (full)
            aumentarContactos();
        //Insertamos el nombre en el primer lugar que hay disponible.
        while (cnt < contactosAgenda.length){
            if (this.contactosAgenda[cnt] == null) {
                this.contactosAgenda[cnt] = entradaContacto;
                return;
            }
            cnt++ ;
        }
    }
    public void imprimirAgenda(){
        int cnt = 0;
        System.out.println("\n------------------------------------------------");
        while (cnt < this.contactosAgenda.length ){
            if (this.contactosAgenda[cnt] != null) {
                System.out.println(this.contactosAgenda[cnt].getNombreContacto() + " -----> " + this.contactosAgenda[cnt].getTelefonoContacto());
            }
            cnt++;
        }
        System.out.println("------------------------------------------------\n");
    }
    public boolean borrarContacto(String nombreContacto){
        for (int contact = 0; contact < this.contactosAgenda.length; contact++){
            if (this.contactosAgenda[contact].getNombreContacto() == nombreContacto) {
                System.out.println("Se ha borrado el contacto: " + nombreContacto + " Correctamente.");
                contactosAgenda[contact] = null;
                return true;
            }
        }
        System.out.println("No se ha encontrado el contacto solicitado. ");
        return false;
    }
    public boolean buscarContacto(String nombreContacto){
        for (int contact = 0; contact < this.contactosAgenda.length; contact++){
            if (this.contactosAgenda[contact].getNombreContacto() == nombreContacto) {
                System.out.println("Se ha encontrado el contacto: " + nombreContacto +
                        ". Su número de teléfono es: " + this.contactosAgenda[contact].getTelefonoContacto());
                return true;
            }
        }
        System.out.println("No se ha encontrado el contacto solicitado. ");
        return false;
    }
}
