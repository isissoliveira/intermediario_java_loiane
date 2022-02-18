package com.isis.javaintermediario;

import com.isis.javaintermediario.enumerador.Pessoa;
import com.isis.javaintermediario.enumerador.TipoDocumento;

public class TesteVarargs {

    public static void main(String[] args) {
        imprimir( 1, 6 ,8, 23, 56);

    }

    private static void imprimir( Integer ... valores){
        for(int i = 0; i< valores.length; i++){
            System.out.println(valores[i]);
        }
    }

}
