package com.isis.javaintermediario.enumerador;

public enum TipoDocumento {
    CPF{
        @Override
        public String geraNumero(){
            return "numeroCPF";
        }
    }, CNPJ {
        @Override
        public String geraNumero() {
            return "numeroCNPJ";
        }
    };
    public abstract String geraNumero();
}
