import java.lang.Math;
import java.util.Scanner;

public class Exercise {

    public static void exercise1 (){
        // Pi with two characters
        double result = Math.PI;
        System.out.println(String.format("%.2f", result));
    }

    public static void exercise2 () {
        // Logarithm with one character
        double result = Math.E;
        System.out.println(String.format("%.1f", result));
    }
    public static void exercise3 () {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        System.out.println("You entered number: " + number);
    }
    public static void exercise4 () {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        System.out.println(number + " - this is entered number");
    }

    public static void exercise5 () {
        System.out.println("1 13 49");
    }

    public static void exercise6 () {
        System.out.println("7  15  100");
    }
    public static void exercise10 () {
        System.out.println("5");
        System.out.println("10");
        System.out.println("21");
    }
    public static void main(String[] args) {
        exercise1();
        exercise2();
        // exercise3();
        // exercise4();
        exercise5();
        exercise6();
        exercise10();
    }
}
