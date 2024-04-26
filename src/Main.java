import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse e o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
        Scanner leitura = new Scanner(System.in);

        int ano = 2022;

        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.println(media);

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(classificacao);



        double celsius;
        int conversao;

        System.out.println("Digite a temperatura em graus celsius \n");
        celsius = leitura.nextDouble();

        conversao = (int) (celsius * 1.8) + 32;

        System.out.println("Aqui está a atemperatura convertida para fahrenheit " + conversao);


    }
}