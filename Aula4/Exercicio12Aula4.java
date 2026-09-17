//Ler o salário de uma pessoa e calcular e imprimir o desconto do
//INSS (calculado‼) de acordo com a tabela a seguir:​
//<= R$ 600,00 Isento​
//R$ 600,00 e <= R$ 1200,00 20%​
//R$ 1200,00 e <= R$ 2000,00 25%​
//<= R$ 2000,00 30%​

import java.util.Scanner;
public class Exercicio12Aula4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu sálario");
        double sal = scanner.nextDouble();
        double desconto;

        if(sal <= 600){

            System.out.println("Você está isento de desconto");
        } else if (sal > 600 || sal <= 1200){
            desconto = sal * 0.20;
            System.out.println("O desconto é de " + desconto);

        } else if (sal > 1200 || sal <= 2000){
            desconto = sal * 0.25;
            System.out.println("O desconto é de " + desconto);

        } else {
             desconto = sal * 0.30;
            System.out.println("O desconto é de " + desconto);
        }
        scanner.close();
    }
}
