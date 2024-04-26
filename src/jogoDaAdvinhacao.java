import java.util.Random;
import java.util.Scanner;

public class jogoDaAdvinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int chute = 0;
        System.out.println(numeroAleatorio);

        int tentativas = 5;
        while (chute != numeroAleatorio && tentativas != 0) {
            System.out.println("Esse é o jogo da advinhação, chute um número e veja se acertou. Você tem " + tentativas + " tentativas");
            for (tentativas = 4; tentativas >= 0; tentativas--) {
                System.out.println("Digite seu chute para tentar adivinhar o numero aleatorio: ");
                chute = scanner.nextInt();
                if (chute > numeroAleatorio && tentativas > 0) {
                    System.out.println("O numero aleatorio é menor que " + chute + " Você tem " + tentativas + " tentativas");
                }
                if (chute < numeroAleatorio && tentativas > 0) {
                    System.out.println("O numero aleatorio é maior que " + chute + " Você tem " + tentativas + " tentativas");
                }
                if (chute == numeroAleatorio && tentativas > 0) {
                    System.out.println("Parabéns você advinhou o numero aleatorio " + numeroAleatorio);
                    break;
                } else if (tentativas == 0) {
                    System.out.println("Acabou suas tentativas, fim de jogo. " +
                    "O numero era " + numeroAleatorio);
                    break;
                }
            }
        }
    }
}
