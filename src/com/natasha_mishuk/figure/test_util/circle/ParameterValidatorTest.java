package com.natasha_mishuk.figure.test_util.circle;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import com.natasha_mishuk.figure.circle.ParameterValidator;


public class ParameterValidatorTest {

    private ParameterValidator objectValidator;

    @Before
    public void initParameterValidator(){

        objectValidator = new ParameterValidator();

    }

    @After
    public void clearParameterValidator(){

        objectValidator = null;

    }

    @Test
    public void validateIfPositiveTrueTest(){

        assertTrue("validateIfPositiveTest fails!",objectValidator.validateIfPositive(1) );

    }

    @Test
    public void validateIfPositiveFalseTest(){
        assertFalse("validateIfPositiveTest fails!",objectValidator.validateIfPositive(-1) );

    }

    @Test
    public void validateIfPositiveZeroTest(){
        assertFalse("validateIfPositiveTest fails!",objectValidator.validateIfPositive(0) );

    }
}
