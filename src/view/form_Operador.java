
package view;

import controller.ControllerOperadores;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Model_Operadores;

/**
 *
 * @author Misael Modesto
 */
public class form_Operador extends javax.swing.JInternalFrame {

    ArrayList<Model_Operadores> ListaModelOperadores = new ArrayList<>();
    ControllerOperadores controllerOperadores = new ControllerOperadores();
    Model_Operadores modelOperadores = new Model_Operadores();
    String salvarAlterar;
    
    public form_Operador() {
        initComponents();
        carregarOperadores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form_Produto1 = new view.form_Produto();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jtfSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtOperadores = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jcbPerfil = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();

        setTitle("Operador");

        jLabel1.setText("ID:");

        jtfId.setEnabled(false);

        jtfNome.setEnabled(false);

        jLabel2.setText("Nome:");

        jLabel3.setText("Login:");

        jtfLogin.setEnabled(false);

        jtfSenha.setEnabled(false);

        jLabel4.setText("Senha:");

        jtOperadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Usuário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtOperadores);
        if (jtOperadores.getColumnModel().getColumnCount() > 0) {
            jtOperadores.getColumnModel().getColumn(0).setMinWidth(50);
            jtOperadores.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtOperadores.getColumnModel().getColumn(0).setMaxWidth(50);
            jtOperadores.getColumnModel().getColumn(1).setMinWidth(250);
            jtOperadores.getColumnModel().getColumn(1).setPreferredWidth(250);
            jtOperadores.getColumnModel().getColumn(1).setMaxWidth(250);
        }

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_arquivos.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jcbPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Fiscal", "gerente ", "Caixa" }));
        jcbPerfil.setEnabled(false);
        jcbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPerfilActionPerformed(evt);
            }
        });

        jLabel5.setText("Perfil:");

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfNome)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfSenha))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jcbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo)
                    .addComponent(btnExcluir))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.habilitaresabilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jcbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPerfilActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(salvarAlterar.equals("salvar")){
            salvarOperador();
            this.limparCampos();
            habilitaresabilitarCampos(false);
        }else if (salvarAlterar.equals("editar")){
            editarOperador();
            this.limparCampos();
            habilitaresabilitarCampos(false);            
        }  
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = jtOperadores.getSelectedRow();
        int codigoOperador = (int) jtOperadores.getValueAt(linha, 0);
        
        if (controllerOperadores.excluirOperadorController(codigoOperador)){
            JOptionPane.showMessageDialog(this, "Produto Excluid com Sucesso");
            carregarOperadores();
        }else {
            JOptionPane.showMessageDialog(this,"Erro ao excluir Aluno");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = jtOperadores.getSelectedRow();
        try {
        int codigoOperador = (int) jtOperadores.getValueAt(linha, 0);
           salvarAlterar = "editar";
                    //Recuperar Dados do Banco
            modelOperadores = controllerOperadores.retornarOperadorController(codigoOperador);
            //setar na Interface
            this.jtfId.setText(String.valueOf(modelOperadores.getIdOperador()));
            this.jtfNome.setText(modelOperadores.getOp_nome());
            this.jtfLogin.setText(modelOperadores.getOp_login());
            this.jtfSenha.setText(modelOperadores.getOp_senha());
            this.jcbPerfil.setSelectedItem(modelOperadores.getOp_perfil());
            habilitaresabilitarCampos(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Codigo invalido ou nenhum Registro Selecionado", "AVISO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        habilitaresabilitarCampos(true);  
        salvarAlterar = "salvar";
    }//GEN-LAST:event_btnNovoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(form_Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Operador().setVisible(true);
            }
        });
    }
    
    private void carregarOperadores(){
        ListaModelOperadores = controllerOperadores.retornarListaOperadorController();
        DefaultTableModel modelo = (DefaultTableModel)jtOperadores.getModel();
        modelo.setNumRows(0);
        //Inserir Produtos na Tabela
        int cont = ListaModelOperadores.size();
        for (int i =0; i < cont; i++){
            modelo.addRow(new Object[]{
                ListaModelOperadores.get(i).getIdOperador(),
                ListaModelOperadores.get(i).getOp_nome(),
                ListaModelOperadores.get(i).getOp_login(),
            });          
        }
    }
    
    private void salvarOperador(){
        modelOperadores.setOp_nome(this.jtfNome.getText());
        modelOperadores.setOp_login(this.jtfLogin.getText());
        modelOperadores.setOp_senha(this.jtfSenha.getText());
        modelOperadores.setOp_perfil(this.jcbPerfil.getSelectedItem().toString());
        if (controllerOperadores.salvarOperadorController(modelOperadores) > 0){
            JOptionPane.showMessageDialog(this, "Salvo com Sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            carregarOperadores();
            this.habilitaresabilitarCampos(false);
            this.limparCampos();
            salvarAlterar = null;
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao Salvar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    private void editarOperador(){
        modelOperadores.setOp_nome(this.jtfNome.getText());
        modelOperadores.setOp_login(this.jtfLogin.getText());
        modelOperadores.setOp_senha(this.jtfSenha.getText());
        modelOperadores.setOp_perfil(this.jcbPerfil.getSelectedItem().toString());
        if (controllerOperadores.alterarOperadorController(modelOperadores)){
            JOptionPane.showMessageDialog(this, "Alterado com Sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            //carregarAlunos();
            this.habilitaresabilitarCampos(false);
            this.limparCampos();
            this.carregarOperadores();
            salvarAlterar = null;
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao Alterar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }     
    }
    
    private void habilitaresabilitarCampos (boolean condicao){
        this.jtfId.setEnabled(condicao);
        this.jtfNome.setEnabled(condicao);
        this.jtfLogin.setEnabled(condicao);
        this.jtfSenha.setEnabled(condicao);
        this.jcbPerfil.setEnabled(condicao);
        this.btnSalvar.setEnabled(condicao);
    }
    
    private void limparCampos(){
        this.jtfId.setText("");
        this.jtfNome.setText("");
        this.jtfLogin.setText("");
        this.jtfSenha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private view.form_Produto form_Produto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbPerfil;
    private javax.swing.JTable jtOperadores;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables
}
