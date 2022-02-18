package com.isis.javaintermediario.thread;

public class MinhaThread extends Thread {

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start(); // chama a run()
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
}
