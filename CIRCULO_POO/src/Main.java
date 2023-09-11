import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        double radio = 0;

        Scanner ingreso = new Scanner(System.in);

        Circulo nuevoCirculo = new Circulo(radio);

        System.out.print("\n>> Ingrese el radio del circulo: ");
        radio = ingreso.nextDouble();

        nuevoCirculo.setRadio(radio);

        System.out.println("\n" + nuevoCirculo.getRadio());
        System.out.println("\n|-- Area del circulo: " + nuevoCirculo.getArea());
        System.out.println("|-- Circunferencia de circulo: " + nuevoCirculo.getCircunferencia() + "\n");
    }
}
