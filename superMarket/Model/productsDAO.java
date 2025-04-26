/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superMarket.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import superMarket.database.ConnectionSQL;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class productsDAO {
    
    private Connection connect = ConnectionSQL.conectar(); 
    
    public  String addProducts(Products product){
        String sql = "INSERT INTO superMarket(name, value, units) VALUES (?, ?, ?)";
   

    try (PreparedStatement stmt = connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
        
        stmt.setString(1, product.getName());
        stmt.setInt(2, product.getValue());
        stmt.setInt(3, product.getUnits());

        int linhasAfetadas = stmt.executeUpdate();

        if (linhasAfetadas > 0) {
            ResultSet rs = stmt.getGeneratedKeys(); // Obtém o ID gerado
            if (rs.next()) {
                
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return "Product add";
    }
}
    
        
    

    
