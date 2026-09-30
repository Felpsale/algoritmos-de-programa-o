//Faça um algoritmo que imprima a metade de cada número de 10 a 20.​

//– Exemplo:​
//¨ a metade de 10 é 5.0​
//¨ a metade de 11 é 5.5​
//¨ a metade de 12 é 6.0​
//¨ a metade de 18 é 9.0​
//¨ a metade de 19 é 9.5​
//¨ a metade de 20 é 10.0​



package Aula6;
public class Exercicio4While {
    public static void main(String[] args) {

         double metade;
    

    for (double i = 10; i <= 20; i++){
    
    metade = i / 2.0;
    System.err.println("A metade de " + i + " é igual a " + metade);


    }



        
    }
}
