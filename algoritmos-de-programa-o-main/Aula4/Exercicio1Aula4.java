//Faça um algoritmo que leia um número inteiro.

//Se o número for maior que 20. . .

//calcular e imprimir a metade dele.
import java.util.Scanner;
public class Exercicio1Aula4 {
    public static void main(String[] args) {

        int divide;

        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero > 20){
        divide = numero / 2;

        System.out.println("A metade desse número é " + divide);

    } else {

        divide = numero / 2;

        System.out.println("A metade desse número é " + divide);

    }

        scanner.close();

    }

} 


