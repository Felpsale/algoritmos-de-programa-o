//Faça um algoritmo que leia 10 números inteiros e
//diga:​ quantos são pares;​ e quantos são ímpares.​
//– Exemplo:​
//¨ Digite o 1o número:​
//¨ 4​
//¨ Digite o 2o número:​
//¨ 201
//¨ Digite o 10o número:​
//¨ 976​
//¨ O total de pares é: <número de pares>​
//¨ O total de ímpares é: <número de ímpares>​
package Aula6;
import java.util.Scanner;

public class Exercicio2While {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int pares = 0;
int impares = 0;

for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número:");
            int numero = scanner.nextInt();
            
         
            if (numero % 2 == 0) {
                pares++;   
            } else {
                impares++;
            }
        }
        
        // 4. O Relatório Final
        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de ímpares é: " + impares);
        
        scanner.close();
    }
}
    

    

