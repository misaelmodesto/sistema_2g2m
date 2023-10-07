package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.Model_Alunos;

/**
 *
 * @author Misael
 */
public class DAO_Alunos extends ConexaoMySql{
    
    public int salvarAlunosDAO(Model_Alunos pModelAlunos){
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_aluno ("
                    + "alu_nome,"
                    + "alu_matricula,"
                    + "alu_perfil,"
                    + "alu_unidade"
                    + ") VALUES ("
                    + "'" + pModelAlunos.getNome()+ "',"
                    + "'" + pModelAlunos.getMatricula()+ "',"
                    + "'" + pModelAlunos.getPerfil()+ "',"
                    + "'" + pModelAlunos.getUnidade()+ "'"
                    + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }
    
        public boolean excluirAlunoDAO(int pIdAluno){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_aluno WHERE pk_id_aluno = '"+pIdAluno+"'"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
        
    public boolean alterarAlunoDAO(Model_Alunos pModelAlunos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_aluno SET "
                    + "pk_id_aluno = '" + pModelAlunos.getId()+ "',"
                    + "alu_nome = '" + pModelAlunos.getNome()+ "',"
                    + "alu_matricula = '" + pModelAlunos.getMatricula()+ "',"
                    + "alu_perfil = '" + pModelAlunos.getPerfil()+ "',"
                    + "alu_unidade = '" + pModelAlunos.getUnidade()+ "'"
                    + " WHERE pk_id_aluno = '" + pModelAlunos.getId()+ "'"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public Model_Alunos retornaralunoDAO(int pIdAluno){
        Model_Alunos modelAluno = new Model_Alunos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_aluno,"
                    + "alu_nome,"
                    + "alu_matricula,"
                    + "alu_perfil,"
                    + "alu_unidade"
                    + " FROM tbl_aluno WHERE pk_id_aluno = '"+pIdAluno+"';");
            while(this.getResultSet().next()){
                modelAluno.setId(this.getResultSet().getInt(1));
                modelAluno.setNome(this.getResultSet().getString(2));
                modelAluno.setMatricula(this.getResultSet().getString(3));
                modelAluno.setPerfil(this.getResultSet().getString(4));
                modelAluno.setUnidade(this.getResultSet().getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelAluno;
    }
    
        public Model_Alunos retornaralunoMatriculaDAO(String pMatriculaAluno){
        Model_Alunos modelAluno = new Model_Alunos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_aluno,"
                    + "alu_nome,"
                    + "alu_matricula,"
                    + "alu_perfil,"
                    + "alu_unidade"
                    + " FROM tbl_aluno WHERE alu_matricula = '"+pMatriculaAluno+"';");
            while(this.getResultSet().next()){
                modelAluno.setId(this.getResultSet().getInt(1));
                modelAluno.setNome(this.getResultSet().getString(2));
                modelAluno.setMatricula(this.getResultSet().getString(3));
                modelAluno.setPerfil(this.getResultSet().getString(4));
                modelAluno.setUnidade(this.getResultSet().getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelAluno;
    }

    public ArrayList<Model_Alunos> RetornarListaalunoDAO(){
        ArrayList<Model_Alunos> listaModelAluno = new ArrayList<>();
        Model_Alunos modelAluno = new Model_Alunos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_aluno,"
                    + "alu_nome,"
                    + "alu_matricula,"
                    + "alu_perfil,"
                    + "alu_unidade "
                    + "FROM tbl_aluno;");
            while(this.getResultSet().next()){
                modelAluno = new Model_Alunos();
                modelAluno.setId(this.getResultSet().getInt(1));
                modelAluno.setNome(this.getResultSet().getString(2));
                modelAluno.setMatricula(this.getResultSet().getString(3));
                modelAluno.setPerfil(this.getResultSet().getString(4));
                modelAluno.setUnidade(this.getResultSet().getString(5));
                listaModelAluno.add(modelAluno);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelAluno;
    }    
    
        public boolean getValidarAlunoDAO(Model_Alunos pModelAlunos) {
        try {
            this.conectar();
              this.executarSQL("SELECT "
                    + "alu_matricula"
                    + " FROM tbl_aluno WHERE alu_matricula = '" + pModelAlunos.getMatricula() + "';");

            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }
    
}
