public class Quick_sort {

    public static void main(String[] args) {
        
        int tam =5, i=0, j, aux;
        int n[] = new int[tam];

        n[0] = 4;
        n[1] = 1;
        n[2] = 6;
        n[3] = 2;
        n[4] = 7;

        for(j=i+1; j<tam; j++){

            if(n[j] <=n[0]){

                i+=1;
                
                aux = n[i];
                n[i] = n[j];
                n[j] = aux;

            

            }

        }

        System.out.println("i" + i);

        aux = n[0];
        n[0] = n[i];
        n[i] = aux;

    
        for(int x=0; x<tam; x++){

            System.out.println(n[x] + "  ");

        }

    }

}
