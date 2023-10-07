package DAO;

import conexoes.ConexaoMySql;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Model_Operadores;

/**
 *
 * @author Suporte
 */
public class DAO_Operadores extends ConexaoMySql {

    public int salvarOperadoresDAO(Model_Operadores pModelOperadores) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_operador ("
                    + "ope_nome,"
                    + "ope_login,"
                    + "ope_senha,"
                    + "ope_perfil,"
                    + "ope_unidade"
                    + ") VALUES ("
                    + "'" + pModelOperadores.getOp_nome() + "',"
                    + "'" + pModelOperadores.getOp_login() + "',"
                    + "'" + pModelOperadores.getOp_senha() + "',"
                    + "'" + pModelOperadores.getOp_perfil() + "',"
                    + "'" + pModelOperadores.getOp_unidade() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirOperadoresDAO(int pIdOperador) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_operador WHERE pk_id_operador = '" + pIdOperador + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean alterarOperadoresDAO(Model_Operadores pModelOperador) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_operador SET "
                    + "pk_id_operador = '" + pModelOperador.getIdOperador() + "',"
                    + "ope_nome = '" + pModelOperador.getOp_nome() + "',"
                    + "ope_login = '" + pModelOperador.getOp_login() + "',"
                    + "ope_senha = '" + pModelOperador.getOp_senha() + "',"
                    + "ope_perfil = '" + pModelOperador.getOp_perfil() + "',"
                    + "ope_unidade + '" + pModelOperador.getOp_unidade() + "'"
                    + " WHERE pk_id_operador = '" + pModelOperador.getIdOperador() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public Model_Operadores retornaroperadorDAO(int pIdOperador) {
        Model_Operadores modelOperadores = new Model_Operadores();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_operador,"
                    + "ope_nome,"
                    + "ope_login,"
                    + "ope_senha, "
                    + "ope_perfil,"
                    + "ope_unidade"
                    + " FROM tbl_operador WHERE pk_id_operador = '" + pIdOperador + "';");
            while (this.getResultSet().next()) {
                modelOperadores.setIdOperador(this.getResultSet().getInt(1));
                modelOperadores.setOp_nome(this.getResultSet().getString(2));
                modelOperadores.setOp_login(this.getResultSet().getString(3));
                modelOperadores.setOp_senha(this.getResultSet().getString(4));
                modelOperadores.setOp_perfil(this.getResultSet().getString(5));
                modelOperadores.setOp_unidade(this.getResultSet().getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelOperadores;
    }

    public ArrayList<Model_Operadores> RetornarListaoperadorDAO() {
        ArrayList<Model_Operadores> listaModelOperadores = new ArrayList<>();
        Model_Operadores modelOperadores = new Model_Operadores();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_operador,"
                    + "ope_nome,"
                    + "ope_login,"
                    + "ope_senha,"
                    + "ope_senha"
                    + " FROM tbl_operador;");
            while (this.getResultSet().next()) {
                modelOperadores = new Model_Operadores();
                modelOperadores.setIdOperador(this.getResultSet().getInt(1));
                modelOperadores.setOp_nome(this.getResultSet().getString(2));
                modelOperadores.setOp_login(this.getResultSet().getString(3));
                modelOperadores.setOp_senha(this.getResultSet().getString(4));
                modelOperadores.setOp_perfil(this.getResultSet().getString(5));
                listaModelOperadores.add(modelOperadores);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelOperadores;
    }

    public int getValidarOperadorDAO(Model_Operadores pModelOperador) {
        int pk_id_operador = -1; // Valor padrão para indicar login inválido
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_operador,"
                    + "ope_nome,"
                    + "ope_login,"
                    + "ope_senha, "
                    + "ope_perfil,"
                    + "ope_unidade"
                    + " FROM tbl_operador WHERE ope_login = '" + pModelOperador.getOp_login() + "' AND ope_Senha = '" + pModelOperador.getOp_senha() + "' ;");

        if (getResultSet().next()) {
            pk_id_operador = getResultSet().getInt("pk_id_operador"); // ID do operador se o login for válido
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        this.fecharConexao();
    }
    return pk_id_operador;
}  
        

// Função para verificar se o usuário pode fazer login    
public boolean LoginAllowed(int pIdOperador){
    try {
        this.conectar();
        // Consulta para verificar se o usuário já está loga
        this.executarSQL("SELECT COUNT(*) FROM tbl_sessao WHERE fk_id_operador = '"+pIdOperador+"' AND ses_logout_times IS NULL ");
        
        if (getResultSet().next()){
            int activeSessions = getResultSet().getInt(1);
            // Se houver sessões ativas, o login não é permitido
            return activeSessions == 0;
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
}

// Função para verificar se o usuário pode abrir caixa    
public boolean CaixaAllowed(int pIdOperador){
    try {
        this.conectar();
        // Consulta para verificar se o usuário já está loga
        this.executarSQL("SELECT COUNT(*) FROM tbl_caixa WHERE fk_id_operador = '"+pIdOperador+"' AND cx_fechamento_times IS NULL ");
        
        if (getResultSet().next()){
            int activeSessions = getResultSet().getInt(1);
            // Se houver sessões ativas, o login não é permitido
            return activeSessions == 0;
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
}
  
}
