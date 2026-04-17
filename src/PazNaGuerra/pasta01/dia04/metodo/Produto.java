package PazNaGuerra.pasta01.dia04.metodo;

import java.util.List;

public class Produto {
    private List<String> nome;
    private List<Integer> preco;

    public Produto(List<String> nome, List<Integer> preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void criaProdutos(){
        //tenta usar depois
    }

    public void produtoBrinquedo(){
        nome.add(0,"Soldadinho");
        nome.add(1,"Carros");
        nome.add(2,"Arminha");
        nome.add(3,"Bumerang");
        nome.add(4,"Bola");

        preco.add(0,15);
        preco.add(1,120);
        preco.add(2,245);
        preco.add(3,450);
        preco.add(4,30);
    }

    public void produtoComida(){
        nome.add(0,"Picanha");
        nome.add(1,"Sushi");
        nome.add(2,"Peixe");
        nome.add(3,"Hamburguer");
        nome.add(4,"Macarronada");

        preco.add(0,45_000);
        preco.add(1,400);
        preco.add(2,120);
        preco.add(3,15);
        preco.add(4,40);
    }

    public List<String> getNome() {
        return nome;
    }

    public List<Integer> getPreco() {
        return preco;
    }
}
