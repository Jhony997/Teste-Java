package TreinoAlgoritmoUGABUGA.Projeto01.Eteste;

import TreinoAlgoritmoUGABUGA.Projeto01.Dominio.*;

import java.util.ArrayList;

public class test01 {
    public static void main(String[] args) {
        GuardaRoupas guardaRoupas = new GuardaRoupas(true,new roupas90s(new ArrayList<>(),1),new roupasEspacial(new ArrayList<>(),2),new roupasModerna(new ArrayList<>(),3),new roupasMedieval(new ArrayList<>(),4));

        guardaRoupas.usaRoupa("90s");
        guardaRoupas.usaRoupa("espacial");
        guardaRoupas.usaRoupa("Medieval");
        guardaRoupas.usaRoupa("Moderna");
    }
}
