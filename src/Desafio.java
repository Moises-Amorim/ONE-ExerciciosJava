import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);

        String nome = "Moisés Amorim";
        String tipoConta = "Corrente";
        double saldoInicial = 1000.00, valorReceber, valorTransferir;
        int opcao = 0;

        System.out.println("********************************\n" +
                "Dados iniciais do cliente:\n" +
                "Nome: " + nome +
                "\nTipo de conta: " + tipoConta +
                "\nSaldo: R$ " + saldoInicial +
                "\n++++++++++++++++++++************");

        while (opcao != 4) {

            System.out.println("\nDigite a opção desejada: \n");
            System.out.println("1 - Consultar Saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - transferir valor");
            System.out.println("4 - Sair");

            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("********************************\n" +
                            "Dados iniciais do cliente:\n" +
                            "Nome: " + nome +
                            "\nTipo de conta: " + tipoConta +
                            "\nSaldo: R$" + saldoInicial +
                            "\n++++++++++++++++++++************");
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    valorReceber = leitor.nextDouble();

                    saldoInicial += valorReceber;

                    System.out.println("Saldo após operação: R$ " + saldoInicial);

                    break;
                case 3:
                    System.out.println("Informe o valor a transferir: ");
                    valorTransferir = leitor.nextDouble();

                    saldoInicial -= valorTransferir;

                    System.out.println("Saldo após operação: R$ " + saldoInicial);
                    break;
                case 4:
                    leitor.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
