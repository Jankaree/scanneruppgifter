package com.martin.tasks5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(!sc.hasNextInt()){
            System.out.println("Thats not a number!");
            sc.next();
        }
    }
}
