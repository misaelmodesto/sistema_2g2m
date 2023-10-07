
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.Model_Vendas;

/**
 *
 * @author Misael Modesto
 */
public class DAO_Vendas extends ConexaoMySql{
    
    public int salvarVendasDAO(Model_Vendas pModelProdutos){
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_venda ("
                    + "ven_data,"
                    + "ven_hora,"
                    + "ven_valor_Bruto,"
                    + "ven_valor_Liquido,"
                    + "ven_desconto,"
                    + "ven_formpagamento,"
                    + "fk_operador,"
                    + "fk_aluno"
                    + ") VALUES ("
                    + "'" + pModelProdutos.getVen_data()+ "',"
                    + "'" + pModelProdutos.getVen_hora()+ "',"
                    + "'" + pModelProdutos.getVen_valor_Bruto()+ "',"
                    + "'" + pModelProdutos.getVen_valor_Liquido()+ "',"
                    + "'" + pModelProdutos.getVen_desconto()+ "',"
                    + "'" + pModelProdutos.getVen_formpagamento()+ "',"
                    + "'" + pModelProdutos.getFk_operador()+ "',"
                    + "'" + pModelProdutos.getFk_aluno()+ "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }    
}
