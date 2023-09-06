public class Main {
    public static void main(String[] args) {
        String frase = "java python java programacionpython";
        String fraseMin = frase.toLowerCase();
        String palabra = "python";
        int maxPalabra = palabra.length();   //maxPalabra = 7
        int maxFrase = frase.length() - maxPalabra; //maxFrase 25
        int cantidad = 0;

        //Similar a 'contain'
        buscar:
        for(int i=0; i<=maxFrase; ){ //inicia en 0 , tope 25
            System.out.println(i);
            int k = i;  // a k se le esta asginadno el valor de i=0 , tope 25
            for(int j=0; j<maxPalabra; j++){  // 0-7
                //System.out.println("\t"+frase.charAt(k)+" - "+palabra.charAt(j));

                if(frase.charAt(k++) != palabra.charAt(j) ){  //  Programación orientada a objetos  =0
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }

        System.out.println("Encontrado "+cantidad+
                " veces la palabra '"+palabra+"' en la frase");



    }
}