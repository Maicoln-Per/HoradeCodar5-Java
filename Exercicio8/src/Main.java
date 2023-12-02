import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo. O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
        Scanner recebe = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        int numerador = recebe.nextInt();
        System.out.println("Insira o segundo valor");
        int denominador = recebe.nextInt();
        while(denominador <= 0) {
            System.out.println("Insira um número diferente de zero ou negativo!");
            denominador = recebe.nextInt();
        }
        int divisao = numerador/denominador;
        System.out.println("O resultado da divisão: " + divisao);
    }
}