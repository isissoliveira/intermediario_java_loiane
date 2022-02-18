package com.isis.javaintermediario.thread.sincronizada;

public class Teste {

    public static void main(String[] args) {
        int[] inteiros = { 1,2,3,4,5};
        MinhaThreadSoma minhaThreadSoma1 = new MinhaThreadSoma( "Thread1", inteiros);
        MinhaThreadSoma minhaThreadSoma2 = new MinhaThreadSoma( "Thread2", inteiros);
    }
}
