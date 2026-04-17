package PazNaGuerra.pasta01.dia04.metodo;

import java.util.List;

public class Pessoa {
    private int idade;
    private int dinheiro;
    private String nome;
    private List<String> carrinho;

    public Pessoa(int idade, int dinheiro, String nome, List<String> carrinho) {
        this.idade = idade;
        this.dinheiro = dinheiro;
        this.nome = nome;
        this.carrinho = carrinho;
    }
    public void carrinho(){
        for(String num : carrinho){
            System.out.println("Carrinho : " + num);
        }
    }

    public int getIdade() {
        return idade;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public String getNome() {
        return nome;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public List<String> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<String> carrinho) {
        this.carrinho = carrinho;
    }
}
