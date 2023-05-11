import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Eu sou o " + nome);
        System.out.println("Minha idade é " + idade);
        System.out.println("Minha altura é de " + altura);
    }
}
