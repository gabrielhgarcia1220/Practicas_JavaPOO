package Logica;

public class Alumno {
    
    /* >>> ATRIBUTOS <<< */
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    
    /* >>> CONSTRUCTOR VACIO <<< */
    public Alumno() {
    }

    /* >>> CONSTRUCTOR CARGADO <<< */
    public Alumno(int id, int dni, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    /* >>> GETTERS & SETTERS <<< */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getDNI() {
        return dni;
    }

    public void setDNI(int dni) {
        this.dni = dni;
    }

    /* >>> METODOS <<< */

}
