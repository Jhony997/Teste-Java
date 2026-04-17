package PazNaGuerra.pasta01.dia03.teste;

import PazNaGuerra.pasta01.dia03.metodo.Loja;
import PazNaGuerra.pasta01.dia03.metodo.Pessoa;
import PazNaGuerra.pasta01.dia03.metodo.ServidorSimulado;

import java.util.Scanner;
// Colocar desconto | Melhora os texto (validação).
// Melhora imperativo vs evento.
//Não consigo usar toLowerCase.
//Viro Espaguete rápido e nada escalável é joga no lixo tudo isso msm!
// Me ajudou a aprender mais um pouco.

//Versão atual código 1.0 (totalmente inicial)

public class test01 {
    public static void main(String[] args) {
        Loja avan = new Loja("Jonas", "Avan", 5);
        Pessoa carlos = new Pessoa("Carlos Robert", 130);
        ServidorSimulado sv = new ServidorSimulado(true);
        Scanner in = new Scanner(System.in);


        System.out.println("| Digite qualquer coisa para começar |");
        String input = in.next();
        sv.servidor(input, avan, carlos);
    }
}
