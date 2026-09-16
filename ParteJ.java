public class ParteJ {
    // Ejercicio 51
    class Rectangulo {
        double base, altura;

        double calcularArea() { return base * altura; }
        double calcularPerimetro() { return 2 * (base + altura); }
        void mostrarResultados() {
            System.out.println("Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro());
        }
    }

    // Ejercicio 52
    class FacturaSimple {
        String numero, cliente;
        double valor;

        double aplicarDescuento() {
            return valor - (valor * 0.10);
        }
    }

    // Ejercicio 53
    class Reserva {
        String nombreCliente, fecha;
        boolean activa;

        void confirmar() { activa = true; }
        void cancelar() { activa = false; }
    }

    // Ejercicio 54
    class Semaforo {
        String colorActual = "rojo";

        void cambiar() {
            if (colorActual.equals("rojo")) colorActual = "verde";
            else if (colorActual.equals("verde")) colorActual = "amarillo";
            else colorActual = "rojo";
        }
    }

    // Ejercicio 55
    class Reloj {
        int hora, minuto, segundo;

        void mostrarHora() {
            System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
        }
    }

    // Ejercicio 56
    class Temperatura {
        double celsius;

        double convertirAFahrenheit() {
            return (celsius * 9 / 5) + 32;
        }
    }

    // Ejercicio 57
    class NotaAcademica {
        String asignatura;
        double nota1, nota2, nota3;

        double calcularDefinitiva() {
            return (nota1 + nota2 + nota3) / 3;
        }
    }

    // Ejercicio 58
    class InventarioItem {
        String nametag;
        int cantidad;
        double precioUnitario;

        double calcularValorTotal() {
            return cantidad * precioUnitario;
        }
    }

    // Ejercicio 59
    class UsuarioSistema {
        String nombreUsuario, clave;
        boolean activo;

        void activar() { activo = true; }
        void desactivar() { activo = false; }
    }

    // Ejercicio 60
    class Avion {
        String aerolinea, destino;
        int pasajeros;

        void abordar(int cantidad) {
            pasajeros += cantidad;
        }
    }
}
