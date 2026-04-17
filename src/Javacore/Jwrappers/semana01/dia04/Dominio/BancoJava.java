package Javacore.Jwrappers.semana01.dia04.Dominio;

import java.util.List;

public class BancoJava {
    private List<String> funcionarios;
    private int dinheiro;
    private List<String> cameras;
    private String endereco;

    public BancoJava(List<String> funcionarios, int dinheiro, List<String> cameras, String endereco) {
        this.funcionarios = funcionarios;
        this.dinheiro = dinheiro;
        this.cameras = cameras;
        this.endereco = endereco;

        funcionarios.add("Segurança : Jhon");
        funcionarios.add("Dono : Carlos");
        funcionarios.add("Caixista : Daniele");
        funcionarios.add("Caixista : Kelvin");

        cameras.add("Camera 01 : Subsolo");
        cameras.add("Camera 02 : Terraço");
        cameras.add("Camera 03 : Entrada");
        cameras.add("Camera 04 : Cofre");
    }
    public void imprime(Pessoa p){
        System.out.println("Clientes : "+ p.getNome() );
        System.out.println("Valor Cliente : " + p.getDinheiro());
        System.out.println("CPF Cliente : " + p.getCpf());
        System.out.println("Moradia do Cliente : " + p.getSobreNome());

        System.out.println("Nome do banco : "+ toString());
        System.out.println("Renda : " + this.dinheiro);
        System.out.println(this.funcionarios);
        System.out.println(this.cameras);
        System.out.println(this.endereco);
        System.out.println();
        System.out.println();
    }

    public List<String> getFuncionarios() {
        return funcionarios;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public List<String> getCameras() {
        return cameras;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "BancoJava{" +
                '}';
    }
}
