package PazNaGuerra.pasta01.dia02.teste;

import PazNaGuerra.pasta01.dia02.metodo.FamilyPapazos;
//precioso melhorar isso urgentemente essa semana!

public class test01 {
    public static void main(String[] args) {

        FamilyPapazos f1 = new FamilyPapazos("Familia Papazos",15,1);
        FamilyPapazos f2 = new FamilyPapazos("Familia Molchat",25,5);
        FamilyPapazos f3 = new FamilyPapazos("Familia Polinarf",45,3);
        FamilyPapazos f4 = new FamilyPapazos("Familia Sakura",20,8);

        f1.irTrabalho();
        f2.irTrabalho();
        f3.irTrabalho();
        f4.irTrabalho();



    }
}
