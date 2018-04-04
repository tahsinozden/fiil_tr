package com.ozden.fiiltr.conj;

public interface Rule {
    String apply(String word);

    int getOrder();
}
