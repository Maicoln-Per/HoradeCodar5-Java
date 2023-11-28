import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calcular a área de um losango e informar os valores ao usuário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do diagonal maior:");
        Double diagonalMaior = scanner.nextDouble();
        System.out.println("Informe o valor do diagonal menor:");
        Double diagonalMenor = scanner.nextDouble();
        Double area = (diagonalMaior * diagonalMenor)/2;
        System.out.printf("O cálculo das diagonais %.2f e %.2f resulta em: %.2f \nAo final do cálculo com a divisão por 2, a área do losango resultará em: %.2f",diagonalMaior, diagonalMenor, (diagonalMaior*diagonalMenor), area);
    }
}