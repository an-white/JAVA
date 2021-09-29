public class App {
    public static void main(String[] args) throws Exception {
        /** arreglos o vectores*/
        /** declaracion se declara el nombre y la dimension del arreglo*/
        int x[]=new int[10];
        /** asignacion */

        x[0]=3;
        x[1]=4;
        x[2]=5;
        x[3]=6;
        
        /** otra forma de declarar arreglos */
        double y[]= {1,5,3,45,11,1.5};
        
        /** para det la longitud de un vetor */
        int dim=x.length;

        for (int n=0;n<dim;n++)
        {
            System.out.println("x["+n+"]: "+x[n]);
        }
        for (int n=0;n<y.length;n++){
            System.out.println(y[n]);
        }
        
        /** matrices */
        int array[][];
        array= new int[3][3];
        /**asignar valores de la siguiente forma */
        array[0][0]=2;
        System.out.println("array[0][1]="+array[0][1]);
        
        /** acceder a todos los elementos de un array es mediante 2 ciclos for para las filas y las columnas */
 
        
        // se puede declarar igual que los vectores 
        // anidacion consiste en tener un ciclo o alguna funcion dentro de otra
        int m=2;
        int n=2;
        double matrix[][] = new double[n][m];
        int cont=1;
        for (int k = 0; k < matrix.length; k++) {
            for (int i = 0; i < matrix.length; i++) {
                cont=cont+1;
                matrix[k][i]=cont; 
            
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
            }
      
        }
    }
}
