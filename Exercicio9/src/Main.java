import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 9 -  Cansar de Digitar
        //Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
        Scanner recebeValor = new Scanner(System.in);
        int somaValores = 0;
        int valores[] = new int[10];
        for(int i = 0; i < 10; i++) {
            System.out.printf("Insira o %d° valor: ", (i + 1));
            valores[i] = recebeValor.nextInt();
            somaValores += valores[i];
        }
        double media = somaValores/10;
        System.out.printf("Os valores informados foram: %s\n", Arrays.toString(valores));
        System.out.printf("A média aritmética é: %.2f", media);
    }
}