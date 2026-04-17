package Javacore.Jwrappers.semana01.dia03.Dominio;

import java.util.List;

public class MercadoAcai {
    private List<String> listaCompra;
    private List<String> funcionarios;

    public MercadoAcai(List<String> lista, List<String> funcionarios) {
        this.listaCompra = lista;
        this.funcionarios = funcionarios;
        listaCompra.add("Macarrão");
        listaCompra.add("Feijão");
        listaCompra.add("Batata Doce");
        listaCompra.add("Ervilha");



        funcionarios.add("{Gerente} João");
        funcionarios.add("{Chefe} Carlos");
        funcionarios.add("{Caixa} Danilo");
        funcionarios.add("{Repositor} Renato");
    }

    public List<String> getListaCompra() {
        return listaCompra;
    }

    public List<String> getFuncionarios() {
        return funcionarios;
    }
}
