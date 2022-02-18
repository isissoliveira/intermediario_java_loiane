package com.isis.javaintermediario;


public class Anonima {
    private String texto = "texto original";

    public void imprime(){
            System.out.println( Anonima.this.texto);
        }

    public static void main(String[] args) {
        Anonima an = new Anonima(){
            public void imprime(){
                System.out.println( "Novo texto anonimo");
            }
        };

        an.imprime();
    }

}



