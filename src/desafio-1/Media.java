import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner nota1 = new Scanner(System.in);
        System.out.println("Digite a primeira nota: \n");
        Scanner nota2 = new Scanner(System.in);
        System.out.println("Digite a segunda nota: \n");

        double nota = Double.parseDouble(nota1.nextLine());
        double notaDois = Double.parseDouble(nota2.nextLine());

        double media = (nota + notaDois) / 2;

        System.out.println("A media é %.2f".formatted(media));

        char passed = 'A';
        char notPassed = 'F';
        String passou = "Conseguiste, Parabéns";
        String nãoPassou = "Infelizmente você foi eliminado.";

        if (media >= 7) {
            System.out.println(passed + ": " + passou);
        } else {
            System.out.println(notPassed + ": " + nãoPassou);
        }
    }
}