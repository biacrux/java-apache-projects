/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import AED.AED;


/**
 * Classe principal contendo o método main para testar.
 */
public class Main {
    
    /**
     * Método principal de teste
     * @param args argumentos da linha de comando
     */
    
    public static void main(String[] args) {
        AED gestao = new AED();

        System.out.println("*** 1.REGISTAR ALUNOS ***");
        
        //1. registar alunos
        // Inserções desordenadas para garantir que a LinkedSortedList ordena pelo número
        gestao.addAluno_pt(500, "Pedro Santos");
        gestao.addAluno_pt(100, "Ana Ferreira");
        gestao.addAluno_en(900, "John Doe");
        gestao.addAluno_pt(200, "Bruno Oliveira");
        gestao.addAluno_en(50, "Maria Garcia");
        gestao.addAluno_pt(400, "Carlos Almeida");
        gestao.addAluno_pt(300, "Diana Costa");

        //2. criar as turmas 
        System.out.println("\n***2. Criacao de 4 turmas (A, B, C, D)***");
        gestao.criarTurmas(4);
        gestao.mostrarTurmas();

        //3. remover a ultima turma (D)
        System.out.println("\n***3. Remocao da ultima turma (Turma D)***");
        gestao.removerUltimaTurma();
        gestao.mostrarTurmas();
        
        //4. remover a ultima turma (C)
        System.out.println("\n***4. Remocao da ultima turma (Turma C)***");
        gestao.removerUltimaTurma();
        gestao.mostrarTurmas();
        
        //5. So remover 2 turmas(impossivel - enunciado só e possivel trumas >3)
        System.out.println("\n**5. Remocao de 2 turmas***");
        boolean resultado = gestao.removerUltimaTurma();
        System.out.println("Removeu: " + resultado); 
        
        
        //6. alunos duplicados 
        boolean duplicado1 = gestao.addAluno_pt(100, "Ana Ferreira");
        System.out.println("\n***6.Testar um aluno duplicado ***");
        System.out.println("Adicionou duplicado: " + duplicado1); 
        
        
        //7. Criacao de turmas com n(numero de turmas a criar)<2 
        System.out.println("\n***7. Tentar criar 1 turma ***");
        boolean turma_Invalida = gestao.criarTurmas(1);
        System.out.println("Resultado: " + turma_Invalida); // false
        
        
    }
}