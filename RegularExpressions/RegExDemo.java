package RegularExpressions;

public class RegExDemo {
    public static void main(String[] args) {
        String name = "Anuj";
        String cell = "8643006438";
        String email = "anujpathakanuj371@gmail.com";

        String nameRegex = "[A-Z]{1}[a-z]{3,}";
        String cellRegex = "[6-9]{1}[0-9]{9}";
        String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        System.out.println(name.matches(nameRegex));
        System.out.println(cell.matches(cellRegex));
        System.out.println(email.matches(emailRegex));
    }

}
