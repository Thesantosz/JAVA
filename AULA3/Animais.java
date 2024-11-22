/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA3;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class Animais {
    String nome;
    int idade;
    String raca;
    


public Animais(String nome, int idade, String raca){
this.nome = nome;
this.idade = idade;
this.raca = raca;
};

public  void apresentarInfo(){
    
    System.out.println("O nome desse animal e " + nome + " com a idade de " + idade + ". A raca dele e " + raca);
};

};



