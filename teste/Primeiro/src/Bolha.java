public class Bolha {
    public static void main(String[] args) {

        int aux;
        int [] vetor = {5, 1, 12, -5, 16};

        for(int i = 0; i<vetor.length; i++){
            for(int x =0; i<vetor.length-1; x++){
                if(vetor[x]>vetor[x+1]){


                aux = vetor[x];
                vetor[x] = vetor[x+1];
                vetor[x+1] = aux;

                }
            }
        }

        System.out.println("\n\n");

        for(int i = 0; i<vetor.length; i++){

            System.out.print(vetor[i] + "a  ");

        }
}
}
