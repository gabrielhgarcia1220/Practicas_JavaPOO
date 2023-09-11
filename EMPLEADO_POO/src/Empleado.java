public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private int salario;
    private int incremento;

    /* »»»» CONSTRUCTOR «««« */
    public Empleado(int id, String nombre, String apellido, int salario, int incremento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.incremento = incremento;
    }
    
    /* »»»» GETTERS & SETTERS «««« */
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public int SalarioAnual(){
        return (this.salario * 12);
    }

    public int aumentoSalario(){
        return ((this.salario*incremento)/100)+this.salario;
    }

    public int salarioAnualTotal(){
        return (aumentoSalario()*12);
    }

    @Override
    public String toString(){
        return "Empleado[id = " + id + "nombre= " + nombre + "apellido= " + apellido + "salario= " + salario + "]";
    }
}
