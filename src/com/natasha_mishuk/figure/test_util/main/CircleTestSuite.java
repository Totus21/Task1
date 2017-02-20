package com.natasha_mishuk.figure.test_util.main;


import com.natasha_mishuk.figure.test_util.circle.CircleAreaCalculationTest;
import com.natasha_mishuk.figure.test_util.circle.CirclePerimeterCalculationTest;
import com.natasha_mishuk.figure.test_util.circle.ParameterValidatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({ParameterValidatorTest.class,CircleAreaCalculationTest.class,CirclePerimeterCalculationTest.class})
@RunWith(Suite.class)

public class CircleTestSuite {
}
