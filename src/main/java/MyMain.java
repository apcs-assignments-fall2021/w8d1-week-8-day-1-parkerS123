import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        int WillHarris = (int)(Math.random() * 11) + 10;
        return WillHarris;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {

        int m = randomTeen();
        int o = randomTeen();
        int p = randomTeen();

        System.out.println(Mathey.max(m, Mathey.max(o, p)));

        // pythag theorem

        System.out.println(Mathey.sqrt(Mathey.pow(5 , 2) + Mathey.pow(12, 2)));



         // My tests
        System.out.println("Mathey.max tests");
        System.out.println("Mathey max int 2");
        System.out.println(Mathey.max(1, 2)); // 2
        System.out.println(Mathey.max(2, 1)); // 2

        System.out.println("Mathey max double 2");
        System.out.println(Mathey.max(3.0,4.5)); // 4.5
        System.out.println(Mathey.max(34.2,16.5)); // 34.2

        System.out.println("Mathey max int 3");
        System.out.println(Mathey.max(3, 7, 12)); // 12
        System.out.println(Mathey.max(6, 1, 2)); // 6

        System.out.println("Mathey max double 4");
        System.out.println(Mathey.max(3, 55, 6,44)); // 55
        System.out.println(Mathey.max(22, 5, 18,0)); // 22

        System.out.println("Random int 2");
        System.out.println(Mathey.randomInteger(4,12));
        System.out.println(Mathey.randomInteger(32,120));

        System.out.println("Random int 1");
        System.out.println(Mathey.randomInteger(6));
        System.out.println(Mathey.randomInteger(43));

        System.out.println("pow test");
        System.out.println(Mathey.pow(3,4));
        System.out.println(Mathey.pow(2,6));

        System.out.println("ABS test");
        System.out.println(Mathey.abs(-5));
        System.out.println(Mathey.abs(24));

        System.out.println("Round test");
        System.out.println(Mathey.round(3.4));
        System.out.println(Mathey.round(7.6));

        System.out.println("Floor test");
        System.out.println(Mathey.floor(4.6));
        System.out.println(Mathey.floor(43.9));

        System.out.println("Ceiling test");
        System.out.println(Mathey.ceil(3.01));
        System.out.println(Mathey.ceil(65.999));

        System.out.println("Sqrt test");
        System.out.println(Mathey.sqrt(42.7));
        System.out.println(Mathey.sqrt(144.0));



    }

}


