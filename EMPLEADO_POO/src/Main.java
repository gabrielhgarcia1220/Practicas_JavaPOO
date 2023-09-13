import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int id;
        String nombre;
        String apellido;
        int salario;
        int incremento; // Porcentaje de incremento del sueldo

        Scanner ingreso = new Scanner(System.in);
                
        System.out.print("\nIngrese el ID del empleado: ");
        id = ingreso.nextInt();
        ingreso.nextLine(); // Limpia la nueva línea después de leer un entero

        System.out.print("Ingrese el APELLIDO del empleado: ");
        apellido = ingreso.nextLine();

        System.out.print("Ingrese el NOMBRE del empleado: ");
        nombre = ingreso.nextLine();

        System.out.print("Ingrese el SALARIO del empleado:$ ");
        salario = ingreso.nextInt();

        System.out.print("Ingrese el PORCENTAJE de incremento salarial del empleado: ");
        incremento = ingreso.nextInt();

        Empleado nEmpleado = new Empleado(id, nombre, apellido, salario, incremento); // nEmpleado => nuevoEmpleado
        nEmpleado.aumentoSalario(incremento);

        System.out.println("|-----------------------------------------------------------------------|");

        System.out.println("\nApellido del empleado: " + nEmpleado.getApellido());
        System.out.println("Nombre del empleado : " + nEmpleado.getNombre());
        System.out.println("Salario:$ " + nEmpleado.getSalario());
        System.out.println("El " + incremento + "% del salario mensual:$ " + (nEmpleado.getSalario()*incremento)/100 + "\n");
    
        System.out.println("|-----------------------------------------------------------------------|");

        System.out.println("\n>>> Salario Anual:$ " + nEmpleado.getSalarioAnual() + "\n");
        
    }
}
