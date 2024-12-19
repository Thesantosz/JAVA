/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DESAFIO;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class Paladino implements Habilidades{
    
   @Override
      public int Dano(){
          
         int dano = (Sorteio.numeroAleatorio() + Sorteio.numeroAleatorio()); 
         return 
                 dano;
      }
     
      @Override
    public int Vida(){
        
        int vida = ((Sorteio.numeroAleatorio() + Sorteio.numeroAleatorio()) * 3);
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
    public int  golpeEspecial(){
        int danoEspecial = 20;
        String mensagem1 = "VOCE DEU O GOLPE ESPECIAL";
    System.out.println(mensagem1);
    
         return 
                 danoEspecial;
        }
       
    
    
    @Override
    public int UsarBandagem(){
        
    int rilar = Vida() + 5;
  String mensagem = ("Voce recuperou 5 de vida e ficou com " + Vida());
  System.out.println(mensagem);
    return
           rilar;
    
    }};
    


    

