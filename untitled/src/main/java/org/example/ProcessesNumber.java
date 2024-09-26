package org.example;

import java.io.IOException;

public class ProcessesNumber {
    public static void main(String[] args) throws IOException {
        Runtime runtime=Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
    }
}
