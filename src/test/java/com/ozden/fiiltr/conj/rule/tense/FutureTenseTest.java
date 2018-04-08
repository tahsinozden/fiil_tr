package com.ozden.fiiltr.conj.rule.tense;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FutureTenseTest {
    @Autowired
    private Future future;

    @Test
    public void shouldApplyPresentFutureTense() {
        StringBuilder word = new StringBuilder("ağlamak");
        future.apply(word);
        assertEquals("ağlayacak", word.toString());

        word = new StringBuilder("görmek");
        future.apply(word);
        assertEquals("görecek", word.toString());

        word = new StringBuilder("öpmek");
        future.apply(word);
        assertEquals("öpecek", word.toString());

        word = new StringBuilder("gelmek");
        future.apply(word);
        assertEquals("gelecek", word.toString());

        word = new StringBuilder("kalmak");
        future.apply(word);
        assertEquals("kalacak", word.toString());

        word = new StringBuilder("susmak");
        future.apply(word);
        assertEquals("susacak", word.toString());

        word = new StringBuilder("üşümek");
        future.apply(word);
        assertEquals("üşüyecek", word.toString());

        word = new StringBuilder("olmak");
        future.apply(word);
        assertEquals("olacak", word.toString());

        word = new StringBuilder("ısırmak");
        future.apply(word);
        assertEquals("ısıracak", word.toString());

        word = new StringBuilder("incitmek");
        future.apply(word);
        assertEquals("incitecek", word.toString());

        word = new StringBuilder("artmak");
        future.apply(word);
        assertEquals("artacak", word.toString());
    }
}