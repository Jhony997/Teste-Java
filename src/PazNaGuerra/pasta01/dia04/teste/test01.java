package PazNaGuerra.pasta01.dia04.teste;

import PazNaGuerra.pasta01.dia04.metodo.Loja;
import PazNaGuerra.pasta01.dia04.metodo.Pessoa;
import PazNaGuerra.pasta01.dia04.metodo.Produto;

import java.util.ArrayList;

// Está horrível , porém meu primeiro contato com objeto sério!
// preciso criar um cestinho de compra na classe Pessoa!
// preciso criar a classe servidor para não deixa tudo main!

public class test01 {
    public static void main(String[] args) {
        Loja h1 = new Loja("Henner",new Produto(new ArrayList<String>(),new ArrayList<Integer>()));
        Pessoa jonas = new Pessoa(24,15_000,"Jonas",new ArrayList<>());

        h1.catalogoLojaProdutos();
        h1.compraProduto(jonas,"Bola");
        h1.compraProduto(jonas,"sushi");
        h1.compraProduto(jonas,"PeIxE");

        //too string test
        System.out.println("ToString : " + h1);
        System.out.println("ToString : " + jonas);
    }
}
