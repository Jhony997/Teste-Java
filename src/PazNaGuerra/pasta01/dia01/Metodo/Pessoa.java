package PazNaGuerra.pasta01.dia01.Metodo;

import java.util.Random;

public class Pessoa {
    private String nome;
    private int idade;
    private int vida;
    private int money;
    protected Random gerador = new Random();

    protected boolean tempoVida;


    public Pessoa(String nome, int idade, int vida, int money) {
        this.nome = nome;
        this.idade = idade;
        this.vida = vida;
        this.money = money;
    }
    public void imprime(){
        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Vida : " + vida);
        System.out.println("Dinheiro : " + money);
    }
    public void passaDia(){
        this.idade = idade + 1;
        this.vida = vida + 1;
    }
    public void interagir(){
        int rng = gerador.nextInt(4);

        if(rng <= 1){
            this.vida = vida - 2 ;
            System.out.println("Você se esforçou em vão e levou dano!");
        }
        if(rng == 2){
            this.money = money + 15;
            System.out.println("Trabalho bem sucedido, +15$ para conta!");
        }
        if(rng == 3){
            this.vida = vida + 3;
            this.money = money + 25;
            System.out.println("Dia feliz , +3 hp e +25$ !");
        }
    }

    public boolean morte(){
        if(vida <= 0 || idade >= 80){
            System.out.println("Você morreu !");
        }
        return tempoVida;
    }

    public String getNome() {
        return nome;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
