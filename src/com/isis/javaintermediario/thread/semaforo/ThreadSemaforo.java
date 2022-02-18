package com.isis.javaintermediario.thread.semaforo;

public class ThreadSemaforo implements Runnable {
    private CorSemaforo cor;
    private boolean parar;
    private boolean corMudou;

    public ThreadSemaforo() {
        this.cor = CorSemaforo.VERMELHO;
        this.parar = false;
        this.corMudou = false;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!parar) {
            try {
                switch (this.cor) {
                    case VERMELHO:
                        Thread.sleep(this.cor.getTempo());
                        break;
                    case AMARELO:
                        Thread.sleep(this.cor.getTempo());
                        break;
                    case VERDE:
                        Thread.sleep(this.cor.getTempo());
                        break;
                }
                mudarCor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void mudarCor(){
        switch (this.cor) {
            case VERMELHO:
                this.cor = CorSemaforo.VERDE;
                break;
            case AMARELO:
                this.cor = CorSemaforo.VERMELHO;
                break;
            case VERDE:
                this.cor = CorSemaforo.AMARELO;
                break;
        }
        this.corMudou = true;
        notify(); // notifica a thread que estiver esperando
    }

    public synchronized  void esperaCorMudar(){
        while ( !corMudou){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.corMudou = false;
    }

    public synchronized  void desligar(){
        this.parar = true;
    }

    public CorSemaforo getCor() {
        return cor;
    }

}

enum CorSemaforo {
        VERMELHO(2000),
        AMARELO(300),
        VERDE(1500);

    public int getTempo() {
        return tempo;
    }

    private int tempo;

        CorSemaforo( int tempo){
            this.tempo = tempo;
        }
    }