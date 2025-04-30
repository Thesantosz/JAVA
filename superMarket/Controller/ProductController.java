/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superMarket.Controller;

import superMarket.Model.Products;
import superMarket.Model.productsDAO;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class ProductController {
    
   public static String addProduct(String name, String value, String units){
    

    try{
        Products product = new Products(name, value, units);
        productsDAO productsDAO = new productsDAO();
        productsDAO.addProducts(product);

        return "Cadastro da tarefa realizado!";
    } catch (NumberFormatException e){
        return "Error: " + e.getMessage();
    }
}
   
   public static String revProduct(int id){
    try {
        productsDAO newProduct = new productsDAO();
        int resultado = newProduct.revProduct(id); // ✅ Agora capturamos o retorno corretamente

        if (resultado > 0) {
            return "Product deletada com sucesso!";
        } else {
            return "Nenhum product encontrada com esse ID.";
        }
    } catch (Exception e) {
        System.out.println("Erro ao deletar tarefa: " + e.getMessage());
        return "Erro ao deletar tarefa.";
    }
}

}
