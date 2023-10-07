
package controller;

import DAO.DAO_Sessao;
import model.Model_Sessao;


/**
 *
 * @author Misael Modesto
 */
public class ControllerSessao {
    
    DAO_Sessao daoSessao = new DAO_Sessao();
    
    public int salvarSessaoController(Model_Sessao pModelSessao){
        return this.daoSessao.salvarSessaoDAO(pModelSessao);
    }
    
    public boolean updateSessaoController(Model_Sessao pModelSessao){
        return this.daoSessao.updadeSessaoDAO(pModelSessao);
    }
}
