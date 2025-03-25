/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoMVC_Tasks.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class TarefaDAO {

    public static void adicionarTarefa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private Connection conexao;

    private static ArrayList<TarefaDAO> idBanco = new ArrayList();
    
    public TarefaDAO() {
        this.conexao = ConexaoSQLite.conectar();
    }
    
    public int adicionarTarefa(Tarefa tarefa) {
    String sql = "INSERT INTO tarefas(titulo, descricao, data_vencimento, status) VALUES (?, ?, ?, ?)";
    int idGerado = -1; // Inicializa a variável antes do try

    try (PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
        
        stmt.setString(1, tarefa.getTitulo());
        stmt.setString(2, tarefa.getDescricao());
        stmt.setString(3, tarefa.getData_vencimento());
        stmt.setString(4, "pendente");
        
       
        

        int linhasAfetadas = stmt.executeUpdate();

        if (linhasAfetadas > 0) {
            ResultSet rs = stmt.getGeneratedKeys(); // Obtém o ID gerado
            if (rs.next()) {
                idGerado = rs.getInt(1); // ✅ Agora idGerado pode ser usado no return
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return idGerado; 
    
    
}


    
   public void atualizarTarefa(String novoTitulo, String novaDescricao, String novaData, int id) {
        
        // A string SQL que vai realizar a atualização. 
        // A cláusula WHERE é usada para especificar qual usuário será atualizado com base no ID.
        String sql = "UPDATE tarefas" 
                + "SET titulo = ?,"
                + " descricao = ?, "
                + "data_vencimento = ?" +
                   "WHERE id = ?";

        try {
            // Cria um PreparedStatement para executar o SQL com parâmetros.
            // O PreparedStatement ajuda a prevenir ataques de SQL Injection, 
            //já que os valores dos parâmetros são definidos separadamente.
            try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
                
                // Substitui o primeiro parâmetro (?) com o novo nome fornecido.
                pstmt.setString(1, novoTitulo);
                
                // Substitui o segundo parâmetro (?) com o novo email fornecido.
                pstmt.setString(2, novaDescricao);
                
                // Substitui o terceiro parâmetro (?) com o ID do usuário para identificar qual usuário atualizar.
                pstmt.setString(3, novaData);
                
                pstmt.setInt(4, id);
                
                // Executa o comando SQL e retorna o número de linhas afetadas pela operação.
                int rowsUpdated = pstmt.executeUpdate();

                // Verifica se pelo menos uma linha foi atualizada.
                if  (rowsUpdated > 0) {
                    // Se a atualização foi bem-sucedida, imprime a mensagem de sucesso.
                    System.out.println("Tarefa atualizada com sucesso!");
                } else {
                    // Se nenhuma linha foi atualizada (significa que o ID fornecido não foi encontrado), imprime uma mensagem.
                    System.out.println("Nenhuma Tarefa encontrado!");
                }
            } catch (Exception e) {
                // Caso ocorra algum erro durante a execução do PreparedStatement, 
                // ele é capturado aqui.
                // O erro é impresso com uma mensagem explicativa.
                System.out.println("Erro ao atualizar tarefa: " + e.getMessage());
            }
        } catch (Exception e) {
            // Caso ocorra um erro ao tentar preparar ou executar a instrução SQL, 
            // ele é capturado aqui. A mensagem do erro é impressa.
            System.out.println("Erro ao conectar ou executar SQL: " + e.getMessage());
        }
    } //atualizar
   
  public int deletarTarefa(int id) {
    System.out.println("Tentando deletar tarefa com ID: " + id);

    String sql = "DELETE FROM tarefas WHERE id = ?";

    try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
        
        pstmt.setInt(1, id);
        int rowsDeleted = pstmt.executeUpdate(); 
        
        System.out.println("Linhas deletadas: " + rowsDeleted);

        return rowsDeleted;
        
    } catch (SQLException e) {
        System.out.println("Erro ao deletar tarefa: " + e.getMessage());
        return 0;
    }
  }//deletar tarefa
  
    public int concluirTarefa(int id){
        
        String sql = "UPDATE tarefas" 
                + "SET status = ✅ "
                +  "WHERE id = ?";
       
          try {
         
            try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
               
                pstmt.setInt(1, id);
                
                int rowsUpdated = pstmt.executeUpdate();

                // Verifica se pelo menos uma linha foi atualizada.
                if  (rowsUpdated > 0) {
                    // Se a atualização foi bem-sucedida, imprime a mensagem de sucesso.
                    System.out.println("Tarefa concluida com sucesso!");
                } else {
                    // Se nenhuma linha foi atualizada (significa que o ID fornecido não foi encontrado), imprime uma mensagem.
                    System.out.println("Nenhuma Tarefa encontrado!");
                }
            } catch (Exception e) {
                // Caso ocorra algum erro durante a execução do PreparedStatement, 
                // ele é capturado aqui.
                // O erro é impresso com uma mensagem explicativa.
                System.out.println("Erro ao concluir tarefa: " + e.getMessage());
            }
        } catch (Exception e) {
            // Caso ocorra um erro ao tentar preparar ou executar a instrução SQL, 
            // ele é capturado aqui. A mensagem do erro é impressa.
            System.out.println("Erro ao conectar ou executar SQL: " + e.getMessage());
        }
          return 0;
    }


   


}//classe