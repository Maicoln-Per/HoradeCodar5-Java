import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.  */

        Scanner recebeValor = new Scanner(System.in);
        int valores[] = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o " + (i + 1) + "° valor:");
            valores[i] = recebeValor.nextInt();

            for (int j = 0; j < i; j++) {
                if (valores[i] == valores[j]) {
                    System.out.println("Por favor, informe um valor diferente dos anteriores.");
                    i--; // Decrementa i para reavaliar o valor atual
                    break; // Sai do loop de verificação
                }
            }
        }

        int maiorValor = valores[0];
        for (int i = 1; i < 3; i++) {
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
            }
        }
        System.out.println("O maior valor é: " + maiorValor);
    }
}