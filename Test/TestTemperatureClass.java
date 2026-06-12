package Test;

public class TestTemperatureClass {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println(tc.cToF(100));
        System.out.println(tc.fToC(33));
    }
}
