package projeto_3;

/**
 *
 * @author cruzb
 */
public class Projeto_3 {

    interface Animal {
        void fazerSom();
    }
    
    static class Cao implements Animal { // esta classe tem de ter o fazerSom pq herdou de Animal
        public void fazerSom() {
            System.out.println("Au, Au");
        }
    }
    
    static class Gato implements Animal {
        public void fazerSom() {
            System.out.println("Miau");
        }
    }
    
    public static void main(String[] args) {
        Animal cao = new Cao();
        Animal gato = new Gato();
        
        cao.fazerSom();
        gato.fazerSom();
        
        // Testar com um array de Animal (polimorfismo)
        Animal[] animais = { new Cao(), new Gato(), new Cao() };
        for (Animal a : animais) {
            a.fazerSom();
        }
    }
}