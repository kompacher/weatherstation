package com.senacor.oo.wheatherstation.rest;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
public enum StationType {
    WHITE("white"),
    GOLD("gold");

    private String value;

    StationType(String value) {
        this.value = value;
    }

    public static StationType fromStringValue(String value) {
        return StationType.valueOf(value.toUpperCase());
    }

    public String toStringValue() {
        return this.value;
    }
}
