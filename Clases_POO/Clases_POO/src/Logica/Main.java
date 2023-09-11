package Logica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int id = 0;
        int dni = 0;
        String nombre = "";
        String apellido = "";

        Scanner teclado = new Scanner(System.in);

        /* System.out.print("\nIngrese el apellido: ");
        apellido = teclado.nextLine();

        System.out.print("Ingrese el nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Ingrese el DNI: ");
        dni = teclado.nextInt();

        System.out.print("Ingrese el ID: ");
        id = teclado.nextInt();

        Alumno alu = new Alumno(id, dni, nombre, apellido);*/
        
        Alumno alu = new Alumno(id, dni, nombre, apellido);

        System.out.print("\nIngrese el apellido: ");
        alu.setApellido(teclado.nextLine());

        System.out.print("Ingrese le nombre: ");
        alu.setNombre(teclado.nextLine());

        System.out.print("Ingrese el DNI: ");
        alu.setDNI(teclado.nextInt());

        System.out.print("Ingrese el ID: ");
        alu.setId(teclado.nextInt()); 

        System.out.println("\nNombre del Alumno/a: " + alu.getNombre());
        System.out.println("Apellido del Alumno/a: " + alu.getApellido());
        System.out.println("DNI del Alumno/a: " + alu.getDNI());
        System.out.println("ID del Alumno/a: " + alu.getId() + "\n");
    }
}
