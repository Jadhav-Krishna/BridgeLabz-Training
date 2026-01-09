package org.bridgelabz.linearAndBinarysearch.stringbuffer;

public class ComparePerformance {

    public static void main(String[] args) {

        int iterations = 1000000;
        String text = "Java DSA";

        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        System.out.println("Time StringBuffer  : " + bufferTime + " ns");
        System.out.println("Time StringBuilder : " + builderTime + " ns");
    }
}

