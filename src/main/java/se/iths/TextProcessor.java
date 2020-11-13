package se.iths;

public class TextProcessor {

    public static void main(String[] args) {

        System.out.println("Hej Pontus!");
        System.out.println(upperCase("Hej Pontus!"));
        System.out.println(lowerCase("Hej Pontus!"));
        System.out.println(backwards("Hej Pontus!"));
    }

    public static String upperCase(String s) {
        return s.toUpperCase();
    }

    public static String lowerCase(String s) {
        return s.toLowerCase();
    }

    public static String backwards(String s) {
        StringBuilder word = new StringBuilder();

        word.append(s);
        word.toString();
        StringBuilder reverseStr = word.reverse();

        return reverseStr.toString();
    }

}
