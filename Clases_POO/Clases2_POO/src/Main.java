import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        String apellido;
        String nombre;
        int dni, legajo;
        float nota;

        Scanner ingreso = new Scanner(System.in);

        System.out.print("\nIngrese el APELLIDO del alumno/a: ");
        apellido = ingreso.nextLine();

        System.out.print("Ingrese el NOMBRE del alumno/a: ");
        nombre = ingreso.nextLine();

        System.out.print("Ingrese el DNI del alumno/a: ");
        dni = ingreso.nextInt();

        System.out.print("Ingrese el LEGAJO del alumno/a: ");
        legajo = ingreso.nextInt();

        System.out.print("Ingrese la NOTA del alumno/a: ");// La nota con decimal se ingresa con la coma, ej: 7,8
        nota = ingreso.nextFloat();

        Alumno alu = new Alumno(apellido, nombre, dni, legajo);

        alu.verNota(nota);
    }
}
