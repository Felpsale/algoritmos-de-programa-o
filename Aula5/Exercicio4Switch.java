//Um funcionário receberá aumento de acordo com seu plano de trabalho.​
//Faça um algoritmo que leia:​
//¨ o plano de trabalho;​
//¨ e o salário atual de um funcionário;​
//Calcule e imprima o seu novo salário.​

package Aula5;
import java.util.Scanner;
public class Exercicio4Switch {
    
public static void main(String[] args) {



      double aumento;
      Scanner scanner = new Scanner(System.in); 
      System.out.println("Digite seu sálario atual");
      Double sal = scanner.nextDouble();
      System.out.println("Digite um plano entre \n A \n B \n C");
      String letra = scanner.next();
    

      switch (letra){
          case "A":
          case "a":
         
        aumento = sal * 1.10;
        System.out.println("Seu novo sálario é de\n" + aumento);
        break;
         case "B":
         case "b":
          aumento = sal * 1.15;
        System.out.println("Seu novo sálario é de\n" + aumento);
        break;
          case "C":
         case "c":
          aumento = sal * 1.20;
        System.out.println("Seu novo sálario é de \n" + aumento);
        break;
        default:
        System.out.println("Digite um plano ou número válido");
        break;
        

      

      }
    

 
 
 
      scanner.close();
}  

}
