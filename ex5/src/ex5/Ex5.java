/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cruzb
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {5, 12, 8, 20, 3, 17};
        int soma = 0;
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        double media = (double) soma / numeros.length;

        System.out.println("Array: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Maior valor: " + maior);
        System.out.println("Media: " + media);
    }
    
}
