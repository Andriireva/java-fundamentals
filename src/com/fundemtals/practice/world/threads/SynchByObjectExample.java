package com.fundemtals.practice.world.threads;

public class SynchByObjectExample {
    public static void main(String[] args) {
        SyncedObject myRunnable = new SyncedObject();
        Thread thread1 = new Thread(() -> myRunnable.doUnSync());
        Thread thread2 = new Thread(() -> myRunnable.doInSynch());
        thread1.start();
        thread2.start();
        new Thread(() -> myRunnable.doInSynch()).start();
        new Thread(() -> myRunnable.doInSynch()).start();
        new Thread(() -> myRunnable.doUnSync()).start();
        new Thread(() -> myRunnable.doInSynch()).start();
        new Thread(() -> myRunnable.doInSynch()).start();
        new Thread(() -> myRunnable.doInSynch()).start();
        new Thread(() -> myRunnable.doInSynch()).start();
        new Thread(() -> myRunnable.doUnSync()).start();
        new Thread(() -> myRunnable.doUnSync()).start();
    }
}
