/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minha_colecao;

/**
 *
 * @author cruzb
 */
public class Principal {
    
    
    public static void main (String [] args){
        // alinea a )
        /*ArrayColl nomes = new ArrayColl(2);
        try{
            nomes.add("Ana");
            nomes.add("Beatriz");
            nomes.add("Carlos");
        }catch(IllegalStateException e ){
            System.out.println(e);
            
        }finally {
            System.out.println("Nomes inseridos: ");
        }
            System.out.println(nomes.toString());
            nomes.remLast();
            System.out.println(nomes.toString());
    */   
      
        // allinea b)
        ArrayColl<String> nomes  = new ArrayColl<>(20); // nao vai dar execao pq definimos como 20
        // passar valor de string
        nomes.add("Ana");
        nomes.add("Beatriz");
        nomes.add("Carlos");
        System.out.println(nomes.toString());
        
        // passar valores inteiros 
         ArrayColl<Integer> idades  = new ArrayColl<>(20);
         idades.add(10);
         idades.add(25);
         idades.add(28);
         System.out.println(idades.toString());
         
         ArrayColl<Double> salario  = new ArrayColl<>(20);
         salario.add(1250.25);
         salario.add(3200.98);
         salario.add(1020.00);
          System.out.println(salario.toString());
    }
}


