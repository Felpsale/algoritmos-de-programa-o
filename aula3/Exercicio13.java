import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
    System.out.println("Digite um número: ");
    Scanner scanner = new Scanner(System.in);
    int numero = scanner.nextInt();
    System.out.println("O valor desse número elevado ao quadrado é: " + (numero * numero));
    System.out.println("O valor desse número elevado ao cubo é: " + (Math.pow(numero, 3)));
    System.out.println("A raiz quadrada desse número é: " + (Math.sqrt(numero)));
    System.out.println("Esse número elevado a potência de 10 é: " + (Math.pow(numero, 10)));
    scanner.close();
    }
}
