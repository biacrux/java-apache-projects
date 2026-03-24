/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6;

import java.util.Scanner; //para ir buscar valores do terminal
import java.util.InputMismatchException;

public class Ex6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            int[] v = new int[3];
            System.out.println("Introduza 3 valores inteiros: ");
    
            for(int i =0; i<3 ; i++){
                System.out.print("v[" +i+ "]: ");
                v[i]= input.nextInt();//guardar os valores que vamos captar no terminal
            }
        
            System.out.println("Indique a posciao a mostrar: ");
                int pos= input.nextInt();
        
            System.out.println("Elmento nessa posicao: "+ v[pos]);
        
        } catch (InputMismatchException e ){
            System.out.println("Erro: deve introduzir um valor inteiro");
            
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Erro: posicao invalida");
        }finally{
            input.close(); // para limpar o scanner
        }
        System.out.println("Fim do codigo");
    }    
}
