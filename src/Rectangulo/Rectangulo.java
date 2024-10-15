package rectangulo;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la altura del rectangulo: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite la base del rectangulo: ");
        double base = scanner.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println("El área del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}
