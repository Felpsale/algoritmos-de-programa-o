//O IMC (índice de Massa Corporal) é uma medida do grau de obesidade de uma pessoa.​
//Faça um algoritmo que leia a altura e o peso de 10 pessoas.​
//Calcular o IMC de cada pessoa e verificar quantas pessoas estão com o
//IMC entre 18,5 e 24,9 que é considerado sem obesidade.​

package Aula6;
import java.util.Scanner;
public class Exercicio7While {
public static void main(String[] args) {
    double imc = 0;
    double altura = 0;
    double peso = 0;
    int contador = 0;
    Scanner scanner = new Scanner(System.in);
   
    
    for(int i = 1; i <= 10; i++){

   
    System.out.println("Digite seu peso");
    peso = scanner.nextDouble();
    System.out.println("Digite sua altura");
    altura = scanner.nextDouble(); 
    imc = peso / (altura * altura); 

    
    if(imc >= 18.5 && imc <= 24.9){

         System.out.println("Você não é considerado obeso");
         contador ++;

    }
  


    }  

    System.out.println("Total de pessoas sem obesidade: " + contador);
    scanner.close();
}
    
}
