package pl.sda.jvm.javac;

import java.util.Scanner;

/*
    javac + java

    - 1) Napisz klasę z metodą main, która przyjmować będzie argument [N] typu int od użytkownika i wyświetli napis “Hello World!” N razy.

    - 2) Wykorzystaj polecenia javac oraz java do kompilacji i uruchomienia swojej klasy.

    - 3) Postaraj się poprawić metodę main tak, by obsługiwała ona błędnie podany argument oraz
         by podanie argumentu było opcjonalne, a napis “Hello World!” wyświetlił się co najmniej raz.

    - 4) * Rozszerz metodę main tak by przyjmowała ona w sposób ciągły polecenia od użytkownika
           i kończyła pracę dopiero po podaniu przez użytkownika polecenia “EXIT” / "exit" / "Exit" itd.
           - podpowiedź: klasa Scanner
 */
public class JavacTask {
    // #1
//    public static void main(String[] args) {
//        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
//            System.out.println("Hello World!");
//        }
//    }

    // #2
//    javac src/pl/sda/jvm/javac/JavacTask.java
//    java -cp src/ pl/sda/jvm/javac/JavacTask
//
//    javac src/pl/sda/jvm/javac/JavacTask.java && java -cp src/ pl/sda/jvm/javac/JavacTask

    // #3
//    public static void main(String[] args) {
//        int n = 1;
//        try {
//            n = Integer.parseInt(args[0]);
//        } catch (NumberFormatException | ArrayIndexOutOfBoundsException ignored) {}
//        for (int i = 0; i < n; i++) {
//            System.out.println("Hello World!");
//        }
//    }

    // #4
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