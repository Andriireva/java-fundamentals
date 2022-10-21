package com.fundemtals.practice.world.threads;

import java.time.Instant;

public class SyncedObject {

    private Object synchObject = new Object();

    public void doInSynch() {
        // in bracers there should be a marker object
        synchronized (synchObject) {
            System.out.println("doInSynch is called. start " + Instant.now());
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("doInSynch: end " + Instant.now());
            // this code will wait unitl other part of code that is also synchronized (synchObject) runs
        }
    }

    public void doUnSync() {
        System.out.println("doUnSync is called. start " + Instant.now());
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doUnSync: end " + Instant.now());
    }
}
