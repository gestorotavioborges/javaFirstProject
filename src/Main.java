import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Bem vindo ao OtaFilms!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        if (senha.equals("192837")) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Senha incorreta, Tente novamente!");
        }*/


        System.out.println();
        System.out.println("Filme: Velozes e Furiosos 1");
        System.out.println();

        int anoDELANCAMENTO = 2001;
        System.out.println("Ano de Lançamento: " + anoDELANCAMENTO);
        System.out.println();
        boolean incluidoNaAssinatura = true;

        double media = (8.4 +7.34 + 9.5 + 8.0 + 6.9) / 5;
        DecimalFormat df = new DecimalFormat("0.00");
        String mediaFormatada = df.format(media);
        System.out.println("Avaliação: " + mediaFormatada);
        System.out.println();
        String sinopse;
        sinopse = "Brian O'Conner é um policial que se infiltra no submundo dos rachas de rua para investigar uma série de furtos. " +
                "Enquanto tenta ganhar o respeito e a confiança do líder Dom Toretto, ele corre o risco de ser desmascarado.";
        System.out.println(sinopse);
        System.out.println();
        int estrelas; estrelas = (int) (media /2);
        System.out.println("Estrelas: " + estrelas);
    }
}


