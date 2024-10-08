import java.sql.SQLOutput;
import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme preferido: ");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento do filme: ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual a sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}
