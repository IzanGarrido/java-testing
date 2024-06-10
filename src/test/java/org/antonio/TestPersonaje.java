package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class TestPersonaje {
    
    Luffy luffy = new Luffy(null, 0);
    Zoro zoro = new Zoro(null, 0);

    @Before
    public void SetUp() {
        luffy = new Luffy("Monkey D. Luffy", 100);
        zoro = new Zoro("Roronoa Zoro", 80);
    }
 
    @Test
    public void testGetters() {

        assertEquals("Monkey D. Luffy", luffy.getNombre());
        assertEquals(100, luffy.getPoder());
        assertEquals("Roronoa Zoro", zoro.getNombre());
        assertEquals(80, zoro.getPoder());

    }

    @Test
    public void testSetters() {

        luffy.setNombre("Luffy");
        luffy.setPoder(120);
        zoro.setNombre("Zoro");
        zoro.setPoder(100);

        assertEquals("Luffy", luffy.getNombre());
        assertEquals(120, luffy.getPoder());
        assertEquals("Zoro", zoro.getNombre());
        assertEquals(100, zoro.getPoder());

    }



}