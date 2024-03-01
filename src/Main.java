/*Question:
How do we write a program that calculates the user's year of birth based on
the entered age? How do we write tests to ensure that the program works properly?*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        YearOfBirth year = new YearOfBirth();   //object initialisation of class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name. Eg:John"); //no check for Name
        String name = scanner.nextLine();
        String output;  //initialised here inorder to use the variable in while condition
        //get input from user until age validation is successful
        do {
            System.out.println("Enter your age in years");
            String age = scanner.nextLine();
            //calling the method from YearOfBirth class for validation and calculation
            output = year.getBirthYear(age,name);
            System.out.println(output);
        }
        while (output.contains("Invalid")); // while condition checks if invalid keyword exists in output
    }
}