package pl.sda.jvm.jar;

import java.util.Scanner;

/**
 * javac src/pl/sda/jvm/jar/JarExample.java
 * jar -cvfme JarExample.jar src/pl/sda/jvm/jar/Manifest.txt pl.sda.jvm.jar.JarExample src/pl/sda/jvm/jar/JarExample.class
 * java -jar JarExample.jar
 */
public class JarExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">>> ");
            String nextLine = scanner.nextLine();
            if ("EXIT".equalsIgnoreCase(nextLine)) {
                scanner.close();
                break;
            } else {
                printHelloWorld(nextLine);
            }
        }
    }

    private static void printHelloWorld(String arg) {
        int n = 1;
        try {
            n = Integer.parseInt(arg);
        } catch (NumberFormatException ignored) {}
        System.out.println("I'll print `Hello World!` " + n + " times ;)");
        System.out.println("===");
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World!");
        }
        System.out.println();
    }
}
