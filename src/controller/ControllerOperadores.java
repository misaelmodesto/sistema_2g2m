package controller;

import DAO.DAO_Operadores;
import java.util.ArrayList;
import model.Model_Operadores;

/**
 *
 * @author Misael Modesto
 */
public class ControllerOperadores {
    
    private DAO_Operadores daoOperadores = new DAO_Operadores();
    
    public int salvarOperadorController(Model_Operadores pModelOperadores){
        return this.daoOperadores.salvarOperadoresDAO(pModelOperadores);
    }    
    
    public boolean excluirOperadorController(int pIdOperador){
        return this.daoOperadores.excluirOperadoresDAO(pIdOperador);
    }
    
    public boolean alterarOperadorController(Model_Operadores pModelOperador){
        return this.daoOperadores.alterarOperadoresDAO(pModelOperador);
    }  
    
    public Model_Operadores retornarOperadorController(int pIdOperador){
        return this.daoOperadores.retornaroperadorDAO(pIdOperador);
    }
    
    public ArrayList<Model_Operadores> retornarListaOperadorController(){
        return this.daoOperadores.RetornarListaoperadorDAO();
    }    
    
    public int getValidarOperadorController(Model_Operadores pModelOperador) {
        return this.daoOperadores.getValidarOperadorDAO(pModelOperador);
    }
    
    public boolean loginAllowed (int pIdOperador){
        return this.daoOperadores.LoginAllowed(pIdOperador);
    }
    
    public boolean caixaAllowed (int pIdOperador){
        return this.daoOperadores.CaixaAllowed(pIdOperador);
    }
    
}
