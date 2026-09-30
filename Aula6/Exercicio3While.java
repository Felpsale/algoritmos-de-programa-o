//Construir um algoritmo que leia um número inteiro e imprime a 	sequência:​
//– 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024. . .​
//– enquanto o valor da sequência for menor ou igual ao número lido.​


package Aula6;
import java.util.Scanner;
public class Exercicio3While {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int atual = 1; 
    
    System.out.println("Digite um número");
    int numero = scanner.nextInt();
    while (atual <= numero){
    
        System.out.println(atual);

        atual = atual * 2;


    }

scanner.close();
}
    
}
