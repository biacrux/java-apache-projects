package projeto_4;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Teste {
    
    public void lerArquivo(){
        try{
            FileReader f = new FileReader("arquivo.txt");
        }catch(FileNotFoundException e){
            System.out.println("O arquivo não foi encontrado");
        }
    }
    
    public void metodoA() throws FileNotFoundException{
        FileReader f = new FileReader("arquivo.txt");
    }
   
    public static void main(String[] args) {
        Teste t = new Teste();
        
        t.lerArquivo(); // já trata a exceção internamente, pode chamar-se direto

        try{
            t.metodoA();
        }catch(FileNotFoundException e){
            System.out.println("Arquivo ausente");
        }
    }
}
