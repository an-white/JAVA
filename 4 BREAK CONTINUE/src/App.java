public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <=10; i++) {
            if (i==4) {
                System.out.println("has dejado el ciclo");
                break;//salir de ciclo
            }
            System.out.println("sigues en el ciclo \n el valor del i="+i);
        }
        
        for (int i = 0; i <=10; i++) {
            if (i%2!=0){
                System.out.println("\n"+i+" no es un numero par");
            }
            else{
                continue;
            }
        }
    }
}
