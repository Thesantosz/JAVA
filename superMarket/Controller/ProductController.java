/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superMarket.Controller;

import java.util.ArrayList;
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

        return "Cadastro do product realizado!";
    } catch (NumberFormatException e){
        return "Error: " + e.getMessage();
    }
}
   
   public static String revProduct(int id){
   try {
            // chama a classe DAO e deleta o produto
            productsDAO newProduct = new productsDAO();
            Boolean delete = newProduct.revProduct(id);

            // retorna mensagens se o produto foi deletado ou não
            if (delete) {
                return "Produto deletado com sucesso!";
            } else {
                return "Produto não encontrado ou não pode ser deletado";
            }
        } catch (Exception e) {
            System.out.println("Erro ao deletar product: " + e.getMessage());
            return "Erro ao deletar product.";
        }
}
   
    public static String attProducts(String name, String value, String units, int id){
        
        try{
          productsDAO newProduct = new productsDAO();
          newProduct.attProducts(name, value, units, id);
            
        }catch (Exception e) {
                
                System.out.println("Erro ao atualizar product: " + e.getMessage());
            }
        
        return
                "product atualizada";
} //atualizar produto
    
    public ArrayList<String> ListProducts() {
        productsDAO dao = new productsDAO();
        
        // cria um array list para receber os produtos da tabela
        ArrayList<String> ListDone = new ArrayList<>();
        try {
            
            // o array list recebe os dados de ProductDAO
            ArrayList<Products> ProductsList = dao.ListProducts();

            // processa os dados antes de enviar para a View
            for (Products product : ProductsList) {
                String detalhes = "ID: " + product.getId() + " | "
                        + "Name: " + product.getName() + " | "
                        + "Value: " + product.getValue() + " | "
                        + "Units: " + product.getUnits();
                ListDone.add(detalhes);
            }
        } catch (Exception e) {
            ListDone.add("Erro ao recuperar os produtos: " + e.getMessage());
        }
        return ListDone;
    }

}
