package com.csc;
import java.util.Scanner;
public class Factorizer {
    public String prime_factors(int number) {
        if (number <= 1) {
            return null;
        }
        String result = "";
        int factor = 2;
        while (number > 1) {
            if (number % factor == 0) {
                if (!result.isEmpty()) {
                    result += ","; 
                }
                result += factor;
                number /= factor;
            } else {
                factor++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Factorizer factorizer = new Factorizer();
        Scanner scan = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter a prime number to determine its factors: ");
            number = scan.nextInt();
            if (number > 1) {
                break;
            }
            System.out.println("Entry must be greater than 1. Please try again.");
        }
        String result = factorizer.prime_factors(number);
        if (result != null) {
            System.out.println("Factors of " + number);
            System.out.println(result);
        }
        scan.close();
    }
}
