/**
 *
 * @author PILARES
 */
public class CondicionFor {
    public static void main(String[] args) {
        String frase="programacion orientada objetos";
        //número de caracteres
        int max = frase.length();
        int cantidad = 0;
        char letra ='o';
        //validación que va comparando letra por letra en 'frase'
        for(int i=0; i<max; i++){
            if(frase.charAt(i) != letra){
                continue;
            }
            cantidad++;
        }
        System.out.println("encontrado:"+cantidad);        
    }
    
}
