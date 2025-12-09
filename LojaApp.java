public class LojaApp {
   public static void main(String[]args){
   
   Produto p1 = new Produto(1, "Vestido Flor", 89.90, 3);
   Produto p2 = new Produto(2, "Vestido Borboleta", 129.90, 2);

   Cliente c1 = new Cliente("joão", "123.456.789-10");

   System.out.println("estoque antes da venda" + p1);
  
   Venda venda1 = new Venda(c1);
   venda1.adicionarProduto(p1, 2);
   venda1.finalizarVenda();

   System.out.println("Estoque pós venda: " + p1); 
  }
}
