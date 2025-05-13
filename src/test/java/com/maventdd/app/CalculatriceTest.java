package com.maventdd.app;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatriceTest {
    @Test
    public void testAdditionner() {
        Calculatrice calc = new Calculatrice();
        assertEquals(5, calc.additionner(2, 3));
    }
}