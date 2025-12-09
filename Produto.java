public class Produto{
   private int id;
   private String nome;
   private double preco;
   private int estoque; 

public Produto (int id, String nome, double preco, int estoque){
   this.id = id;
   this.nome = nome;
   this.preco = preco;
   this.estoque = estoque;
} 
   //Metodo para diminuir o estoque na venda 
public void debitarEstoque(int quantidade){
   if(quantidade <= this.estoque) { 
      this.estoque -= quantidade;
   }else{
      System.out.println("Estoque insuficiente...");
   }     
}

   //Getters e toString()

public String getNome(){
   return nome;
}

public double getPreco() {
   return preco;
}

@Override
public String toString() {
        return "ID: " + id + " | " + nome + " | R$ " + preco + " | Qtd: " + estoque;
    }
}

