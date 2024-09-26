package org.example;

import java.io.IOException;

public class LaunchYT {
    public static void main(String[] args) throws IOException {
        Runtime runtime=Runtime.getRuntime();
        String[] command = {"explorer", "https://www.youtube.com/"};
        Process process = runtime.exec(command);
    }
}
