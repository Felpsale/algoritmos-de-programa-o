//Ler dois valores inteiros:

//e se forem iguais, mostrar “Números iguais”;

//caso contrário, apresentar a diferença do maior pelo menor.

import java.util.Scanner;



public class Exercicio3Aula4 {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int numero1 = scanner.nextInt();
        if (numero == numero1){

        System.out.println("Os números são iguais");


    } else if (numero > numero1){

        System.out.println("A diferença entre os números é " + (numero - numero1));

    }  else{        System.out.println("A diferença entre os números é " + (numero1 - numero));}

   

        scanner.close();

    }



}