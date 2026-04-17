package PazNaGuerra.pasta01.dia02.metodo;

public class FamilyPapazos extends PermissionHell{
    private String nome;
    protected int fundos;
    protected int trabalho;

    public FamilyPapazos(String nome ,int fundos,int trabalho) {
        this.nome = nome;
        this.fundos = fundos;
        this.trabalho = trabalho;
    }

    @Override
    public void irTrabalho() {
        this.fundos += trabalho;
        System.out.println(nome + " Fundos : " + fundos + "  Renda trabalho : "+ trabalho);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getFundos() {
        return fundos;
    }

    public void setFundos(int fundos) {
        this.fundos = fundos;
    }

    public int getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(int trabalho) {
        this.trabalho = trabalho;
    }
}
