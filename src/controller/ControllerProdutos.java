
package controller;

import DAO.DAO_Produtos;
import java.util.ArrayList;
import model.Model_Produtos;

/**
 *
 * @author Misael Modesto
 */
public class ControllerProdutos {
    
    private DAO_Produtos daoProdutos = new DAO_Produtos();
    
    public int salvarProdutoController(Model_Produtos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }
    
    public boolean excluirProdutoController(int pCodigo){
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    
    public boolean alterarProdutoController (Model_Produtos pModelProdutos){
        return this.daoProdutos.alterarprodutoDAO(pModelProdutos);        
    }
    
    public Model_Produtos retornarprodutoController (int pCodigo){
        return this.daoProdutos.retornarprodutoDAO(pCodigo);
    }
    
    public ArrayList<Model_Produtos> retornarListaProdutoController(){
        return this.daoProdutos.RetornarlistaprodutoDAO();
    }
}
