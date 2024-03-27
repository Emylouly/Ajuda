public class Principal {

    public static void main(String[] args) {
        
        int tam=10, aux;
        int n[] = new int[tam];

        n[1] = 1;
        n[2] = 10;
        n[3] = 4;
        n[4] = 3;
        n[5] = 2;
        n[6] = 9;
        n[7] = 7;
        n[8] = 11;

        for(int i =0; i<tam; i++){

            if(n[i]>n[i-1]){

                aux = n[i];
                n[i] = n[i-1];
                n[i-1] = aux;

            }

        }

        for(int i=0; i<tam; i++){

            System.out.print(n[i] + "  ");

        }

    

    }
    

}
