package com.isis.javaintermediario.thread.sincronizada;

public class MinhaThreadSoma implements Runnable {
    private String nome;
    private int[] numeros;
    private static Calculadora minhaCalculadora = new Calculadora(); // SINGLETON

    public MinhaThreadSoma(String nome, int[] numeros) {
        this.nome = nome;
        this.numeros = numeros;
        new Thread( this, nome ).start();
    }

    @Override
    public void run() {
        int soma = minhaCalculadora.somaArray(numeros);
        System.out.println( "Soma "+ soma + " da thread "+this.nome);
    }
}
