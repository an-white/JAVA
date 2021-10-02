package Pack;

public class Carro {
    double peso,altura,ancho,largo;
    int puertas;
    boolean encendido=false;
    String modelo;

    public Carro()
    {
        this.peso=1000;
        this.altura=1.90;
        this.ancho=2.5;
        this.largo=3.54;
    }
    public double obtenerPeso(){
        return peso;
    }
    public void encender(){
        encendido=true;
        System.out.println("Has encendido la maquina Bv");
    }
    public void apagar(){
        encendido=false;
        System.out.println("Has apagado la maquina B:'v");
    }
    public void estado(){
        if(encendido==true)
            System.out.println("Maquina encendia");
        else
            System.out.println("Maquina apaga");
    }

}

class CarroToyota extends Carro
{
    public void info(){
        System.out.println("Modelo Toyota");
    }

}