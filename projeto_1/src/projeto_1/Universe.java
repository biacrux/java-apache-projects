
package projeto_1;
/**
 *
 * @author cruzb
 */
public class Universe {

    public static void main(String[] args) {

        // Testar construtor vazio
        Contador c1 = new Contador();
        System.out.println("c1 inicial: " + c1);

        // Testar incrementar
        c1.incrementar();
        c1.incrementar();
        c1.incrementar();
        System.out.println("c1 depois de 3 incrementos: " + c1);

        // Testar decrementar
        c1.decrement();
        System.out.println("c1 depois de 1 decremento: " + c1);

        // Testar construtor com valor inicial
        Contador c2 = new Contador(10);
        System.out.println("c2 inicial: " + c2);

        // Testar getCount
        System.out.println("Valor de c2 via getCount(): " + c2.getCount());

        // Testar equals
        Contador c3 = new Contador(2);
        System.out.println("c1 equals c3? " + c1.equals(c3)); // true, ambos valem 2

        Contador c4 = new Contador(5);
        System.out.println("c1 equals c4? " + c1.equals(c4)); // false

        // Testar equals com null e outro tipo
        System.out.println("c1 equals null? " + c1.equals(null));
        System.out.println("c1 equals String? " + c1.equals("teste"));

        // Testar clone
        Contador c5 = c1.clone();
        System.out.println("c5 (clone de c1): " + c5);
        System.out.println("c1 == c5 (mesma referência)? " + (c1 == c5));
        System.out.println("c1 equals c5 (mesmo valor)? " + c1.equals(c5));
    }
}