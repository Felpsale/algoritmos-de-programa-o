//Faça um algoritmo que receba dois números;​
//execute as operações listadas a seguir . . .​
//de acordo com a escolha do usuário.​
//Opção	Mensagem​
//M	média entre os números digitados S	diferença do maior pelo menor​
//P	produto entre os números digitados D	divisão do primeiro pelo segundo​

package Aula5;
import java.util.Scanner;
public class Exercicios5Switch {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Digite um número");
    int numero = scanner.nextInt();
    System.out.println("Digite outro número");
    int numero1 = scanner.nextInt();
    System.out.println("Escolha entre essas opções \n M \n S \n P \n D");
    String opcao = scanner.next();

    switch(opcao){
    case "M":
    case "m":
    int media;
    media = (numero + numero1) / 2;
    System.out.println("A média entre os números digitados é " + media);
    break;

    case "S":
    case "s":
     int diferenca;
     if(numero >= numero1){
          diferenca = numero - numero1;
    System.out.println("A diferença do maior pelo menor​ é " + diferenca);
     } else {
        diferenca = numero1 - numero;
         System.out.println("A diferença do maior pelo menor​ é " + diferenca);
  
    }
       break;

     case "P":
     case "p":
    int produto;
    produto = numero * numero1;
    System.out.println("O produto entre os números digitados é " + produto);
    break;

 case "D":
 case "d":
    if (numero1 == 0 || numero == 0) {
        System.out.println("Não é possível dividir por zero.");
    } else {
        double divisao;
        divisao = (double) numero / numero1;
        System.out.println("A divisão do primeiro pelo segundo​ é " + divisao);
    }
    break;
    default:
    System.out.println("Digite uma opção válida");
    break;
    }
    scanner.close();
    }
}
