package com.isis.javaintermediario.thread;

public class TesteMinhaThread {

    public static void main(String[] args) {
        MinhaThread minhaThread1 = new MinhaThread("Thread1", 500);
        MinhaThread minhaThread2 = new MinhaThread("Thread2", 800);
        //minhaThread1.start();

        MinhaThreadRunnable minhaThreadR1 = new MinhaThreadRunnable("ThreadRunnable1", 300);
        MinhaThreadRunnable minhaThreadR2 = new MinhaThreadRunnable("ThreadRunnable2", 300);
        //Thread t1 = new Thread( minhaThreadR1);
        //t1.start();

        try {//AGUARDA A FINALIZAÇÃO DE TODAS AS THREADS
            minhaThread1.join();
            minhaThread2.join();
            minhaThreadR1.getT1().join();
            minhaThreadR2.getT1().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Programa finalizado");
    }
}
