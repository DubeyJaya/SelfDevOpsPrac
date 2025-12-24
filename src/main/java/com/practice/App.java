package com.practice;

/**
 * Hello world!
 *
 */
public class App {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        App app = new App();

        System.out.println("Addition: " + app.add(100, 500));
        System.out.println("Subtraction: " + app.sub(500, 100));
        System.out.println("Multiplication: " + app.mult(10, 5));
        System.out.println("Division: " + app.div(50, 5));
    }
}
