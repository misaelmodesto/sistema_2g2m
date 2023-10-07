/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import DAO.AlunosSingleton;

/**
 *
 * @author Suporte
 */
public class teste {
           //setar no model
       // AlunosSingleton.getInstance().setNome("Consumidor Externo");
       // AlunosSingleton.getInstance().setPerfil("Consumidor Externo");
    //pegar do model
//TxtAluno.setText(AlunosSingleton.getInstance().getNome());
//TxtPerfil.setText(AlunosSingleton.getInstance().getPerfil());
   
/**    
   "CREATE TABLE Venda (\n" +
"    ID_Venda INT PRIMARY KEY,\n" +
"    ID_Aluno INT,\n" +
"    Data_e_Hora_da_Venda DATETIME,\n" +
"    Status_da_Venda VARCHAR(50),\n" +
"    Valor_Total DECIMAL(10, 2),\n" +
"    FOREIGN KEY (ID_Aluno) REFERENCES Alunos(ID_Aluno)\n" +
");"
   
   "CREATE TABLE Venda_Produto (\n" +
"    ID_Venda_Produto INT PRIMARY KEY,\n" +
"    ID_Venda INT,\n" +
"    ID_Produto INT,\n" +
"    Quantidade INT,\n" +
"    Valor_Unitario DECIMAL(10, 2),\n" +
"    Valor_Total DECIMAL(10, 2),\n" +
"    FOREIGN KEY (ID_Venda) REFERENCES Venda(ID_Venda),\n" +
"    FOREIGN KEY (ID_Produto) REFERENCES Produtos(ID_Produto)\n" +
");"
* 
*  */
    
}
