package com.multithreading;

public class Multithreading {
    public static void main(String[] args) {

//        MultithreadThing myThing = new MultithreadThing();
//        MultithreadThing myThing2 = new MultithreadThing();
//
//        myThing.start();
//        myThing2.start();

        for (int i = 0; i < 3; i++) {
            MultithreadThing myThing = new MultithreadThing(i);
            Thread myRunnableThread = new Thread(myThing);
            myRunnableThread.start();
//            if you have one thread and you want to wait for another to complete use .join()
//            myRunnableThread.join();

//            sees if thread is still running
//            myRunnableThread.isAlive();
        }

    }
}
