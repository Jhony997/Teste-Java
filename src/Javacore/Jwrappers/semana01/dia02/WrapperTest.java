package Javacore.Jwrappers.semana01.dia02;

//https://www.youtube.com/playlist?list=PLYoZ5NeRgzjfrhsW3ecpWbp9VLxVLwic3

//Ficou uma bosta K K K K K , vou separar em classes e usar melhor memória [ Dia 03 HOJE KSKS ] !

import java.util.ArrayList;

public class WrapperTest {
    public static void main(String[] args) {
        ArrayList<Integer> m1 = new ArrayList<>();
        m1.add(101);

        String nString = "256";
        int numero = Integer.parseInt(nString);
        System.out.println("String -> int : " + numero);



        int tipoPrimitivo = 0;

        for (int i = 0; i < 10; i++) {
            m1.add(i);
            tipoPrimitivo = i;
            System.out.println("-----Cadeia LOOP [" + i + " ] -----");
            System.out.println("Valores Lista : " + m1);
            System.out.println("Valor Primitivo : " + tipoPrimitivo);
            System.out.println("----- ||| -----");
        }
    }
}
