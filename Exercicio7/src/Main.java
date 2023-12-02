import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         /*
         Qual o quê?
         Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
         */
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2, valor3;

        do {
            System.out.println("Digite o primeiro valor: ");
            valor1 = scanner.nextInt();
            System.out.println("Digite o segundo valor: ");
            valor2 = scanner.nextInt();
            System.out.println("Digite o terceiro valor: ");
            valor3 = scanner.nextInt();

            if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
                System.out.println("Por favor, insira valores diferentes!");
            }
        } while (valor1 == valor2 || valor1 == valor3 || valor2 == valor3);

        int maior, segundoMaior;

        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
            segundoMaior = (valor2 > valor3) ? valor2 : valor3;
        } else if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
            segundoMaior = (valor1 > valor3) ? valor1 : valor3;
        } else {
            maior = valor3;
            segundoMaior = (valor1 > valor2) ? valor1 : valor2;
        }

        int somaDosMaiores = maior + segundoMaior;

        System.out.printf("A soma dos maiores números é: %d", somaDosMaiores);
    }
}