package PazNaGuerra.pasta01.dia04.teste;

import PazNaGuerra.pasta01.dia04.metodo.Loja;
import PazNaGuerra.pasta01.dia04.metodo.Pessoa;
import PazNaGuerra.pasta01.dia04.metodo.Produto;
import PazNaGuerra.pasta01.dia04.metodo.Servidor;

//a gente ta criando novos métodos toda vez e duplicando, precisamos melhora isso!
// parece ser isso dentro do while compra(); , preciso tomar cuidado!
// não to conseguindo coloca nada no carrinho na variável List.

import java.util.ArrayList;

public class test02 {
    public static void main(String[] args) {
        Loja re = new Loja("Renners",new Produto(new ArrayList<>(), new ArrayList<>()));
        Pessoa p1 = new Pessoa(10,15_000,"Jonas",new ArrayList<>());
        Servidor serve = new Servidor();

        serve.servidor(re,p1);
    }
}
