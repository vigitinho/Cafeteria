import controlador.Montador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Montador criarBebida = new Montador();

        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione um drink: \n"
                + "<< 1 - Cafe >>\n"
                + "<< 2 - Cafe com Leite >>\n"
                + "<< 3 - Leite com Chocolate >>\n"
                + "<< 4 - Mocha >>\n"
                + "<< 5 - Espresso con Panna >>\n"
                + "Digite a opcao desejada: ");
        criarBebida.selecaoBebidas(sc.nextInt());

        System.out.println("Selecione um tamanho: \n"
                + "<< 1 - Pequeno >>\n"
                + "<< 2 - Medio >>\n"
                + "<< 3 - Grande >>\n"
                + "Digite a opcao de tamanho: ");
        criarBebida.selecaoTamanho(sc.nextInt());

        criarBebida.maisAdicional();

        sc.close();

        System.out.println("O valor do pedido foi: " + criarBebida.getTotalValor());
        System.out.println("A bebida pedida foi: " + criarBebida.getAdicionalList());
        System.out.println("O(s) adicional(is) pedidos foram: " + criarBebida.getBebidasList());
    }

}
