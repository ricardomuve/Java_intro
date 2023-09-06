
public class ProgramaSwitch {
    public static void main(String[] args) {
        int numero = 44;
        String size = "";

        switch (numero){
            case 29:
                size = "Pequeño";
                break;
            case 42:
                size = "Mediano";
                break;
            case 44:
                size = "Grande";
                break;
            case 48:
                size = "Extra grande";
                break;
            default:

        }
        
        System.out.println(size);


    }
}
