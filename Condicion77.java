public class Condicion77 {
    //Generamos serie de números impares positivos
    public static void main(String[] args) {
        int n=20;
        for(int i=1; i<=n; i++){
            // i++ - operador unario
            if(i % 2 == 1){
                System.out.println("El número es impar: "+i);
            }
        }
    }
}
