package com.ozden.fiiltr.conj.rule.imperative;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AffirmativeImperativeTest {

    @Autowired
    private AffirmativeImperative affirmativeImperative;

    @Test
    public void shouldConjugateAffirmativeImperative() {
        StringBuilder word = new StringBuilder("ağlamak");
        affirmativeImperative.apply(word);
        assertEquals("ağla", word.toString());

        word = new StringBuilder("görmek");
        affirmativeImperative.apply(word);
        assertEquals("gör", word.toString());

        word = new StringBuilder("öpmek");
        affirmativeImperative.apply(word);
        assertEquals("öp", word.toString());

        word = new StringBuilder("gelmek");
        affirmativeImperative.apply(word);
        assertEquals("gel", word.toString());

        word = new StringBuilder("kalmak");
        affirmativeImperative.apply(word);
        assertEquals("kal", word.toString());

        word = new StringBuilder("susmak");
        affirmativeImperative.apply(word);
        assertEquals("sus", word.toString());

        word = new StringBuilder("üşümek");
        affirmativeImperative.apply(word);
        assertEquals("üşü", word.toString());

        word = new StringBuilder("olmak");
        affirmativeImperative.apply(word);
        assertEquals("ol", word.toString());

        word = new StringBuilder("ısırmak");
        affirmativeImperative.apply(word);
        assertEquals("ısır", word.toString());

        word = new StringBuilder("incitmek");
        affirmativeImperative.apply(word);
        assertEquals("incit", word.toString());

        word = new StringBuilder("artmak");
        affirmativeImperative.apply(word);
        assertEquals("art", word.toString());
    }
}