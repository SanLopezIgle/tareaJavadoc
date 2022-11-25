package boletin14; /**
 * @author Sandra López Oglesias
 * @version 1.0
 */

import com.sandra.partes.*;

/**
 * clase en la que definimos las caracteristicas de un ordenador
 */
public class Ordenador {
    /**
     * pulgadas del monitor del ordenador
     */
    private Monitor monitor;
    /**
     * marca del teclado del ordenador
     */
    private Teclado teclado;
    /**
     * velocidad del procesador del ordenador
     */
    private Cpu procesador;
    /**
     * precio del ordenador
     */
    private float precio;

    /**
     * constructor vacio
     */
    public Ordenador(){

    }

    /**
     * constructor
     * @param monitor
     * @param teclado
     * @param procesador
     * @param precio
     */
    public Ordenador(Monitor monitor, Teclado teclado, Cpu procesador, float precio){
        this.monitor = monitor;
        this.teclado = teclado;
        this.procesador = procesador;
        this.precio = precio;
    }

    /**
     * getter monitor
     * @return monitor
     */
    public Monitor getMonitor(){
        return monitor;
    }

    /**
     * getter teclado
     * @return teclado
     */
    public Teclado getTeclado(){
        return teclado;
    }

    /**
     * getter procesador
     * @return procesador
     */
    public Cpu getProcesador(){
        return procesador;
    }

    /**
     * getter precio
     * @return precio
     */
    public float getPrecio(){
        return precio;
    }

    /**
     * setter monitor
     * @param monitor
     */
    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }

    /**
     * setter teclado
     * @param teclado
     */
    public void setTeclado(Teclado teclado){
        this.teclado = teclado;
    }

    /**
     * setter procesador
     * @param procesador
     */
    public void setProcesador(Cpu procesador){
        this.procesador = procesador;
    }

    /**
     * setter precio
     * @param precio
     */
    public void setPrecio(float precio){
        this.precio = precio;
    }

    /**
     * metodo toString()
     * @return String que contiene las caracteristicas del ordenador
     */
    @Override
    public String toString() {
        return "boletin14.Ordenador{" +
                "\nmonitor " + monitor +
                "\nteclado " + teclado +
                "\nprocesador " + procesador +
                "\nprecio " + precio +
                '}';
    }
}
