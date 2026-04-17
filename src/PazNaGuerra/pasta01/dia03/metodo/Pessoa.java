package PazNaGuerra.pasta01.dia03.metodo;

public class Pessoa {
    private String nome;
    private int dinheiro;

    public Pessoa(String nome, int dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }
}
