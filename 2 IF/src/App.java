import java.net.InterfaceAddress;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int car,var,san;
        car=var=2;
        san=3;
        boolean condi=false,ds=true;

        /** si se colocan 2 if seguidos posteriormente no se debe colocar un else porque da error*/
        
        /**mayor y mayor igual >, >=
         * menor y menor igual <, <=
         * igual ==
         * and &&
         * o ||
         * negar operacion !
         */ 
        if(car>san)
        {
            System.out.println(car+">"+san);
        }
        else
        {
            System.out.println(car+"<"+san);
            System.out.println(condi+" "+ds);
        }

        var=10;
        car=4;
        if (car>san && car<var)
            System.out.println("Se cumple que: "+car+">"+san+" y "+car+"<"+var);
        
        if (!(car<san || car==var)) /**  */
            System.out.println("yep");

        int v1=4;
        int v2=3;
        int max;
        // operador terniario en cambio de un if then else evalua la condicion entre las dos variables y selecciona la que cumple dicha condicion
        // la estructura depende de ?:
        max= (v1>v2)?v1:v2;
        System.out.println("El max entre las variables es "+max);

        // operador instanceof permite comprobar si un objeto pertenece una clase en si
        class Poligono {}
        class Triangulo extends Poligono implements Figura {}

        Poligono p= new Poligono();
        Triangulo t=new Triangulo();
        System.out.println("p es instancia de ");
        if(p instanceof Poligono)
        {
        System.out.println("Poligono");    
        }
        if (p instanceof Triangulo) {
            System.out.println("Triangulo");          
        }
        if (p instanceof Figura) {
            System.out.println("Figura");
        }

        System.out.println("t es instancia de ");
        if(t instanceof Poligono)
        {
        System.out.println("Poligono");    
        }
        if (t instanceof Triangulo) {
            System.out.println("Triangulo");          
        }
        if (t instanceof Figura) {
            System.out.println("Figura");
        }

    }
}
