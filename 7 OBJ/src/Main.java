import Pack.Carro;
import Pack.Pelota;
import Pack.CarroF1;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Arrancamos");
        /*
         * creacion de objeto en java se define como una variable definiendo primero el
         * tipo de objeto y luego el nombre que se le asignara a dicho objeto
         */
        Pelota p;
        // con esta linea se inicializa el objeto y se pre cargan las variables que el
        // tiene por def
        p = new Pelota(250, 300);

        float var = p.obtenerPeso();
        System.out.println(var + "\n");

        p.cap();

        Carro c;
        c = new Carro();
        // Al ya asignar una variable a mi objeto puedo acceder a sus diversos metodos
        // de la siguiente manera
        c.estado();
        c.encender();
        c.obtenerPeso();

        CarroF1 F1;
        F1 = new CarroF1();
        F1.encender();
        F1.DRS();

        // Polimorfismo consite en la creacion de metodos con mismo nombres en
        // diferentes clases o subclases
    }

}
