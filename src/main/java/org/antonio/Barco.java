/**
 * La clase Barco aporta una serie de funciones para establecer y devolver datos,
 * además de agregar tripualantes a tu barco
 * @version v1
 */

package org.antonio;

public class Barco {
    private String nombre;
    private int capacidad;

    /**
     * Establece un nombre y una capacidad a tu nuevo barco
     * 
     * @param nombre el nombre del barco
     * @param capacidad la capacidad del barco
     */
    public Barco(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    /**
     * Devuelve el nombre del barco
     * 
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la capacidad del barco
     * 
     * @return la capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Establece un nuevo nombre al barco
     * 
     * @param nombre el nombre a poner
     * @see #getNombre()
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece una nueva capacidad al barco
     * 
     * @param capacidad la capacidad a poner
     * @see #getCapacidad()
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @deprecated Reemplazado por {@link #agregarTripulante()}.
     */
    @Deprecated
    public boolean agregarTripulanteViejo() {
        if (capacidad < 10) {
            capacidad++;
            return true;
        }
        return false;
    }

    /**
     * Comprueba si el barco está lleno, el barco está lleno cuando llega a 10 tripulantes
     * 
     * @return devuelve true si la capacidad es menor de 10, o false si es mayor 
     */
    public boolean agregarTripulante() {
        if (capacidad < 10) {
            capacidad++;
            return true;
        }
        return false;
    }
}
