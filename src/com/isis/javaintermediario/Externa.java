package com.isis.javaintermediario;

import org.w3c.dom.ls.LSOutput;


    public class Externa{
        private String texto = "texto externo";

        public class Interna{
            private String texto = "texto interno";

            public void imprime(){
                System.out.println( Externa.this.texto);
            }
        }

        public static void main(String[] args) {
            Externa externa = new Externa();
            Interna interna = externa.new Interna();

            interna.imprime();
        }

    }



