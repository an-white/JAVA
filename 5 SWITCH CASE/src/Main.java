public class Main {
    public static void main(String[] args) throws Exception {
          /**
         * instrucciones switch y case su funcion es la de un menu */
        int var=1;
        char car='a';
        
        switch(var) /** se le debe pasar un parametro de tipo entero o caracter */
        {
            case 0:
            {
                System.out.println("opcion 0");
                break;
                /** se debe colocar un break para poder salir del switch si no se ejecutaran todas las opciones posteriores a la seleccionada */
            }
            case 1:
            {
                System.out.println("zeron't");
                break;
            }

        }
        // el case debe coincidir letra a letra cuando sea definido por cadenas
        switch(car)
        {
            case 'A':
            {
                System.out.println("plan A");
                break;
            }

            case 'B':
            {
                System.out.println("plan An't");
                break;
            }
            default:
            /** si se desea colocar una opcion que no este contemplada previamente se coloca una
             * opcion default
            */
            {
                System.out.println("si no es ni A ni B");
            }
        }
    }
}
