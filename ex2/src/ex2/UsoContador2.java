
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cruzb
 */
public class UsoContador2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // definir o tipo de variavel da outra classe que escrevemos 
          // esta inha daria erro
        Contador2 c1= new Contador2 ();
        c1.incrementar(); // c1=1
        c1.incrementar(); //c1=2
        System.out.println("1: c1=" +c1.getCount());
        c1.decrement();
        System.out.println("2: c1=" +c1.getCount()); 
        
        Contador2 c2= new Contador2 (10);
        c1=c2; // c2=10 pq apontam para o mesmo end de memoria 
        c2.incrementar(); // c2=11; c1=11
        
        System.out.println("3: c1=" +c1.getCount()); 
        System.out.println("4: c2=" +c2.getCount()); 
        
        Contador2 c3;
        c3 = c2.clone();
        c3.incrementar();
        
        System.out.println(c2.toString());
        System.out.println("c3= "+ c3);
        System.out.println("c2==c3: " +(c2== c3)); //ver se apontam pra o mesmo end de memoria (falso)
        
        
       c2.incrementar();
       System.out.println("c2==c3: " +(c2== c3)); //falso) mesmo tendo o = valor nao aponta para o emsmo end de memoria
        
       System.out.println("c2.equals(c3): " +c2.equals(c3)); // aqui ja compara os vlores (true)
       
    }
    
}
