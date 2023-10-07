package controller;

import DAO.DAO_Caixa;
import model.Model_Caixa;

/**
 *
 * @author Misael Modesto
 */
public class ControllerCaixa {
    DAO_Caixa daoCaixa = new DAO_Caixa();
    
    public int salvarCaixaController(Model_Caixa pModelCaixa){
        return this.daoCaixa.salvarCaixaDAO(pModelCaixa);
    }
    
    public boolean updateCaixaController(Model_Caixa pModelCaixa){
        return this.daoCaixa.updadeCaixaDAO(pModelCaixa);
    }    
    
}
