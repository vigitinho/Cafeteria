package controlador;

import adicionais.*;
import cafes.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Montador {
    private double totalValor;
    private double bebidasValor;
    private int validator = 1;
    private ArrayList<String> adicionalList = new ArrayList();
    private ArrayList<String> bebidasList = new ArrayList(); 
    
   public void selecaoBebidas(int op) {

        switch (op) {
            case 0:
                break;
            case 1:
                Bebidas cafe = new Cafe();
                bebidasValor = cafe.getValor();
                bebidasList.add("Café");
                break;
            case 2:
                Bebidas cafeComLeite = new CafeComLeite();
                bebidasValor = cafeComLeite.getValor();
                bebidasList.add("Café com Leite");
                break;
            case 3:
                Bebidas leiteComChocolate = new LeiteComChocolate();
                bebidasValor = leiteComChocolate.getValor();
                bebidasList.add("Leite com Chocolate");
                break;
            case 4:
                Bebidas mocha = new Mocha();
                bebidasValor = mocha.getValor();
                bebidasList.add("Mocha");
                break;
            case 5:
                Bebidas espressoPanna = new EspressoPanna();
                bebidasValor = espressoPanna.getValor();
                bebidasList.add("Espresso Panna");
                break;
            default:
                System.out.println("Você não selecionou nenhum café.");
        }
    }

    public void selecaoTamanho(int op) {
        switch (op) {
            case 1: 
                totalValor = bebidasValor;
            break;    
            case 2: 
                totalValor = (bebidasValor * 0.2) + bebidasValor;
            break;
            case 3: 
                totalValor = (bebidasValor * 0.35) + bebidasValor;
            break;
            default: System.out.println("Você não selecionou nenhum tamanho.6");
        }
    }
    
    public void selectAdicional() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione o adicional para colocar no seu drink: ");
        System.out.println("0 - Sem adicional");
        System.out.println("1 - Raspas de limao");
        System.out.println("2 - Canela em po");
        System.out.println("3 - Leite ninho (colher)");
        System.out.println("4 - Gelo de creme de leite (Cubo)");
        System.out.println("5 - Leite condensado (Colher)");
        System.out.println("6 - Chocolate em po(Colher)");
        System.out.println("7 - Cookie (Unidade)");
        System.out.println("Digite a opção do adicional: ");

        int op = sc.nextInt();
        switch (op) {
            case 1: 
                Adicional raspasDeLimao = new RaspasDeLimao();
                totalValor += raspasDeLimao.getValor();
                adicionalList.add("Raspas de Limão");
            break;
            case 2: 
                Adicional canelaEmPo = new CanelaEmPo();
                totalValor += canelaEmPo.getValor();
                adicionalList.add("Canela em Pó");
            break;
            case 3: 
                Adicional leiteNinho = new LeiteNinho();
                totalValor += leiteNinho.getValor();
                adicionalList.add("Leite Ninho");
            break;
            case 4: 
                Adicional geloDeCremeDeLeite = new GeloDeCremeDeLeite();
                totalValor += geloDeCremeDeLeite.getValor();
                adicionalList.add("Gelo de Creme de Leite");
            break;
            case 5: 
                Adicional leiteCondensado = new LeiteCondensado();
                totalValor += leiteCondensado.getValor();
                adicionalList.add("Leite Condensado");
            break;
            case 6: 
                Adicional chocolateEmPo = new ChocolateEmPo();
                totalValor += chocolateEmPo.getValor();
                adicionalList.add("Chocolate em Pó");
            break;
            case 7: 
                Adicional cookie = new Cookie();
                totalValor += cookie.getValor();
                adicionalList.add("Cookie");
            break;
            default: System.out.println("Você não selecionou nenhum adicional");
        }
    }

    public void maisAdicional() {
        Scanner sc = new Scanner(System.in);
        while (validator == 1) {
            System.out.println("Gostaria de colocar mais um adicional?(Lembre que isso é um café, não uma festa)");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            validador(sc.nextInt());
        }

    }

    private void validador(int op) {
        switch (op) {
            case 1: 
                selectAdicional();
                break;    
            case 2: 
                validator -= 1;
                break;
        }

    }

    public double getTotalValor() {
        return totalValor;
    }

    public ArrayList<String> getAdicionalList() {
        return adicionalList;
    }

    public ArrayList<String> getBebidasList() {
        return bebidasList;
    } 
}
