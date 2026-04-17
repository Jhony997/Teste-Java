package Javacore.Jwrappers.semana01.dia03.Dominio;

public class CaixaImpressora {

    public void Imprime(Cliente c, MercadoAcai m){
        System.out.println("--- LLL ---");
        System.out.println("Cliente : " + c.getNome());
        System.out.println("Dinheiro : " + c.getDinheiro());
        System.out.println("Carrinho : " + c.getCarrinho());

        System.out.println("--- Mercado ---");
        System.out.println("Funcionarios : " + m.getFuncionarios());
        System.out.println("Produtos : " + m.getListaCompra());
    }
}
