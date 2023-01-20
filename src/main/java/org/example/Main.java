package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Write number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 != 0) {
            System.out.println("Число нечетное");
        } else {
            System.out.println("Число четное");
        }

//ааfff
        if (number % 10 == 3) {
            System.out.println("Число окончивается на 3");
        } else {
            System.out.println("Число не окончивается на 3");
        }


        System.out.println("Hello world!");
    }
}