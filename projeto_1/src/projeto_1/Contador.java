/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto_1;

/**
 *
 * @author cruzb
 */
public class Contador {

    private int count;
    @Override
    
    public String toString(){
        return "[" + count +"]";
    }
    
    @Override 
    public boolean equals(Object obj){
        if (obj == null ||this.getClass()!= obj.getClass()){
            return false;
        }else{
            return count == ((Contador)obj).count;
        }
    }
    
    
    public Contador clone(){
        return new Contador(count);
    }
}
   
    
