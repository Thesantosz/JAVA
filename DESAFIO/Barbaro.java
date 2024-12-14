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
        
        String mensagem = "Você irá atacar seu oponente";
        
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
    public int golpeEspecial(){
        
        String mensagem = "VOCE DEU O GOLPE ESPECIAL";
        System.out.println(mensagem);
         int danoEspecial = 20;
         return 
                 danoEspecial;
        
    };
    
    @Override
    public int UsarBandagem(){
        
    int rilar = Vida() + 5;
  String mensagem = ("Voce recuperou 5 de vida e ficou com " );
  System.out.println(mensagem);
    return
           rilar;
    };
    
}

