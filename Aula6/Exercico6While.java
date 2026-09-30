//Faça um algoritmo que leia dez números inteiros e positivos​ – mostre o menor entre eles.​

package Aula6;
import java.util.Scanner;
public class Exercico6While {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    int menor = Integer.MAX_VALUE;

    for(int i = 1; i <= 10; i++ ){

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if (numero <= menor){

            menor = numero;   
           
        }
     
    }
     System.out.println("Esse é o menor número " + menor);
    
    scanner.close();
    }
   
}
