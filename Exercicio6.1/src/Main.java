import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles.  */

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner recebeValor = new Scanner(System.in);

        // Declara um array para armazenar 4 valores inteiros
        int valores[] = new int[4];

        // Loop para ler 4 valores diferentes do usuário
        for (int i = 0; i < 4; i++) {
            // Solicita ao usuário que informe o valor atual
            System.out.println("Informe o " + (i + 1) + "° valor:");

            // Lê o valor informado pelo usuário
            valores[i] = recebeValor.nextInt();

            // Verifica se o valor já foi informado anteriormente
            for (int j = 0; j < i; j++) {
                // Se o valor atual for igual a algum valor anterior, solicita um novo valor
                if (valores[i] == valores[j]) {
                    System.out.println("Por favor, informe um valor diferente dos anteriores.");
                    i--; // Decrementa i para reavaliar o valor atual
                    break; // Sai do loop de verificação
                }
            }
        }

        // Encontra o maior valor entre os 4 valores informados
        int maiorValor = valores[0];
        for (int i = 1; i < 4; i++) {
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
            }
        }

        // Exibe o resultado da variável maiorValor entre os 4 informados
        System.out.println("O maior valor é: " + maiorValor);
    }
}