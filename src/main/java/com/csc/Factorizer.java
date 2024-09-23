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

    // portfolio add-on for is it prime?
public boolean prime(int number) {
    if (number <= 1) {
        return false;
    }
    String factors = prime_factors(number);
    return factors != null && factors.equals(Integer.toString(number));
    }
    // portfolio add-on for is it composite?
    public boolean composite(int number) {
        return number > 1 && !prime(number);
        }
    
    public static void main(String[] args) {
        Factorizer factorizer = new Factorizer();
        Scanner scan = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter a number to determine its factors: ");
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
    // portfolio add-on for is it prime?
        if (factorizer.prime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    // portfolio add-on for is it composite?
        if (factorizer.composite(number)) {
            System.out.println(number + " is a composite number.");
        } else {
            System.out.println(number + " is not a composite number.");
        }
    }
}
