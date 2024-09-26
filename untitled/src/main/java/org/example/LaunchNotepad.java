package org.example;

import java.io.IOException;

public class LaunchNotepad {
    public static void main(String[] args) throws IOException {
        Runtime runtime=Runtime.getRuntime();
        String[] command = {"notepad"};
        Process process = runtime.exec(command);
    }
}
