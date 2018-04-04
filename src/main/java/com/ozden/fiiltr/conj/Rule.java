package com.ozden.fiiltr.conj;

public interface Rule {
    StringBuilder apply(String word);

    int getOrder();
}
