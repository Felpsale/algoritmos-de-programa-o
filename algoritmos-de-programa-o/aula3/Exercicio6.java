import java.util.Scanner;

public class Exercicio6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota do aluno: ");
        int numero = scanner.nextInt();
        System.out.println("Digite a segunda nota do aluno:");
        int numero2 = scanner.nextInt();
         System.out.println("Digite a terceira nota do aluno:");
        int numero3 = scanner.nextInt();
        System.out.println("A média das três notas é " + (numero + numero2 + numero3) / 3.0);
       
          scanner.close();

        }
    }

