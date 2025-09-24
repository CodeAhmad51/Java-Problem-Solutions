package solutions.exercise_1;

import java.util.Scanner;

public class Main {
    // This function checks if a number is even.
    static boolean isEven(int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(isEven(number)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
