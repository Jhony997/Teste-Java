package Javacore.Jwrappers.semana01.dia04.Test;

import Javacore.Jwrappers.semana01.dia04.Dominio.BancoItau;
import Javacore.Jwrappers.semana01.dia04.Dominio.BancoJava;
import Javacore.Jwrappers.semana01.dia04.Dominio.Pessoa;

//praticar hoje isso vou dormi agora nessa merda !!
//FICOU UMA MERDA KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK
//Preciso parar de depender muito do construtor

//Abstract + Interface talvez?
//Menos Get/Set? Protect?
import java.util.ArrayList;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Bruno","Garcia",15_000,"90845","Laura barbosa");
        Pessoa p2 = new Pessoa("Danilo","Ribeiro",25_000,"67845","Kooppe barbosa");

        BancoJava bj = new BancoJava(new ArrayList<>(),100_000,new ArrayList<>(),"RUa barbosa");
        BancoItau bI = new BancoItau(new ArrayList<>(),250_000,new ArrayList<>(),"Rua marechal");

        boolean dentroLoja = true;
        Scanner leitor = new Scanner(System.in);
        int stackBJ = bj.getDinheiro();
        int stackBI = bI.getDinheiro();
        bj.imprime(p1);
        bI.imprime(p2);
        while(dentroLoja){
            System.out.println("Digite quantidade dinheiro que quer sacar : ");
           int saque = leitor.nextInt();
           stackBJ = stackBI - saque;
            System.out.println("Total banco : " + stackBJ);
            System.out.println("Valor sacado (lá ele 1000x) : " + saque);
            dentroLoja = !dentroLoja;
        }
        System.out.println("Código Horroso finalizado MEU DEUS");
    }
}
