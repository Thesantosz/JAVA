/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DESAFIO;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class Bandagem {

      int quantidadeBandagem = 2;
     static int vidaBandagem = 15;
            
public int UsarBandagem() {
    quantidadeBandagem = quantidadeBandagem - 1; 
    return quantidadeBandagem;
}
}