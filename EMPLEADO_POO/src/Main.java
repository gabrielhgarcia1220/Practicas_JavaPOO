import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int id = 0;
        String nombre = "";
        String apellido = "";
        int salario = 0;
        int incremento = 0;

        Scanner ingresoInt = new Scanner(System.in);
        Scanner IngresoString = new Scanner(System.in);

        Empleado nEmpleado = new Empleado(id, nombre, apellido, salario, incremento); // nEmpleado => nuevoEmpleado

        
        System.out.print("\nIngrese el ID del empleado: ");
        nEmpleado.setId(ingresoInt.nextInt());

        System.out.print("Ingrese el APELLIDO del empleado: ");
        nEmpleado.setApellido(IngresoString.nextLine());

        System.out.print("Ingrese el NOMBRE del empleado: ");
        nEmpleado.setNombre(IngresoString.nextLine());

        System.out.print("Ingrese el SALARIO del empleado:$ ");
        nEmpleado.setSalario(ingresoInt.nextInt());

        System.out.print("Ingrese el PORCENTAJE de incremento salarial del empleado: ");
        nEmpleado.setIncremento(ingresoInt.nextInt());
        
        System.out.println("|-----------------------------------------------------------------------|");

        System.out.println("\nApellido del empleado: " + nEmpleado.getApellido());
        System.out.println("Nombre del empleado : " + nEmpleado.getNombre());
        System.out.println("Salario:$ " + nEmpleado.getSalario());
        System.out.println("El " + nEmpleado.getIncremento() + "% del salario mensual:$ " + (nEmpleado.getSalario()*nEmpleado.getIncremento())/100);
        System.out.println("Incremento del " + nEmpleado.getIncremento() + "% del salario mensual:$ " + nEmpleado.aumentoSalario() + "\n");

        System.out.println("|-----------------------------------------------------------------------|");

        System.out.println("\n>>> Salario Anual:$ " + nEmpleado.SalarioAnual());
        System.out.println(">>> Salario anual con el incremento del " + nEmpleado.getIncremento() + "% : $" + nEmpleado.salarioAnualTotal() + "\n");

    }
}
