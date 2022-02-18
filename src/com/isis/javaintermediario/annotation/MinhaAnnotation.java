package com.isis.javaintermediario.annotation;

@interface MinhaAnnotation {
    String autor();
    int aulaNumero();
    String blog() default "http://endereco.default";
}
