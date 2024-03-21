import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        CadastroConta conta = new CadastroConta();
        int escolha;
        String nome, valor;

        for(int i =1; i!=0; i++){

            System.out.println("Digite a sua escolha: ");
            System.out.println("1 - para cadastrar: ");
            System.out.println("2 - para listar: ");
            System.out.println("3 - para procurar: ");
            System.out.println("4 - para sair: ");
            System.out.println("\n\nInsira aqui: ");

            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    
                    System.out.println("\n\nDigite o nome: ");
                    nome = input.next();
                    System.out.println("Digite o valor: ");
                    valor = input.next();

                    conta.cadastrar(nome, valor);

                    break;

                case 2:

                    conta.listar();

                    break;
                
                case 3:

                    System.out.println("Digite o nome do usuário da conta: ");
                    nome = input.next();
                    conta.pesquisa(nome);

                    break;
                
                case 4:

                    System.out.println("Saindo!!");
                    System.out.println(0);

                    break;
            
                default:

                    System.out.println("Escola inválida!!!");

                    break;
            }

        }


    }

}
