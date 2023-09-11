public class Alumno {

    /* »»»» ATRIBUTOS «««« */
    private String nombre;
    private String apellido;
    private int dni;
    private int legajo;

    /* »»»» CONSTRUCTOR VACIO «««« */
    public Alumno() {
    }

    /* »»»» CONSTRUCTOR CARGADO «««« */
    public Alumno(String nombre, String apellido, int dni, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
    }

    /* GETTERS & SETTERS */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String mostrarNota(int nota){

        if(nota >= 6){
            return "APROBADO";
        }else if(nota > 0 && nota <6){
            return "DESAPROBADO";
        }else{
            return "Nota ingresada no permitida";
        }
    }

    public void verNota(double nota) {
    }    
}
