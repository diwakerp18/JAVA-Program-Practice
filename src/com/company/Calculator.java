package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two Number You Want To Calculate : ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("Please Select an Operation (+, -, /, *): ");
        char operator = scan.next().charAt(0);
        double result;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.println("Your Calculated Value is : "+result);
    }
}
