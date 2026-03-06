/**
 * Descripción de clase: Esta clase principal de los animales,
 * Sirve como medio para coordinar los animales con características, usando la jerarquía.
 * @author Laura Paredes Alcaraz
 * @version 1.1
 */


package es.cifpcarlosiii.ed1damdist.tarea4;

public class Principal {

    /**
     * Método de inicio que ejecuta el programa.
     * Crea instancias de {@link Perro} y {@link Gato}, asignándoles nombres
     * específicos a través de sus constructores, y demuestra el uso de métodos heredados y sobreescritos.
     *  @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

/*
Esquema de clases de reino-animal        
                  Animal
                    |
                    |
                Mamifero
                /       \
               /         \        
          Perro          Gato
*/


        Animal animal = new Animal();

        Mamifero mamifero = new Mamifero();

        Perro toby = new Perro();

        Gato isidoro = new Gato();
        isidoro.setPelos(4);

        animal = isidoro;

        Gato g;
        g = (Gato) animal;
        System.out.println("pelos de gato: " + g.getPelos());

        Animal array[] = new Animal[4];

        array[0] = animal;
        array[1] = mamifero;
        array[2] = toby;
        array[3] = isidoro;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Perro) {
                System.out.println("El objeto " + i + " es un perro");

                Perro p = (Perro) array[i];
                p.ladrar();
            }

            if (array[i] instanceof Gato) {
                System.out.println("El objeto " + i + " es un gato");

                Gato anigato = (Gato) array[i];
                anigato.maullar();
            }
        }

    }
}
