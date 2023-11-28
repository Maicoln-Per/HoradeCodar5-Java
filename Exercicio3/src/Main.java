import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* 3 - A Bit of Information
        Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
       */
        Scanner recebe = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nomeUsuario = recebe.next();
        System.out.println("Digite sua idade:");
        int idadeUsuario = recebe.nextInt();
        System.out.printf("Olá, %s, você tem %d anos de idade!", nomeUsuario, idadeUsuario);
    }
}