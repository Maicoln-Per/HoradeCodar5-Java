import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alunosAprovados = 0;
        String resposta;
        do {
            double somaNotas = 0;
            for (int i = 1; i <= 6; i++) {
                System.out.print("Informe a nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }
            double mediaFinal = somaNotas / 6;

            if (mediaFinal >= 6.5) {
                alunosAprovados++;
                System.out.printf("\nMédia final: %.2f\n", mediaFinal);
                System.out.println("Aluno Aprovado!");
            } else {
                System.out.printf("\nMédia final: %.2f\n", mediaFinal);
                System.out.println("Aluno Reprovado!");
            }
            System.out.print("\nCalcular a média de outro aluno (Sim/Não)? ");
            resposta = scanner.next();
            resposta = resposta.toUpperCase();
        } while ("SIM".equals(resposta));
        System.out.println("Total de alunos aprovados: " + alunosAprovados);
        scanner.close();
    }
}
