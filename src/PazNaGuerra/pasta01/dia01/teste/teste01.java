package PazNaGuerra.pasta01.dia01.teste;

import PazNaGuerra.pasta01.dia01.Metodo.Pessoa;

import java.util.Scanner;
//series de classe divertidas para o java não saturar!!

public class teste01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jonas", 15,10, 0);

        boolean looper = true;
        Scanner in = new Scanner(System.in);
        int cooldownInteragir = 3;
        int totalDeDias = 1;

        while (looper){
            System.out.println("Digite 1 passar dia , 2 para interagir, 3 para encerrar, 4 exibir status");
           int inp = in.nextInt();

           if(inp == 1){
               p1.passaDia();
               totalDeDias++;
               cooldownInteragir = 3;
               System.out.println("Mais um dia novo! BOOOM DIA! [DIA ATUAL " + totalDeDias + " ]");
           }
           if(inp == 2 && cooldownInteragir > 0){
                p1.interagir();
                cooldownInteragir = cooldownInteragir - 1;
               System.out.println("Ação total hoje : " + cooldownInteragir);
           }else if (cooldownInteragir <= 0){
               System.out.println("Pule o dia para mais ação!");
           }

           if(inp == 3){
               looper = false;
               System.out.println("Encerrando jogo!");
           }

           if(inp == 4){
               p1.imprime();
           }

           if(p1.getIdade() >= 80 || p1.getVida() <= 0){
               looper = false;
               p1.morte();
           }

           ;
        }
    }
}
