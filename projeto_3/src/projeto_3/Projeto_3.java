/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto_3;

/**
 *
 * @author cruzb
 */
public class Projeto_3 {

    interface Animal{
        void fazerSom();
    }
    
    class Cao implements Animal{ // esta classe tem de ter o fazer so pq herdou de animal
        public void fazerSom(){
            System.out.println("Au , Au");
        }
    }
    
    class Gato implements Animal{
        public void fazerSom(){
            System.out.println("Miau");
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
