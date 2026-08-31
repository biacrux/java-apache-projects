/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AED;
import Aluno.Aluno;
import Aluno.Aluno_en;
import Aluno.Aluno_pt;
import Turma.Turma;
import mylists.LinkedSortedList;
import mylists.SortedList;


/**
  * Classe principal que gere os alunos e as turmas
 */
public class AED {
    private SortedList<Aluno> alunos;
    private SortedList<Turma> turmas;
    
    /**
     * - Construtor do AED
    */ 
    public AED(){
        this.alunos= new LinkedSortedList<>();
        this.turmas = new LinkedSortedList<>();
    }
    
    /**
      * - Classe que regista um aluno nacional(pt)
      * @param num número do aluno
      * @param nome nome do aluno
      * @return true se foi adicionado, false se já existia
     */
    public boolean addAluno_pt(int num, String nome){
        return alunos.add(new Aluno_pt(num, nome));
    }
    
    /**
     * - Classe que regista um aluno internacional(en)
     * @param num número do aluno
     * @param nome nome do aluno
     * @return true se foi adicionado, false se já existia
     */
    public boolean addAluno_en(int num, String nome) {
        return alunos.add(new Aluno_en(num, nome));
    }
    
     /**
      * - Classe que cria varias turmas e distribui os alunos
      * @param n número de turmas a criar 
      * @return true se as turmas foram criadas, false caso contrário
     */
    public boolean criarTurmas(int n) {
        if (n < 2) return false;

        // Limpar turmas anteriores
        turmas.clear();

        // Criar n turmas: A, B, C...
        for (int i = 0; i < n; i++) {
            char letra = (char) ('A' + i);
            turmas.add(new Turma(letra));
        }

        // Distribuir os alunos
        distribuirAlunos();
        return true;
    }
    
     /**
      * - Classe que remove a última turma e redistribui os alunos
      * @return true se removeu, false se tiver menos de 3 turmas
     */
     public boolean removerUltimaTurma() {
        if (turmas.size() < 3) return false;

        // Remove a última turma
        turmas.remove(turmas.size() - 1);

        // Limpar alunos das turmas restantes e redistribuir
        for (int i = 0; i < turmas.size(); i++) {
            turmas.get(i).limparAlunos();
        }

        distribuirAlunos();
        return true;
    }
     
     /**
      * - Classe que mostra todas as turmas e os seus alunos
     */
      public void mostrarTurmas() {
        if (turmas.isEmpty()) {
            System.out.println("Não existem turmas criadas.");
            return;
        }
        for (int i = 0; i < turmas.size(); i++) {
            System.out.println(turmas.get(i));
        }
    }
      
     /**
      * - Classe que distribui os alunos pelas turmas
      * Alunos internacionais, turma A.
      * Alunos nacionais vão para as restantes turmas
     */
       private void distribuirAlunos() {
        int indice = 0;

        for (int i = 0; i < alunos.size(); i++) {
            Aluno a = alunos.get(i);

            if (a instanceof Aluno_en) {
               
                turmas.get(0).adicionarAluno(a);
            } else {
               
                int numTurmasPt = turmas.size() - 1;
                int turmaIndex = 1 + (indice % numTurmasPt);
                turmas.get(turmaIndex).adicionarAluno(a);
                indice++;
            }
        }
    }  
}
