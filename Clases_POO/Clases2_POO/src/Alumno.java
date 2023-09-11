public class Alumno {
    
    /* »»»» ATRIBUTOS «««« */
    private String apellido;
    private String nombre;
    private int dni;
    private int legajo;
    
    /* »»»» CONSTRUCTOR VACIO «««« */
    public Alumno() {
    }

    /* »»»» CONSTRUCTOR CARGADO «««« */
    public Alumno(String apellido, String nombre, int dni, int legajo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = legajo;
    }

    /* »»»» GETTERS & SETTERS «««« */
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    /* »»»» METODOS «««« */
    public void verNota(float nota){

        if(nota >= 6){
            System.out.println("\n>>> Legajo: " + getLegajo());
            System.out.println(">>> Apellido: " + getApellido());
            System.out.println(">>> Nombre: " + getNombre());
            System.out.println("\n\tAPROBADO/A");
        }else if(nota > 0 && nota <6){
            System.out.println("\n>>> Legajo: " + getLegajo());
            System.out.println(">>> Apellido: " + getApellido());
            System.out.println(">>> Nombre: " + getNombre());
            System.out.println("\n\tDESAPROBADO/A");
        }else{
            System.out.println("NOTA INVALIDA");
        }
    }
}
