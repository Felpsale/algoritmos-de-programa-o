import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O valor da 1° expressão é " + (20.0 - 15.0)/2.0);
        double expressao2 = Math.pow(2.0, (5.0 / 20.0)) + (30.0 / Math.pow(15.0, 2.0));
        System.out.println("O valor da 2ª expressão é: " + expressao2);
        System.out.println("O valor da 3ª expressão é: " + 35.0/(6.0+2.0));
        System.out.println("O valor da 4ª expressão é: " + 23%4);

          scanner.close();

        }
    }
