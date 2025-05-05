/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoSupermarket.Controller;

import java.util.ArrayList;
import ProjetoSupermarket.model.Products;
import ProjetoSupermarket.model.ProductsDAO;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class ProductController {
    
    private ProductsDAO productsDAO;

  
    public ProductController() {
        this.productsDAO = new ProductsDAO();  
    }

   
    public static String add(String name, String value, String units) {
        try {
            Products Product = new Products(name, value, units); 
            ProductsDAO productDAO = new ProductsDAO(); 
            productDAO.addProduct(Product);
        } catch (NumberFormatException e) {
            return "Erro:" + e.getMessage();
        }
        return null;
    }

    public static String upt(String newName, String newValue, String newUnits, int id) {
        try {
            ProductsDAO newProducts = new ProductsDAO();
            boolean update = newProducts.uptProduct(newName, newValue, newUnits, id);

            if (update) {
                return "Produto atualizado!";
            } else {
                return "Produto não encontrado ou não atualizado.";
            }
        } catch (Exception e) {
            System.out.println("Erro ao atualizar Produto: " + e.getMessage());
        }
        return "Erro ao atualizar produto.";
    }

    public static String dlt(int id) {
        try {
            ProductsDAO newDelete = new ProductsDAO();
            Boolean delete = newDelete.dltProduct(id);

            if (delete) {
                return "Produto deletado com sucesso!";
            } else {
                return "Produto não encontrado ou não pode ser deletado";
            }
        } catch (Exception e) {
            System.out.println("Erro ao deletar tarefa: " + e.getMessage());
            return "Erro ao deletar tarefa.";
        }
    }

    public ArrayList<String> ListProducts() {

        ArrayList<String> List = new ArrayList<>();
        try {
            
            ArrayList<Products> ProductsList = productsDAO.ListProducts();

            for (Products product : ProductsList) {
                String detalhes = "ID: " + product.getId() + " | "
                        + "Name: " + product.getName() + " | "
                        + "Value: " + product.getValue() + " | "
                        + "Units: " + product.getUnits();
                List.add(detalhes);
            }
        } catch (Exception e) {
            List.add("Erro ao recuperar os produtos: " + e.getMessage());
        }
        return List;
    }

}