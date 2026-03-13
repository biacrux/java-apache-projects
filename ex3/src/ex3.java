/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cruzb
 */
public class ex3 {
    
    public static void main(String[] args) {
        Object[] vetor = new Object[10];
        for(int i=0; i<5; i++ ){
            vetor[i]=i*i;
        }for(int i=5; i<10; i++){
            vetor[i]=(i-3)+ "feira";
        }for(Object i: vetor){
            System.out.println(i);
        } 
    }
    
}
