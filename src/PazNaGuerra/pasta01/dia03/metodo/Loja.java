package PazNaGuerra.pasta01.dia03.metodo;

import java.util.Scanner;

public class Loja {
    private String funcionarioCaixa;
    private String nomeLoja;
    private int desconto;

    public Loja(String funcionarioCaixa, String nomeLoja, int desconto) {
        this.funcionarioCaixa = funcionarioCaixa;
        this.nomeLoja = nomeLoja;
        this.desconto = desconto;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public void caixas(Pessoa pe, String input) {
        funcionarioCaixa = "Jonas";
        System.out.println("Indo ao caixa | Funcionario do caixa :" + funcionarioCaixa);
        System.out.println(funcionarioCaixa + " : Bom dia, vamos passar o produto no caixa");
        Produtos pr = new Produtos(0, 0, 0, 0);

        pr.plateleira();

        switch (input) {
            case "brinquedo":
                if (pe.getDinheiro() >= pr.getBrinquedo()) {
                    pe.setDinheiro(pe.getDinheiro() - pr.getBrinquedo());
                    System.out.println("Compra realizada | Comprou brinquedos | Valor : " + pr.getBrinquedo() + "$");
                }
                if (pe.getDinheiro() < pr.getBrinquedo()) {
                    System.out.println("[ !!! Sem dinheiro | para comprar Brinquedos !!! ]");
                }
                break;
            case "ferramenta":
                if (pe.getDinheiro() >= pr.getFerramentas()) {
                    pe.setDinheiro(pe.getDinheiro() - pr.getFerramentas());
                    System.out.println("Compra realizada | Comprou Ferramentas | Valor : " + pr.getFerramentas() + "$");
                }
                if (pe.getDinheiro() < pr.getFerramentas()) {
                    System.out.println("[ !!! Sem dinheiro | para comprar Ferramentas !!! ]");
                }
                break;
            case "eletrodomesticos":
                if (pe.getDinheiro() >= pr.getEletroDomesticos()) {
                    pe.setDinheiro(pe.getDinheiro() - pr.getEletroDomesticos());
                    System.out.println("Compra realizada | Comprou eletrodomesticos | Valor :  : " + pr.getEletroDomesticos() + "$");
                    if (pe.getDinheiro() < pr.getEletroDomesticos()) {
                        System.out.println("[ !!! Sem dinheiro | para comprar eletrodomesticos !!! ]");
                    }
                }
                break;
            case "roupas":
                if (pe.getDinheiro() >= pr.getRoupas()) {
                    pe.setDinheiro(pe.getDinheiro() - pr.getRoupas());
                    System.out.println("Compra realizada | Comprou Roupas | Valor : " + pr.getRoupas() + "$");
                    if (pe.getDinheiro() < pr.getRoupas()) {
                        System.out.println("[ !!! Sem dinheiro | para comprar roupas !!! ]");
                    }
                }
                break;
            default:
                System.out.println("Opção de produto inválida tente outro!");
                break;
        }
    }

    public void listaPreco() {
        Produtos pr = new Produtos(0, 0, 0, 0);

        pr.plateleira();
        System.out.println("----- Lista de preço -----");
        System.out.println("Brinquedo : " + pr.getBrinquedo() + "$");
        System.out.println("EletroDomesticos : " + pr.getEletroDomesticos() + "$");
        System.out.println("Ferramentas : " + pr.getFerramentas() + "$");
        System.out.println("Roupas : " + pr.getRoupas() + "$");
    }
}



