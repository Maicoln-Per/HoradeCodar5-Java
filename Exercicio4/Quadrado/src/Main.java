import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        // Calcular área do quadrado e informar os valores ao usuário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do lado do quadrado:");
        Double lado = scanner.nextDouble();
        Double area = Math.pow(lado, 2);
        System.out.printf("A área do quadrado é de: %.2f", area);
    }
}