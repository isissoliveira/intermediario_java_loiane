package com.isis.javaintermediario.thread.sincronizada;

public class Calculadora {
    private int soma;

    public synchronized int somaArray( int[] inteiros){ // FICA BLOQUEADO ATÉ QUE A THREAD TERMINE
        soma = 0;
        for (int i=0; i<inteiros.length; i++){
            soma += inteiros[i];
            System.out.println("Soma = " + soma+ " chamada pela thread "+ Thread.currentThread().getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return soma;
    }
}
