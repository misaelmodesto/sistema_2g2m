package controller;

import model.Model_VendaProduto;
import DAO.DAOVendaProduto;
import java.util.ArrayList;

/**
*
* @author Misael Modesto
*/
public class ControllerVendaProduto {

    private DAOVendaProduto daoVendaProduto = new DAOVendaProduto();

    /**
    * grava VendaProduto
    * @param pModelVendaProduto
    * @return int
    */
   // public int salvarVendaProdutoController(Model_VendaProduto pModelVendaProduto){
        //return this.daoVendaProduto.salvarVendaProdutoDAO(pModelVendaProduto);
    //}

    /**
    * recupera VendaProduto
    * @param pPk_id_venda_produto
    * @return Model_VendaProduto
    */
    public Model_VendaProduto getVendaProdutoController(int pPk_id_venda_produto){
        return this.daoVendaProduto.getVendaProdutoDAO(pPk_id_venda_produto);
    }

    /**
    * recupera uma lista deVendaProduto
    * @param pPk_id_venda_produto
    * @return ArrayList
    */
    public ArrayList<Model_VendaProduto> getListaVendaProdutoController(){
        return this.daoVendaProduto.getListaVendaProdutoDAO();
    }

    /**
    * atualiza VendaProduto
    * @param pModelVendaProduto
    * @return boolean
    */
    public boolean atualizarVendaProdutoController(Model_VendaProduto pModelVendaProduto){
        return this.daoVendaProduto.atualizarVendaProdutoDAO(pModelVendaProduto);
    }

    /**
    * exclui VendaProduto
    * @param pPk_id_venda_produto
    * @return boolean
    */
    public boolean excluirVendaProdutoController(int pPk_id_venda_produto){
        return this.daoVendaProduto.excluirVendaProdutoDAO(pPk_id_venda_produto);
    }
    
    public boolean salvarVendaProdutoController(ArrayList<Model_VendaProduto> pListaModelVendaProdutos){
        return this.daoVendaProduto.salvarVendaProdutoDAO(pListaModelVendaProdutos);
    }
}