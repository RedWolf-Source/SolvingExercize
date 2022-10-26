import java.lang.Math;

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
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
}
