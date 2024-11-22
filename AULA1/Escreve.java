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

public class Escreve {
    public static void main(String[] args){
            
           //cria um objeto Scanner para ler a entrada do usuário
            Scanner sc = new Scanner(System.in);
            
            //Declara duas variáveis inteiras para armazenar os números digitados pelo usúario
            int numero1, numero2;
            
            System.out.println("Digite um numero: ");
            numero1 = sc.nextInt();
            
             System.out.println("Digite outro numero: ");
            numero2 = sc.nextInt();
                    
                    System.out.println("A soma dos numeros é" + (numero1 +  numero2));
            
            
    }
    
}
