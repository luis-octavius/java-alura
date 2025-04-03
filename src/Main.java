import java.util.Scanner;

class Perfil {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Digite o seu nome: \n");

        String userName = name.nextLine();
        System.out.println("Olá, " + userName);

        System.out.println("Tudo bem?");
    }
}