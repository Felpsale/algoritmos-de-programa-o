package Aula7;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaAlturas = 0;
        int PessoasMais50 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + " - Idade: ");
            int idade = scanner.nextInt();
            
            System.out.println("Pessoa " + i + " - Altura (m): ");
            double altura = scanner.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                PessoasMais50++;
            }
        }

        if (PessoasMais50 > 0) {
            double media = somaAlturas / PessoasMais50;
            System.out.println("A média das alturas das pessoas com mais de 50 anos é: " + media + "m");
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi registrada.");
        }
        
        scanner.close();
    }
}
