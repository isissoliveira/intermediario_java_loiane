package com.isis.javaintermediario.thread.sincronizada;

public class MinhaThreadTicTac implements Runnable {
    TicTac tt;
    Thread t;

    public MinhaThreadTicTac(String nome, TicTac tt) {
        this.tt = tt;
        this.t = new Thread( this, nome );
        t.start();
    }

    @Override
    public void run() {
        if( t.getName().equalsIgnoreCase("TIC")) {
            for (int i = 0; i < 5; i++) {
                tt.imprimeTic(true);
            }
            tt.imprimeTic(false);
        }else{
            for (int i = 0; i < 5; i++) {
                tt.imprimeTac(true);
            }
            tt.imprimeTac(false);
        }
    }
}
