import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Calcular a área de um trapézio e informar os valores ao usuário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da base maior:");
        Double baseMaior = scanner.nextDouble();
        System.out.println("Informe o valor da base menor:");
        Double baseMenor = scanner.nextDouble();
        System.out.println("Informe o valor da altura");
        Double h = scanner.nextDouble();
        Double area = (baseMaior + baseMenor) * h/2;
        System.out.printf("%.2f + %.2f = %.2f\n%.2f x %.2f = %.2f\n%.2f / 2\nÁrea do trapézio é igual a: %.2f", baseMaior, baseMenor, (baseMaior + baseMenor), (baseMaior + baseMenor), h, ((baseMaior + baseMenor) * h), ((baseMaior + baseMenor) * h),area);
    }
}