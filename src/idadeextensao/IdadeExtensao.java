/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadeextensao;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class IdadeExtensao {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner t = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = t.nextInt();
        String[] extenso = {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito","nove", "Dez", 
            "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte",
            "vinte um", "vinte dois", "vinte três", "vinte quatro", "vinte cinco", "vinte seis", "vinte sete", "vinte oito",
            "vinte nove", "trinta", 
            "trinta um", "trinta dois", "trinta três", "trinta quatro", "trinta cinco", "trinta seis", "trinta sete", 
            "trinta oito", "trinta nove", "quarenta ", 
            "quarenta um", "quarenta dois", "quarenta três", "quarenta quatro", "quarenta cinco", "quarenta seis", 
            "quarenta sete", "quarenta oito", "quarenta nove","cinquenta", 
            "cinquenta um", "cinquenta dois", "cinquenta três", "cinquenta quatro", "cinquenta cinco", "cinquenta seis", 
            "cinquenta sete", "cinquenta oito", "cinquenta nove", "sessenta",
        "sessenta um", "sessenta dois" , "sessenta três", "sessenta quatro", "sessenta cinco", "sessenta seis", "sessenta sete", 
        "sessenta oito", "sessenta nove", "setenta", 
        "setenta um","setenta dois", "setenta três", "setenta quatro", "setenta cinco", "setenta seis"};
        int i, w = 0;
       
        for(w=1;w<=76;w += 8) {
            for(i=1;i<=76;i++) {   
                if(i==idade) {     
                    System.out.println("Você tem "+extenso[idade-1]+" ano(s)");
                    w=76;   
                }
            }            
        }
    }

}

    

