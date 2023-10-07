
package view;

import DAO.AlunosSingleton;
import DAO.OperadorSingleton;
import controller.ControllerProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Model_Produtos;
import util.Formatador;
import conexoes.ConexaoMySql;
import DAO.OperadorSingleton;

/**
 *
 * @author Misael Modesto
 */
public class form_Produto extends javax.swing.JInternalFrame{
    
    ArrayList<Model_Produtos> ListaModelProdutos = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    Model_Produtos modelProdutos = new Model_Produtos();
    Formatador formatador = new Formatador();
      

    public form_Produto() {
        initComponents();
        carregarProdutos();
        //setLocationRelativeTo(null);
        habilitaresabilitarCampos(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProdutos = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jtfpesquisa = new javax.swing.JTextField();
        jbPesquisa = new javax.swing.JButton();
        jtfValor = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("Produtos");

        jLabel1.setText("ID:");

        jtfId.setEnabled(false);

        jLabel2.setText("Nome:");

        jLabel3.setText("Descricao:");

        jtfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescricaoActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor:");

        jtableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descricão", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableProdutos);
        if (jtableProdutos.getColumnModel().getColumnCount() > 0) {
            jtableProdutos.getColumnModel().getColumn(0).setMinWidth(40);
            jtableProdutos.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtableProdutos.getColumnModel().getColumn(0).setMaxWidth(40);
            jtableProdutos.getColumnModel().getColumn(1).setMinWidth(115);
            jtableProdutos.getColumnModel().getColumn(1).setPreferredWidth(115);
            jtableProdutos.getColumnModel().getColumn(1).setMaxWidth(115);
            jtableProdutos.getColumnModel().getColumn(2).setMinWidth(160);
            jtableProdutos.getColumnModel().getColumn(2).setPreferredWidth(160);
            jtableProdutos.getColumnModel().getColumn(2).setMaxWidth(160);
        }

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_cancelar.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_editar.png"))); // NOI18N
        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_salvar.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_pesquisar.png"))); // NOI18N
        jbPesquisa.setText("Pesquisar");
        jbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisaActionPerformed(evt);
            }
        });

        jtfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(jbEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalvar)))
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfpesquisa, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbPesquisa, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbEditar)
                    .addComponent(jbSalvar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDescricaoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        editarProduto();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        int linha = jtableProdutos.getSelectedRow();
        try {
        int codigoProduto = (int) jtableProdutos.getValueAt(linha, 0);
                    //Recuperar Dados do Banco
            modelProdutos = controllerProdutos.retornarprodutoController(codigoProduto);
            //setar na Interface
            this.jtfId.setText(String.valueOf(modelProdutos.getIdproduto()));
            this.jtfNome.setText(modelProdutos.getProNome());
            this.jtfDescricao.setText(modelProdutos.getProDescricao());
            this.jtfValor.setText(String.valueOf(modelProdutos.getProValor()));
            habilitaresabilitarCampos(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Codigo invalido ou nenhum Registro Selecionado", "AVISO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.habilitaresabilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jtableProdutos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtableProdutos.setRowSorter(classificador);
        String texto = jtfpesquisa.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jbPesquisaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */ 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Produto().setVisible(true);
            }
        });
    }
    
    /**
     * Preenche a tabela de Produtos com os produtos do Banco
     */
    private void carregarProdutos(){
        ListaModelProdutos = controllerProdutos.retornarListaProdutoController(); 
        DefaultTableModel modelo = (DefaultTableModel) jtableProdutos.getModel();
        modelo.setNumRows(0);
        //Inserir Produtos na Tabela
        int cont = ListaModelProdutos.size();
        for (int i =0; i < cont; i++){
            modelo.addRow(new Object[]{
                ListaModelProdutos.get(i).getIdproduto(),
                ListaModelProdutos.get(i).getProNome(),
                ListaModelProdutos.get(i).getProDescricao(),
                ListaModelProdutos.get(i).getProValor()             
            });          
        }
    }
    
    private void salvarProduto(){
        modelProdutos.setProNome(this.jtfNome.getText());
        modelProdutos.setProDescricao(this.jtfDescricao.getText());
        modelProdutos.setProValor(Double.parseDouble(this.jtfValor.getText()));
        if (controllerProdutos.salvarProdutoController(modelProdutos) > 0){
            JOptionPane.showMessageDialog(this, "Salvo com Sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            carregarProdutos();
            this.habilitaresabilitarCampos(false);
            this.limparCampos();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao Salvar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    private void editarProduto(){
        modelProdutos.setProNome(this.jtfNome.getText());
        modelProdutos.setProDescricao(this.jtfDescricao.getText());
        modelProdutos.setProValor(formatador.converterVirgula(this.jtfValor.getText()));
        if (controllerProdutos.alterarProdutoController(modelProdutos)){
            JOptionPane.showMessageDialog(this, "Alterado com Sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            carregarProdutos();
            this.habilitaresabilitarCampos(false);
            this.limparCampos();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao Alterar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }     
    }
    
    
    private void habilitaresabilitarCampos (boolean condicao){
        jtfNome.setEnabled(condicao);
        jtfDescricao.setEnabled(condicao);
        jtfValor.setEnabled(condicao);
    }
    
    private void limparCampos(){
        jtfId.setText("");
        jtfNome.setText("");
        jtfDescricao.setText("");
        jtfValor.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbPesquisa;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable jtableProdutos;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JFormattedTextField jtfValor;
    private javax.swing.JTextField jtfpesquisa;
    // End of variables declaration//GEN-END:variables
}
