package projeto_1;

/**
 *
 * @author cruzb
 */
public class Contador {

    private int count;

    // Construtor vazio - começa em 0
    public Contador() {
        this.count = 0;
    }

    // Construtor com valor inicial
    public Contador(int valorInicial) {
        this.count = valorInicial;
    }

    public void incrementar() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString(){
        return "[" + count +"]";
    }
    
    @Override 
    public boolean equals(Object obj){
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }else{
            return count == ((Contador)obj).count;
        }
    }
    
    public Contador clone(){
        return new Contador(count);
    }
}