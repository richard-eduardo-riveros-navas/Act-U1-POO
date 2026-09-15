public class ParteD {
        public static void main(String[] args) {
            // Ejercicio 19
            Estudiante est1 = new Estudiante();
            // Estudiante es la CLASE: define la estructura (nombre, codigo, semestre).
            // est1 es un OBJETO: una instancia concreta creada a partir de esa clase, con memoria propia.

            // Ejercicio 20
            Estudiante a = new Estudiante(); a.nombre = "Ana"; a.codigo = 1234; a.semestre = 4;
            Estudiante b = new Estudiante(); b.nombre = "Luis"; b.codigo = 12345; b.semestre = 1;
            Estudiante c = new Estudiante(); c.nombre = "Marta"; c.codigo = 123456; c.semestre = 7;
            // Los tres comparten la misma clase (mismos atributos y métodos posibles: nombre,
            // codigo, semestre). Se diferencian en los VALORES que cada uno guarda.

            // Ejercicio 21
            Producto pA = new Producto(); pA.nombre = "Cuaderno"; pA.precio = 3000;
            Producto pB = new Producto(); pB.nombre = "Cuaderno"; pB.precio = 5000;
            // Mismo "nombre", distinto "precio": dos objetos de la misma clase pueden coincidir
            // en un atributo y diferir en los demás.

            // Ejercicio 22
            Libro l1 = new Libro(); l1.titulo = "Rayuela";
            Libro l2 = new Libro(); l2.titulo = "El Aleph";
            Libro l3 = new Libro(); l3.titulo = "Ficciones";
            Libro l4 = new Libro(); l4.titulo = "1984";
            // Conclusión: la clase Libro es una plantilla que dice un libro tiene título,
            // autor y páginas. Y cada objeto es un caso real y específico de
            // esa plantilla, con su propia información.
        }

    }
// Ejercicio 23 y 24
class Libro {
    String titulo, autor;
    int paginas;

    Libro() { }

    Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    Libro(Libro otro) { // constructor copia
        this.titulo = otro.titulo;
        this.autor = otro.autor;
        this.paginas = otro.paginas;
    }
}
