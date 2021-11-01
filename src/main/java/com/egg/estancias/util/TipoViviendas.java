package com.egg.estancias.util;

public enum TipoViviendas {
    CASA("Casa"),DUPLEX("Duplex"),PISO("Piso"),CHALET("Chalet");

    private String value;

    TipoViviendas(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
