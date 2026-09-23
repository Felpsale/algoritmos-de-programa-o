import java.util.Scanner;
public class aula3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
    

        System.out.println("Cadastre seus 5 livros favoritos");
        System.out.println();
        System.out.println("Digite o seu 1º livro favorito: ");
        String livro1 = scanner.nextLine();
        System.out.println("Digite o seu 2º livro favorito: ");
        String livro2 = scanner.nextLine();
        System.out.println("Digite o seu 3º livro favorito: ");
        String livro3 = scanner.nextLine();
        System.out.println("Digite o seu 4º livro favorito: ");
        String livro4 = scanner.nextLine();
        System.out.println("Digite o seu 5º livro favorito: ");
        String livro5 = scanner.nextLine();


        System.out.println("\nSeus livros favoritos são: ");
        System.out.println("1 - " + livro1);
        System.out.println("2 - " + livro2);
        System.out.println("3 - " + livro3);
        System.out.println("4 - " + livro4);
        System.out.println("5 - " + livro5);

        scanner.close();
    }
    
}
