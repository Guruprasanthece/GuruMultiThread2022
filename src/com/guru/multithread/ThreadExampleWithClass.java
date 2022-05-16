package com.guru.multithread;

public class ThreadExampleWithClass {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());

        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread 1 !!!");
    }

}


class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread 2 !!!");
    }

}