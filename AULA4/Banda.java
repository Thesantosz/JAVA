/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA4;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class Banda{
    public static void main(String[] args) {
        Violao meuViolao = new Violao();
        Piano meuPiano = new Piano();
        Bateria minhaBateria = new Bateria();

        
        meuViolao.afinar();
        meuViolao.tocar();
        minhaBateria.tocar();
        minhaBateria.afinar();
        meuPiano.tocar();
        meuPiano.afinar();
        
        
    }
   
}
