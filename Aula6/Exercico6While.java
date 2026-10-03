package Aula6;
import java.util.Scanner;
public class Exercico6While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int menor = Integer.MAX_VALUE;
        int i = 1;
        while (i <= 10) {
            System.out.println("Digite um número");
            int numero = scanner.nextInt();
            if (numero <= menor){
                menor = numero;   
            }
            i++;
        }
        System.out.println("Esse é o menor número " + menor);
        scanner.close();
    }
}