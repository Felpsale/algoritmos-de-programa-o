package Aula6;
import java.util.Scanner;
public class Exercício9While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorTotalCompra = 0.0;
        int continuar;
        do { 
            double preco = 0.0; 
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
            switch (codigo) {
                case 100: preco = 1.20; break;
                case 101: preco = 1.30; break;
                case 102: preco = 1.50; break;
                case 103: preco = 1.20; break;
                case 104: preco = 1.30; break;
                case 105: preco = 1.00; break;
                default: System.out.println("Código inválido!"); preco = 0.0;
            }
            if (preco > 0) {
                System.out.print("Digite a quantidade: ");
                int quantidade = scanner.nextInt();
                double valorItem = preco * quantidade;
                System.out.println("Valor deste item: R$ " + valorItem);
                valorTotalCompra = valorTotalCompra + valorItem; 
            }
            System.out.println("\nDeseja continuar comprando? (1 - Sim / 2 - Não)");
            continuar = scanner.nextInt();
        } while (continuar == 1);
        System.out.println("\nO valor total da sua compra é: R$ " + valorTotalCompra);
        scanner.close();
    }
}