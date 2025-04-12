/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hash.controller;

import hash.dao.UsuarioDAO;
import hash.model.Usuario;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class UsuarioController {
    
    private UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    public boolean registrarUsuario(String username, String senha) {
        
        Usuario usuario = new Usuario(username, senha);
        //criamos um objeto Usuario com as info que pegamos nos parâmetros ( que por sua vez pegamos dos 
        //campos na view)
        return usuarioDAO.registrarUsuario(usuario); // Inserimos o usuario no banco, pois o metodo DAO faz isso.
    }
    
}
