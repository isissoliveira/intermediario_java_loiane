package com.isis.javaintermediario.string;

import java.util.StringTokenizer;

public class ManipulandoStirngs
{
    public static void main(String[] args) {
        //CONSTRUTORES
        String s = new String();
        String s2 = new String("java");

        char[] abcdef = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String bcd = new String(abcdef,1,3);
        System.out.println(bcd);

        System.out.println( s2.charAt(0));

        char[] arrJava = new char[3];
        s2.getChars(0, 3, arrJava, 0);
        System.out.println(arrJava);

        // COMPARAÇÃO DE STRINGS
        System.out.println("COMPARAÇÃO DE STRINGS");
        String banana = "banana";
        String ana = "ana";
        System.out.println( banana.indexOf(ana));

        // JOIN E SPLIT
        String alfabeto = String.join( ",", "a", "e", "i", "o");
        System.out.println(alfabeto);

        String[] novoAlfabeto = alfabeto.split(",");

        // STRINGBUFFER E  STRINGBUILDER
        System.out.println("STRINGBUFFER E  STRINGBUILDER");
        StringBuilder sb_ = new StringBuilder();
        sb_.append("ola");
        sb_.append("mundo");

        System.out.println( sb_.toString());
        System.out.println( sb_.reverse());
        System.out.println( sb_.toString());

        StringBuffer sb = new StringBuffer();  // A DIFERENÇA É SER THREAD SAFE
        sb.append("ola");
        sb.append("mundo");

        System.out.println( sb.toString());
        System.out.println( sb.reverse());
        System.out.println( sb.toString());

        // TOKENIZER
        System.out.println("TOKENIZER");
        StringTokenizer st = new StringTokenizer( alfabeto, ",");
        while ( st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }

}
