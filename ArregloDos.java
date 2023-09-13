
import java.util.Scanner;

public class ArregloDos {
    public static void main(String[] args) {
        //variables
        int [] ArregloUno = new int[5];
        //creando objeto Scanner
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<ArregloUno.length; i++){
            System.out.print("Ingresa el "+(i+1)+"° valor: ");
            ArregloUno[i] = sc.nextInt();
        }
        
        //for para recorrer
        System.out.println("\tArreglo con for:");
        for(int j=0; j<ArregloUno.length; j++){
            System.out.println(ArregloUno[j]);
        }

        //for-each para recorrer
        System.out.println("\tArreglo con for-each:");
        for(int item:ArregloUno){
            //System.out.println(item);
            System.out.println("%");
            
        }
    }
}
