package CollectionAPIs;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale hindi = new Locale("en");


        ResourceBundle bundle = ResourceBundle.getBundle("msgs");
        System.out.println(bundle.getString("greeting"));
        System.out.println(bundle.getString("message"));
    }
}
