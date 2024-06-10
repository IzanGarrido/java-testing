package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class TestBarco {

    Barco sunny = new Barco(null, 0);
    Barco merry = new Barco(null, 0);

    @Before
    public void SetUp() {
        sunny = new Barco("Thousand Sunny", 5);
        merry = new Barco("Going Merry", 10);
    }

    @Test
    public void testGetters() {

        assertEquals("Thousand Sunny", sunny.getNombre());
        assertEquals(5, sunny.getCapacidad());
    }
    @Test
    public void testSetters() {
        sunny.setCapacidad(8);
        sunny.setNombre("sol");

        assertEquals("sol", sunny.getNombre());
        assertEquals(8, sunny.getCapacidad());
    }

    @Test
    public void testAgregarTripulante() {
        assertTrue(sunny.agregarTripulante());
        assertEquals(6, sunny.getCapacidad());

    }

    @Test
    public void testAgregarTripulanteMaximo() {
        assertFalse(merry.agregarTripulante());
        assertEquals(10, merry.getCapacidad());
    }

}