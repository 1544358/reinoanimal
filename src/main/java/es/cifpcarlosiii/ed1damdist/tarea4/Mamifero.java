/**
 * Descripción de clase: Esta clase trata del tipo generico de los animales,
 * Sirve como base para animales con características comunes de mamíferos, ayuda a la clase Animales
 * @author Laura Paredes Alcaraz
 * @version 1.1
 */

package es.cifpcarlosiii.ed1damdist.tarea4;

public class Mamifero extends Animal {
    /**
     * Crea una instancia de Mamifero asignándole un nombre.
     * @param {nombre} El nombre que identificará al mamífero, enviado a la superclase {Animal}.
     */
    public Mamifero() {
        super();
    }

    /**
     * Representa la forma de reproducción de los mamíferos.
     */
    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }
    /**
     * Establece una relación entre este mamífero y otro animal.
     * @param m El animal con el que se interactúa.
     */
    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.ToString());
    }
}
