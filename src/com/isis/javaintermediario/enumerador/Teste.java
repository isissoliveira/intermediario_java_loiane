package com.isis.javaintermediario.enumerador;

public class Teste {
    public static void main(String[] args) {
        usandoConstantes();
        usandoENUM();

        DiaSemana[] dias = DiaSemana.values();
        for (DiaSemana dia : DiaSemana.values()){
            System.out.println(dia.toString());
        }
        System.out.println( Enum.valueOf( DiaSemana.class, "SEGUNDA").getValor());

        System.out.println();
        Pessoa pf = new Pessoa();
        pf.setTipoDocumento( Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento( pf.getTipoDocumento().geraNumero());
        System.out.println(pf);

        System.out.println();
        Operacao op = Enum.valueOf( Operacao.class, "ADICAO");
        System.out.println(op.toString());
        System.out.println(op.executarOperacao( 10.5, 20));

    }

    private static void imprimeDiaSemana( int dia){
        switch (dia){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terca");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }

    private static void usandoConstantes(){
        imprimeDiaSemana( DiaSemanaConstantes.DOMINGO);
    }

    private static void imprimeDiaSemanaENUM( DiaSemana dia){
        switch (dia){
            case SEGUNDA:
                System.out.println("Segunda");
                break;
            case TERCA:
                System.out.println("Terca");
                break;
            case QUARTA:
                System.out.println("Quarta");
                break;
            case QUINTA:
                System.out.println("Quinta");
                break;
            case SEXTA:
                System.out.println("Sexta");
                break;
            case SABADO:
                System.out.println("Sabado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }

    private static void usandoENUM(){
        imprimeDiaSemanaENUM( DiaSemana.DOMINGO);
    }

}
