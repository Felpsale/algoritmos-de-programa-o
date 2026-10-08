package Aula7;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pessoasMais50 = 0;
        int quantidadePessoas10a20 = 0;
        double somaAltura10a20 = 0;
        int pessoasMenos40Kg = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("--- Pessoa " + i + " ---");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            
            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();
            
            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();

            // a) Pessoas maiores de 50 anos
            if (idade > 50) {
                pessoasMais50++;
            }

            // b) Alturas das pessoas entre 10 e 20 anos
            if (idade >= 10 && idade <= 20) {
                somaAltura10a20 += altura;
                quantidadePessoas10a20++;
            }

            // c) Peso inferior a 40 quilos
            if (peso < 40) {
                pessoasMenos40Kg++;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("a) Quantidade de pessoas maiores de 50 anos: " + pessoasMais50);

        if (quantidadePessoas10a20 > 0) {
            double mediaAltura = somaAltura10a20 / quantidadePessoas10a20;
            System.out.println("b) Média das alturas (pessoas entre 10 e 20 anos): " + mediaAltura + "m");
        } else {
            System.out.println("b) Não houve pessoas registradas com idade entre 10 e 20 anos.");
        }

        double percentualMenos40 = ((double)pessoasMenos40Kg / 10) * 100;
        System.out.println("c) Porcentagem de pessoas com peso inferior a 40 kg: " + percentualMenos40 + "%");
        
        scanner.close();
    }
}
