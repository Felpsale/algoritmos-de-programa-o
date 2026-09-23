//Faça um algoritmo que:​
//leia o código do produto e a
//quantidade;​
//calcule o valor a ser pago pelo cliente;​
//imprimir o valor a ser pago;​
//imprimir o nome do produto.​

package Aula5;
import java.util.Scanner;
public class Exercicio6Switch {
public static void main(String[] args) {

Scanner scanner = new Scanner (System.in);
double cachorro, bauru, bauruovo, hamburger, chesee, refri, pago;
cachorro = 1.20;
bauru = 1.30;
bauruovo = 1.50;
hamburger = 1.20;
chesee = 1.30;
refri = 1.00;

//utilizei ia para criar essa tabela
System.out.println("================ MENU ================");
        System.out.println("Código | Produto           | Preço");
        System.out.println("--------------------------------------");
        System.out.println(" 100   | Cachorro Quente   | R$ 1,20");
        System.out.println(" 101   | Bauru Simples     | R$ 1,30");
        System.out.println(" 102   | Bauru com ovo     | R$ 1,50");
        System.out.println(" 103   | Hambúrguer        | R$ 1,20");
        System.out.println(" 104   | Cheeseburguer     | R$ 1,30");
        System.out.println(" 105   | Refrigerante      | R$ 1,00");
        System.out.println("======================================");
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        System.out.println("Digite a quantidade do produto");
        int quanti = scanner.nextInt();
        switch (codigo){
        case 100:
        pago = quanti * cachorro;
        System.out.println("O valor a ser pago pelo cachorro quente é R$" + pago  );
        break;
        
        case 101:
        pago = quanti * bauru;
        System.out.println("O valor a ser pago pelo Bauru Simples é R$" + pago );
        break; 

        case 102:
        pago = quanti * bauruovo;
        System.out.println("O valor a ser pago pelo Bauru com Ovos é R$" + pago );
        break;

        case 103:
        pago = quanti * hamburger;
        System.out.println("O valor a ser pago pelo Hambúrguer é R$" + pago);
        break;

        case 104:
        pago = quanti * chesee;
        System.out.println("O valor a ser pago pelo Cheseburguer é R$" + pago);
        break;

        case 105:
        pago = quanti * refri;
        System.out.println("O valor a ser pago pelo Refrigerante é R$" + pago);
        break;

        default:
        System.out.println("Digite um código válido");
        break;

        }
        scanner.close();
}
}
