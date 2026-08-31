/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cruzb
 */
public class UsoContador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // definir o tipo de variavel da outra classe que escrevemos 
          // esta inha daria erro
        Contador1 c1= new Contador1 ();
        c1.incrementar(); // c1=1
        c1.incrementar(); //c1=2
        System.out.println("1: c1=" +c1.getCount());
        c1.decrement();
        System.out.println("2: c1=" +c1.getCount()); 
        
        Contador1 c2= new Contador1 (10);
        c1=c2; // c2=10
        c2.incrementar(); // c2=11; c1=11
        
        System.out.println("3: c1=" +c1.getCount()); 
        System.out.println("4: c2=" +c2.getCount()); 
        
        
        
    }
    
}
