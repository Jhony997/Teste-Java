package Boolean;

import java.util.InputMismatchException;
import java.util.Scanner;
//código antigo totalmente imperativo -> Não escala

public class Binario01Jogo {
    public static void main(String[] args) {
        long flag32bits = 0;
        int x = 0;
        int y = 0;
        int total = 0;
        int money = 0;
        int round = 0;
        boolean rodando = true;


        System.out.println("digite 256 para condição teste !");
        Scanner leitor = new Scanner(System.in);


        while (rodando) {
            try {

                int entrada = leitor.nextInt();
                System.out.println("----- Round " + round + "-----");
                flag32bits = flag32bits + entrada;

                System.out.println("Vai andar quantas casas em X? ");
                int posicao_x = leitor.nextInt();
                if (posicao_x >= 21) {
                    System.out.println("posição invalida tem que ser menor que 21");
                } else {
                    x = x + posicao_x;
                    total = total + posicao_x;
                }
                System.out.println("Posição X atual : \"" + x);

                System.out.println("Vai andar quantas casas em Y? ");
                int posicao_y = leitor.nextInt();
                if (posicao_y >= 21) {
                    System.out.println("posição invalida tem que ser menor que 21");
                } else {
                    y = y + posicao_y;
                    total = total + posicao_y;

                }
                System.out.println("Posição Y atual : \"" + y);

                System.out.println("Digite 0 para sair ! ");
                int sair = leitor.nextInt();


                flag32bits = sair;
                round = round + 1;

                if (flag32bits == 0) {
                    rodando = false;
                }
                if (x >= 100 || y >= 100) {
                    x = 0;
                    y = 0;
                    money = money + 1;
                    System.out.println("Ganhou +1 de dinheiro : \"" + money + "$");
                }

                if (flag32bits == 256) {
                    System.out.println("Condição teste ativa :D");
                }


            } catch (InputMismatchException e) {
                System.out.println("Digite Apenas número ou números até 20!");
                leitor.next();
                continue;
            }
        }


        System.out.println("----- Jogo encerrado -----");
        System.out.println("Money : \"" + money);
        System.out.println("Total caminhado : \"" + total);
        System.out.println("Posição X \"" + x + "/   Posição Y \"" + y + "$");
        leitor.close();


    }
}
