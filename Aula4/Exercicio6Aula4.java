//Faça um algoritmo que leia a altura e o sexo de uma pessoa:​
//calcule e mostre seu peso ideal.​ usar as formulas a seguir para calcular o peso ideal:​
//para o sexo masculino: p72, 7 ˆ alturaq ´ 58​
//para o sexo feminino: p62, 1 ˆ alturaq ´ 44, 7​
import java.util.Scanner;
public class Exercicio6Aula4 {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o seu gênero (Utilize M OU F)");
    String genero = scanner.next();  

    double pesoIdeal;
    double altura;


// equalsIgnoreCase é utilizado para ver se o usuario digitou um texto do tipo string, o ignore case é para ignorar se é upper case ou lowercase.

if (genero.equalsIgnoreCase("M")) {



    System.out.println("Digite a sua altura ");
    altura = scanner.nextDouble();
    pesoIdeal = (72.7 * altura) - 58;
    System.out.println("O seu peso ideal é de " + pesoIdeal + " kg");

  System.out.println("O seu IMC é de " );

} else if (genero.equalsIgnoreCase("F")) {
 
  
    System.out.println("Digite a sua altura ");
    altura = scanner.nextDouble();
   pesoIdeal = (62.1 * altura) - 44.7;
     System.out.println("O seu IMC é de " );

} else {
    System.out.println("Gênero inválido! Por favor, digite apenas M ou F.");
    
   
}
 scanner.close();
}
    
    
}
