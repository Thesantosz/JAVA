/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superMarket.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import superMarket.database.ConnectionSQL;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class productsDAO {

    
    private Connection connect;

    public productsDAO() {
        connect = ConnectionSQL.connected();
    }

    public boolean addProduct(Products product) {
        String sql = "INSERT INTO products (name, value, units) VALUES (?,?, ?)";

        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            // adiciona as variaveis nas classes escolhidas
            pstmt.setString(1, product.getName());
            pstmt.setString(2, product.getValue());
            pstmt.setString(3, product.getUnits());
            pstmt.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao REGISTRAR! " + e.getMessage());
            return false;
        }
    }

    public boolean uptProduct(String newName, String newValue, String newUnits, int id) {
        String sql = "UPDATE products SET name = ?, value = ?, units = ? WHERE id  = ?";

        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            // atualiza as variaveis nas classes escolhidas
            pstmt.setString(1, newName);
            pstmt.setString(2, newValue);
            pstmt.setString(3, newUnits);
            pstmt.setInt(4, id);
            
            return pstmt.executeUpdate() > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao ATUALIZAR! " + e.getMessage());
            
            return false;
        }
    }
 
     public boolean dltProduct(int id) {
        String sql = "DELETE FROM products WHERE id = ?";

        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            // deleta o produto com o id selecionado
            pstmt.setInt(1, id);
            
            return pstmt.executeUpdate() > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao DELETAR! " + e.getMessage());
            return false;
        }
    }

    public ArrayList<Products> ListProducts() {
        ArrayList<Products> lista = new ArrayList<>();
        String sql = "SELECT * FROM products";

        try (Statement stmt = connect.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) { 
                Products product;
                product = new Products(
                        rs.getString("name"),
                        rs.getString("value"),
                        rs.getString("units")
                );
                product.setId(rs.getInt("id")); 
                lista.add(product); 
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os PRODUTOS: " + e.getMessage());
        }
        return lista;
    }
}


    
        
    

    