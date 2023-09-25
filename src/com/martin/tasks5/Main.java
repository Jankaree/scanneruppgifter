package com.martin.tasks5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "";
      do{
          System.out.println("insert name");
          name = scannerText();
          System.out.println("hello " + name);
      }while(true);



        }

        public static String scannerText(){
        Scanner Scanner = new Scanner(System.in);

        String input = Scanner.nextLine();

        return input;
    }

    public static int scanPosInt(){
        int loop = 0;

        while(loop <= 0) {
            String input = scannerText();

            try {
                int input2 = Integer.parseInt(input);
                loop = Integer.parseInt(input);
            } catch (NumberFormatException var14) {
                System.out.println("please only input a number higher than 0");
            }

        }
        return loop;

        }
    }

