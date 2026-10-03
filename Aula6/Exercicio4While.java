package Aula6;
public class Exercicio4While {
    public static void main(String[] args) {
        double metade;
        double i = 10;
        while (i <= 20) {
            metade = i / 2.0;
            System.err.println("A metade de " + i + " é igual a " + metade);
            i++;
        }
    }
}