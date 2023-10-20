import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Seu nome é " + nome + " " + sobrenome);
            System.out.println("Você tem " + idade + " anos");
            System.out.println("Sua altura é " + altura + "m");
            scanner.close();
        }
        catch (InputMismatchException e) {
            System.out.println("ERRO: Os campos idade e altura precisam ser numéricos");
        }

    }
}
