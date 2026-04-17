package Javacore.Jwrappers.semana01.dia04.Dominio;

import java.util.List;

public class BancoItau extends BancoJava{
    public BancoItau(List<String> funcionarios, int dinheiro, List<String> cameras, String endereco) {
        super(funcionarios, dinheiro, cameras, endereco);

        funcionarios.add("Segurança : Renato");
        funcionarios.add("Dono : Paola");
        funcionarios.add("Caixista : Aragão");
        funcionarios.add("Caixista : Dorivau");
        funcionarios.add("Investidor : Jeovane");

        cameras.add("Camera 01 : Subsolo");
        cameras.add("Camera 02 : Terraço");
        cameras.add("Camera 03 : Entrada-1");
        cameras.add("Camera 04 : Entrada-2");
        cameras.add("Camera 05 : Cofre-1");
        cameras.add("Camera 06 : Cofre-2");
    }

    @Override
    public String toString() {
        return "BancoItau{}";
    }
}
