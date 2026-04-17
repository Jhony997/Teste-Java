package TradutoSinho.Pasta01.dia01;

import java.util.Locale;
import java.util.ResourceBundle;

public class teste01 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("appe",new Locale("en","US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("game"));
        System.out.println(bundle.getString("morning"));

        ResourceBundle bundle1 = ResourceBundle.getBundle("appe",new Locale("pt","BR"));
        System.out.println(bundle1.getString("hello"));
        System.out.println(bundle1.getString("game"));
        System.out.println(bundle1.getString("morning"));

    }
}
