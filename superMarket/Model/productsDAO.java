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

    public String addProducts(Products product) {
        String sql = "INSERT INTO products(name, value, units) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, product.getName());
            stmt.setString(2, product.getValue());  // Alterado para setDouble
            stmt.setString(3, product.getUnits());

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = stmt.getGeneratedKeys(); // Obtém o ID gerado
                if (rs.next()) {
                    // Tratar o ID gerado, se necessário
                    int generatedId = rs.getInt(1);  // Obtém o ID do produto inserido
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
        return "Produto adicionado com sucesso";
    }
    
    public int revProduct(int id) {
    System.out.println("Tentando deletar produto com ID: " + id);

    String sql = "DELETE FROM products WHERE id = ?";

    try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
        
        pstmt.setInt(1, id);
        int rowsDeleted = pstmt.executeUpdate(); 
        
        System.out.println("Linhas deletadas: " + rowsDeleted);

        return rowsDeleted;
        
    } catch (SQLException e) {
        System.out.println("Erro ao deletar produto: " + e.getMessage());
        return 0;
    }
  }
}


    
        
    

    
