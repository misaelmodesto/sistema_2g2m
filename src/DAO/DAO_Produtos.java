package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.Model_Produtos;
import DAO.OperadorSingleton;

/**
 *
 * @author Misael Modesto
 */
public class DAO_Produtos extends ConexaoMySql{
    
    public int salvarProdutosDAO(Model_Produtos pModelProdutos){
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_produto ("
                    + "pro_nome,"
                    + "pro_descricao,"
                    + "pro_valor"
                    + ") VALUES ("
                    + "'" + pModelProdutos.getProNome()+ "',"
                    + "'" + pModelProdutos.getProDescricao()+ "',"
                    + "'" + pModelProdutos.getProValor()+ "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }
    
    public boolean excluirProdutoDAO(int pIdproduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
            "DELETE FROM tbl_produto WHERE pk_id_produto =  '"+pIdproduto+"'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false ;            
        }finally{
            this.fecharConexao();
        }
 
    }
    
    public boolean alterarprodutoDAO(Model_Produtos pModelProdutos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET "
                            + "pro_nome = '"+pModelProdutos.getProNome()+"',"
                            + "pro_descricao = '"+pModelProdutos.getProDescricao()+"',"
                            + "pro_valor = '"+pModelProdutos.getProValor()+"'"
                            + " WHERE pk_id_produto = '"+pModelProdutos.getIdproduto()+"'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false; 
        }finally{
            this.fecharConexao();
        }
    } 
    
    public Model_Produtos retornarprodutoDAO(int pIdProduto){
        Model_Produtos modelProduto = new Model_Produtos();
        String unidade = OperadorSingleton.getInstance().getUnidade();
        try {
        this.conectar();
        this.executarSQL("SELECT "
        + "pk_id_produto, "
        + "pro_nome, "
        + "pro_descricao, "
        + "pro_valor "
        + "FROM " + unidade + " WHERE pk_id_produto = '"+pIdProduto+"';");
            while (this.getResultSet().next()) {
                modelProduto.setIdproduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProDescricao(this.getResultSet().getString(3));
                modelProduto.setProValor(this.getResultSet().getDouble(4));
           }
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }
    
    public ArrayList<Model_Produtos> RetornarlistaprodutoDAO(){
      ArrayList<Model_Produtos> listaModelproduto = new ArrayList<>();
      Model_Produtos modelProduto = new Model_Produtos();
      String unidade = OperadorSingleton.getInstance().getUnidade();

        try {
            this.conectar();
            this.executarSQL("SELECT "
            + "pk_id_produto, "
            + "pro_nome, "
            + "pro_descricao, "
            + "pro_valor "
            + "FROM " + unidade + ";");
            
             while (this.getResultSet().next()) {
                modelProduto = new Model_Produtos();
                modelProduto.setIdproduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProDescricao(this.getResultSet().getString(3));
                modelProduto.setProValor(this.getResultSet().getDouble(4));
                listaModelproduto.add(modelProduto);
           }           
        } catch (Exception e) {
        }finally{
            this.fecharConexao();
        }
        return listaModelproduto;
    }   
}
