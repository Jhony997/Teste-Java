package TreinoAlgoritmoUGABUGA.Projeto01.Dominio;

import java.util.List;

public class roupasMedieval extends roupasTemplate {
    private List<String> catalogo;
    private int tamanho;

    public roupasMedieval(List<String> catalogo, int tamanho) {
        this.catalogo = catalogo;
        this.tamanho = tamanho;
    }

    @Override
    public void roupasTotal() {
        //Cabeça
        catalogo.add("Elmo paladino");
        catalogo.add("Elmo gladiador");

        //Tronco
        catalogo.add("Cota de malha");
        catalogo.add("Placa de metal");

        //Braços
        catalogo.add("Braçadeira de malha");
        catalogo.add("Braçadeira de metal");

        //Pernas
        catalogo.add("Vestido de malha");
        catalogo.add("Vestido de pano");
    }

    public List<String> getCatalogo() {
        return catalogo;
    }
}
