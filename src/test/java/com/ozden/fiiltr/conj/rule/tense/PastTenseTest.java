package com.ozden.fiiltr.conj.rule.tense;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PastTenseTest {

    @Autowired
    private Past past;

    @Test
    public void shouldApplyPastTense() {
        StringBuilder word = new StringBuilder("ağlamak");
        past.apply(word);
        assertEquals("ağladı", word.toString());

        word = new StringBuilder("görmek");
        past.apply(word);
        assertEquals("gördü", word.toString());

        word = new StringBuilder("öpmek");
        past.apply(word);
        assertEquals("öptü", word.toString());

        word = new StringBuilder("gelmek");
        past.apply(word);
        assertEquals("geldi", word.toString());

        word = new StringBuilder("kalmak");
        past.apply(word);
        assertEquals("kaldı", word.toString());

        word = new StringBuilder("susmak");
        past.apply(word);
        assertEquals("sustu", word.toString());

        word = new StringBuilder("üşümek");
        past.apply(word);
        assertEquals("üşüdü", word.toString());

        word = new StringBuilder("olmak");
        past.apply(word);
        assertEquals("oldu", word.toString());

        word = new StringBuilder("ısırmak");
        past.apply(word);
        assertEquals("ısırdı", word.toString());

        word = new StringBuilder("incitmek");
        past.apply(word);
        assertEquals("incitti", word.toString());

        word = new StringBuilder("artmak");
        past.apply(word);
        assertEquals("arttı", word.toString());
    }
}