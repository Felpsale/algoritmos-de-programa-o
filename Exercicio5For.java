package Aula7;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAprovados = 0, totalExame = 0, totalReprovados = 0;
        double somaClasse = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("--- Aluno " + i + " ---");
            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();
            
            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2;
            somaClasse += media;

            System.out.println("Média do aluno: " + media);
            
            if (media <= 3.0) {
                System.out.println("Situação: REPROVADO");
                totalReprovados++;
            } else if (media < 7.0) {
                System.out.println("Situação: EXAME");
                totalExame++;
            } else {
                System.out.println("Situação: APROVADO");
                totalAprovados++;
            }
        }

        System.out.println("\n--- Resumo da Classe ---");
        System.out.println("Total de alunos aprovados: " + totalAprovados);
        System.out.println("Total de alunos de exame: " + totalExame);
        System.out.println("Total de alunos reprovados: " + totalReprovados);
        System.out.println("Média da classe: " + (somaClasse / 6));
        
        scanner.close();
    }
}
