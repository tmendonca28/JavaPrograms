package com.mendonca;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        // Anonymous class
        new Thread() {
            public void run() {
                System.out.println("Hello from the anonymous class thread.");
            }
        }.start();

        System.out.println("Hello again from the main thread.");

        //
    }
}
