public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         /**
         * existen varios tipos de variables
         * short numeros cortos
         * int enteros
         * long largos
         * float con 1 decimal mas pesado que los anteriores
         * double dobles con todos los decimales posibles
         * byte 8bits
         * char caracteres 
         * boolean True and False
         * Strings cadenas
         * para ver el residuo de una division con decimales se utiliza %
         */
        
        System.out.println("Funciona?\n");

        float var;
        var=32;
        double result;
        result=var*.20;
        double div=10/3.14;
        System.out.println("Variable entera ="+var);
        System.out.println("Resultado="+result);
        System.out.println("Division="+div);

        /** para obtener el resultado sin problemas se utiliza la variable double si no
         * todas deben ser declaradas como floats
         */

        // los operadores de relaciones son iguales que en python
        double v1,v2;
        v1=12.3;
        v2=14.5;

        if (v1>v2)
        {
            System.out.println("v1<v2");
        }
        else
        {            
            System.out.println("v1>v2");
        }
        // operadores condicionales 
        // && and
        // || or
        //  ?: operador ternario

    }
}
