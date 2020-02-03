package homeworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw3 {
    private static ArrayList<Integer> primes = new ArrayList<Integer>();

    public static void primeNumber() {
        int number = 0;
        Scanner kb = new Scanner(System.in);
        int[] primeNumbers = new int[10];
        int primeNumberCount = 0;
        System.out.println("Enter a number (over than 1):");
        number = kb.nextInt();
        kb.close();
        if (number <= 1) {
            System.out.println("Invalid number please enter a valid number.");
        } else {
            for (int i = 2; number != 1; ++i) {
                if (number % i == 0) {
                    number /= i;
                    primeNumbers[primeNumberCount] = i;
                    ++primeNumberCount;
                    --i;
                }
            }
            System.out.print("Prime Numbers: ");
            for (int j = 0; j < primeNumberCount; j++) {
                System.out.print(primeNumbers[j] + " ");
            }
        }
    }

    public static void designPattern() {
        int width;
        int height;

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter height - width");
        height = kb.nextInt();
        width = kb.nextInt();


        kb.close();

        printDesign(width, height);

    }

    private static void printDesign(int w, int h) {
        int starIndex = 1;
        int direction = 1;
        if (w == 1) {
            direction = 0;
        }
        for (int i = 1; i <= h; ++i) {
            drawLine(starIndex, w);
            if (direction == 1 && starIndex == w) {
                direction = -1;
            } else if (direction == -1 && starIndex == 1) {
                direction = 1;
            }
            starIndex += direction;
        }
    }

    private static void drawLine(int starIndex, int width) {
        System.out.print("|");

        if (starIndex > width) {
            starIndex %= width;
        }

        for (int i = 1; i <= width; ++i) {
            if (starIndex == i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("|");

    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void goldBachTheorem() {
        int evenNumber;

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a even number which bigger than 2");
        evenNumber = kb.nextInt();

        if (evenNumber > 2 && evenNumber % 2 == 0) {
            viewByAdditionPrimeNumbers(evenNumber);
        } else {
            System.out.println("Invalid number");
            System.out.println("Enter a even number which bigger than 2");
        }
        kb.close();
    }

    private static void viewByAdditionPrimeNumbers(int number) {
        findPrime(number);

        for(int i=0;i<primes.size();i++){

            for(int j = 0 ;j<primes.size();j++){

                int firstNumber = primes.get(i);
                int secondNumber = primes.get(j);
                if(firstNumber + secondNumber == number)
                {
                    System.out.println(firstNumber + "+" + secondNumber);
                    return;
                }
            }
        }

    }

    private static void findPrime(int number) {
        primes.add(2);
        for (int i = 2; i <= number; ++i) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
    }
}

