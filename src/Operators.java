public class Operators {
    public static void Main(String[] args) {
        int valor = 5; // Atribuição simples

        valor += 15; // Adicionando ao valor anterior

        int a = 10 + 5; // 15
        int b = 10 - 5; // 5
        int c = 10 * 5; // 50
        int d = 10 / 5; // 2
        int e = 10 % 3; // 1

        boolean igual = (b == a); // false
        boolean diferente = (b != a); // true
        boolean maior = (b > a); // false
        boolean menorIgual = (b <= c); // true

        boolean teste1 = true;
        boolean teste2 = false;

        if (teste1) {
            System.out.println("Ok");
        } else if (!teste2){
            System.out.println("Nope");
        }
    }
}
