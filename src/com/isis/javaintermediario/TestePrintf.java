package com.isis.javaintermediario;

public class TestePrintf {

    public static void main(String[] args) {

        System.out.printf("Ola %s", "mundo " );
        System.out.println();
        System.out.printf("Ola %S", "mundo maiusculo " );
        System.out.println();
        System.out.printf("Ola %c", 'a' );
        System.out.println();
        System.out.printf("Ola %C", 'a' );
        System.out.println();
        System.out.printf("Ola %d", 123456 );
        System.out.println();
        System.out.printf("Ola %f", 12.3456789999 );
        System.out.println();
        System.out.printf("%20s", "20 direita" );
        System.out.println();
        System.out.printf("%-20s", "20 esquerda" );
        System.out.println();
        System.out.printf("Ola %+d", 123456 );
        System.out.println();
        System.out.printf("Ola 15 digitos comecando com zero %015d", 123456 );
        System.out.println();
        System.out.printf("%.2f", 15.46588 );
        System.out.println();

        double[] precos = { 10000 , 123.54 , 74864.6588, 1, 5.5236558};
        for (int i=0; i<precos.length; i++){
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
        }
    }



}
