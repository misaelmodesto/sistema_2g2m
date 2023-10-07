package controller;

import DAO.DAO_Alunos;
import java.util.ArrayList;
import model.Model_Alunos;

/**
 *
 * @author Misael Modesto
 */

public class ControllerAlunos {
    
    private DAO_Alunos daoAluno = new DAO_Alunos();

    public int salvarAlunoController(Model_Alunos pModelAluno){
        return this.daoAluno.salvarAlunosDAO(pModelAluno);
    }
    
    public boolean excluirAlunoController(int pIdAluno){
        return this.daoAluno.excluirAlunoDAO(pIdAluno);
    }
    
    public boolean alterarAlunoController(Model_Alunos pModelAluno){
        return this.daoAluno.alterarAlunoDAO(pModelAluno);
    }

  
    public Model_Alunos retornarAlunoController(int pIdAluno){
        return this.daoAluno.retornaralunoDAO(pIdAluno);
    }

    public ArrayList<Model_Alunos> retornarListaAlunoController(){
        return this.daoAluno.RetornarListaalunoDAO();
    }
    
        public boolean getValidarAlunoController(Model_Alunos pModelAlunos) {
        return this.daoAluno.getValidarAlunoDAO(pModelAlunos);
    }
    
    public Model_Alunos retornarAlunoMatriculaController(String pMatriculaAluno){
        return this.daoAluno.retornaralunoMatriculaDAO(pMatriculaAluno);
    }
}
