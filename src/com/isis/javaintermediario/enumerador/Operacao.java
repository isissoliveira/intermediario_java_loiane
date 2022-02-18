package com.isis.javaintermediario.enumerador;

public enum Operacao {
    ADICAO("+"){
        @Override
        public double executarOperacao(double num1, double num2) {
            return num1 + num2;
        }
    }, SUBTRACAO("-"){
        @Override
        public double executarOperacao(double num1, double num2) {
            return num1 - num2;
        }
    }, DIVISAO("/"){
        @Override
        public double executarOperacao(double num1, double num2) {
            return num1 / num2;
        }
    }, MULTIPLICACAO("*"){
        @Override
        public double executarOperacao(double num1, double num2) {
            return num1 * num2;
        }
    };

    @Override
    public String toString() {
        return "Operacao{" +
                "simbolo='" + simbolo + '\'' +
                '}';
    }

    private String simbolo;
    Operacao( String simbolo){
        this.simbolo = simbolo;
    }
    public abstract double executarOperacao( double num1, double num2);
}
