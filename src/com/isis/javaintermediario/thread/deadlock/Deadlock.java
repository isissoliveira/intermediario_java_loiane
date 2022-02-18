package com.isis.javaintermediario.thread.deadlock;

public class Deadlock {

    public static void main(String[] args) {
        final String recurso1 = "Recurso 1";
        final String recurso2 = "Recurso 2";

        Thread t1 = new Thread(){
            public void run() {
                synchronized (recurso1){
                    System.out.println("Thread 1 bloqueou o recurso 1");

                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Thread 1 tentando acessar o recurso 2");

                    synchronized (recurso2){
                        System.out.println("Thread 1 bloqueou o recurso 2");
                    }
                } // FIM CYNCRONIZED THREAD1
            }
        };

        Thread t2 = new Thread(){
            public void run() {
                synchronized (recurso2){
                    System.out.println("Thread 2 bloqueou o recurso 2");

                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Thread 2 tentando acessar o recurso 1");

                    synchronized (recurso1){
                        System.out.println("Thread 2 bloqueou o recurso 1");
                    }
                } // FIM CYNCRONIZED THREAD1
            }
        };

        t1.start();
        t2.start();
    }
}
