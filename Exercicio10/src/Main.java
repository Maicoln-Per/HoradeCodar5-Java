import java.util.*;
public class Main {
    public static void main(String[] args) {
        //10 - Parabéns
        //Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).
        Scanner notaAvaliacao = new Scanner(System.in);
        int notas[] = new int[4];
        int somaNotas = 0;

        String respostaUsuario;
        while(true) {
            System.out.println("Deseja ver sua média semestral? (s/n)");
            respostaUsuario = notaAvaliacao.next();
            if ("s".equals(respostaUsuario)) {
                for(int i = 0; i < 4; i++) {
                    System.out.printf("Informe a nota %d:", (i + 1));
                    notas[i] = notaAvaliacao.nextInt();
                    somaNotas += notas[i];
                }
                double mediaAluno = somaNotas/4;
                System.out.println("A soma das notas dá: " + somaNotas);
                System.out.println("A média do semestre é: " + mediaAluno);
                if (mediaAluno >= 6) {
                    System.out.println("PARABÉNS!\nVocê foi Aprovado!");
                } else {
                    System.out.println("Nota insuficiente\nVocê está de Recuperação!");
                }
            } else if ("n".equals(respostaUsuario)){
                System.exit(0);
            } else {
                System.out.println("Informe uma resposta válida!");
            }
        }
    }
}