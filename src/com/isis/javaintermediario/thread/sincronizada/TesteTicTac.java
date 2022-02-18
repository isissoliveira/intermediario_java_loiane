package com.isis.javaintermediario.thread.sincronizada;

public class TesteTicTac {

    public static void main(String[] args) {
        TicTac tt = new TicTac();

        MinhaThreadTicTac minhaThreadTic = new MinhaThreadTicTac( "TIC", tt);
        MinhaThreadTicTac minhaThreadTac = new MinhaThreadTicTac( "TAC", tt);

        try {
            minhaThreadTic.t.join();
            minhaThreadTac.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
