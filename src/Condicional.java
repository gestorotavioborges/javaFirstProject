public class Condicional {
    public static void main(String[] args) {
        int anoDELANCAMENTO = 2001;
        boolean incluidoNaAssinatura = true;
        String planoAssinatura = "deluxe";

        if (anoDELANCAMENTO >= 2023){
            System.out.println("Filmes Lançamentos");
    } else {
        System.out.println("Filmes de sucesso, já conhecidos.");
    }

        if (incluidoNaAssinatura || planoAssinatura.equals("deluxe")){
             System.out.println("Filme disponível na Assinatura");
        } else {
            System.out.println("Faça um upgrade em sua assinatura.");
        }
    }
}
