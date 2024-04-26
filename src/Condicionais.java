public class Condicionais {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >=  2022) {
            System.out.println("Lançado recentemente");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Disponivel para assistir");
        } else {
            System.out.println("Paque mais x para assistir");
        }
    }
}
