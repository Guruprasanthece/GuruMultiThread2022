package com.guru.multithread;

public class ThreadExampleJava8 {

    public static void main(String[] args) {

        System.out.println("Hello !!!");

       Thread thread1 = new Thread(()->{
           System.out.println("Thread 1 !!!");
       });

       Thread thread2 = new Thread(()->{
          System.out.println("Thread 2 !!!!");
       });

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
