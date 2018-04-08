package com.ozden.fiiltr.conj.rule.sentence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NegativeSentenceTest {
    @Autowired
    private NegativeSentence negativeSentence;

    @Test
    public void shouldNegateVerb() {
        StringBuilder word = new StringBuilder("ağlamak");
        negativeSentence.apply(word);
        assertEquals("ağlama", word.toString());

        word = new StringBuilder("görmek");
        negativeSentence.apply(word);
        assertEquals("görme", word.toString());

        word = new StringBuilder("öpmek");
        negativeSentence.apply(word);
        assertEquals("öpme", word.toString());

        word = new StringBuilder("gelmek");
        negativeSentence.apply(word);
        assertEquals("gelme", word.toString());

        word = new StringBuilder("kalmak");
        negativeSentence.apply(word);
        assertEquals("kalma", word.toString());

        word = new StringBuilder("susmak");
        negativeSentence.apply(word);
        assertEquals("susma", word.toString());

        word = new StringBuilder("üşümek");
        negativeSentence.apply(word);
        assertEquals("üşüme", word.toString());

        word = new StringBuilder("olmak");
        negativeSentence.apply(word);
        assertEquals("olma", word.toString());

        word = new StringBuilder("ısırmak");
        negativeSentence.apply(word);
        assertEquals("ısırma", word.toString());

        word = new StringBuilder("incitmek");
        negativeSentence.apply(word);
        assertEquals("incitme", word.toString());

        word = new StringBuilder("artmak");
        negativeSentence.apply(word);
        assertEquals("artma", word.toString());
    }
}