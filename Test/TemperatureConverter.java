package Test;

public class TemperatureConverter implements Temperature {
    @Override
    public double cToF(double cel){
        return (cel*((double) 5 /9))+32;
    }

    @Override
    public double fToC(double fah) {
        return (fah-32)*(5/9);
    }
}
