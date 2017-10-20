/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menormaiooor;

import java.util.Scanner;

/**
 *
 * @author mateus.araujo
 */
public class Programaprincipalmaior {
    
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        int n1=leitor.nextInt();
        int n2=leitor.nextInt();
        int maior;
        
        if (n1>n2){
            maior = n1;
        }else{
            maior = n2;
        }
        System.out.println("Maior:"+ maior);
        leitor.close();
    }
}
