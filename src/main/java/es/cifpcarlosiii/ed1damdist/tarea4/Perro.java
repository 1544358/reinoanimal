/**
 * Descripción de clase: Esta clase trata de un perro, la clase hereda las características de un Mamifero y coge comportamientos como ladrar o gruñir.
 * @author Laura Paredes Alcaraz
 * @version 1.1
 */

package es.cifpcarlosiii.ed1damdist.tarea4;

public class Perro extends Mamifero {

    /**
     * Crea una instancia de Perro con un nombre determinado.
     * @param {nombre} El nombre que identificará al perro.
     */
    public Perro() {
        super();
    }
    /**
     * Simula la acción de dormir del perro imprimiendo un mensaje.
     */
    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    /**
     * Simula el sonido del ladrido del perro.
     */
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    /**
     * Simula el sonido del gruñir del perro.
     */
    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    /**
     * Establece una interacción entre este perro y otro animal.
     * @param p El animal con el que se va a relacionar.
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.ToString());
    }

}
