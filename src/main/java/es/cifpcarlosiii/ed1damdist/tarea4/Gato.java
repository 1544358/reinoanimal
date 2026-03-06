/**
 * Descripción de clase: Esta clase trata de un gato, la clase hereda las características de un Mamifero y coge comportamientos felinos.
 * @author Laura Paredes Alcaraz
 * @version 1.1
 */

package es.cifpcarlosiii.ed1damdist.tarea4;

public class Gato extends Mamifero {

    private int pelos;
    /**
     * Crea un nuevo Gato con el nombre proporcionado.
     * @param {nombre} El nombre que se le asignará al gato,
     * pasado a la clase base a través del constructor.
     */
    public Gato() {
        super();
    }

    /**
     * Realiza la acción de dormir de un gato.
     */
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }
    /**
     * Realiza la acción de maullar propia de los gatos.
     */
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }
    /**
     * Establece una interacción entre este gato y otro animal.
     * @param p El animal con el que se va a relacionar.
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.ToString());
    }

    /**
     * Obtiene la cantidad de pelo del gato
     * @return {int} devuelve el numero de pelos
     */
    public int getPelos() {
        return pelos;
    }

    /**
     * Define la cantidad
     * @param pelos devuelve la cantidad actualizada de pelos
     */
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }
}
