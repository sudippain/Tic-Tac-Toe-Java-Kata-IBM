package com.ibm.tictactoe.view;

import java.util.Random;
import java.util.Scanner;

public class Console {

    private Scanner scanner;

    public Console() {
        initialiseScanner();
    }

    public void print(String text) {
        System.out.println(text);
    }

    public void printLines(String... lines) {
        for (String line : lines) {
            print(line);
        }
    }

    public int getIntAnswerFor(String question) {
        System.out.print(question);
        try {
//            return scanner.nextInt();
        	Thread.sleep(1000);
        	return new Random().nextInt(10-1)+1;
        } catch (Exception e) {
            initialiseScanner();
            System.out.println("Invalid input!!!");
            return getIntAnswerFor(question);
        }
    }

    public String getStringAnswerFor(String question) {
        System.out.println();
        System.out.print(question);
        return scanner.next();
    }

    private void initialiseScanner() {
        scanner = new Scanner(System.in);
    }
}
