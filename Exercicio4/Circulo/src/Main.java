import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Calcular área do circulo e informar os valores ao usuário.
        Scanner scanner = new Scanner(System.in);
        Double PI = Math.PI;
        System.out.println("Informe o valor do raio do círculo:");
        Double raio = scanner.nextDouble();
        Double area = PI * Math.pow(raio, 2);
        System.out.println("π x " + raio + "² = " + String.format("%.2f", area));
        System.out.println("Área do círculo: " + String.format("%.2f",area));
    }
}