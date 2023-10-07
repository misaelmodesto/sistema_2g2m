package DAO;

import conexoes.ConexaoMySql;
import model.Model_Caixa;

/**
 *
 * @author Misael Modesto
 */
public class DAO_Caixa extends ConexaoMySql {
    public int salvarCaixaDAO(Model_Caixa pModelCaixa) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_caixa ("
                    + "fk_id_operador,"
                    + "cx_abertura_times,"
                    + "cx_valorAbertura,"
                    + "cx_tipoRefeicao"
                    + ") VALUES ("
                    + "'" + pModelCaixa.getFk_id_operador()  + "',"
                    + "'" + pModelCaixa.getCx_abertura_times() + "',"
                    + "'" + pModelCaixa.getCx_valorAbertura() + "',"
                    + "'" + pModelCaixa.getCx_refeicao() +"'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();    
            return 0;
        } finally {
            this.fecharConexao();
        }
    }  
    
    
    public boolean updadeCaixaDAO(Model_Caixa pModelCaixa) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_caixa SET "
                    + "cx_fechamento_times = '" + pModelCaixa.getCx_fechamento_times()+ "'"
                    + " WHERE fk_id_operador = '" + pModelCaixa.getFk_id_operador()+ "' AND cx_fechamento_times IS NULL;"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }   
}
