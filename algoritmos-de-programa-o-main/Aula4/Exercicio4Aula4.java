//Ler dois números (ponto flutuante) e apresentá-los em ordem decrescente.​ supor que não sejam iguais.​
import java.util.Scanner;
public class Exercicio4Aula4 {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float numero = scanner.nextFloat();
        System.out.println("Digite outro número: ");
        float numero1 = scanner.nextFloat();
      
       if (numero1 < numero){

        System.out.println("A sequência dos numeros decrescentes é " + numero1 + " , " + numero);

       } else {

         System.out.println("A sequência dos numeros decrescentes é " + numero + " , " + numero1);

       }

        scanner.close();
    }
}