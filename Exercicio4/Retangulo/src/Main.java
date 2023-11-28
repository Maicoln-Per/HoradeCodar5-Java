import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calcular área do retângulo e informar os valores ao usuário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da base do retângulo:");
        Double base = scanner.nextDouble();
        System.out.println("Informe o valor da altura do retângulo:");
        Double altura = scanner.nextDouble();
        Double area = base * altura;
        System.out.printf("A área do retângulo com o cálculo de %.1f x %.1f é igual a = %.1f", base, altura, area);
    }
}