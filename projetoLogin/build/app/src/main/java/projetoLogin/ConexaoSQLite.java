/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class ConexaoSQLite {
    
    
    public Connection conectar(){
            Connection conexao = null; //Declara uma variavel para armazenar a conexao 
            String url =  "jdbc:sqlite:usuarios.db"; //Define  o camiho do banco de dados SQLite
            
            try{
                //Tenta estabelecer a conexao com o banco de dados usando a URL fornecida
                conexao = DriverManager.getConnection(url);
                System.out.println("Conexao com SQLite estabelecida!"); //Mensagem de sucesso
            } catch (SQLException e){
                
                //Csso ocorra um erro, ele sera capturado e exibido
                System.out.println("Erro ao conectar ao banco" + e.getMessage());
            }
                return 
                        
                        conexao;
            }
    
}
