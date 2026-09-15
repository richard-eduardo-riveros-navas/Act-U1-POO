public class ParteB {
    public static void main(String[] args) {
        // Ejercicio 6
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Yudiliexis";
        estudiante1.codigo = 1204;
        estudiante1.semestre = 3;
        estudiante1.mostrarInfo();

        // Ejercicio 7
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Mazzda"; vehiculo1.modelo = "3"; vehiculo1.velocidadActual = 0;
        Vehiculo v2 = new Vehiculo();
        v2.marca = "Yamaha"; v2.modelo = "MT-03"; v2.velocidadActual = 40;
        vehiculo1.mostrarEstado();
        v2.mostrarEstado();

        // Ejercicio 8
        Producto producto1 = new Producto(); producto1.nombre = "Teclado"; producto1.precio = 45000; producto1.stock = 10;
        Producto producto2 = new Producto(); producto2.nombre = "Mouse"; producto2.precio = 25000; producto2.stock = 30;
        Producto producto3 = new Producto(); producto3.nombre = "Monitor"; producto3.precio = 600000; producto3.stock = 5;
        producto1.mostrarProducto(); producto2.mostrarProducto(); producto3.mostrarProducto();

        // Ejercicio 9
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Firulais"; mascota1.especie = "Perro"; mascota1.edad = 2;
        mascota1.mostrarMascota();
        mascota1.edad = 3; 
        mascota1.mostrarMascota();
        mascota1.edad = 4;
        mascota1.mostrarMascota();

        // Ejercicio 10
        CuentaBancaria c1 = new CuentaBancaria();
        c1.numero = "111"; c1.titular = "Pedro"; c1.saldo = 200000;
        CuentaBancaria c2 = new CuentaBancaria();
        c2.numero = "222"; c2.titular = "Ana"; c2.saldo = 500000;
        c1.mostrarCuenta();
        c2.mostrarCuenta();
    }
}