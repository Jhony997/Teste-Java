package LendoDocumentacao.Stack.Metodo;

// https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-2.html
// https://dev.to/anaccortez/heap-vs-stack-como-o-java-gerencia-o-que-deve-ser-lembrado-ou-esquecido-3ndm
public class Pessoa extends CLT {
    public int idade;


    @Override
    public String toString() {
        return "PessoaDaToString{" +
                "idade=" + idade +
                " | DEBBUGER HUMANO BUAAAAAAAAAAH, MÁQUINA" +
                '}';
    }

    public Pessoa(int salario) {
        super(salario);
        salario += 100;
    }
}

