
public class ArregloBidimensionales {
    //tambén conocidas como matrices
    // compuesta por renglones y columnas
    public static void main(String[] args) {
        //[filas][columnas]
        int [][] numeros = new int [2][4];
        //llenando 1a. fila
        numeros[0][0]=1;
        numeros[0][1]=2;
        numeros[0][2]=3;
        numeros[0][3]=4;
        //llenando 2a. fila
        numeros[1][0]=11;
        numeros[1][1]=12;
        numeros[1][2]=13;
        numeros[1][3]=14;
        
        //obtenemos tamaño de filas y columnas
        System.out.println("No. de filas: "+ numeros.length);
        System.out.println("No. de columnas: "+ numeros[0].length);
        
        //Imprimiendo un elemento de la matriz
        System.out.println("Elemento[1][2]: "+numeros[1][2]);
        //Imprimiendo un elemento de la matriz
        System.out.println("Último elemento[1][3]: "+numeros[1][3]);
        
        int num1,num2;
        num1=numeros.length -1;
        num2=numeros[1].length -1;
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println(numeros[(numeros.length -1)][(numeros.length -1)]);
        
        double [][] nuevosValores = {{2,2.2,3},{3,3.3,4},{4,4.4,5}};
        System.out.println("\nNuevosValores:");
        System.out.println("No. de filas: "+ nuevosValores.length);
        System.out.println("No. de columnas: "+ nuevosValores[0].length);
        
        
        
    }
    
}
