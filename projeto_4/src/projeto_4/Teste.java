/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto_4;
import java.io.FileReader; 
import java.io.FileNotFoundException;

public class Teste {
    public void LerArquivo(){
        try{
            FileReader f = new  Reader("aquivo.txt")
        }catch(FileNotException e){
            System.out.println("o arquivo nao foi encontrado");
        }
    }
    
    public void metodoA() throws FileNotFoundException{
        FileReader f = new FileReader("arquivo.txt");
    }
   
    public static void main(String[] args) {
        metodoA();
        try{
            metodoA()
        }catch(FileNotFoundException e ){
            System.out.println("Arquivo ausente");
        }
                
    }
    
}
