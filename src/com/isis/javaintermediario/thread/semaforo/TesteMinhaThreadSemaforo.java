package com.isis.javaintermediario.thread.semaforo;

import com.isis.javaintermediario.thread.MinhaThread;
import com.isis.javaintermediario.thread.MinhaThreadRunnable;

public class TesteMinhaThreadSemaforo {

    public static void main(String[] args) {
        ThreadSemaforo threadSemaforo = new ThreadSemaforo();

        for (int i=0; i<10; i++){
            System.out.println("Cor: "+ threadSemaforo.getCor());
            threadSemaforo.esperaCorMudar();
        }
        threadSemaforo.desligar();
    }
}
