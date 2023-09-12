
import javax.swing.*;

public class MenuJOptionPane {

	public static void main(String[] args) {
		//variables
		double a,b,res;
        int opcion = 0;
        
        //ciclo while para mostrar menú.
        while(opcion!=7){
            System.out.println("\n\t>> Menu Principal<<" +
                    "\n1. Suma."+
                    "\n2. Resta."+
                    "\n3. Multiplicacion."+
                    "\n4. Division."+
                    "\n5. Modal."+
                    "\n6. Submenu."+
                    "\n7. Salir.\n");

            //ventana de diálogo con entrada
            String op = JOptionPane.showInputDialog(null,"Selecciona una opción: ","MENÚ PRINCIPAL",JOptionPane.INFORMATION_MESSAGE);
            
            //try-catch para asegurar opción=entero
            try {
            		opcion = Integer.parseInt(op);
            	}
            	catch (NumberFormatException e) {
            		opcion = 0;
            	}
            
            //validación de 'opcion'
            if(opcion==1){
            	//Entrada de datos
                String inpA = JOptionPane.showInputDialog(null,"Ingresa el 1er valor:","SUMA",JOptionPane.INFORMATION_MESSAGE);                
                //convertimos string a double
                a = Double.parseDouble(inpA);
                String inpB = JOptionPane.showInputDialog(null,"Ingresa el 2o valor:","SUMA",JOptionPane.INFORMATION_MESSAGE);
                b = Double.parseDouble(inpB);
                //operación
                res = a+b;
                JOptionPane.showMessageDialog(null,"La suma es: "+res,"Resltado",JOptionPane.INFORMATION_MESSAGE);
                

            }else if(opcion==2){
            	//Entrada de datos
                String inpA = JOptionPane.showInputDialog(null,"Ingresa el 1er valor:","RESTA",JOptionPane.INFORMATION_MESSAGE);                
                //convertimos string a double
                a = Double.parseDouble(inpA);
                String inpB = JOptionPane.showInputDialog(null,"Ingresa el 2o valor:","RESTA",JOptionPane.INFORMATION_MESSAGE);
                b = Double.parseDouble(inpB);
                //operación
                res = a-b;
                JOptionPane.showMessageDialog(null,"La resta es: "+res,"Resltado",JOptionPane.INFORMATION_MESSAGE);

            }else if(opcion==3){
            	//Entrada de datos
                String inpA = JOptionPane.showInputDialog(null,"Ingresa el 1er valor:","MULTIPLICACIÓN",JOptionPane.INFORMATION_MESSAGE);                
                //convertimos string a double
                a = Double.parseDouble(inpA);
                String inpB = JOptionPane.showInputDialog(null,"Ingresa el 2o valor:","MULTIPLICACIÓN",JOptionPane.INFORMATION_MESSAGE);
                b = Double.parseDouble(inpB);
                //operación
                res = a*b;
                JOptionPane.showMessageDialog(null,"El producto es: "+res,"Resltado",JOptionPane.INFORMATION_MESSAGE);

            }else if(opcion==4){
            	//Entrada de datos
                String inpA = JOptionPane.showInputDialog(null,"Ingresa el 1er valor:","DIVISIÓN",JOptionPane.INFORMATION_MESSAGE);                
                //convertimos string a double
                a = Double.parseDouble(inpA);
                String inpB = JOptionPane.showInputDialog(null,"Ingresa el 2o valor:","DIVISIÓN",JOptionPane.INFORMATION_MESSAGE);
                b = Double.parseDouble(inpB);
                //operación
                res = a/b;
                JOptionPane.showMessageDialog(null,"El cociente es: "+res,"Resltado",JOptionPane.INFORMATION_MESSAGE);
                

            }else if(opcion==5){
            	//Entrada de datos
                String inpA = JOptionPane.showInputDialog(null,"Ingresa el 1er valor:","MODAL",JOptionPane.INFORMATION_MESSAGE);                
                //convertimos string a double
                a = Double.parseDouble(inpA);
                String inpB = JOptionPane.showInputDialog(null,"Ingresa el 2o valor:","MODAL",JOptionPane.INFORMATION_MESSAGE);
                b = Double.parseDouble(inpB);
                //operación
                res = a%b;
                JOptionPane.showMessageDialog(null,"El modal es: "+res,"Resltado",JOptionPane.INFORMATION_MESSAGE);
                
            // Submenú
            }else if(opcion==6){
                while(opcion!=10){
                    System.out.println("\n\t>> Sub-Menu <<" +
                            "\n8. Potencia."+
                            "\n9. Raiz cuadrada."+
                            "\n10. Regresar.\n");

                    op = JOptionPane.showInputDialog(null,"Selecciona una opción: ","SUB-MENÚ",JOptionPane.INFORMATION_MESSAGE);
                    try {
                    		opcion = Integer.parseInt(op);
                    	}
                    	catch (NumberFormatException e) {
                    		opcion = 0;
                    	}

                    if(opcion==8){
                    	//Entrada de datos
                        String inpA = JOptionPane.showInputDialog(null,"Ingresa la base:","POTENCIA",JOptionPane.INFORMATION_MESSAGE);                
                        //convertimos string a double
                        a = Double.parseDouble(inpA);
                        String inpB = JOptionPane.showInputDialog(null,"Ingresa el exponente:","POTENCIA",JOptionPane.INFORMATION_MESSAGE);
                        b = Double.parseDouble(inpB);
                        //operación
                        res = Math.pow(a,b);
                        JOptionPane.showMessageDialog(null,"La potencia es: "+res,"Resltado",JOptionPane.INFORMATION_MESSAGE);

                    }else if(opcion==9){
                    	//Entrada de datos
                        String inpA = JOptionPane.showInputDialog(null,"Ingresa el radicando:","RAÍZ CUADRADA",JOptionPane.INFORMATION_MESSAGE);                
                        //convertimos string a double
                        a = Double.parseDouble(inpA);
                        //operación
                        res = Math.sqrt(a);
                        JOptionPane.showMessageDialog(null,"La raíz cuadrada es: "+res,"Resltado",JOptionPane.INFORMATION_MESSAGE);

                    }else if(opcion==10) {
                        System.out.println("\tRegresando...");
                        break;
                    } else{
                    	JOptionPane.showMessageDialog(null,"Opción inválida.","ERROR",JOptionPane.ERROR_MESSAGE);
                    }

                }

            }else if(opcion==7) {
            	JOptionPane.showMessageDialog(null,"Fin del programa.","SALIR",JOptionPane.WARNING_MESSAGE);
                break;
            } else{
            	JOptionPane.showMessageDialog(null,"Opción inválida.","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }

	}

}

