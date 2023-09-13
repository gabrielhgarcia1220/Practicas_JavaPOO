public class Empleado {

    private int id;
    private String nombre;
    private String apellido;
    private int salario;
    

    /* »»»» CONSTRUCTOR «««« */
    public Empleado(int id, String nombre, String apellido, int salario, int incremento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
   
    // GETTERS
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String nombreCompleto(){
        return (getNombre()+" "+getApellido());
    }

    public int getSalario() {
        return salario;
    }
    
    public int getSalarioAnual(){
        return getSalario()*12;
    }

    // SETTER
    public void setSalario(int salario) {
        this.salario = salario;
    }

    // METODO
    public int aumentoSalario(int incremento){
        return getSalario()*incremento;
    }

    @Override
    public String toString(){
        return "Empleado[id = " + id + "nombre= " + nombre + "apellido= " + apellido + "salario= " + salario + "]";
    }
}
