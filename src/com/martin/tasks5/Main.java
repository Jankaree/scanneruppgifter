package com.martin.tasks5;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //task 6: Check function "scanPosInt()"

        String stop = "";
        boolean run = true;
      do{

          stop = scannerText();
          switch (stop){
              case "stop":
                  break;
              case "1":
                  System.out.println("Throwing");
                  break;
              default:
                  System.out.println("Wrong input");
          }


          if(Objects.equals(stop, "stop")){
              run = false;
          }

      }while(run);



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

