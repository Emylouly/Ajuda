import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int tam, aux;

        System.out.println("Digite quantos números que você quer por em ordem crescente: ");
        Scanner input = new Scanner(System.in);
        tam = input.nextInt();

        int n[] = new int[tam];
        
        System.out.println("Digite os numeros que serão colocados em ordem crescente: ");

        for(int i=0; i<tam; i++){

            n[i] = input.nextInt();

        }

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
