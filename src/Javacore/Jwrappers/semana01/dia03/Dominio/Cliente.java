package Javacore.Jwrappers.semana01.dia03.Dominio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private double dinheiro;
    private List<String> Carrinho;

    public Cliente(String nome, double dinheiro, List<String> carrinho) {
        this.nome = nome;
        this.dinheiro = dinheiro;
        Carrinho = carrinho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public List<String> getCarrinho() {
        return Carrinho;
    }

    public void setCarrinho(List<String> carrinho) {
        Carrinho = carrinho;
    }
}

