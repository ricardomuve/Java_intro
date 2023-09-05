
package RepasoUno;
//importando paquetería de 'swing' (ventanas emergentes)
import javax.swing.*;

/**
 *
 * @author PILARES
 */
public class Condiciones3 {
    public static void main(String[] args) {
        //arreglo unidimensional
        String[] nombres = {"alberto","juan","hector","jorge","sandra"};
        int contador = nombres.length;
        
        for(int i=0; i<contador;i++){
            
            if(nombres[i].toLowerCase().contains("JUAN".toLowerCase() ) 
                    || nombres[i].toLowerCase().contains("AlbertO".toLowerCase() )){
                //omite las dos palabras cuando coindicen
                continue;
            }
            System.out.println(i+".- "+nombres[i]);
        }
        //ventana de diálogo con input
        String buscar = JOptionPane.showInputDialog("Ingresa un nombre: ");
        System.out.println("Buscar = "+buscar);
        
        boolean encontrado = false;
        
        for(int i=0; i<contador;i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("Nombres = "+nombres[i]);
        }
        
        if(encontrado){
            //ventana de alerta
            JOptionPane.showMessageDialog(null, buscar+" fue encontrado");
        }else{
            JOptionPane.showMessageDialog(null,buscar+" no existe en el sistema");
        }
    }
    
    
}








