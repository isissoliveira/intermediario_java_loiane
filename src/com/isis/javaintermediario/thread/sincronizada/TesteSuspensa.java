package com.isis.javaintermediario.thread.sincronizada;

public class TesteSuspensa {

    public static void main(String[] args) {
        MinhaThreadSuspensa minhaThreadSuspensa1 = new MinhaThreadSuspensa( "Thread1");
        MinhaThreadSuspensa minhaThreadSuspensa2 = new MinhaThreadSuspensa( "Thread2");

        minhaThreadSuspensa1.suspend();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        minhaThreadSuspensa2.suspend();

        minhaThreadSuspensa1.resume();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        minhaThreadSuspensa2.resume();
        minhaThreadSuspensa2.stop();

    }
}
