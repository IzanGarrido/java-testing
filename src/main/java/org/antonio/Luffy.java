/**
 * La clase Luffy aporta una serie de funciones para establecer y devolver datos,
 * además de atacar a tu contricante y recibir el ataque
 * @version v1
 */

package org.antonio;

public class Luffy implements Personaje{
    private String nombre;
    private int poder;

    /**
     * Establace un nombre y un poder a tu clase Luffy
     * 
     * @param nombre
     * @param poder
     */
    public Luffy(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }


    /**
     * Devuelve el nombre de la clase Luffy.
     * 
     * @return el nombre 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el poder de la clase Luffy
     * 
     * @return el poder
     */
    public int getPoder() {
        return poder;
    }

    /**
     * Establece el nombre de tu clase
     * @param nombre el nombre a poner
     * @see #getNombre()
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *  Estable el poder de tu clase
     * @param poder el poder a establecer
     * @see #getPoder()
     */
    public void setPoder(int poder) {
        this.poder = poder;
    }

    /**
     * @deprecated Reemplazado por {@link #atacar(Personaje)}.
     */
    @Deprecated
    public void atacarViejo(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }

    /**
     * Ataca al personaje enemigo
     * 
     * @param enemigo el enemigo a atacar
     */
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(poder);
    }


    /**
     * Recibe el danio del personaje enemigo
     * 
     * @param cantidadDanio el danio a recibir
     */
    public void recibirDanio(int cantidadDanio) {
        this.poder -= cantidadDanio;
    }
}