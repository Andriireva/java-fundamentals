package com.fundemtals.practice.world.threads;

public class MyRunnableMain {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable(() -> "".equals(""));

        Thread thread = new Thread(myRunnable);

        thread.start();

        try {
            Thread.sleep(10L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myRunnable.doStop();
    }
}
