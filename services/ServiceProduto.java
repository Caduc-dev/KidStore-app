package services;

import models.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceProduto {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Produto> produtos = new ArrayList<>();

    //metodo para adicionar um produto

    public static void adicionarProduto() {

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Estoque: ");
        int estoque = scanner.nextInt();
        scanner.nextLine();

        Produto p = new Produto(nome, preco, estoque);
        produtos.add(p);

        System.out.println("Produto adicionado...");

    }

    public static void listarProdutos() {
        System.out.println("\n----LISTA DE PRODUTOS----");

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            System.out.println(i + " - " + p.getNome() + " | R$ " + p.getPreco() + " | Estoque: " + p.getEstoque());
        }
    }
}
