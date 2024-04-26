import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de lancçamento");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Qual sua nota para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println("fime: " + filme + " Ano de lançamento: " + anoDeLancamento + "\n Sua not apara o filme: " + avaliacao);
    }
}
