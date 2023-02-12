package javabasics._3;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        System.out.print("M");
        System.out.println("A");
        System.out.print('a');
        System.out.print('b');
        System.out.println('c');

    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        // Write your code here
        System.out.println("Exercise 2:");
        int age = 28;
        System.out.println("Age: " + age);
        boolean isAge21OrOver = age >= 21;
        System.out.println("Is age 21 or over? " + isAge21OrOver);
//exercise n2
        System.out.println("Exercise 2:");
        int age = 28;
        System.out.println("Age:" + age);
        boolean isAge24OrOver = age >= 24;
        System.out.println("Is age 24 or over? " + isAge24OrOver);
        boolean hadLunch = true;
        System.out.println("Had lunch? " + hadLunch);
        double lunchPrice = 7;
        System.out.println("Lunch price: €" + lunchPrice);
//exercise n 3
        System.out.println("Exercise 2:");
        int age = 28;
        System.out.println("Age: " + age);
        boolean isAge24OrOver = age >= 24;
        System.out.println("Is age 24 or over? " + isAge24OrOver);
        boolean hadLunch = true;
        System.out.println("Had lunch? " + hadLunch);
        double lunchPrice = 4;
        System.out.println("Lunch price: €" + lunchPrice);


    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        System.out.println("Exercise 3:");
        int age = 28;
        boolean isAge24OrOver = age >= 24;
        boolean hadLunch = true;
        double lunchCost = 4;

        System.out.println("Age: " + age);
        System.out.println("Is age 24 or over? " + isAge24OrOver);
        System.out.println("Had lunch? " + hadLunch);
        System.out.println("Lunch price: €" + lunchCost);

        //exercise n2
        System.out.println("Exercise 3:");

        char favouriteLetter = 'g';
        System.out.print("My favourite letter=");
        System.out.println(favouriteLetter);

    }
}
