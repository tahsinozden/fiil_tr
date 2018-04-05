package com.ozden.fiiltr.webapi;

import com.ozden.fiiltr.conj.rule.RuleCombiner;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.verify;

public class ConjugateServiceTest {

    @Mock
    private RuleCombiner ruleCombiner;

    @InjectMocks
    private ConjugateService conjugateService = new ConjugateService();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldApplyRules() {
        conjugateService.applyRules("word", Lists.newArrayList());
        verify(ruleCombiner).applyMultipleRules(any(StringBuilder.class), anyList());
    }
}