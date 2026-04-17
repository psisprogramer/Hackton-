// Esta interfaz básicamente define lo que cualquier unidad debe poder hacer
// o sea, iniciar y finalizar una operación sí o sí
interface Operable {
    void iniciarOperacion();
    void finalizarOperacion();
}

// Esta es una clase abstracta porque no tiene sentido crear una "unidad genérica"
// sirve más como base para las demás
abstract class UnidadEntrega {

    // atributos básicos que todas las unidades tienen
    protected String identificador;

    // constructor para inicializar el ID
    public UnidadEntrega(String identificador) {
        this.identificador = identificador;
    }

    // método que ya está hecho y lo pueden usar todas
    public void mostrarInformacion() {
        System.out.println("ID: " + identificador);
    }

    // este método lo dejo abstracto porque cada vehículo entrega diferente
    public abstract void realizarEntrega();
}

// Bicicleta
// aquí ya hago una clase concreta que hereda y también implementa la interfaz
class Bicicleta extends UnidadEntrega implements Operable {

    // constructor que llama al de la clase padre
    public Bicicleta(String identificador) {
        super(identificador);
    }

    // cada clase define su forma de entregar
    public void realizarEntrega() {
        System.out.println("Entrega en bicicleta");
    }

    // implementación de la interfaz
    public void iniciarOperacion() {
        System.out.println("Inicia bicicleta");
    }

    public void finalizarOperacion() {
        System.out.println("Finaliza bicicleta");
    }
}

//  Motocicleta
class Motocicleta extends UnidadEntrega implements Operable {

    public Motocicleta(String identificador) {
        super(identificador);
    }

    public void realizarEntrega() {
        System.out.println("Entrega en motocicleta");
    }

    public void iniciarOperacion() {
        System.out.println("Inicia motocicleta");
    }

    public void finalizarOperacion() {
        System.out.println("Finaliza motocicleta");
    }
}

// Drone
class Drone extends UnidadEntrega implements Operable {

    public Drone(String identificador) {
        super(identificador);
    }

    public void realizarEntrega() {
        System.out.println("Entrega con drone");
    }

    public void iniciarOperacion() {
        System.out.println("Inicia drone");
    }

    public void finalizarOperacion() {
        System.out.println("Finaliza drone");
    }
}

// clase principal donde pruebo todo
public class Main {
    public static void main(String[] args) {

        // creo objetos de cada tipo
        Bicicleta bici = new Bicicleta("B1");
        Motocicleta moto = new Motocicleta("M1");
        Drone drone = new Drone("D1");

        // aquí básicamente simulo el proceso completo
        bici.iniciarOperacion();
        bici.mostrarInformacion();
        bici.realizarEntrega();
        bici.finalizarOperacion();

        System.out.println("-----");

        moto.iniciarOperacion();
        moto.mostrarInformacion();
        moto.realizarEntrega();
        moto.finalizarOperacion();

        System.out.println("-----");

        drone.iniciarOperacion();
        drone.mostrarInformacion();
        drone.realizarEntrega();
        drone.finalizarOperacion();
    }
}