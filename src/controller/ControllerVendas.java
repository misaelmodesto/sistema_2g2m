/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAO_Vendas;
import model.Model_Vendas;

/**
 *
 * @author Misael
 */
public class ControllerVendas {
    private DAO_Vendas daoVendas = new DAO_Vendas();
    
        public int salvarVendasController(Model_Vendas pModelVendas){
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }
}
