package pl.sda.jvm.jit;

public class MethodInlining {
    public void print() {
        System.out.println("Hello " + getWorld());
    }

    private String getWorld() {
        return "World!";
    }

    // #1
//    public void print() {
//        System.out.println("Hello " + "World!");
//    }

    // #2
//    public void print() {
//        System.out.println("Hello World!");
//    }
}
