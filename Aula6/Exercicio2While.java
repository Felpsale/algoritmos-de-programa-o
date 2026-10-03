package Aula6;
import java.util.Scanner;

public class Exercicio2While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int i = 1;
        while (i <= 10) {
            System.out.println("Digite o " + i + "º número:");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pares++;   
            } else {
                impares++;
            }
            i++;
        }
        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de ímpares é: " + impares);
        scanner.close();
    }
}