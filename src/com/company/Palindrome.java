package com.company;
import java.util.Scanner;

public class Palindrome {
    static void checkPalindrome(String input) {
        boolean result = true;
        int l = input.length();

        for(int i=0; i<= l/2; i++) {
            if(input.charAt(i) != input.charAt(l-i-1)) {
                result = false;
                break;
            }
        }
        System.out.println(input + " is palindrome = "+result);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = scan.nextLine();

        checkPalindrome(str);
    }
}
