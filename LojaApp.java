import java.util.Scanner;

public class LojaApp {
   static void main(String[] args){
      Scanner leitor = new Scanner(System.in);

      int opcao = 0;

      while (opcao != 4) {
         System.out.println("+--------------------------------------+");
         System.out.println("+         Loja Mundo Bella             +");
         System.out.println("+--------------------------------------+");
         System.out.println();
         System.out.println("[1] Vendas.");
         System.out.println("[2] Cadastrar um cliente.");
         System.out.println("[3] Estoque.");
         System.out.println("[4] Sair...");
         System.out.println();
         System.out.print("Escolha: ");
         opcao = leitor.nextInt();
         leitor.nextLine();

         switch (opcao){
            case 1:

               int opcao2 = 0;

               System.out.println("+--------------------------------------+");
               System.out.println("+           Menu de vendas:            +");
               System.out.println("+--------------------------------------+");
               System.out.println();
               System.out.println("[1] Realizar uma venda");
               System.out.println("[2] Historico de vendas");

               opcao2 = leitor.nextInt();
               leitor.nextLine();

         }

      }

      System.out.println("O Sistema esta encerrando...");

  }
}
