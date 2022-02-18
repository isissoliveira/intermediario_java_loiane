package com.isis.javaintermediario.thread.sincronizada;

public class TicTac {
    private boolean tic;

   synchronized void imprimeTic( boolean emExecucao){
       if( !emExecucao){
           tic = true;
           notify(); // NOTIFICAMOS A OUTRA THREAD
           return;
       }
       System.out.println( "TIC");
       tic = true;
       notify();

       try {
           while (tic){
               wait();
           }
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

   }
   synchronized void imprimeTac( boolean emExecucao){
       if( !emExecucao){
           tic = false;
           notify();
           return;
       }
       System.out.println( "TAC");
       tic = false;
       notify();

       try {
           while (!tic){
               wait();
           }
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

   }



}
