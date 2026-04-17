package TreinoAlgoritmoUGABUGA.Projeto01.Dominio;

public class GuardaRoupas {
    private boolean isGuardaRoupa;
    roupas90s s90;
    roupasEspacial esp;
    roupasModerna mord;
    roupasMedieval med;

    public GuardaRoupas(boolean isGuardaRoupa, roupas90s s90, roupasEspacial esp, roupasModerna mord, roupasMedieval med) {
        this.isGuardaRoupa = isGuardaRoupa;
        this.s90 = s90;
        this.esp = esp;
        this.mord = mord;
        this.med = med;
    }

    public void usaRoupa(String input){
        s90.roupasTotal();
        esp.roupasTotal();
        mord.roupasTotal();
        med.roupasTotal();

        switch (input) {
            case "90s":
                System.out.println("--- 90s Roupas ---");
                for (String roupas : s90.getCatalogo()) {
                    System.out.println(roupas);
                }
                break;
            case "espacial":
                System.out.println("--- Espacial Roupas ---");
                for (String roupas : esp.getCatalogo()){
                    System.out.println(roupas);
                }
                break;
            case "Medieval":
                System.out.println("--- Medieval Roupas ---");
                for (String roupas : med.getCatalogo()){
                    System.out.println(roupas);
                }
                break;
            case "Moderna":
                System.out.println("--- Moderna Roupas ---");
                for (String roupas : mord.getCatalogo()){
                    System.out.println(roupas);
                }
                break;
        }
    }
}
