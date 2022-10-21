package com.fundemtals.practice.world.threads;

import java.time.Instant;

public class MyRunnable implements Runnable {



    private boolean doStop = false;
    private Runnable action;

    public MyRunnable(Runnable action) {
        this.action = action;
    }

    // we use synchronized keyword to synchronize
    public synchronized void doStop() {
        this.doStop = true;
    }

    //
    private synchronized boolean keepRunning() {
        return this.doStop == false;
    }


    @Override
    public void run() {
        while (keepRunning()) {
            // keep doing what this thread should do.
            System.out.println("Running" + Instant.now());

            try {
                Thread.sleep(1000L);
                action.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
