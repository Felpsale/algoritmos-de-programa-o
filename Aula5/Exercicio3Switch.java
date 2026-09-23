//Faça um algoritmo que leia o período em que um aluno estuda:
//M - Matutino;
//V - Vespertino;
//N - Noturno.
//Escreva uma das opções a seguir:
//Opção	Saudação
//M	bom dia
//V	boa tarde
//N	boa noite
package Aula5;
import java.util.Scanner;
public class Exercicio3Switch {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um período de estudo \n M - Matutino \n V - Vespertino \n N - Noturno");
    String letra = scanner.next();
    switch (letra){
        case "M" : 
        case "m" :
        System.out.println("Bom dia");
        break;
        case "V":
        case "v" :
        System.out.println("Boa tarde");
        break;
        case "N":
        case "n" :
        System.out.println("Boa noite");
        break;
        default:
        System.out.println("Digite um periodo de estudo válido");
        break;
        


    }
    
    scanner.close();
    }
    
}
