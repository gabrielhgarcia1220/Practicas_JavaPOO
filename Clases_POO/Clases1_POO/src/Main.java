import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        String nombre = "";
        String apellido = "";
        int dni = 0;
        int legajo = 0;
        int nota;

        Scanner teclado1 = new Scanner(System.in);

        Alumno alu1 = new Alumno(); // Llama al constructo vacio.
        Alumno alu2 = new Alumno(nombre, apellido, dni, legajo); // Llama al constructor cargado.

        /* --- Ingreso de los datos --- */
        System.out.print("\n\tINGRESO DE DATOS DE ALUMNO 1");

        System.out.print("\nIngrese Apellido del alumno/a: ");
        alu1.setApellido(teclado1.nextLine());

        System.out.print("Ingrese Nombre del alumno/a: ");
        alu1.setNombre(teclado1.nextLine());

        System.out.print("Ingrese el DNI del alumno/a: ");
        alu1.setDni(teclado1.nextInt());

        System.out.print("Ingrese el LEGAJO del alumno/a: ");
        alu1.setLegajo(teclado1.nextInt());

        System.out.print("Ingrese la NOTA del alumno/a: ");
        nota = teclado1.nextInt();

        /* --- MOSTRAR INFO --- */
        System.out.println("\n>>> Legajo del alumno/a: " + alu1.getLegajo());
        System.out.println(">>> Apellido del alumno/a: " + alu1.getApellido());
        System.out.println(">>> Nombre del alumno/a: " + alu1.getNombre());
        System.out.println(">>> DNI del alumno/a: " + alu1.getDni());
        System.out.println("\n\t" + alu1.mostrarNota(nota) + "\n");

        System.out.println("----------------------------------------------------------------");

        Scanner teclado2 = new Scanner(System.in);
        
        System.out.print("\n\tINGRESO DE DATOS DE ALUMNO 2");

        System.out.print("\nIngrese Apellido del alumno/a: ");
        alu2.setApellido(teclado1.nextLine());

        System.out.print("Ingrese Nombre del alumno/a: ");
        alu2.setNombre(teclado2.nextLine());

        System.out.print("Ingrese el DNI del alumno/a: ");
        alu2.setDni(teclado2.nextInt());

        System.out.print("Ingrese el LEGAJO del alumno/a: ");
        alu2.setLegajo(teclado2.nextInt());

        System.out.print("Ingrese la NOTA del alumno/a: ");
        nota = teclado2.nextInt();

        /* --- MOSTRAR INFO --- */
        System.out.println("\n>>> Legajo del alumno/a: " + alu2.getLegajo());
        System.out.println(">>> Apellido del alumno/a: " + alu2.getApellido());
        System.out.println(">>> Nombre del alumno/a: " + alu2.getNombre());
        System.out.println(">>> DNI del alumno/a: " + alu2.getDni());
        System.out.println("\n\t" + alu2.mostrarNota(nota) + "\n");
    }
}
