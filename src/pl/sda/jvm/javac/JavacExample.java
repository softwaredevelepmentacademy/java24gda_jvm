package pl.sda.jvm.javac;

/**
 * javac src/pl/sda/jvm/javac/JavacExample.java
 * java -cp src/ pl.sda.jvm.javac.JavacExample
 * javap -verbose -private src/pl/sda/jvm/javac/JavacExample.class
 */
public class JavacExample {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World!");
        }
    }
}
