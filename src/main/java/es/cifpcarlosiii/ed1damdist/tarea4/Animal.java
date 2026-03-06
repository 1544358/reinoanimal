/**
 * Descripción de clase: Es la clase generica de los animales donde se recogen las acciones de cada gesto animal.
 * @author Laura Paredes Alcaraz
 * @version 1.1
 */

package es.cifpcarlosiii.ed1damdist.tarea4;

public class Animal {
    /**
     * Recoje el nombre de Animal
     */
    public Animal() {
        this.nombre = nombre;
    }
    /**
     * El atributo nombre identificativo del animal.
     */
    private String nombre;

    /**
     * En la acción "comer" nos devuelve esa cadena
     */

    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    /**
     * En la acción "Dormir" nos devuelve esa cadena
     */
    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }
    /**
     * En la acción "Originar" nos devuelve esa cadena
     */
    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }
    /**
     * En la acción "relacionar" nos devuelve esa cadena + el nombre
     */
    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }

    /**
     * El método ToString devuelve una cadena de texto que representa al animal.
     * @return {String} nos devuelve el "Nombre" del animal obtenido a través del método getNombre()
     */
    String ToString() {
        return this.getNombre();
    }
    /**
     *Recoge el nombre del animal
     * @return {String} con una cadena del nombre actual del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del animal
     * @param nombre {String} Recoge el nuevo nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
