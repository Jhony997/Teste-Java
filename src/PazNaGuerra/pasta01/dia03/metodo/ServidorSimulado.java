package PazNaGuerra.pasta01.dia03.metodo;

import java.util.Scanner;

public class ServidorSimulado {
    private boolean rodando;
    private Scanner in = new Scanner(System.in);

    public ServidorSimulado(boolean rodando) {
        this.rodando = rodando;
    }
    public void servidor(String input, Loja lj, Pessoa pe){
        while (rodando){
            System.out.println("Bem vindo | " + pe.getNome() + " |  A loja : " + lj.getNomeLoja() + " | Seu saldo atual : " + pe.getDinheiro() + "$");
            System.out.println("Digite produto que quer comprar : brinquedo | ferramenta | eletrodomesticos | roupas");
            lj.listaPreco();

            input = in.next();

            lj.caixas(pe,input);
            System.out.println("Seu Saldo atual : " + pe.getDinheiro() + "$");

            System.out.println("digite exit -> sair loja | digite qualquer -> coisa para continuar !");
            input = in.next();
            controle(input);
        }
    }
    public void controle(String input){
        if(input.equalsIgnoreCase("exit")){
            rodando = false;
        }
    }
}
