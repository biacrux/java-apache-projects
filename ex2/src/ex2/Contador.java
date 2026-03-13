/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

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
    
    @Override 
    public String toString(){
        return "Contador com o valor:" + count;
    }
    
    @Override 
    public Contador clone(){
        return new Contador(count);// new cria mum novo end na memoria 
    }
    
    @Override 
    public boolean equals(Object obj){
        if(obj == null || obj.getClass() != this.getClass()){ // usamos sempre assim para um equals
            return false;
        }else 
            return count == ((Contador)obj).count;    
    }
}

