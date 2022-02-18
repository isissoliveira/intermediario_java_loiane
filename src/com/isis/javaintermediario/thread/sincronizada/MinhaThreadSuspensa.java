package com.isis.javaintermediario.thread.sincronizada;

public class MinhaThreadSuspensa implements Runnable {

    private String nome;
    private int tempo;
    private Thread t1;
    private boolean estaSuspensa;
    private boolean foiTerminada;

    public MinhaThreadSuspensa(String nome) {
        this.nome = nome;
        this.estaSuspensa = false;
        this.foiTerminada = false;
        t1 = new Thread( this, nome);
        t1.start();
    }

    public void run(){
        System.out.println("Executando a thread");
        try {
            for (int i=0; i<6; i++){
            System.out.println(this.nome +"_" + (i + 1) );

                Thread.sleep(300);

                synchronized ( this){
                    while( estaSuspensa){
                        wait();
                    }
                    if( this.foiTerminada ){
                        break;
                    }
                }

            }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println(this.nome + "terminada");
    }

    public Thread getT1() {
        return t1;
    }

    void suspend (){
        this.estaSuspensa = true;
    }
    synchronized void resume (){
        this.estaSuspensa = false;
        notify();
    }
    synchronized void stop (){
        this.foiTerminada = true;
        notify();
    }
}
