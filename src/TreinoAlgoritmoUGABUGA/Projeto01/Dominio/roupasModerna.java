package TreinoAlgoritmoUGABUGA.Projeto01.Dominio;

import java.util.List;

public class roupasModerna extends roupasTemplate {
    private List<String> catalogo;
    private int tamanho;

    public roupasModerna(List<String> catalogo, int tamanho) {
        this.catalogo = catalogo;
        this.tamanho = tamanho;
    }

    @Override
    public void roupasTotal() {
        //Cabeça
        catalogo.add("Capacete de moto");
        catalogo.add("Chapeu preto");

        //Tronco
        catalogo.add("Camisa branca");
        catalogo.add("Camisa com logo");

        //Braços
        catalogo.add("Relógio de prata");
        catalogo.add("Celular e5-Plus");

        //Pernas
        catalogo.add("Calça de lã");
        catalogo.add("Bermuda de práia");
    }

    public List<String> getCatalogo() {
        return catalogo;
    }
}
