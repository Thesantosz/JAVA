/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DESAFIO;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class Feiticeiro implements Habilidades{
    
     public int Dano(){
          
         int dano = (Sorteio.numeroAleatorio() + Sorteio.numeroAleatorio() +  Sorteio.numeroAleatorio()); 
         return 
                 dano;
      }
     
      @Override
    public int Vida(){
        
        int vida = (Sorteio.numeroAleatorio() + Sorteio.numeroAleatorio());
       return
               vida;
    }
        
    @Override
    public int Mana(){
        int mana = (Sorteio.numeroAleatorio() + Sorteio.numeroAleatorio());
        return 
                mana;
    };
}
    
    
}
