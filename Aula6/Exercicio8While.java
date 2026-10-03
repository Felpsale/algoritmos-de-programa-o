package Aula6;
import java.util.Scanner;
public class Exercicio8While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media, nota1, nota2;
        int i = 1;
        while (i <= 5) {
            do {
                System.out.println("Digite a primeira nota (0 a 10):");
                nota1 = scanner.nextDouble();
            } while (nota1 < 0 || nota1 > 10); 
            do {
                System.out.println("Digite a segunda nota (0 a 10):");
                nota2 = scanner.nextDouble();
            } while (nota2 < 0 || nota2 > 10);
            media = (nota1 + nota2) / 2.0;
            System.out.println("A média do aluno " + i + " foi: " + media);
            i++;
        } 
        scanner.close();
    }
}