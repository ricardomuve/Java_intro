
import java.util.Scanner;
import java.util.*;

public class CalculadoraWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,res;
        int opcion = 0;

        while(opcion!=7){
            System.out.println("\n\t>> Menú <<" +
                    "\n1. Suma."+
                    "\n2. Resta."+
                    "\n3. Multiplicación."+
                    "\n4. División."+
                    "\n5. Modal."+
                    "\n6. Submenú."+
                    "\n7. Salir.\n");

            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            if(opcion==1){
                System.out.println("\t >> Suma <<");
                System.out.println("Ingresa el 1° valor:");
                a = sc.nextDouble();
                System.out.println("Ingresa el 2° valor:");
                b = sc.nextDouble();
                res = a+b;
                System.out.println("La suma es: "+res);

            }else if(opcion==2){
                System.out.println("\t >> Resta <<");
                System.out.println("Ingresa el 1° valor:");
                a = sc.nextDouble();
                System.out.println("Ingresa el 2° valor:");
                b = sc.nextDouble();
                res = a-b;
                System.out.println("La resta es: "+res);

            }else if(opcion==3){
                System.out.println("\t >> Multiplicación <<");
                System.out.println("Ingresa el 1° valor:");
                a = sc.nextDouble();
                System.out.println("Ingresa el 2° valor:");
                b = sc.nextDouble();
                res = a*b;
                System.out.println("El producto es: "+res);

            }else if(opcion==4){
                System.out.println("\t >> División <<");
                System.out.println("Ingresa el divisor:");
                a = sc.nextDouble();
                System.out.println("Ingresa el dividendo:");
                b = sc.nextDouble();
                res = a/b;
                System.out.println("El cociente es: "+res);

            }else if(opcion==5){
                System.out.println("\t >> Modal <<");
                System.out.println("Ingresa el 1° valor:");
                a = sc.nextDouble();
                System.out.println("Ingresa el 2° valor:");
                b = sc.nextDouble();
                res = a%b;
                System.out.println("El modal es: "+res);

            // Submenú
            }else if(opcion==6){
                while(opcion!=10){
                    System.out.println("\n\t>> Sub-Menú <<" +
                            "\n8. Potencia."+
                            "\n9. Raíz cuadrada."+
                            "\n10. Regresar.\n");

                    System.out.print("Selecciona una opción: ");
                    opcion = sc.nextInt();

                    if(opcion==8){
                        System.out.println("\t >> Potencia <<");
                        System.out.println("Ingresa la base:");
                        a = sc.nextDouble();
                        System.out.println("Ingresa la potencia:");
                        b = sc.nextDouble();
                        res = Math.pow(a,b);
                        System.out.println("La potencia es: "+res);


                    }else if(opcion==9){
                        System.out.println("\t >> Raíz cuadrada <<");
                        System.out.println("Ingresa el valor:");
                        a = sc.nextDouble();
                        res = Math.sqrt(a);
                        System.out.println("La raíz cuadrada es: "+res);



                    }else if(opcion==10) {
                        System.out.println("\tRegresando...");
                        break;
                    } else{
                        System.out.println("Opción inválida...");
                    }

                }

            }else if(opcion==7) {
                System.out.println("Fin del programa...");
                break;
            } else{
                System.out.println("Opción inválida...");
            }
        }


    }
}
