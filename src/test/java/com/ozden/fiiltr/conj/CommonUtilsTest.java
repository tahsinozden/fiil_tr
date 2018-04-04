package com.ozden.fiiltr.conj;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommonUtilsTest {

    @Test
    public void shouldRemoveVerbEnding() {
        String verb = "almak";
        assertEquals("al", CommonUtils.removeVerbEnding(verb).toString());

        verb = "gelmek";
        assertEquals("gel", CommonUtils.removeVerbEnding(verb).toString());

        verb = "blabla";
        assertEquals("blabla", CommonUtils.removeVerbEnding(verb).toString());
    }
}