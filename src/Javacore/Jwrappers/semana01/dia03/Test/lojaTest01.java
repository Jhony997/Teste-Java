package Javacore.Jwrappers.semana01.dia03.Test;
//To tentando fazer isso !! tá muito fudido primeira vez usando essa merda PQP!!! (05 / 02 / 2026)

import Javacore.Jwrappers.semana01.dia03.Dominio.CaixaImpressora;
import Javacore.Jwrappers.semana01.dia03.Dominio.Cliente;
import Javacore.Jwrappers.semana01.dia03.Dominio.MercadoAcai;

import java.util.ArrayList;

/*
OK tive que apagar três vezes o código inteiro hoje

1. Preciso aprender a usar ArrayList melhor e passar nos construtor.
2. Poliomorfismo com Arraylist / Classe teste me quebrou tudo.
3. Preciso Melhorar a hierarquia de POO.

// Preciso depender menos do metodo imprime!
 */
public class lojaTest01 {
    public static void main(String[] args) {
        MercadoAcai ma = new MercadoAcai(new ArrayList<>(),new ArrayList<>());
        Cliente c1 = new Cliente("João",20_000,new ArrayList<>());
        Cliente c2 = new Cliente("Carlos",15_000,new ArrayList<>());

        CaixaImpressora imprime = new CaixaImpressora();

        for(String nome : ma.getListaCompra()){
            c1.getCarrinho().add(nome);
            c2.getCarrinho().add(nome);
        }

        imprime.Imprime(c1,ma);
        imprime.Imprime(c2,ma);

    }
}
