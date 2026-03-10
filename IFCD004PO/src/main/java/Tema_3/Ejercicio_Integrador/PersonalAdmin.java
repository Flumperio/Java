package Tema_3.Ejercicio_Integrador;

public class PersonalAdmin {
    //Atributos - Privados
    private String  nombre;
    private String  cargo;
    private String  area;
    private String  tipo;
    private double  sueldoMensual;
    private double  aniosAntiguedad;
    //Constuctor público
    public PersonalAdmin(String nombre, String cargo, String area, String tipo,
                         double sueldoMensual, double aniosAntiguedad) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.area = area;
        this.tipo = tipo;
        this.sueldoMensual = sueldoMensual;
        this.aniosAntiguedad = aniosAntiguedad;
    }
    //Setters y Getters - Públicos. Métodos.
    public String getNombre() {
        return nombre;
    }
    public String getCargo() {
        return cargo;
    }
    public String getArea() {
        return area;
    }
    public double getSueldoMensual() {
        return sueldoMensual;
    }
    public double getAniosAntiguedad() {
        return aniosAntiguedad;
    }
    public String getTipo() {
        return tipo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    public void setAniosAntiguedad(double aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
