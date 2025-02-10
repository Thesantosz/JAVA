/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
import java.util.ArrayList;
        
public class Carrinho {
    private ArrayList<String> carrinhoP = new ArrayList<>(); // Criar um ArrayList de produtos

    // Método para adicionar um produto ao carrinho
    public void adicionar(String produto) {
        carrinhoP.add(produto);
        System.out.println(produto + " adicionado ao carrinho!");
    }

    // Método para exibir os produtos no carrinho
    public void exibirCarrinho() {
        if (carrinhoP.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Produtos no carrinho:");
            for (String produto : carrinhoP) {
                System.out.println(" - " + produto);
            }
        }
    }
}
