package Aula6;
import java.util.Scanner;
public class Exercicio7While {
    public static void main(String[] args) {
        double imc = 0, altura = 0, peso = 0;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i <= 10) {
            System.out.println("Digite seu peso");
            peso = scanner.nextDouble();
            System.out.println("Digite sua altura");
            altura = scanner.nextDouble(); 
            imc = peso / (altura * altura); 
            if(imc >= 18.5 && imc <= 24.9){
                System.out.println("Você não é considerado obeso");
                contador ++;
            }
            i++;
        }  
        System.out.println("Total de pessoas sem obesidade: " + contador);
        scanner.close();
    }
}