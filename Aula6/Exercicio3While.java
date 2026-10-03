package Aula6;
import java.util.Scanner;
public class Exercicio3While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int atual = 1; 
        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        while (atual <= numero){
            System.out.println(atual);
            atual = atual * 2;
        }
        scanner.close();
    }
}