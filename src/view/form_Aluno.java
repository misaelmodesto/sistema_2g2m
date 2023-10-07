/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerAlunos;
//import controller.ControllerProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Model_Alunos;

/**
 *
 * @author Misael
 */
public class form_Aluno extends javax.swing.JInternalFrame {
    
    ArrayList<Model_Alunos> ListaModelAlunos = new ArrayList<>();
    ControllerAlunos controllerAlunos = new ControllerAlunos();
    Model_Alunos modelAlunos = new Model_Alunos();
    String salvarAlterar;
    
    public form_Aluno() {
        initComponents();
        carregarAlunos();
        //setLocationRelativeTo(null);
        habilitaresabilitarCampos(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfMatricula = new javax.swing.JTextField();
        jcbUnidade = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAluno = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jtfPesquisa = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jcbPerfil = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Alunos");

        jLabel1.setText("Nome:");

        jtfId.setEnabled(false);

        jLabel2.setText("ID:");

        jLabel3.setText("Matricula:");

        jtfMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMatriculaActionPerformed(evt);
            }
        });

        jcbUnidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RU - JEQUIE", "RU - VIT. CONQUISTA" }));

        jLabel4.setText("Unidade:");

        jtAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Matricula", "Perfil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(jtAluno);
        if (jtAluno.getColumnModel().getColumnCount() > 0) {
            jtAluno.getColumnModel().getColumn(0).setMinWidth(40);
            jtAluno.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtAluno.getColumnModel().getColumn(0).setMaxWidth(40);
            jtAluno.getColumnModel().getColumn(1).setMinWidth(185);
            jtAluno.getColumnModel().getColumn(1).setPreferredWidth(185);
            jtAluno.getColumnModel().getColumn(1).setMaxWidth(185);
            jtAluno.getColumnModel().getColumn(2).setMinWidth(100);
            jtAluno.getColumnModel().getColumn(2).setPreferredWidth(100);
            jtAluno.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_cancelar.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_arquivos.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_salvar.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_editar.png"))); // NOI18N
        jbAlterar.setText("Editar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_pesquisar.png"))); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_excluir.png"))); // NOI18N
        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jcbPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRAE", "CAA" }));

        jLabel5.setText("Perfil:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfNome)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalvar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jcbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbNovo)
                    .addComponent(jbSalvar)
                    .addComponent(jbAlterar)
                    .addComponent(jButton2))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.habilitaresabilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        habilitaresabilitarCampos(true);  
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        
        switch (salvarAlterar) {
            case "salvar":
                salvarAluno();
                this.limparCampos();
                habilitaresabilitarCampos(false);
                break;
            case "editar":
                editarAluno();
                this.limparCampos();  
                habilitaresabilitarCampos(false);
                break;
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        int linha = jtAluno.getSelectedRow();
        try {
        int codigoAluno = (int) jtAluno.getValueAt(linha, 0);
           salvarAlterar = "editar";
                    //Recuperar Dados do Banco
            modelAlunos = controllerAlunos.retornarAlunoController(codigoAluno);
            //setar na Interface
            this.jtfId.setText(String.valueOf(modelAlunos.getId()));
            this.jtfNome.setText(modelAlunos.getNome());
            this.jtfMatricula.setText(modelAlunos.getMatricula());
            this.jcbUnidade.setSelectedItem(modelAlunos.getPerfil());
            habilitaresabilitarCampos(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Codigo invalido ou nenhum Registro Selecionado", "AVISO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jtAluno.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtAluno.setRowSorter(classificador);
        String texto = jtfPesquisa.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMatriculaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int linha = jtAluno.getSelectedRow();
        int codigoAluno = (int) jtAluno.getValueAt(linha, 0);
        
        if (controllerAlunos.excluirAlunoController(codigoAluno)){
            JOptionPane.showMessageDialog(this, "Produto Excluid com Sucesso");
            carregarAlunos();
        }else {
            JOptionPane.showMessageDialog(this,"Erro ao excluir Aluno");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(form_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Aluno().setVisible(true);
            }
        });
    }
    
        private void carregarAlunos(){
        ListaModelAlunos = controllerAlunos.retornarListaAlunoController();
        DefaultTableModel modelo = (DefaultTableModel)jtAluno.getModel();
        modelo.setNumRows(0);
        //Inserir Produtos na Tabela
        int cont = ListaModelAlunos.size();
        for (int i =0; i < cont; i++){
            modelo.addRow(new Object[]{
                ListaModelAlunos.get(i).getId(),
                ListaModelAlunos.get(i).getNome(),
                ListaModelAlunos.get(i).getMatricula(),
                ListaModelAlunos.get(i).getPerfil()
            });          
        }
    }
    
        private void salvarAluno(){
        modelAlunos.setNome(this.jtfNome.getText());
        modelAlunos.setMatricula(this.jtfMatricula.getText());
        modelAlunos.setPerfil(this.jcbPerfil.getSelectedItem().toString());
        modelAlunos.setUnidade(this.jcbUnidade.getSelectedItem().toString());
        if (controllerAlunos.salvarAlunoController(modelAlunos) > 0){
            JOptionPane.showMessageDialog(this, "Salvo com Sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            carregarAlunos();
            this.habilitaresabilitarCampos(false);
            this.limparCampos();
            salvarAlterar = null;
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao Salvar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    private void editarAluno(){
        modelAlunos.setNome(this.jtfNome.getText());
        modelAlunos.setMatricula(this.jtfMatricula.getText());
        modelAlunos.setPerfil(this.jcbPerfil.getSelectedItem().toString());
        modelAlunos.setUnidade(this.jcbUnidade.getSelectedItem().toString());
        if (controllerAlunos.alterarAlunoController(modelAlunos)){
            JOptionPane.showMessageDialog(this, "Alterado com Sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            //carregarAlunos();
            this.habilitaresabilitarCampos(false);
            this.limparCampos();
            this.carregarAlunos();
            salvarAlterar = null;
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao Alterar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }     
    }
    
    private void habilitaresabilitarCampos (boolean condicao){
        jtfNome.setEnabled(condicao);
        jtfMatricula.setEnabled(condicao);
        jcbUnidade.setEditable(condicao);
    }
    
    private void limparCampos(){
        jtfId.setText("");
        jtfNome.setText("");
        jtfMatricula.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox jcbPerfil;
    private javax.swing.JComboBox jcbUnidade;
    private javax.swing.JTable jtAluno;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfMatricula;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisa;
    // End of variables declaration//GEN-END:variables
}
