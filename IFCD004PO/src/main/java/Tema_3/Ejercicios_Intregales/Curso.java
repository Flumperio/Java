package Tema_3.Ejercicios_Intregales;

public class Curso {
    //Atributos Privados
    private String  nombreCurso;
    private int     cupoMaximo;
    private int     inscritosActuales;
    //Consturctor Público
    public Curso(String nombreCurso, int cupoMaximo) {
        this.nombreCurso = nombreCurso;
        this.cupoMaximo = cupoMaximo;
    }
    // Getters
    public String getNombreCurso() {
        return nombreCurso;
    }
    public int getCupoMaximo() {
        return cupoMaximo;
    }
    //Métodos públicos
    public void inscribirAlumno (Alumno alumno) throws Exception {
        if (alumno.getEdad() < 16)
            throw new EdadNoValidaException("El alumno " + alumno.getNombre() + " tiene menos de 16 años. No se puede inscribir en el curso.");
        else if (cupoMaximo <= inscritosActuales)
            throw new CursoLlenoException("Se ha alcanzado el cupo máximo para el curso " + this.nombreCurso);
        else {
            this.inscritosActuales += 1;
            System.out.println("Se ha inscrito correctamente al alumno " + alumno.getNombre());
        }
    }
}
