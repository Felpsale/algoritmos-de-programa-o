import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("Digite outro número:");
        int numero2 = scanner.nextInt();
        System.out.println("O produto dos dois números é " + (numero * numero2));
       
          scanner.close();

        }
    }

    
