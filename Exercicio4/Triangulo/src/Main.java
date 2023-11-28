import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Calcular área do triângulo e informar os valores ao usuário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da base do triângulo:");
        Double base = scanner.nextDouble();
        System.out.println("Informe o valor da altura do triângulo:");
        Double altura = scanner.nextDouble();
        Double area = (base * altura) / 2;
        System.out.printf("Área do triângulo: %.2f", area);
    }
}