package com.mario21ic;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Testing Cloneable
     */
    @Test
    public void sameParrafos()
    {
        Documento d1 = new Documento();
        d1.setParrafo1("parr1");
        d1.setParrafo2("parr2");
        d1.setParrafo3("parr3");

        Documento d2 = (Documento) d1.clone();
        assertTrue(d2.getParrafo1().equals("parr1"));
        assertTrue(d2.getParrafo2().equals("parr2"));
        assertTrue(d2.getParrafo3().equals("parr3"));
    }
}
