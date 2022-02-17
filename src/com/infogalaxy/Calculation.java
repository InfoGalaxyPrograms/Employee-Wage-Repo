package com.infogalaxy;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c=0;
        System.out.println("Enter the 2 Numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("Addition="+c);
    }
}
