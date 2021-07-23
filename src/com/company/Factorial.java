package com.company;
import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to calculate Fact :");
        int num = scan.nextInt();

        int factorial = fact(num);

        System.out.println("Factorial of given number is: "+factorial);
    }
    static int fact(int n)
    {
        if(n==1){
            return 1;
        }
        else if (n==0){
            return 1;
        }

        int output = fact(n-1)* n;
        return output;
    }
}
