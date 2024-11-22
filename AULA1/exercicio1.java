/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA1;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */

import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String frase;
        Double saldo;
        int numero;
        boolean sim = true;        
        
        System.out.println("Qual a frase do dia?");
        frase = sc.nextLine();
        
         System.out.println(frase); 
         
        System.out.println("Qual seu saldo da conta? Irei comprar um colchao com seu dinheiro.");
        saldo = sc.nextDouble();
 
        System.out.println("O colchão foi R$500, seu saldo ficou com " + (saldo - 500));
        
        System.out.println("Escolhe um numero: ");
        numero = sc.nextInt();
        
        System.out.println("Eu sou professor?");
        sim = sc.nextBoolean();
        
        
      
        
    }
}
