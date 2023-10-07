package view;

import controller.ControllerOperadores;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Model_Operadores;

/**
 *
 * @author Misael Modesto
 */
public class internal_Operador extends javax.swing.JInternalFrame {
    
    ArrayList<Model_Operadores> ListaModelOperadores = new ArrayList<>();
    ControllerOperadores controllerOperadores = new ControllerOperadores();
    Model_Operadores modelOperadores = new Model_Operadores();
    String salvarAlterar;
    
    public internal_Operador() {
        initComponents();
        carregarOperadores();
        habilitaresabilitarCampos(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
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
        jcbPerfil = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        jcbUnidade = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
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

        jcbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Fiscal", "gerente ", "Caixa" }));
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

        jcbUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RU - JEQUIE", "RU - VIT. CONQUISTA" }));
        jcbUnidade.setEnabled(false);
        jcbUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbUnidadeActionPerformed(evt);
            }
        });

        jLabel6.setText("Unidade");

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPrincipalLayout.createSequentialGroup()
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jtfNome)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPrincipalLayout.createSequentialGroup()
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jtfSenha))))
                        .addGap(18, 18, 18)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jcbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jcbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo)
                    .addComponent(btnExcluir))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.habilitaresabilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        habilitaresabilitarCampos(true);
        salvarAlterar = "salvar";
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.btnCancelar.setEnabled(true);
        this.btnExcluir.setEnabled(false);
        this.btnNovo.setEnabled(false);
        this.btnSalvar.setEnabled(true);
        
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

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        switch (salvarAlterar) {
            case "salvar":
                salvarOperador();
                this.limparCampos();
                habilitaresabilitarCampos(false);
                break;
            case "editar":
                editarOperador();
                this.limparCampos();
                habilitaresabilitarCampos(false);
                break;
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jcbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPerfilActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = jtOperadores.getSelectedRow();
        int codigoOperador = (int) jtOperadores.getValueAt(linha, 0);

        if (controllerOperadores.excluirOperadorController(codigoOperador)){
            JOptionPane.showMessageDialog(this, "Operador Excluido com Sucesso");
            carregarOperadores();
        }else {
            JOptionPane.showMessageDialog(this,"Erro ao excluir Operador");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jcbUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbUnidadeActionPerformed

    private void salvarOperador(){
        modelOperadores.setOp_nome(this.jtfNome.getText());
        modelOperadores.setOp_login(this.jtfLogin.getText());
        modelOperadores.setOp_senha(this.jtfSenha.getText());
        modelOperadores.setOp_perfil(this.jcbPerfil.getSelectedItem().toString());
        modelOperadores.setOp_unidade(this.jcbUnidade.getSelectedItem().toString());
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
    
    private void habilitaresabilitarCampos (boolean condicao){
        this.jtfNome.setEnabled(condicao);
        this.jtfLogin.setEnabled(condicao);
        this.jtfSenha.setEnabled(condicao);
        this.jcbPerfil.setEnabled(condicao);
        this.jcbUnidade.setEnabled(condicao);
        this.btnSalvar.setEnabled(condicao);
        this.btnCancelar.setEnabled(condicao);
        
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbPerfil;
    private javax.swing.JComboBox<String> jcbUnidade;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JTable jtOperadores;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables
}
