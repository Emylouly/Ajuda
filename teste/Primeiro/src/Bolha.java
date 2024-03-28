public class Bolha {
    public static void main(String[] args) {

        int tam=7, aux;
        int [] n = {5, 1, 12, -5, 16, 0, 100};

        for(int i = 0; i<tam; i++){
            for(int x =0; x<tam-1; x++){

                if(n[x]>n[x+1]){

                aux = n[x];
                n[x] = n[x+1];
                n[x+1] = aux;

                }      
            }
        }

        System.out.println("\n\n");

        for(int i = 0; i<tam; i++){

            System.out.print(n[i] + "  ");

        }
}
}
