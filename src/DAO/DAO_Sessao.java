package DAO;

import conexoes.ConexaoMySql;
import model.Model_Sessao;

/**
 *
 * @author Misael Modesto
 */

public class DAO_Sessao extends ConexaoMySql{

    public int salvarSessaoDAO(Model_Sessao pModelSessao) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_sessao ("
                    + "fk_id_operador,"
                    + "ses_login_times"
                    + ") VALUES ("
                    + "'" + pModelSessao.getFk_id_operador()  + "',"
                    + "'" + pModelSessao.getSes_login_times() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }  
    
    
    public boolean updadeSessaoDAO(Model_Sessao pModelSessao) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_sessao SET "
                    + "ses_logout_times = '" + pModelSessao.getSes_logout_times()+ "'"
                    + " WHERE fk_id_operador = '" + pModelSessao.getFk_id_operador()+ "' AND ses_logout_times IS NULL;"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }  
    
}
