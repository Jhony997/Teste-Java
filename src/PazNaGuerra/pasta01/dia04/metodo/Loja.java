package PazNaGuerra.pasta01.dia04.metodo;

public class Loja {
    private String nome;
    private Produto produto;
    private int index;

    public Loja(String nome, Produto produto) {
        this.nome = nome;
        this.produto = produto;
    }

    public void catalogoLojaProdutos() {
        produto.produtoBrinquedo();
        produto.produtoComida();
        index = -1;

        System.out.println("----- Lista de produtos -----");
        for (String nomeProduto : produto.getNome()) {
            index++;
            System.out.println(nomeProduto + " | " + produto.getPreco().get(index) + "$");
        }
        System.out.println("----- Fim da lista -----");
    }

    public void compraProduto(Pessoa p1 , String input){
        System.out.println("Mulher do Caixa : Querendo comprar " + input + " ? ,Bacana!");
        index = -1;

        for(String catalogoProdutos : produto.getNome()){
            index++;
            if(input.equalsIgnoreCase(catalogoProdutos)){
                if(p1.getDinheiro() >= produto.getPreco().get(index)) {
                    System.out.println(catalogoProdutos + " | " + produto.getPreco().get(index) + "$ " + p1.getNome() + " Comprou! ");
                    p1.setDinheiro(p1.getDinheiro() - produto.getPreco().get(index));
                    System.out.println("Saldo atual : " + p1.getDinheiro());

                }else {
                    System.out.println("Saldo insuficiente : " + catalogoProdutos + " | " + produto.getPreco().get(index) +"$");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Loja OBA OBA LALALA : {" +
                "nome = '" + nome + '\'' +
                ", produto = " + produto +
                ", index = " + index +
                '}';
    }
}
