package org.cronpilot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassForTestingJacocoCoverageInSonarTest {
    @Test
    public void test() {
        int expected = 42;
        int result = new  ClassForTestingJacocoCoverageInSonar().sum(40, 2);
        assertEquals(expected, result);
    }
}