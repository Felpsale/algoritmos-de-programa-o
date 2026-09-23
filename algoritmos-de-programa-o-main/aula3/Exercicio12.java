import java.util.Scanner;
public class Exercicio12 {

    public static void main(String[] args) {   
    double ano;
    ano = 2026;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o seu ano de nascimento: ");
    double data = scanner.nextDouble();
    System.out.println("O seu ano de nascimento é: " + data);
    System.out.print("O ano atual é: " + ano);
    System.out.println("A sua idade é: " + (ano - data));
    System.out.println("Em 2030 você terá: " + (2030 - data) + " anos");
    scanner.close();

    }
}
