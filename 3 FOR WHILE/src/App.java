public class App {
    public static void main(String[] args) throws Exception {
    /** para los ciclos for se debe definir la siguiente estructura
         * un contador entero (iniciado en cualquier valor), una condicion de menor igual que sera el lim de contador y una añadidor al contador cada vez que se pase por ese punto
         * si se def una condicion de <= se ejecutara el ciclo n+1 veces si se arranca desde 0 y si se condiciona a < se ejecutara n veces
         */
        for(int cont=0;cont<5;cont++)
        {
            System.out.println(cont+1);
        /** si el intervalo se requiere definir decreciente se establece el inicial como max y la condicion como > o >= y el decrecimiento -- */  
        }

        int x=0;
        // si se desea que se ejecute al menos 1 vez el ciclo utilizar el do-while ya que garantiza la ejecucion de al menos 1 vez de dicho ciclo
        while(x<=4)
        {
            /** este tipo de ciclo se debe establecer dentro del mismo la condicion de salida ya sea un incrementador o un calculo el cual rompa la condicion establecida */
            System.out.println("valor de x="+x);
            x=x+1;
            /** condicion break; permite romper un ciclo si se desea establecer cierta condicion
             *  condicion continue; permite saltar todo el codigo posterior a el en un ciclo 
             */
        }
    }
    
}
