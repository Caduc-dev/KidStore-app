package models;

public class Produto{
   private int id;
   private String nome;
   private double preco;
   private int estoque; 

public Produto (String nome, double preco, int estoque){
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

   public int getId() {
      return id;
   }

   public String getNome(){

   return nome;
}

public double getPreco() {
   return preco;
}

public int getEstoque() {
   return estoque;
}

@Override
public String toString() {
        return "ID: " + id + " | " + nome + " | R$ " + preco + " | Qtd: " + estoque;
    }
}

