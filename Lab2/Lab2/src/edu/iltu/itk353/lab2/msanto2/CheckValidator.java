package edu.iltu.itk353.lab2.msanto2;

public class CheckValidator {

    public static boolean isCounterfeit(String string) {
        if (string.length() != 10) {
            return true;
        }

        if (hasAlphaChar(string)) {
            return true;
        }

        if (threeOrMoreZerosInSuccession(string)) {
            return true;
        }

        if (fourOrMoreNonZerosInSuccession(string)) {
            return true;
        }

        return false;
    }

    private static boolean hasAlphaChar(String string) {
        return string.matches(".*[a-zA-Z].*");
    }

    private static boolean threeOrMoreZerosInSuccession(String string) {
        return string.matches(".*(0{3,}).*");
    }

    private static boolean fourOrMoreNonZerosInSuccession(String string) {
        return string.matches(".*([1-9]{4,}).*");
    }

}
