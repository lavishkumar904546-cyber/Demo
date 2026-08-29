package Demo;

import java.util.Scanner;

public class UserInputAddition {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the second Number: ");
        int secondNumber = sc.nextInt();

        System.out.println("The sum of two number is: " + (firstNumber + secondNumber));
    }
}