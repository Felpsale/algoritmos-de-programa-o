//Crie um algoritmo que leia um número de 1 a 7.
//imprima o dia da semana correspondente;
//assuma que 1 corresponde ao Domingo.
package Aula5;

import java.util.Scanner;

public class Exercicio1Switch {

    public static void main(String[] args) {

    System.out.println("Digite um número de 1 a 7");
      Scanner scanner = new Scanner(System.in);
      int numero = scanner.nextInt();
      switch (numero){
        case 1:
        System.out.println("1 Corresponde a domingo");
        break;
        case 2: 
        System.out.println("2 Corresponde a segunda");
        break;
        case 3:
        System.out.println("3 Corresponde a terça");
        break;
        case 4: 
        System.out.println("4 Corresponde a quarta");
        break;
        case 5:
        System.out.println("5 Corresponde a quinta");
        break;
        case 6:
        System.out.println("6 Corresponde a sexta");
        break;
        case 7:
        System.out.println("7 Corresponde a sabado");
        break;
        default: 
        System.out.println("Opção inválida. Digite um número de 1 a 7.");
        break;
      }
      scanner.close();
    }
    
}
