package TreinoAlgoritmoUGABUGA.Projeto01.Dominio;

import java.util.List;

public class roupasEspacial extends roupasTemplate {
    private List<String> catalogo;
    private int tamanho;

    public roupasEspacial(List<String> catalogo, int tamanho) {
        this.catalogo = catalogo;
        this.tamanho = tamanho;
    }

    @Override
    public void roupasTotal() {
        //Cabeça
        catalogo.add("Capacete Lunar");
        catalogo.add("Capacete Orbitral");

        //Tronco
        catalogo.add("Jaqueta KOSMONAUTA");
        catalogo.add("Camisa Estiloza da C.I.A");

        //Braços
        catalogo.add("Relógio temporal");
        catalogo.add("Propulsor de 1 GW");

        //Pernas
        catalogo.add("Tubo de oxigênio");
        catalogo.add("Calça da nasa");
    }

    public List<String> getCatalogo() {
        return catalogo;
    }
}
