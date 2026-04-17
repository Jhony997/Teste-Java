package LendoDocumentacao.Stack.teste;

import LendoDocumentacao.Stack.Metodo.CLT;
import LendoDocumentacao.Stack.Metodo.Pessoa;
import PazNaGuerra.pasta01.dia04.metodo.Loja;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        Pessoa p = new Pessoa(2_000);
        p.idade = 20;

        System.out.println(p.idade);
        System.out.println(p);

        System.out.println(CLT.CLTcartaDEtrabai);
    }
}
