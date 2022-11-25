package boletin14; /**
 * @author Sandra López Oglesias
 * @version 1.0
 */

import com.sandra.partes.Cpu;
import com.sandra.partes.Monitor;
import com.sandra.partes.Teclado;

/**
 * Main, lo que hace es mostrarnos las caracteristicas de un ordenador
 */
public class Main {
    public static void main(String[] args) {

        Monitor monitor = new Monitor(23f);
        Teclado teclado = new Teclado("marca");
        Cpu procesador = new Cpu(50);
        Ordenador ordenador = new Ordenador(monitor, teclado, procesador, 345.78f);

        System.out.println(ordenador.toString());
        System.out.println(ordenador.getMonitor().getPulgadas());
        System.out.println(ordenador.getTeclado().getMarca());
    }
}