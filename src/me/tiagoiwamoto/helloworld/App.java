package me.tiagoiwamoto.helloworld;

import java.util.Scanner;

/**
 * Tiago Henrique Iwamoto
 * System Analyst
 * Mail: tiago.iwamoto@gmail.com
 **/
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me your name :) ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }

}
