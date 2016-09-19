package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        int answer;
        int fakeanswer;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter First Number" + "\n");
        String firstnumber = user_input.next();
        firstnumber = firstnumber.tonum;
        System.out.print("Enter Second Number" + "\n");
        String secondnumber = user_input.next();
        secondnumber = secondnumber.tonum;
        String operation;
        System.out.print("Enter Operation (+.-,/, or *)" + "\n");
        operation = user_input.next();
        System.out.print("So, your is equation is " + firstnumber + operation + secondnumber + "? (y/n)\n");
        String yn = user_input.next( );
        if (yn.equals("y")) {
            if (operation.equals("+")) {
                answer = firstnumber + secondnumber;
                fakeanswer = Math.sqrt(answer);
                System.out.print("Your answer is " + fakeanswer + ".");
            }
            else if (operation.equals("-")) {
                answer = firstnumber - secondnumber;
                fakeanswer = Math.sqrt(answer);
                System.out.print("Your answer is "  + fakeanswer + ".");
            }
            else if (operation.equals("/")) {
                answer = firstnumber / secondnumber;
                fakeanswer = Math.sqrt(answer);
                System.out.print("Your answer is " + fakeanswer + ".");
            }
            else if (operation.equals("*")) {
                answer = firstnumber * secondnumber;
                fakeanswer = Math.sqrt(answer);
                System.out.print("Your answer is " + fakeanswer + ".");
            }
            else{
                System.out.print("Are you sure that was your equation cause you didn't put in a correct operation and now have to restart the program?");
            }

        }
        else if (yn.equals("n")){
            System.out.print("Then learn how to follow directions and restart the program");
        }
        else{
            System.out.print("You can't even type a simple y or n? Disgraceful. Restart the program.");
        }    }
}
