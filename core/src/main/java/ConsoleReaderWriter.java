package org.example.core;

import java.util.Scanner;

public class ConsoleReaderWriter {
    private final Scanner scanner = new Scanner(System.in);

    public void printMessage(String message) {
        System.out.println(message);
    }

    public int readInt() {
        return scanner.nextInt();
    }

    public String readString() {
        return scanner.nextLine();
    }
}