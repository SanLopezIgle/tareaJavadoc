/**
 * @author Sandra López Oglesias
 * @version 1.0
 */

package com.sandra.partes;

public class Cpu {

    /**
     * mide la velocidad del procesador
     */
    private int velocidad;
    /**
     * constructor vacio
     */
    public Cpu(){

    }
    /**
     * constructor
     * @param velocidad
     */
    public Cpu(int velocidad){
        this.velocidad = velocidad;
    }

    /**
     * getter velocidad
     * @return velocidad
     */
    public int getVelocidad(){
        return velocidad;
    }

    /**
     * setter
     * @param velocidad
     */
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    /**
     * metodo toString()
     * @return String con la velocidad del procesador
     */
    @Override
    public String toString() {
        return "velocidad: " + velocidad;
    }
}
