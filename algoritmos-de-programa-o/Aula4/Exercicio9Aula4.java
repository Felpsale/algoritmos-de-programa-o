//A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatuários.​
//o valor máximo da prestação não poderá ultrapassar 30% do salário bruto.​
//fazer um algoritmo que leia o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.​
//Exemplo:​
//alário bruto: 1200,00​
//Valor da prestação: 400,00​
//Empréstimo não pode ser concedido!​ 

import java.util.Scanner;
public class Exercicio9Aula4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Digite o valor do seu sálario bruto");
double sal = scanner.nextDouble();
System.out.println("Digite o valor da prestação");
double prest = scanner.nextDouble();

if (prest > (sal * 0.30)){

    System.out.println("Empréstimo não autorizado!");
} else {
    System.out.println("Empréstimo autorizado! " );

}


    

scanner.close();
}
}
