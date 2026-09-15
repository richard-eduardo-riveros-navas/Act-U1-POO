 //Ejercicio 1
class Estudiante {
    String nombre;
    int codigo;
    int semestre;

// Ejercicio 29
Estudiante() { }

     Estudiante(String nombre, int codigo) {
         this.nombre = nombre;
         this.codigo = codigo;
     }

     Estudiante(String nombre, int codigo, int semestre) {
         this.nombre = nombre;
         this.codigo = codigo;
         this.semestre = semestre;
     }
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Código: " + codigo + ", Semestre: " + semestre);
    }

     // Ejercicio 17
     void cambiarSemestre(int nuevoSemestre) {
         semestre = nuevoSemestre;
     }
}

 //Ejercicio 2
class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    void mostrarEstado() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidadActual);
    }
     // Ejercicio 11
     void acelerar() {
         velocidadActual += 10;
     }
     // Ejercicio 12
     void frenar() {
         velocidadActual -= 10;
         if (velocidadActual < 0) velocidadActual = 0;
     }
}


 //Ejercicio 3
class Producto {
    String nombre;
    double precio;
    int stock;

     Producto() { }

     Producto(String nombre, double precio, int stock) {
         this.nombre = nombre;
         this.precio = precio;
         this.stock = stock;
     }
    void mostrarProducto() {
        System.out.println("Producto: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
    }

    static Producto crearProductoBasico(String nombre) {
         return new Producto(nombre, 0, 0);
     }
     // Ejercicio 15
     void vender(int cantidad) {
         if (cantidad <= stock) stock -= cantidad;
         else System.out.println("Stock insuficiente");
     }
     // Ejercicio 16
     void reabastecer(int cantidad) {
         stock += cantidad;
     }
}

 //Ejercicio 4
class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

     CuentaBancaria() {};

     // Ejercicio 27
     CuentaBancaria(String numero, String titular, double saldoInicial) {
         this.numero = numero;
         this.titular = titular;
         this.saldo = saldoInicial;
     }

    void mostrarCuenta() {
        System.out.println("Cuenta: " + numero + ", Titular: " + titular + ", Saldo: " + saldo);
    }

     // Ejercicio 13
     void consignar(double valor) {
         saldo += valor;
     }

     // Ejercicio 14
     void retirar(double valor) {
         if (valor <= saldo) {
             saldo -= valor;
         }
         else {
             System.out.println("Saldo insuficiente");
         }
     }
}

 //Ejercicio 5
class Mascota {
    String nombre;
    String especie;
    int edad;

    void mostrarMascota() {
        System.out.println("Mascota: " + nombre + ", Especie: " + especie + ", Edad: " + edad);
    }
     // Ejercicio 18
     void cumplirAnios() {
         edad++;
    }
}