/**
 * Esta clase es para agregar nuevas frutas y saber si son o no deliciosas,
 * para saber si puedo o no puedo comer la fruta
 * @version v1
 */

package org.antonio;

public class Fruta {
    private String nombre;
    private boolean esDeliciosa;

    /**
     * Agrega una nueva fruta
     * 
     * @param nombre el nombre de la fruta
     * @param esDeliciosa si es o no deliciosa
     */
    public Fruta(String nombre, boolean esDeliciosa) {
        this.nombre = nombre;
        this.esDeliciosa = esDeliciosa;
    }

    /**
     * Establece el nombre de tu clase
     * 
     * @param nombre el nombre a poner
     * @see #getNombre()
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el valor de si es o no deliciosa la fruta
     * 
     * @param esDeliciosa si es o no deliciosa
     * @see #getEsDeliciosa()
     */
    public void isEsDeliciosa(boolean esDeliciosa) {
        this.esDeliciosa = esDeliciosa;
    }

    /**
     * Devuelve el valor de si es deliciosa
     * 
     * @return el valor booleano
     */
    public boolean getEsDeliciosa() {
        return esDeliciosa;
    }

   /**
     * Devuelve el nombre de la fruta
     * 
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el valor de si es deliciosa
     * 
     * @return el valor booleano
     */
    public boolean esDeliciosa() {
        return esDeliciosa;
    }

    /**
     * @deprecated Reemplazado por {@link #agregarTripulante()}.
     */
    @Deprecated
    public boolean puedoComerViejo() {
        return esDeliciosa && !nombre.equals("Fruta del Diablo");
    }

    /**
     * Me informa si la fruta es o no deliciosa y si es la fruta del diablo
     * 
     * @return el resultado true o falso y si es fruta del diablo
     */
    public boolean puedoComer() {
        return esDeliciosa && !nombre.equals("Fruta del Diablo");
    }
}
