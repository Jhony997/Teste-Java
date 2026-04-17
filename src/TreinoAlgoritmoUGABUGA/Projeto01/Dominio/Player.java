package TreinoAlgoritmoUGABUGA.Projeto01.Dominio;

public class Player {
    private String nome;
    private enum bodyPart {HEAD, CHEST, LEGS, ARMS}
    private bodyPart atualParte;
    private String roupa;

    public Player(String nome, bodyPart atualParte) {
        this.nome = nome;
        this.atualParte = atualParte;
    }
}
