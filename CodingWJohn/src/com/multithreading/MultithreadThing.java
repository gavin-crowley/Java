package com.multithreading;

public class MultithreadThing implements Runnable{
//public class MultithreadThing extends Thread{

    private int threadNumber;
    public MultithreadThing (int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public MultithreadThing () {}

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);

//

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
