/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoMVC_Tasks.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class TarefaDAO {
    private Connection conexao;

    private static ArrayList<TarefaDAO> tarefaBanco = new ArrayList();
    public TarefaDAO() {
        this.conexao = ConexaoSQLite.conectar();
    }
    
    public void adicionarTarefa(Tarefa tarefa){
        
        String sql = "INSERT INTO tarefas(titulo, descricao, data_vencimento) VALUES (?, ?, ?)";
        
        try(PreparedStatement stmt = conexao.prepareStatement(sql)){
            
        stmt.setString(1, tarefa.getTitulo());
        stmt.setString(2, tarefa.getDescricao());
        stmt.setInt(3, tarefa.getData_vencimento());
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Tarefa cadastrada com sucesso!");
        
    } catch (SQLException e) {
        // Se ocorrer um erro
        JOptionPane.showMessageDialog(null, "Erro ao adicionar livro: " + e.getMessage());
    }
}
}
