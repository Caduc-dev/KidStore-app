package menus;
import java.util.Scanner;

public class MenuPrincipal {

    private static Scanner scanner = new Scanner(System.in);

    public static void exibir() {

        int opcao;

        do {

            System.out.println("+--------------------------------------+");
            System.out.println("+         Loja Mundo Bella             +");
            System.out.println("+--------------------------------------+");
            System.out.println("");
            System.out.println("[1] Abertura e Fechamento de Caixa");
            System.out.println("[2] Vendas.");
            System.out.println("[3] Cliente.");
            System.out.println("[4] Estoque.");
            System.out.println("[5] Devolução de Mercadorias");
            System.out.println("[6] Sair...");
            System.out.print("");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4: MenuProdutos.exibir();
                    break;

                case 5:
                    break;

                default:

            }

        } while (opcao != 6);

    }
}

