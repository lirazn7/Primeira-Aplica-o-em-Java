import java.util.Scanner;

public class ProjetinhoPae {
    static void main() {
        String nome = "Igor Lira";
        String tipoConta = "Corrente";
        double saldo = 2999.99;
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;

        System.out.println("******************************************");
        System.out.println("\nDados iniciais do cliente:");
        System.out.println("Nome:  " + nome);
        System.out.println("Saldo:  " + saldo);
        System.out.println("Tipo de conta:  " + tipoConta);
        System.out.println("\n******************************************");

        String menu = """
                \n** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O seu saldo é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Valor que deseja transferir: ");
                double transfConta = leitura.nextInt();
                System.out.println("Transação efetuada!" + "\nO seu saldo agora é: " + (saldo - transfConta));
                if (transfConta > saldo) {
                    System.out.println("Não há saldo para concluir a transferência.");
                }else {
                    saldo -= transfConta;
                    System.out.println("Seu saldo atualizado: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor à receber: ");
                double recebido = leitura.nextDouble();
                saldo += recebido;
                System.out.println("Valor recebido!" + "\nSeu saldo atualizado: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }




    }
}
