package Javacore.Jwrappers.semana01.dia04.Dominio;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private int dinheiro;
    private String cpf;
    private String Lar;

    public Pessoa(String nome, String sobreNome, int dinheiro, String cpf, String lar) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dinheiro = dinheiro;
        this.cpf = cpf;
        Lar = lar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLar() {
        return Lar;
    }

    public void setLar(String lar) {
        Lar = lar;
    }
}
