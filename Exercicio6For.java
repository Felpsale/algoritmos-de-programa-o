package Aula7;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0;
        int nulos = 0, brancos = 0;

        System.out.println("Códigos de Votação: 1, 2, 3, 4 (Candidatos) | 5 (Nulo) | 6 (Branco)");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Eleitor " + i + ", digite o código do seu voto: ");
            int voto = scanner.nextInt();

            switch (voto) {
                case 1: cand1++; break;
                case 2: cand2++; break;
                case 3: cand3++; break;
                case 4: cand4++; break;
                case 5: nulos++; break;
                case 6: brancos++; break;
                default: 
                    System.out.println("Código inválido! Voto contabilizado como nulo.");
                    nulos++; 
                    break;
            }
        }

        System.out.println("\n--- Resultado da Eleição ---");
        System.out.println("Votos Candidato 1: " + cand1);
        System.out.println("Votos Candidato 2: " + cand2);
        System.out.println("Votos Candidato 3: " + cand3);
        System.out.println("Votos Candidato 4: " + cand4);
        System.out.println("Total de votos nulos: " + nulos);
        System.out.println("Total de votos em branco: " + brancos);

        double percentualBrancosNulos = ((double)(brancos + nulos) / 10) * 100;
        System.out.println("Percentual de votos brancos e nulos: " + percentualBrancosNulos + "%");
        
        scanner.close();
    }
}
