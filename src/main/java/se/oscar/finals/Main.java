package se.oscar.finals;

public class Main {
    public static void main(String[] args) {
        System.out.println(MathConstants.addTen(5));

        System.out.println(Circle.area(5));

        Config.printConfig();

        System.out.println(TemperatureConverter.toCelsius(54));
        System.out.println(TemperatureConverter.toFahrenheit(54));
    }
}
