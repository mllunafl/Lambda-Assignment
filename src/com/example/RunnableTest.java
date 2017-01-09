package com.example;

/**
 * Created by LunaFlores on 1/9/17.
 */
public class RunnableTest {
    public static void main(String[] args) {

        System.out.println("=== RunnableTest ===");

        // Anonymous Runnable
        Runnable rl = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };

        // Lambda Runnable
        Runnable r2 = () -> System.out.println("Hellow world two!");

        //Run em!
        rl.run();
        r2.run();

    }
}
