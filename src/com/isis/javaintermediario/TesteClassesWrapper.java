package com.isis.javaintermediario;

import com.isis.javaintermediario.enumerador.Pessoa;
import com.isis.javaintermediario.enumerador.TipoDocumento;

import static java.lang.Math.pow;

public class TesteClassesWrapper {
    // classes Wrapper representam tipos primitivos da linguagem

    public static void main(String[] args) {
        //PRIMITIVO PARA CLASSE
        Character c = new Character('c');
        Integer i = new Integer(10);
        Integer i2 = Integer.valueOf(45613);
        Long l = new Long(1000l);
        Byte b = new Byte((byte)10);

        // AUTOBOXING
        Character cA = 'c';
        Integer iA = 10;
        Integer i2A = 45613;
        Long lA = 1000l;
        Byte bA = 10;

        // AUTO UNBOXING ( CLASSE PARA PRIMITIVO)
        int i_ = i;
        long l_ = l;

        // método "pow" da classe Math importado de forma static
        System.out.println( pow( 2, 3));


    }


}
