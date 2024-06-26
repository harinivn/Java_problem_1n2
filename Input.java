//1) Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal,
// "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
// Test Data
// Input first number: 2564
// Input second number: 3526
// Input third number: 2456

import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

         //Input 3 numbers
    System.out.print("Input first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Input Second number: ");
    int num2 = scanner.nextInt();

    System.out.print("Input third number: ");
    int num3 = scanner.nextInt();

    if(num1 ==num2 && num2 == num3){
        System.out.println("all numbers are equal");
    }
    else if((num1!=num2)&&(num2!=num3)&&(num3!=num1)){
        System.out.println("all numbers are different");
    }else{
        System.out.println("Neither all are equal or different");
    }



    scanner.close();




    }

   
}

