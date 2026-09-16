    class Materia {
        String nombre;
        int creditos;
        String docente;

        Materia(String nombre, int creditos, String docente) {
            this.nombre = nombre;
            this.creditos = creditos;
            this.docente = docente;
        }
        void mostrarInfo() {
            System.out.println(nombre + " (" + creditos + " créditos) - Docente: " + docente);
        }
    }

    // Ejercicio 67 - vida cotidiana
    class Tarea {
        String descripcion;
        boolean completada;

        Tarea(String descripcion) {
            this.descripcion = descripcion;

        }
        void completar() { completada = true; }
    }

    // Ejercicio 68 - negocio
    class Pedido {
        String cliente;
        double total;
        String estado;

        Pedido(String cliente, double total) {
            this.cliente = cliente;
            this.total = total;
        }
        void marcarEnviado() { estado = "enviado"; }
    }

// Ejercicio 69 - al menos 5 objetos por cada clase
public class ParteL {
    public static void main(String[] args) {
        Materia m1 = new Materia("POO",3,"John Arrieta");
        Materia m2 = new Materia("Calculo Integral",5,"Atilano");
        Materia m3 = new Materia("P y C de textos",1,"Raquel");
        Materia m4 = new Materia("Ingles",2,"Alvaro");
        Materia m5 = new Materia("Programacion Lineal",2,"Juan");

        Tarea t1 = new Tarea("Estudiar POO");
        Tarea t2 = new Tarea("Lavar ropa");
        Tarea t3 = new Tarea("Hacer mercado");
        Tarea t4 = new Tarea("Entregar taller");
        Tarea t5 = new Tarea("Ejercicio");

        Pedido p1 = new Pedido("Ana",50000);
        Pedido p2 = new Pedido("Luis",120000);
        Pedido p3 = new Pedido("Marta",30000);
        Pedido p4 = new Pedido("Sofía",90000);
        Pedido p5 = new Pedido("Diego",15000);
    }
}

//Ejercicio 70
//Clase: Materia (también aplica a Tarea y Pedido)
//Objetos: m1 a m5, cada uno representando una materia real distinta
//Atributos: nombre, créditos, docente
//Comportamiento: mostrarInfo()

