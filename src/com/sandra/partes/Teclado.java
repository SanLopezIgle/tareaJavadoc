/**
 * @author Sandra López Oglesias
 * @version 1.0
 */

package com.sandra.partes;

public class Teclado {

    /**
     * nos dice la marca del teclado
     */
    private String marca;
    /**
     * constructor vacio
     */
    public Teclado(){

    }
    /**
     * constructor
     * @param marca
     */
    public Teclado(String marca){
        this.marca = marca;
    }

    /**
     * getter marca
     *
     * @return marca
     */
    public String getMarca(){
        return marca;
    }

    /**
     * setter marca
     * @param marca
     */
    public void setMarca(String marca){
        this.marca = marca;
    }

    /**
     * metodo toString()
     * @return String con la marca del ordenador
     */
    @Override
    public String toString() {
        return "marca: " + marca;
    }
}
