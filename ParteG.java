public class ParteG {

    // Ejercicio 35
    class Lampara {
        String marca;
        boolean encendida;

        void encender() { encendida = true; }
        void apagar() { encendida = false; }
        void mostrarEstado() {
            System.out.println("Lámpara " + marca + " - Encendida: " + encendida);
        }
    }

    // Ejercicio 36
    class Puerta {
        String material;
        boolean abierta;

        void abrir() { abierta = true; }
        void cerrar() { abierta = false; }
        void mostrarEstado() {
            System.out.println("Puerta de " + material + " - Abierta: " + abierta);
        }
    }

    // Ejercicio 37
    class Celular {
        String marca;
        int bateria;
        boolean prendido;

        void encender() { prendido = true; }
        void apagar() { prendido = false; }
        void cargarBateria() { bateria = 100; }
    }

    // Ejercicio 38
    class Ventilador {
        String marca;
        int velocidad;
        boolean encendido;

        void encender() { encendido = true; }
        void apagar() { encendido = false; velocidad = 0; }
        void subirVelocidad() { velocidad++; }
    }

    // Ejercicio 39
    class Cancion {
        String titulo, artista;
        int duracion; // segundos

        void mostrarInfo() {
            System.out.println(titulo + " - " + artista + " (" + duracion + "s)");
        }
    }

    // Ejercicio 40
    class Pelicula {
        String nombre, genero;
        int minutos;

        void mostrarFicha() {
            System.out.println(nombre + " [" + genero + "] - " + minutos + " min");
        }
    }
}
