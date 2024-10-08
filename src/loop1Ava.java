import java.util.Scanner;

public class loop1Ava {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaAvaliacao = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Qual a sua avaliação para o filme, ou -1 para encerrar o programa.: ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }
        System.out.println("Média de Avaliações: " + mediaAvaliacao / totalDeNotas);
    }
}
