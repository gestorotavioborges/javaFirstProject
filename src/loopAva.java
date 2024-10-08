import java.util.Scanner;

public class loopAva {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Qual a sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;

        }
        System.out.println("Média de Avaliações: " + mediaAvaliacao/5);
    }
}
