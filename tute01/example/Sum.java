package example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that uses the `Scanner` class
 * which reads in a line of numbers separated by spaces,
 * and sums them.
 */

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // // Keep reading the input until we see a line break (\n);
        // String input = s.nextLine();

        // // Split the string by " "
        // String[] numbers = input.split(" ");

        String[] numbers = s.nextLine().split(" ");

        // Convert into string
        // sum numbers
        int sum = 0;

        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println("The sum is " + sum);

        int sum2 = Arrays.asList(numbers).stream().mapToInt(x -> Integer.parseInt(x)).sum();

        String string = String.format("The sum is %d", sum2);
        System.out.println(string);
        s.close();
    }
}
