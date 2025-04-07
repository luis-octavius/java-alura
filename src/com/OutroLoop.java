import java.util.Scanner;

public class OutroLoop {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    double mediaAvaliacao = 0;
    double avaliacao = 0;
    int contador = 0;
    double nota = 0;

    System.out.println("Digite o nome do filme: ");
    String nome = leitura.nextLine();
    
    while (nota != -1) { 
      System.out.println("Digite uma nota para o filme ou -1 para encerrar: ");
      nota = leitura.nextDouble();
      avaliacao += nota;
      contador++;
  }
    
    mediaAvaliacao = avaliacao / contador;
    System.out.println("Média das avaliações do filme é: " + mediaAvaliacao);
  }
}
