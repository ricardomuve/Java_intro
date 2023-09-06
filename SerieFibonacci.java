public class SerieFibonacci {
    public static void main(String[] args) {
        //Serie hasta los 10 primeros números
        int j, n=10, priTermino=0, segTermino=1;

        System.out.println("\tCon for:");
        for(int i=1; i<=n; i++){
            System.out.print(priTermino+", ");
            int siguiente = priTermino + segTermino;
            priTermino = segTermino;
            segTermino = siguiente;
        }

        System.out.println("\n\tCon while:");
        j=1;
        priTermino = 0;
        segTermino = 1;
        while(j<=n){
            System.out.print(priTermino+", ");
            int siguiente = priTermino + segTermino;
            priTermino = segTermino;
            segTermino = siguiente;
            j++;
        }
    }
}
