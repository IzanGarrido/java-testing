package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class TestBatalla {

        Luffy luffy = new Luffy(null, 0);
    Zoro zoro = new Zoro(null, 0);

    @Before
    public void SetUp() {
        luffy = new Luffy("Monkey D. Luffy", 100);
        zoro = new Zoro("Roronoa Zoro", 80);
    }

    @Test
    public void testAtaqueLuffy() {
        luffy.atacar(zoro);
        assertEquals(-20, zoro.getPoder());
    }

    @Test
    public void testAtaqueZoro() {
        zoro.atacar(luffy);
        assertEquals(20, luffy.getPoder());
    }

}