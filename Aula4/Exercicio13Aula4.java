//Criar uma calculadora de operações básicas:​ soma, subtração, multiplicação e divisão.​
//o algoritmo deve ler dois números e o sinal correspondente à operação desejada;​
//utilize o tipo char para ler a operação;​
//no final deve ser impresso o resultado.​
//Restrições:​
//se o sinal digitado não corresponder a uma operação. . .​
//¨ apresentar a mensagem Sinal Inválido e finalizar.​
//para a operação de divisão verificar se o divisor é válido (maior que zero)!​
//¨ caso seja menor ou igual a zero, informar a mensagem “Impossível dividir‼”​

import java.util.Scanner;
public class Exercicio13Aula4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Digite a operação matemática que quer utilizar (+ , - , * , /)");
char operacao = scanner.next().charAt(0);
System.out.println("Digite o primeiro número");
double num1 = scanner.nextDouble();
System.out.println("Digite o segundo número");
double num2 = scanner.nextDouble();

if (operacao == '+') {
    double resultado = num1 + num2;
    System.out.println("O resultado da soma é " + resultado);
} else if (operacao == '-') {
    double resultado = num1 - num2;
    System.out.println("O resultado da subtração é " + resultado);
} else if (operacao == '*') {
    double resultado = num1 * num2;
    System.out.println("O resultado da multiplicação é " + resultado);
} else if (operacao == '/') {
    if (num2 <= 0) {
        System.out.println("Impossível dividir‼");
    } else {
        double resultado = num1 / num2;
        System.out.println("O resultado da divisão é " + resultado);
    }
} else {
    System.out.println("Sinal Inválido");   
}
scanner.close();
}
}    
