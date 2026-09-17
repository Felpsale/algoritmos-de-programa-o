//Faça um algoritmo que receba a idade de um nadador e
//imprima a sua categoria seguindo as regras:​

import java.util.Scanner;
public class Exercicio11Aula4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Digite a sua idade");
int idade = scanner.nextInt();
if (idade <= 3) {

    System.out.println("Idade insuficiente");
}
if(idade == 5 || idade <= 7){

    System.out.println("sua categoria é Infantil A");
} else if(idade == 8 || idade <= 10){
     System.out.println("sua categoria é Infantil B");
}else if(idade == 11 || idade <= 13){
    System.out.println("sua categoria é Juvenil A");
} else if(idade == 14 || idade <= 17){
     System.out.println("sua categoria é Juvenil B");
}else {
     System.out.println("Sua categoria é sênior");
}
scanner.close();

}
    
}
