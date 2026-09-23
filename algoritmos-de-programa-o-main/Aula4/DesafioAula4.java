//Desenvolver um algoritmo para definir se uma pessoa está apta 	a votar no Brasil.​
//Pesquise: Quais são as regras para se votar no Brasil?​
//Identifique quais os dados de entrada necessários para resolver o problema.​
//Identifique quais regras devem ser satisfeitas para definir que uma pessoa está apta a votar.​
//Faça um programa que pede as informações necessárias e verifica se 	uma pessoa está apta a votar.​

import java.util.Scanner;
public class DesafioAula4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();
         System.out.println("possui Titulo de eleitor? S/N");
        String titulo = scanner.next();

        if(titulo.equalsIgnoreCase("S") && idade >= 16 && idade <= 17 ){

            System.out.println("Você pode votar, mas seu voto é opcional");

        } else if (titulo.equalsIgnoreCase("N") && idade >= 16 && idade <= 17 ){

                        System.out.println("Você não pode votar sem a carteira de titular, mas seu voto é opcional");
        } else if (titulo.equalsIgnoreCase("S") && idade >= 18 && idade <= 69){

              System.out.println("Você pode votar, seu voto é obrigatorio");
        } else if (titulo.equalsIgnoreCase("N") && idade >= 18 && idade <= 69 ){

              System.out.println("Você não pode votar sem a carteira de titular, seu voto é obrigatorio");
        } else if (titulo.equalsIgnoreCase("S") && idade >= 70){
                System.out.println("Você pode votar, seu voto é opcional");
        } else if (titulo.equalsIgnoreCase("N") && idade >= 70){
                System.out.println("Você não pode votar sem a carteira de titular, seu voto é opcional");
        }else if (idade <= 15){
                System.out.println("Você não tem idade para votar");
        }
         else {
              System.out.println("Digite S OU N, ou insira um número valido ");
        }
        scanner.close();




    }
}
