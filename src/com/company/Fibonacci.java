package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Value of N Which UpTo Print Fibonacci Series :");
        int n = scan.nextInt();
        int n1 = 0, n2 = 1;
        System.out.print("UpTo " + n + ": ");

        while (n1 <= n)
        {
            System.out.print(n1 + " + ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
