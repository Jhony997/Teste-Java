package PazNaGuerra.pasta01.dia03.metodo;

public class Produtos {
    private int brinquedo;
    private int ferramentas;
    private int eletroDomesticos;
    private int roupas;

    public Produtos(int brinquedo, int ferramentas, int eletroDomesticos, int roupas) {
        this.brinquedo = brinquedo;
        this.ferramentas = ferramentas;
        this.eletroDomesticos = eletroDomesticos;
        this.roupas = roupas;
    }

    public void plateleira(){
        brinquedo = 10;
        ferramentas = 140;
        eletroDomesticos = 200;
        roupas = 15;
    }

    public int getBrinquedo() {
        return brinquedo;
    }

    public void setBrinquedo(int brinquedo) {
        this.brinquedo = brinquedo;
    }

    public int getFerramentas() {
        return ferramentas;
    }

    public void setFerramentas(int ferramentas) {
        this.ferramentas = ferramentas;
    }

    public int getEletroDomesticos() {
        return eletroDomesticos;
    }

    public void setEletroDomesticos(int eletroDomesticos) {
        this.eletroDomesticos = eletroDomesticos;
    }

    public int getRoupas() {
        return roupas;
    }

    public void setRoupas(int roupas) {
        this.roupas = roupas;
    }
}
