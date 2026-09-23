//Faça um algoritmo para ler um número inteiro.​
//verifique se o número está no intervalo entre 50 (inclusive) e 100 (inclusive);​
//se estiver:​ imprimir “Pertence ao intervalo”;​ senão:​
//imprimir “Não pertence ao intervalo”​

import java.util.Scanner;
public class Exercicio5Aula4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if(numero >= 50 && numero <= 100){

        System.out.println("O número pertence ao intervalo " + numero);
        } else {
        System.out.println("O número Não pertence ao intervalo " + numero);
        } 
        
        scanner.close();
    }
   
}
