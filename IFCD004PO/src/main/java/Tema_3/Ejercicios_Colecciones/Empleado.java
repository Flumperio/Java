package Tema_3.Ejercicios_Colecciones;

public class Empleado {
    //Clases Private
    private String  nombre ="";
    private String  departamento = "";
    private int     salario = 0;
    //Consturctor - Publico
    public Empleado (String nNombre, String nDepartamento, int nSalario){
            this.nombre = nNombre;
            this.departamento = nDepartamento;
            this.salario = nSalario;
        }
    //Metodos Publicos
    public String getNombre(){
            return this.nombre;
        }
    public String getDepartamento(){
            return this.departamento;
        }
    public int getSalario(){
            return this.salario;
        }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
        }
    public void setNombre(String nombre) {
        this.nombre = nombre;
        }
    public void setSalario(int salario) {
            this.salario = salario;
        }
}

