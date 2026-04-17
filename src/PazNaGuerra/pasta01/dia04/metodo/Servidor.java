package PazNaGuerra.pasta01.dia04.metodo;

import java.util.Scanner;

public class Servidor {
    private boolean rodando = true;
    private Scanner in = new Scanner(System.in);
    private int contagemLoop = 0;

    public void servidor(Loja loja, Pessoa pessoa) {
        loja.catalogoLojaProdutos();
        while (rodando) {
            contagemLoop++;
            System.out.println("Loop Rodada : " + contagemLoop);
            System.out.println("Digite o produto que dejesa comprar : ");
            String input = in.next();
            loja.compraProduto(pessoa, input);

            System.out.println("Para encerra código digite : off");
            input = in.next();

            if(input.equalsIgnoreCase("off")){
                rodando = false;
            }
            pessoa.carrinho();
        }
    }
}

