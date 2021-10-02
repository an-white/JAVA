//Clase para objetos de dos dimensiones
//DosDimensiones.java
class DosDimensiones{
    private double base;
    private double altura;
    //Métodos de acceso para base y altura
    double getBase(){return base;}
    double getAltura(){return altura;}
    void setBase(double b){base=b;}
    void setAltura (double h){altura=h;}
    void mostrarDimension(){
        System.out.println("La base y altura es: "+base+" y "+altura);
    }
}
//Una subclase de DosDimensiones para Triangulo
//Triangulo.java
class Triangulo extends DosDimensiones{
    private String estilo;
    //Constructor
    Triangulo(String s, double b, double h){
        setBase(b);
        setAltura(h);
        estilo=s;
    }
    double area(){
        return getBase()*getAltura()/2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }
}
class Lados3{
    public static void main(String[] args) {
        Triangulo t1=new Triangulo("Estilo 1",4.0,4.0);
        Triangulo t2=new Triangulo("Estilo 2",8.0,12.0);
        System.out.println("Información para T1: ");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        System.out.println("Su área es: "+t1.area());
        System.out.println();
        System.out.println("Información para T2: ");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        System.out.println("Su área es: "+t2.area());
    }
}