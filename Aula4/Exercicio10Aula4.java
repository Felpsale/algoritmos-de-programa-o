//Faça um algoritmo para encontrar o maior número entre 3
//números inteiros.​ O algoritmo deve ler três inteiros;​ se forem todos iguais, imprimir: “os números são iguais”;​
//caso contrário, imprimir o maior dos 3 números.​


import java.util.Scanner;
public class Exercicio10Aula4 {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número");
    int numero = scanner.nextInt();
      System.out.println("Digite outro número");
    int numero1 = scanner.nextInt();
     System.out.println("Digite mais um número");
    int numero2 = scanner.nextInt();


    if(numero == numero1 && numero1 == numero2 && numero2 == numero ){

        System.out.println("Todos os numeros são iguais " + numero + ", " + numero1 + ", " + numero2);
        
    } else if (numero1 >= numero && numero1 >= numero2) {

        System.out.println("Esse é o maior número " + numero1);
    }else if (numero >= numero1 && numero >= numero2) {

        System.out.println("Esse é o maior número " + numero);
        
    } else {

         System.out.println("Esse é o maior número " + numero2);

    }
scanner.close();
    }
}


