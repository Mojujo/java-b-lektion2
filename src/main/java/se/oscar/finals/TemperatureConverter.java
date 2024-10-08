package se.oscar.finals;

public class TemperatureConverter {

    public static int toCelsius(int temp) {
        return (temp - 32) * 5 / 9;
    }

    public static int toFahrenheit(int temp) {
        return (temp * 9 / 5) + 32;
    }
}
