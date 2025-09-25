package solutions.exercise_2;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static BigInteger factorial(int n){
        long  a = n ;
        BigInteger  result = BigInteger.ONE;
        for (int i = 1; i <a; i++) {
            result =  result.multiply(BigInteger.valueOf(i));

        }
        return result;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter number please");

        int n = input.nextInt();

        System.out.println(factorial(n));



    }
}