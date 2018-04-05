package com.ozden.fiiltr.conj;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommonUtilsTest {

    @Test
    public void shouldRemoveVerbEnding() {
        StringBuilder verb = new StringBuilder("almak");
        CommonUtils.removeVerbEnding(verb);
        assertEquals("al", verb.toString());

        verb = new StringBuilder("gelmek");
        CommonUtils.removeVerbEnding(verb);
        assertEquals("gel", verb.toString());

        verb = new StringBuilder("blabla");
        CommonUtils.removeVerbEnding(verb);
        assertEquals("blabla", verb.toString());
    }
}