//Faça um algoritmo que verifique a validade de uma senha 	fornecida pelo usuário.​ sabendo que a senha é R10p5:​
//imprimir mensagem de “acesso concedido” ou “acesso negado”.​
//Para comparar duas Strings utilizar o método equals();​
//ele retorna um valor booleano!​
//Exemplo:​
//if(senha.equals("R10p5"))​
import java.util.Scanner;
public class Exercicio8Aula4 {
    public static void main(String[] args) {
   Scanner  scanner = new Scanner(System.in);
   System.out.println("Digite seu nome");
   String nome = scanner.next();
   System.out.println("Digite a senha");
   String senha = scanner.next();

   if(senha.equals("R10p5") ){

    System.out.println("Acesso concedido! Seja bem vindo " + nome );
   } else {
    System.out.println("Acesso negado!");

   }
 scanner.close();
    }
   
  
}
