public class ParteF {
        public static void main(String[] args) {
            // Ejercicio 30
            Estudiante e1 = new Estudiante();
            Estudiante e2 = new Estudiante("Laura", 1204);
            Estudiante e3 = new Estudiante("Carlos", 1305, 5);

            // Ejercicio 32
            Producto p1 = Producto.crearProductoBasico("Cargador");
            Producto p2 = Producto.crearProductoBasico("Audífonos");

            // Ejercicio 34
            Libro original = new Libro("Rayuela", "Julio Cortázar", 600);
            Libro copia = new Libro(original);
        }
    }

