import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Faça um programa que leia 5  valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
        Scanner recebe = new Scanner(System.in);
        int[] valores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº valor: ", (i + 1) );
            valores[i] = recebe.nextInt();
        }
        Arrays.sort(valores);
        int somaValores = valores[4] + valores[3];

        System.out.printf("A soma dos 2 maiores valores é: %d", somaValores);
    }
}