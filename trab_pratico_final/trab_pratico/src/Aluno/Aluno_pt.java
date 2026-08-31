/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aluno;

/**
 * - Classe que representa um aluno nacional
*/
public class Aluno_pt extends Aluno {
    
    /**
     * - Construtor do Aluno_pt
     * @param n_aluno número do aluno
     * @param nome_aluno nome do aluno
    */
    public Aluno_pt(int n_aluno, String nome_aluno){
        super(n_aluno, nome_aluno);
    }
    
    /**
     * - Classe que devolve como vai ser mostrado o texto no output 
     * @return string com [PT] número e nome
    */
    @Override 
    public String toString(){
        return "[Aluno_PT]" + super.toString();
    }
}
