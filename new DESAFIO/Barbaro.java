/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DESAFIO;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class Barbaro implements Habilidades{
    
    @Override
    public String Atacar(){  
        
        String mensagem = "Você atacou seu oponente";
        return
                mensagem;
    };
    
    
    public int Dano(){
          
         int dano = (Sorteio.numeroAleatorio() + Sorteio.numeroAleatorio() +  Sorteio.numeroAleatorio()); 
         return 
                 dano;
      }
     
      @Override
    public int Vida(){
        
        int vida = (Sorteio.numeroAleatorio() + Sorteio.numeroAleatorio() + Sorteio.numeroAleatorio());
       return
               vida;
    }
        
    @Override
    public int Mana(){
        int mana = (Sorteio.numeroAleatorio());
        return 
                mana;
    };
    
     @Override
    public String Fugir(){
        String fugir = "Você correu da batalha Barbaro";
        return fugir;
                
        
    };
    
    @Override
    public String golpeEspecial(){
        
        String mensagem2E = "Voce usou o golpe especial!";
    return mensagem2E;

        
    };
    
    @Override
    public String UsarBandagem(){
        
    String mensagem3E = "Você usou uma bandagem! ";
    return mensagem3E;
    };
    
}
