import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class LojaApp {
   static void main(String[] args){
      Scanner leitor = new Scanner(System.in);
      List<Produto> produtos = new ArrayList<>();
      List<Cliente> clientes = new ArrayList<>();

      //Cliente padrão da loja
      Cliente clientepadrão = new Cliente("Cliente", "000.000.000-00");

      //Adiciona um cliente padrão na lista
      clientes.add(clientepadrão);

      int opcao = 0;

      //Menu inicial
      while (opcao != 6) {
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
         opcao = leitor.nextInt();
         leitor.nextLine();

         switch (opcao){

            case 1: //abertura e fechamento de caixa

               System.out.println("+--------------------------------------+");
               System.out.println("+    Abertura e fechamento de caixa    +");
               System.out.println("+--------------------------------------+");
               System.out.println("");
               System.out.println("[1] Abrir caixa");
               System.out.println("[2] encerrar caixa");

               break;

            case 2: //Entra no Menu de vendas

               int opcao2 = 0;

               System.out.println("+--------------------------------------+");
               System.out.println("+           Menu de vendas:            +");
               System.out.println("+--------------------------------------+");
               System.out.println("");
               System.out.println("[1] Realizar uma venda");
               System.out.println("[2] Historico de vendas");

               opcao2 = leitor.nextInt();
               leitor.nextLine();

               break;

            case 3: // entra nas opções de cliente

               System.out.println("+--------------------------------------+");
               System.out.println("+         Cadastro de cliente:         +");
               System.out.println("+--------------------------------------+");
               System.out.println();
               System.out.println("[1] Cadastrar.");
               System.out.println("[2] Ver Clientes");

               opcao2 = leitor.nextInt();
               leitor.nextLine();

               switch (opcao2){
                  case 1 :

                     break;

                  case 2:

                     break;
               }

               break;

            case 4: // Entra no menu de Estoque

               System.out.println("+--------------------------------------+");
               System.out.println("+               Estoque                +");
               System.out.println("+--------------------------------------+");
               System.out.println("");
               System.out.println("[1] Ver Estoque");
               System.out.println("[2] Cadastrar Produto");

               break;

               //ainda vou pensar no resto logica pra esse menu

            case 5: //menu de devolução de compras

               System.out.println("+--------------------------------------+");
               System.out.println("+      Devolução de mercadorias        +");
               System.out.println("+--------------------------------------+");
               System.out.println("");
               System.out.println("");
               System.out.println("");

               break;

               //ainda vou pensar no resto logica pra esse menu

            default:

               System.out.println("O Sistema esta encerrando...");

               break;

         }

      }
  }
}
