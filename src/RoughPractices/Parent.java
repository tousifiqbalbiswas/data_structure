package RoughPractices;

import java.io.IOException;

public class Parent {
    void show(){
        System.out.println("Parent is talking");
    }
    public void readFile(String filePath) throws IOException {
        // Code that may throw IOException
        if (filePath==null)
            throw new IOException();
    }

    public void callerMethod() {
        try {
            readFile("file.txt"); // Handling the exception
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

}
