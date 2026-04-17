package TreinoAlgoritmoUGABUGA.Projeto01.Dominio;

import java.util.List;

public class roupas90s extends roupasTemplate {
    private List<String> catalogo;
    private int tamanho;

    public roupas90s(List<String> catalogo, int tamanho) {
        this.catalogo = catalogo;
        this.tamanho = tamanho;
    }

    @Override
    public void roupasTotal() {
        //Cabeça
        catalogo.add("Capacete Skatista");
        catalogo.add("Bone do Jackson");

        //Tronco
        catalogo.add("Jaqueta de motoboy");
        catalogo.add("Jaqueta de couro");

        //Braços
        catalogo.add("Pulseira de corda");
        catalogo.add("Pulseira de ouro");

        //Pernas
        catalogo.add("Jeens azul");
        catalogo.add("Jeens longo");
    }

    public List<String> getCatalogo() {
        return catalogo;
    }
}
