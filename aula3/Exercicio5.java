import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("Digite outro número:");
        int numero2 = scanner.nextInt();
         System.out.println("Digite outro número:");
        int numero3 = scanner.nextInt();
         System.out.println("Digite outro número:");
        int numero4 = scanner.nextInt();
        System.out.println("A soma dos quatro números é " + (numero + numero2 + numero3 + numero4));
        
     
       
          scanner.close();

        }
    }