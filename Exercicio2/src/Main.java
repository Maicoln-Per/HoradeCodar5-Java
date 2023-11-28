import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* 2 -  Hello Clarice
            Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
         */
        Scanner informaNome = new Scanner(System.in);
        System.out.println("Qual é o seu nome? Digite embaixo:");
        String nomeUsuario = informaNome.next();
        System.out.printf("Olá, %s!", nomeUsuario);
    }
}