import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* 5 - 1, 2 e 3
           Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.
        */
        Scanner recebeValor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numeroUsuario = recebeValor.nextInt();
        if (numeroUsuario == 0) {
            System.out.println("Número Neutro!");
        } else if (numeroUsuario > 0) {
            System.out.println("Número Positivo!");
        } else {
            System.out.println("Número Negativo!");
        }
    }
}