package com.martin.tasks5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "";

        System.out.println("Whats your name?");
        name = scannerText();
        System.out.println("Player 1: " + name);

        }

        public static String scannerText(){
        Scanner Scanner = new Scanner(System.in);

        String input = Scanner.nextLine();

        return input;
    }
}
