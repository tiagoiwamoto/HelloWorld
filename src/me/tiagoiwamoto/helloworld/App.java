package me.tiagoiwamoto.helloworld;

import java.util.Scanner;

/**
 * Tiago Henrique Iwamoto
 * System Analyst
 * Mail: tiago.iwamoto@gmail.com
 **/
public class App {

    public static void main(String[] args) {
        //Initializer the scanner component
        Scanner scanner = new Scanner(System.in);
        //Printing a simple message
        System.out.print("Tell me your name :) ");
        //save the text input in a variable
        String name = scanner.nextLine();
        //Just to "clean" the console with empy lines
        for(int x = 0; x < 100; x++){
            System.out.println();
        }
        //Printing the hello message plus the input
        System.out.println("Hello, " + name);
    }

}
