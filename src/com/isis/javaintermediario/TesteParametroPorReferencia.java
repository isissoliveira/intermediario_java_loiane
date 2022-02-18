package com.isis.javaintermediario;

import com.isis.javaintermediario.enumerador.Pessoa;
import com.isis.javaintermediario.enumerador.TipoDocumento;

import static java.lang.Math.pow;

public class TesteParametroPorReferencia {

    public static void main(String[] args) {

        // PASSAGEM POR REFERÊNCIA
        Pessoa pf = new Pessoa();
        pf.setTipoDocumento( Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento( pf.getTipoDocumento().geraNumero());
        altVal(pf);
        System.out.println(pf.getNumeroDocumento());
    }

    private static void altVal( Pessoa pes){
        pes.setNumeroDocumento("novo numero alterado");
    }

}
