
// 5. Write a program to sum of digits of a number.

import java.util.Scanner;
public class Sum_of_digits {
    public static void main(String[] args) {
        int number;
        int digit;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers to get sum of digits: ");
        number = input.nextInt();
        while(number > 0)
        {
            digit = number % 10;     //finds the last digit of the given number

            sum = sum + digit;        //adds last digit to the variable sum

            number = number / 10;     //removes the last digit from the number
        }
        System.out.println("Sum of Digits: "+sum);
    }


}
