package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda{
   private Cliente cliente;
   private List<Produto> produtos;
   private double total;
   private LocalDateTime dataHora;

public Venda(Cliente cliente) {
   this.cliente = cliente;
   this.produtos = new ArrayList<>();
   this.dataHora = LocalDateTime.now();
}

public void adicionarProduto(Produto p, int quantidade){
   p.debitarEstoque(quantidade);
   produtos.add(p);
   total += p.getPreco() * quantidade;
}

public void finalizarVenda() {
   System.out.println("-----Comprovante de venda-----");
   System.out.println("models.Cliente: " + cliente.getNome());
   System.out.println("Data " + dataHora);
   System.out.println("Itens comprados: " + produtos.size());
   System.out.println("Total a Pagar: R$ " + total);
 }
}


