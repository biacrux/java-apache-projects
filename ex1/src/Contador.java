/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cruzb
 */
public class Contador {
    private int count;
    
    public Contador(){} //construtor da classe para o valor passado por defeito (0)
    
    public Contador(int c){//para passar um valor que queremos dar
        count =c;
    } 
    
    public void incrementar(){
        count ++;
    }
    
    public void decrement(){
        count --;
    }
    
    public void reset(){
        count =0;
    }
    
    public int getCount(){
        return count;
    } 
    
}
