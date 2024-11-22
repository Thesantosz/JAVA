/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA3;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class Cao extends Animais{
     
    String porte;
    
   public Cao (String nome, int idade, String raca, String porte){
      super(nome, idade, raca);
       this.porte = porte;
       
   }
   
   @Override
   
   public void apresentarInfo(){
        System.out.println("o porte do cão é" + porte);
    
};
    
}
