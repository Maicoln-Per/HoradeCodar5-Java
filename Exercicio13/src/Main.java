import java.util.*;

public class Main {
    public static void main(String[] args) {
        //13 - De quanto até quanto?
        //Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número inteiro: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Informe o segundo número inteiro (maior que o primeiro): ");
        int segundoNumero = scanner.nextInt();
        double media = (primeiroNumero + segundoNumero) / 2;
        System.out.println("A média aritmética é: " + media);
        System.out.printf("Números inteiros entre %d e %d: ", primeiroNumero, segundoNumero);
        for (int i = primeiroNumero + 1; i < segundoNumero; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}