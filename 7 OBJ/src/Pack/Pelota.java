package Pack;

public class Pelota {
    
    float radio;
    float peso;
    String color;
    // construtores sirven para definir valor por def e introducir valores en una clsae
    public Pelota(){
        radio=30;
        peso=100;
    }

    // constructor para introducir valores en la clase
    public Pelota(float radio, float peso)
    {  
    // el this es utilizado para diferenciar la variable local de la global
        this.radio=radio;
        this.peso=peso;

    }

    //metodos
    // al colocar una variable estos metodos seran def como funciones
    // el codigo se dentendra al conseguir un return para devolver una variable o 
    // valor que sea requerido
    public float obtenerRadio()
    {
        return radio;
    }
    public float obtenerPeso()
    {
        return peso;
    }
    // el metodo void solo ejecut a codigo que contenga dentro de dicha clase o funcion
    public void patear(){
        System.out.println("Pelota pateada");
    }

    public void cap(){
        System.out.println("Pelota atrapada");
    }
}

// herencia un objeto hereda caracteristicas de el mismo a otro
// para definir la herencia o de quien se hereda se debe definir la siguiente estructura
// esta se definie por fuera de la clase principal

class PelotaVerde extends Pelota{
    /* al utilizar herencia se definen caracteristicas generales del programa o modulo
    y luego se pueden llamar desde definiciones mas especificas que requieran de dichas caracteristicas*/
    public PelotaVerde()
    {
        this.color="verde";
    }
    public void Color(){
        System.out.println("La pelota es de color "+color);
    }
    
}