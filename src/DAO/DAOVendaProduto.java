package DAO;

import model.Model_VendaProduto;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Misael Modesto
*/
public class DAOVendaProduto extends ConexaoMySql {

    /**
    * grava VendaProduto
    * @param pModelVendaProduto
    * @return int
    */
    public int salvarVendaProdutoDAO(Model_VendaProduto pModelVendaProduto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_venda_produto ("
                    + "fk_fk_produto,"
                    + "fk_fk_venda,"
                    + "fk_ven_pro_valor"
                + ") VALUES ("
                    + "'" + pModelVendaProduto.getFk_produto() + "',"
                    + "'" + pModelVendaProduto.getFk_venda() + "',"
                    + "'" + pModelVendaProduto.getVen_pro_valor() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera VendaProduto
    * @param pPk_id_venda_produto
    * @return Model_VendaProduto
    */
    public Model_VendaProduto getVendaProdutoDAO(int pPk_id_venda_produto){
        Model_VendaProduto modelVendaProduto = new Model_VendaProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_pk_id_venda_produto,"
                    + "fk_fk_produto,"
                    + "fk_fk_venda,"
                    + "fk_ven_pro_valor"
                 + " FROM"
                     + " tbl_venda_produto"
                 + " WHERE"
                     + " pk_pk_id_venda_produto = '" + pPk_id_venda_produto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendaProduto.setPk_id_venda_produto(this.getResultSet().getInt(1));
                modelVendaProduto.setFk_produto(this.getResultSet().getInt(2));
                modelVendaProduto.setFk_venda(this.getResultSet().getInt(3));
                modelVendaProduto.setVen_pro_valor(this.getResultSet().getDouble(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendaProduto;
    }

    /**
    * recupera uma lista de VendaProduto
        * @return ArrayList
    */
    public ArrayList<Model_VendaProduto> getListaVendaProdutoDAO(){
        ArrayList<Model_VendaProduto> listamodelVendaProduto = new ArrayList();
        Model_VendaProduto modelVendaProduto = new Model_VendaProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_pk_id_venda_produto,"
                    + "fk_fk_produto,"
                    + "fk_fk_venda,"
                    + "fk_ven_pro_valor"
                 + " FROM"
                     + " tbl_venda_produto"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendaProduto = new Model_VendaProduto();
                modelVendaProduto.setPk_id_venda_produto(this.getResultSet().getInt(1));
                modelVendaProduto.setFk_produto(this.getResultSet().getInt(2));
                modelVendaProduto.setFk_venda(this.getResultSet().getInt(3));
                modelVendaProduto.setVen_pro_valor(this.getResultSet().getDouble(4));
                listamodelVendaProduto.add(modelVendaProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendaProduto;
    }

    /**
    * atualiza VendaProduto
    * @param pModelVendaProduto
    * @return boolean
    */
    public boolean atualizarVendaProdutoDAO(Model_VendaProduto pModelVendaProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_venda_produto SET "
                    + "pk_pk_id_venda_produto = '" + pModelVendaProduto.getPk_id_venda_produto() + "',"
                    + "fk_fk_produto = '" + pModelVendaProduto.getFk_produto() + "',"
                    + "fk_fk_venda = '" + pModelVendaProduto.getFk_venda() + "',"
                    + "fk_ven_pro_valor = '" + pModelVendaProduto.getVen_pro_valor() + "'"
                + " WHERE "
                    + "pk_pk_id_venda_produto = '" + pModelVendaProduto.getPk_id_venda_produto() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui VendaProduto
    * @param pPk_id_venda_produto
    * @return boolean
    */
    public boolean excluirVendaProdutoDAO(int pPk_id_venda_produto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_venda_produto "
                + " WHERE "
                    + "pk_pk_id_venda_produto = '" + pPk_id_venda_produto + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean salvarVendaProdutoDAO(ArrayList<Model_VendaProduto> pListaModelVendaProdutos) {
        try {
            this.conectar();
            int cont = pListaModelVendaProdutos.size();
            
            for (int i = 0; i < cont; i++) {
                                   
            this.insertSQL(
                "INSERT INTO tbl_venda_produto ("
                    + "fk_produto,"
                    + "fk_venda,"
                    + "ven_pro_valor"
                + ") VALUES ("
                    + "'" + pListaModelVendaProdutos.get(i).getFk_produto() + "',"
                    + "'" + pListaModelVendaProdutos.get(i).getFk_venda() + "',"
                    + "'" + pListaModelVendaProdutos.get(i).getVen_pro_valor() + "'"
                + ");"
            );
            }
            return false;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }        
    }
}