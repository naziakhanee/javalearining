package com.study;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]){
        Scanner sc = new Scanner();
        System.out.println("Enter first number ");
        int num1 = Integer.parse(sc.nextLine());

        System.out.println("Enter second number ");
        int num2 = Integer.parse(sc.nextLine());


        System.out.println("Sum of number is " + (num1 + num2));

    }
}