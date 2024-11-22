/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA3;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class Main {
     
    public static void main(String[] args){
        Animais animal1 = new Animais( "Castor", 19876, "picudo");
        Cao cao1 = new Cao("joao", 10, "vira-lata", "medio");
        animal1.apresentarInfo();
        cao1.apresentarInfo();
    }
}
