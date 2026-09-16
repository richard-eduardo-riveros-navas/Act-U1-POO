public class ParteH {


    // Ejercicio 41
    class Empleado {
        String nombre;
        double salario;
        String cargo;
    } //Modelar Empleado como clase es mejor que usar variables sueltas porque agrupa en un solo lugar todos los
    // Datos de un mismo empleado junto con lo que puede hacer. Mientras que con variables sueltas, si hay 50 empleados,
    // se necesitarían 150 variables sin relación explícita entre ellas; con la clase, cada empleado es un objeto
    // independiente y el código se mantiene ordenado sin importar cuántos empleados existan.


    // Ejercicio 42
    class Curso {
        String nombre;

        Curso c1 = new Curso();
        Curso c2 = new Curso();
    }
    //Son ambos objetos de la clase Curso porque compartenla misma estructura (nombre) definida por esa clase,
    // aunque c1 pueda ser "Bases de Datos" y c2 sea "Cálculo". Pertenecer a la misma clase
    // no exige tener los mismos valores solo el mismo tipo de datos y comportamientos posibles.
    // Ejercicio 43


    // Ejercicio 43
    class Computador {
        String marca;
        int ram;
        String procesador;
    }
    //El plano conceptual de Computador (la clase) solo dice que un computador de este tipo tendrá marca, RAM y
    // procesador, sin especificar cuáles. Una máquina concreta creada con new Computador() ya es un objeto real en
    // memoria, con valores definidos como marca "Lenovo" y 16gb de RAM


    // Ejercicio 44
    class Paciente {
        String nombre;
        String diagnostico;
    }
    //"Crear un paciente" enfatiza el resultado — ya existe un registro concreto en el sistema para esa persona.
    // "Instanciar la clase Paciente" enfatiza el proceso técnico de usar new Paciente() para producir esa instancia.
    // Están relacionadas porque instanciar es justamente el mecanismo que produce la creación, pero pedagógicamente
    // conviene distinguir el acto (instanciar) del resultado (el objeto creado).
}
