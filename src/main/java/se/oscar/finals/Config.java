package se.oscar.finals;

public class Config {
    public static final String appName = "Apple";
    public static final String appVersion = "1.0.0";
    public static final int maxUser = 5;

    public static void printConfig() {
        System.out.println("App name : " + appName);
        System.out.println("App version : " + appVersion);
        System.out.println("Max users : " + maxUser);
    }
}
