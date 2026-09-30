//Faça um programa que:​ leia duas notas de 5 alunos​
//Calcule e mostre a média aritmética de cada um deles;​ Para cada nota lida:​
//A entrada de cada nota deve ser validada!​ ou seja, o programa somente avança se a entrada da nota estiver entre 0 e 10.​
//caso contrário, solicite-a novamente.​ Utilize o do.. . while para validar as notas.​

package Aula6;
import java.util.Scanner;
public class Exercicio8While {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    
    double media, nota1, nota2;
   
    for(int i = 1; i <= 5; i++){

 do {
        System.out.println("Digite a primeira nota (0 a 10):");
        nota1 = scanner.nextDouble();
    } while (nota1 < 0 || nota1 > 10); 

   
    do {
        System.out.println("Digite a segunda nota (0 a 10):");
        nota2 = scanner.nextDouble();
    } while (nota2 < 0 || nota2 > 10);

    media = (nota1 + nota2) / 2.0;

    System.out.println("A média do aluno " + i + " foi: " + media);
} 
scanner.close();
    }







   

}
    

