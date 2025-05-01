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
    
    public boolean revProduct(int id) {
    String sql = "DELETE FROM products WHERE id = ?";

        try (PreparedStatement stmt = connect.prepareStatement(sql)) {
            // deleta o produto com o id selecionado
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro! " + e.getMessage());
            return false;
        }
  }
    
     
   public void attProducts(String name, String value, String units, int id) {
        
        // A string SQL que vai realizar a atualização. 
        // A cláusula WHERE é usada para especificar qual usuário será atualizado com base no ID.
        String sql = "UPDATE products SET name = ?,  value = ?, units = ? WHERE id = ?";

        try {
            // Cria um PreparedStatement para executar o SQL com parâmetros.
            // O PreparedStatement ajuda a prevenir ataques de SQL Injection, 
            //já que os valores dos parâmetros são definidos separadamente.
            try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
                
                // Substitui o primeiro parâmetro (?) com o novo nome fornecido.
                pstmt.setString(1, name);
                
                // Substitui o segundo parâmetro (?) com o novo email fornecido.
                pstmt.setString(2, value);
                
                // Substitui o terceiro parâmetro (?) com o ID do usuário para identificar qual usuário atualizar.
                pstmt.setString(3, units);
                
                pstmt.setInt(4, id);
                
                // Executa o comando SQL e retorna o número de linhas afetadas pela operação.
                int rowsUpdated = pstmt.executeUpdate();

                // Verifica se pelo menos uma linha foi atualizada.
                if  (rowsUpdated > 0) {
                    // Se a atualização foi bem-sucedida, imprime a mensagem de sucesso.
                    System.out.println("Product atualizado com sucesso!");
                } else {
                    // Se nenhuma linha foi atualizada (significa que o ID fornecido não foi encontrado), imprime uma mensagem.
                    System.out.println("Nenhum product encontrado!");
                }
            } catch (Exception e) {
                // Caso ocorra algum erro durante a execução do PreparedStatement, 
                // ele é capturado aqui.
                // O erro é impresso com uma mensagem explicativa.
                System.out.println("Erro ao atualizar product: " + e.getMessage());
            }
        } catch (Exception e) {
            // Caso ocorra um erro ao tentar preparar ou executar a instrução SQL, 
            // ele é capturado aqui. A mensagem do erro é impressa.
            System.out.println("Erro ao conectar ou executar SQL: " + e.getMessage());
        }
    } //atualizar
   
    public  ArrayList<Products> ListProducts() {
        ArrayList<Products> lista = new ArrayList<>(); // Cria uma array list para armazenar os produtos
        String sql = "SELECT * FROM products";

        try (Statement stmt = connect.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) { // adiciona todos os produtos no array
                Products product;
                product = new Products(
                        rs.getString("Name"),
                        rs.getString("Value"),
                        rs.getString("Units")   
                );
                product.setId(rs.getInt("id")); // pega o id do produto
                lista.add(product); 
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Produtos: " + e.getMessage());
        }
        return lista;
    }
}


    
        
    

    
