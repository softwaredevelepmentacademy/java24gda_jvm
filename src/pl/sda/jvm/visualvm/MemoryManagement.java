package pl.sda.jvm.visualvm;

import java.util.*;

public class MemoryManagement {
    private static final int LOOPS = 100;
    private static final int COLLECTION_SIZE = 1000000;
    private static final int THREAD_SLEEP = 1000;

    public static void main(String[] args) throws InterruptedException {
        List<String> collection = new ArrayList<>();
        for (int i = 0; i < LOOPS; i++) {
            collection.addAll(generateCollection(COLLECTION_SIZE));
            System.out.println("Collection size: " + collection.size());
            Thread.sleep(THREAD_SLEEP);
        }
    }

    private static List<String> generateCollection(int n) {
        List<String> randomStrings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            randomStrings.add(UUID.randomUUID().toString());
        }
        return randomStrings;
    }
}
