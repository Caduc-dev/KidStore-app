package menus;

import java.util.Scanner;
import services.ServiceProduto;
import menus.MenuPrincipal;

public class MenuProdutos {
    private static Scanner scanner = new Scanner(System.in);

    public static void exibir(){

        int opcao;

        do{
            System.out.println("[1] Listar produtos");
            System.out.println("[2] Cadastrar Produtos");
            System.out.println("[3] Voltar ao menu inicar");

            opcao = scanner.nextInt();

            switch (opcao){

                case 1 : ServiceProduto.listarProdutos();
                break;

                case 2: ServiceProduto.adicionarProduto();
                break;

                default:

                    System.out.println("Retornando ao menu inicial...");
                    MenuPrincipal.exibir();

            }


        } while (opcao != 3);
    }
}

