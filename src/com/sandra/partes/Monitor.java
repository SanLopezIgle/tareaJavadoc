/**
 * @author Sandra López Oglesias
 * @version 1.0
 */

package com.sandra.partes;

public class Monitor {
    /**
     * mide las pulgadas del monitor
     */
    private float pulgadas;

    /**
     * constructor vacio
     */
    public Monitor(){

    }

    /**
     * constructor
     * @param pulgadas
     */
    public Monitor(float pulgadas){
        this.pulgadas = pulgadas;
    }

    /**
     * getter pulgadas
     * @return pulgadas
     */
    public float getPulgadas(){
        return pulgadas;
    }

    /**
     * setter pulgadas
     * @param pulgadas
     */
    public void setPulgadas(float pulgadas){
        this.pulgadas = pulgadas;
    }

    /**
     * metodo toString()
     * @return String con las pulgadas del monitor
     */
    @Override
    public String toString() {
        return "pulgadas: " + pulgadas;
    }
}
