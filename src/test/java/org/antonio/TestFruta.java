package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class TestFruta {

    Fruta luffy = new Fruta(null, true);
    Fruta sabo = new Fruta(null, true);
    Fruta manzana = new Fruta(null, true);
    Fruta diablo = new Fruta(null, true);
    Fruta durian = new Fruta(null, true);

    @Before
    public void setUp() {
        
        luffy = new Fruta("Hito-Hito", true);
        sabo = new Fruta("Mera-Mera", false);
        manzana = new Fruta("Manzana", true);
        diablo = new Fruta("Fruta del Diablo", true);
        durian = new Fruta("Durian", false);
    }

    @Test
    public void testGetters() {

        assertEquals("Hito-Hito", luffy.getNombre());
        assertTrue(luffy.esDeliciosa());
        assertEquals("Mera-Mera", sabo.getNombre());
        assertFalse(sabo.esDeliciosa());
    }

    @Test 
    public void testSetters() {
        luffy.isEsDeliciosa(false);
        luffy.setNombre("Nika");
        sabo.isEsDeliciosa(true);
        sabo.setNombre("Fire");

        assertEquals("Nika", luffy.getNombre());
        assertTrue(sabo.esDeliciosa());
        assertEquals("Fire", sabo.getNombre());
        assertFalse(luffy.esDeliciosa());
    }

    @Test
    public void testPuedoComerFrutaDeliciosa() {
        assertTrue(manzana.puedoComer());

    }

    @Test
    public void  testPuedoComerFrutaDelDiablo() {   
        assertFalse(diablo.puedoComer());

    }

    @Test
    public void  testPuedoComerFrutaNoDeliciosa() {   
        assertFalse(durian.puedoComer());

    }
    
}