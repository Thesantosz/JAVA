/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA2;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class Pessoa {
    private String  nome;
    private int idade;
    
    //CONTRUCTOR
    
    public Pessoa(String nome, int idade){
         this.nome = nome;
         this.idade = idade;
             
        
    };
    
    //METODOS
    
   public void apresentar(){
       System.out.println("Ola, meu nome é " + this.nome + "e tenho " + this.idade + "anos.");
      
};
   
   
};
