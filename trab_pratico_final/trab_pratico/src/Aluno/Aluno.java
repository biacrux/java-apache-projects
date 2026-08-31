/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aluno;

/**
 *- Classe abstrata que representa um aluno
*/
public abstract class Aluno implements Comparable<Aluno> {
    
    private int n_aluno;
    private String nome_aluno;
    
    /**
     * - Construtor do Aluno
     * @param n_aluno número do aluno
     * @param nome_aluno nome do aluno
    */ 
    public Aluno(int n_aluno, String nome_aluno){
        this.n_aluno= n_aluno;
        this.nome_aluno= nome_aluno;
    }
    
    /**
     * - Classe que devolve o numero do aluno
     * @return n_aluno
    */
    public int getNumero_Aluno(){
        return n_aluno;
    }
    
    /**
     * - Classe que devolve o nome do aluno
     * @return nome_aluno
    */
    public String getNome_Aluno(){
        return nome_aluno;
    }
    
    
    /**
     * - Classe que compara os alunos pelo número
     * @param outro aluno a comparar
     * @return negativo se este for menor, positivo se for maior
    */
    @Override
    public int compareTo(Aluno outro) {
        return Integer.compare(this.n_aluno, outro.n_aluno);
    }
    
    /**
     * - Classe que compara os alunos que tiverem o mesmo número 
     * @param obj objeto a comparar
     * @return true se tiverem o mesmo número
    */
    @Override 
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }if (obj == null){
            return false;
        }
        Aluno outro = (Aluno) obj;
        return this.n_aluno == outro.n_aluno;
    }
    
    /**
     * - Classe que devolve como vai ser mostrado o texto no output 
     * @return string com número e nome
    */
    @Override
    public String toString() {
        return n_aluno + " - " + nome_aluno;
    }
}
