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
    
    @Override
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
    
    @Override
    public String Fugir(){
        String fugir = "Você correu da batalha Barbaro";
        return fugir;
                
        
    };
    
        @Override
        public String Atacar(){
        
        String mensagem = "Você irá atacar seu oponente";
        
        return
                mensagem;
    };
        
        @Override
    public String golpeEspecial(){
        
        String mensagem2AT = "Você lançou o golpe especial no seu inimigo! ";
    return mensagem2AT;
        
    };
    
    @Override
    public String UsarBandagem(){
        
    String mensagem3AT = "Você usou uma bandagem! ";
    return mensagem3AT;
    };
    

}
    
    
