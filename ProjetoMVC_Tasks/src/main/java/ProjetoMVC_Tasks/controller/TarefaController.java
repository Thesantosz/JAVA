/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoMVC_Tasks.controller;

import ProjetoMVC_Tasks.model.Tarefa;
import ProjetoMVC_Tasks.model.TarefaDAO;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class TarefaController {
    
    
    public static String adicionarTarefa(String titulo, String descricao, String dataString, String status){
        
        try{
        
        Tarefa tarefa = new Tarefa(titulo, descricao, dataString);
        TarefaDAO tarefaDAO = new TarefaDAO();
        tarefaDAO.adicionarTarefa(tarefa);
        
        return 
                "Cadastro da tarefa realizado!";
                }catch (NumberFormatException e){
return "Erro:" + e.getMessage();
}
    }
    
    public static void atualizarTarefa(String novoTitulo, String novaDescricao, String novaData, int id){
        
        try{
          TarefaDAO novaTarefa = new TarefaDAO();
          novaTarefa.atualizarTarefa(novoTitulo, novaDescricao, novaData, id);
            
        }catch (Exception e) {
                // Caso ocorra algum erro durante a execução do PreparedStatement, 
                // ele é capturado aqui.
                // O erro é impresso com uma mensagem explicativa.
                System.out.println("Erro ao atualizar usuário: " + e.getMessage());
            }
        
        }
    
    }

