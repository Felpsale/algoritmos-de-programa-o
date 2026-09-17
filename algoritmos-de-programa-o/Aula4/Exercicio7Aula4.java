//A empresa XSoftware concedeu um bônus de 20% do valor do salário a todos os funcionários com tempos de trabalho na empresa igual ou
//superior a cinco anos e de 10% aos demais funcionários.​
//Faça um algoritmo que leia o salário e a quantidade de anos de cada
//funcionário, calcule e imprima o valor do bônus.​
import java.util.Scanner;
public class Exercicio7Aula4 {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        double bonus;
        System.out.println("Digite o seu sálario");
        double sal = scanner.nextDouble();
         System.out.println("Digite a quantidade de anos trabalhadas na empresa");
         int anos = scanner.nextInt();

         if(anos >= 5 ){

            bonus = sal * 0.20;
            System.out.println("O salário é de " + sal + " E O bônus é de " + bonus);

         }else{
             bonus = sal * 0.10;
            System.out.println("O salário é de " + sal + " E O bônus é de " + bonus);
         }
         scanner.close();

    }
    
}
