import java.util.Arrays;

public class CadastroConta {

    private Conta conta[] = new Conta[100];
    private int numero;

    public Conta[] getConta() {
    return conta;
    }

    public void setConta(Conta[] conta) {
        this.conta = conta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void cadastrar(String nome, String valor){

        Conta nova = new Conta();

        nova.setNome(nome);
        nova.setValor(valor);

        conta[numero] = nova;
        numero++;

    }

    public void listar(){

        for(int i=0; i<numero; i++){

                System.out.println("\nConta " + (i+1) + "°:\n\nNome: " + conta[i].getNome() + "\nValor: " + conta[i].getValor()); 

        }

    }

    public void pesquisa(String nome){

        for(int i=0; i<numero; i++){

            if(conta[i].getNome().equals(nome)){

                System.out.println("Encontrado!\n\n");
                System.out.println(conta[i].getNome() + conta[i].getValor());
                return;

        }

        System.out.println("Não encontrado!!!");

    }

}
}



