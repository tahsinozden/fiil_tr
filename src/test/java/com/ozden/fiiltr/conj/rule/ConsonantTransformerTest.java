package com.ozden.fiiltr.conj.rule;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsonantTransformerTest {

    @Test
    public void shouldTransform() {
        StringBuilder word = new StringBuilder("susdu");
        ConsonantTransformer.transform(word);
        assertEquals("sustu", word.toString());

        word = new StringBuilder("kaldı");
        ConsonantTransformer.transform(word);
        assertEquals("kaldı", word.toString());
    }
}