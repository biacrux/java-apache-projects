/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Turma;
import Aluno.Aluno;

import mylists.LinkedSortedList;
import mylists.SortedList;

/**
 * Classe que representa uma Turma
 * Implementa Comparable para manter as turmas ordenadas pela sua letra
 */
public class Turma implements Comparable<Turma> {
    private char identificador;
    private SortedList<Aluno> alunos;

    /**
      * - Construtor da classe Turma
      * @param identificador letra que identifica a turma
     */
    public Turma(char identificador) {
        this.identificador = identificador;
        this.alunos = new LinkedSortedList<>();
    }

    /**
      * - Classe que devolve a letra identificadora da turma
      * @return identificador da turma
     */
    public char getIdentificador() { 
        return identificador;
    }
    
    /**
      * - Classe que adiciona um aluno à lista ordenada da turma
      * @param a aluno a adicionar
     */
    public void adicionarAluno(Aluno a) {
        alunos.add(a);
    }

    /**
      * - Classe que limpa a lista de alunos da turma
     */
    public void limparAlunos() {
        alunos.clear();
    }

    /**
      * Classe que compara turmas pela letra que a identifica
      * @param outra turma a comparar
      * @return negativo se esta for menor, positivo se for maior
     */
    
    @Override
    public int compareTo(Turma outra) {
        return Character.compare(this.identificador, outra.identificador);
    }

    /**
      * - Classe que devolve uma string formatada com os dados da turma e dos alunos
      * @return string com os dados da turma
     */
    @Override
    public String toString() {
        String texto = "--- Turma " + identificador + " (" + alunos.size() + " alunos) ---\n";
        for (Aluno a : alunos) {
            texto += "  " + a.toString() + "\n";
        }
        return texto;
    }
}