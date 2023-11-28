import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        // Calcular área de um paralelogramo e informar os valores ao usuário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da base:");
        Double base = scanner.nextDouble();
        System.out.println("Informe o valor da altura:");
        Double altura = scanner.nextDouble();
        Double area = base * altura;
        System.out.printf("A área do paralelogramo é de: %.2f", area);
    }
}