package com.Threads;

/**
 * Created by silvana.albert on 11/7/15.
 */
public class Test extends Thread {
    public void run(int a) {
        System.out.println("Starting loop");
        while (!isInterrupted()) {
        yield();
        }
        System.out.println("end loop");
    }

    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        t.start();
        Thread.sleep(1000);
        t.interrupt();

    }
}
