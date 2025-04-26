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
    public static String addProduct(String name, int value, int units){
        String unitsString = String.valueOf(units);
        
        try{
        
        Products product = new Products(name, value, units);
        productsDAO productsDAO = new productsDAO();
        productsDAO.addProducts(product);
        
        return 
                "Cadastro da tarefa realizado!";
                }catch (NumberFormatException e){
return "Error:" + e.getMessage();
}
    }
}
