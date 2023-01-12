package com.mario21ic;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Testing Singleton
     */
    @Test
    public void testIterator()
    {
        Mochila m = new Mochila();
        m.setZona1("navaja");
        m.setZona2("bocadillo");
        m.setZona3("agua");
        m.setZona4("telefono");

        Iterator<String> it = m.iterator();
        assertTrue( it.next() == "navaja");
        assertTrue( it.next() == "bocadillo");
        assertTrue( it.next() == "agua");
        assertTrue( it.next() == "telefono");
    }
}
