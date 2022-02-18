package com.isis.javaintermediario.thread;

public class MinhaThreadRunnable implements Runnable {

    private String nome;
    private int tempo;
    private Thread t1;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        t1 = new Thread( this, nome);
        t1.start();
    }

    public void run(){
        System.out.println("Executando a thread");
        try {
            for (int i=0; i<6; i++){
            System.out.println(this.nome +"_" + (i + 1) );

                Thread.sleep(this.tempo);
            }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }

    public Thread getT1() {
        return t1;
    }
}
