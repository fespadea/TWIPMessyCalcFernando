package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int answer;
        int fakeanswer;
        Scanner user_input = new Scanner(System.in);
        String operation;
        System.out.print("Do you want to add, subtract, multiply, or divide" + "\n");
        operation = user_input.nextLine();
        if(operation.equals("add")){
            operation = "+";
        }
        else if(operation.equals("subtract")){
            operation = "-";
        }
        else if(operation.equals("multiply")){
            operation = "*";
        }
        else if(operation.equals("divide")){
            operation = "/";
        }
        else{
            operation = operation;
        }
        System.out.print("Enter First Number" + "\n");
        String firststring = user_input.nextLine();
        try{
            int firstnumber = Integer.parseInt(firststring);
        }
        catch(Exception e){
            System.out.print("Nah.");
            System.exit(0);
        }
        int firstnumber = Integer.parseInt(firststring);
        System.out.print("Enter Second Number" + "\n");
        String secondstring = user_input.nextLine();
        try{
            int secondnumber = Integer.parseInt(secondstring);
        }
        catch(Exception e){
            System.out.print("Nah.");
            System.exit(0);
        }
        int secondnumber = Integer.parseInt(secondstring);
        System.out.print("So, your is equation is " + firstnumber + operation + secondnumber + "? (y/n)\n");
        String yn = user_input.next( );
        if (yn.equals("y")) {
            if (operation.equals("+")) {
                answer = firstnumber + secondnumber;
                fakeanswer = Math.max(answer, answer + 3);
                if (fakeanswer != answer) {
                    System.out.println("Your answer is " + fakeanswer + ". Are you satisfied? (Yes/No)");
                    Scanner input = new Scanner(System.in);
                    String satisfaction = input.nextLine();
                    if(satisfaction.equals("Yes")){
                        System.out.print("Are you dumb? That wasn't the right answer.");
                    }
                    else if(satisfaction.equals("No")){
                        System.out.println("Can you identify what math class method I ran the real answer through?");
                        String math = input.nextLine();
                        if(math.equals("max")){
                            System.out.print("Great! Good job and goodbye!");
                        }
                        else{
                            System.out.print("So close yet so far.");
                        }
                    }
                    else{
                        System.out.print("Wasn't even an option.");
                    }
                }
                else{
                    double doubleanswer = fakeanswer;
                    doubleanswer = Math.max(doubleanswer, doubleanswer + 3);
                    System.out.println("Your answer is " + doubleanswer + ". Are you satisfied? (Yes/No)");
                    Scanner input = new Scanner(System.in);
                    String satisfaction = input.nextLine();
                    if(satisfaction.equals("Yes")){
                        System.out.print("Are you dumb? That wasn't the right answer.");
                    }
                    else if(satisfaction.equals("No")){
                        System.out.println("Can you identify what math class method I ran the real answer through?");
                        String math = input.nextLine();
                        if(math.equals("max")){
                            System.out.print("Great! Good job and goodbye!");
                        }
                        else{
                            System.out.print("So close yet so far.");
                        }
                    }
                    else{
                        System.out.print("Wasn't even an option.");
                    }
                }
            }
            else if (operation.equals("-")) {
                answer = firstnumber - secondnumber;
                fakeanswer = Math.max(answer, answer + 3);
                Scanner input = new Scanner(System.in);
                if (fakeanswer != answer) {
                    System.out.println("Your answer is " + fakeanswer + ". Are you satisfied? (Yes/No)");
                    String satisfaction = input.nextLine();
                    if (satisfaction.equals("Yes")) {
                        System.out.print("Are you dumb? That wasn't the right answer.");
                    } else if (satisfaction.equals("No")) {
                        System.out.println("Can you identify what math class method I ran the real answer through?");
                        String math = input.nextLine();
                        if (math.equals("max")) {
                            System.out.print("Great! Good job and goodbye!");
                        } else {
                            System.out.print("So close yet so far.");
                        }
                    } else {
                        System.out.print("Wasn't even an option.");
                    }
                }
                else{
                    double doubleanswer = fakeanswer;
                    doubleanswer = Math.max(doubleanswer, doubleanswer + 3);
                    System.out.println("Your answer is " + doubleanswer + ". Are you satisfied? (Yes/No)");
                    input = new Scanner(System.in);
                    String satisfaction = input.nextLine();
                    if(satisfaction.equals("Yes")){
                        System.out.print("Are you dumb? That wasn't the right answer.");
                    }
                    else if(satisfaction.equals("No")){
                        System.out.println("Can you identify what math class method I ran the real answer through?");
                        String math = input.nextLine();
                        if(math.equals("max")){
                            System.out.print("Great! Good job and goodbye!");
                        }
                        else{
                            System.out.print("So close yet so far.");
                        }
                    }
                    else{
                        System.out.print("Wasn't even an option.");
                    }
                }
            }
            else if (operation.equals("/")) {
                answer = firstnumber / secondnumber;
                fakeanswer = Math.max(answer, answer + 3);
                Scanner input = new Scanner(System.in);
                if (fakeanswer != answer) {
                    System.out.println("Your answer is " + fakeanswer + ". Are you satisfied? (Yes/No)");
                    String satisfaction = input.nextLine();
                    if (satisfaction.equals("Yes")) {
                        System.out.print("Are you dumb? That wasn't the right answer.");
                    } else if (satisfaction.equals("No")) {
                        System.out.println("Can you identify what math class method I ran the real answer through?");
                        String math = input.nextLine();
                        if (math.equals("max")) {
                            System.out.print("Great! Good job and goodbye!");
                        } else {
                            System.out.print("So close yet so far.");
                        }
                    } else {
                        System.out.print("Wasn't even an option.");
                    }
                }
                else{
                    double doubleanswer = fakeanswer;
                    doubleanswer = Math.max(doubleanswer, doubleanswer + 3);;
                    System.out.println("Your answer is " + doubleanswer + ". Are you satisfied? (Yes/No)");
                    input = new Scanner(System.in);
                    String satisfaction = input.nextLine();
                    if(satisfaction.equals("Yes")){
                        System.out.print("Are you dumb? That wasn't the right answer.");
                    }
                    else if(satisfaction.equals("No")){
                        System.out.println("Can you identify what math class method I ran the real answer through?");
                        String math = input.nextLine();
                        if(math.equals("max")){
                            System.out.print("Great! Good job and goodbye!");
                        }
                        else{
                            System.out.print("So close yet so far.");
                        }
                    }
                    else{
                        System.out.print("Wasn't even an option.");
                    }
                }
            }
            else if (operation.equals("*")) {
                answer = firstnumber * secondnumber;
                fakeanswer = Math.max(answer, answer + 3);
                Scanner input = new Scanner(System.in);
                if (fakeanswer != answer){
                    System.out.println("Your answer is " + fakeanswer + ". Are you satisfied? (Yes/No)");
                    String satisfaction = input.nextLine();
                    if (satisfaction.equals("Yes")) {
                        System.out.print("Are you dumb? That wasn't the right answer.");
                    } else if (satisfaction.equals("No")) {
                        System.out.println("Can you identify what math class method I ran the real answer through?");
                        String math = input.nextLine();
                        if (math.equals("max")) {
                            System.out.print("Great! Good job and goodbye!");
                        } else {
                            System.out.print("So close yet so far.");
                        }
                    } else {
                        System.out.print("Wasn't even an option.");
                    }
                }
                else{
                    double doubleanswer = fakeanswer;
                    doubleanswer = Math.max(doubleanswer, doubleanswer + 3);
                    System.out.println("Your answer is " + doubleanswer + ". Are you satisfied? (Yes/No)");
                    input = new Scanner(System.in);
                    String satisfaction = input.nextLine();
                    if(satisfaction.equals("Yes")){
                        System.out.print("Are you dumb? That wasn't the right answer.");
                    }
                    else if(satisfaction.equals("No")){
                        System.out.println("Can you identify what math class method I ran the real answer through?");
                        String math = input.nextLine();
                        if(math.equals("max")){
                            System.out.print("Great! Good job and goodbye!");
                        }
                        else{
                            System.out.print("So close yet so far.");
                        }
                    }
                    else{
                        System.out.print("Wasn't even an option.");
                    }
                }
            }
            else{
                System.out.print("Are you sure that was your equation cause you didn't put in a correct operation and now have to restart the program.");
            }

        }
        else if (yn.equals("n")){
            System.out.print("Then learn how to follow directions and restart the program");
        }
        else{
            System.out.print("You can't even type a simple y or n? Disgraceful. Restart the program.");
        }    }
}
