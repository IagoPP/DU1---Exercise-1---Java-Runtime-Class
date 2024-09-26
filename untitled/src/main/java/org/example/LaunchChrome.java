package org.example;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LaunchChrome {
    public static void main(String[] args) throws IOException {
        Runtime runtime=Runtime.getRuntime();
        String[] command = {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"};
        Process process = runtime.exec(command);
    }
}