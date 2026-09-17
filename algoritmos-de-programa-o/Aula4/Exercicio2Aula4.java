//receba a idade de uma pessoa;

//se for maior de idade imprima: “maior de idade”;

//senão imprima: “menor de idade”.



import java.util.Scanner;

public class Exercicio2Aula4 {



     public static void main(String[] args) {

        System.out.println("Digite a sua idade: ");

        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        if (idade >= 18){

        System.out.println("Você é maior de idade " + idade);

    } else  {

        System.out.println("Você é menor de idade " + idade);

    }

        scanner.close();
    }

   

}