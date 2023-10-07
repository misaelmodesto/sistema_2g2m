package view;

import DAO.OperadorSingleton;
import controller.ControllerOperadores;
import controller.ControllerSessao;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import model.Model_Operadores;
import model.Model_Sessao;

/**
 *
 * @author Misael Modesto
 * @version 1.0
 */
public class form_Login extends javax.swing.JFrame {
    
    ControllerOperadores controllerOperador = new ControllerOperadores();
    Model_Operadores modelOperador = new Model_Operadores();
    Model_Sessao modelSessao = new Model_Sessao();
    ControllerSessao controllerSessao = new ControllerSessao();

    /**
     * Creates new form fom_Login
     */
    public form_Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jtfSenha = new javax.swing.JPasswordField();
        jtfLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_logo.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_saiir.png"))); // NOI18N
        jButton2.setText("SAIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 204, 102));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_entrar.png"))); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        jtfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfSenhaKeyPressed(evt);
            }
        });

        jtfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLoginActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_senha.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_usuarios.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SISTEMA PDV 2G2M");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jtfSenha)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogin)
                            .addComponent(jButton2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLoginActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        modelOperador.setOp_login(jtfLogin.getText());
        modelOperador.setOp_senha(String.valueOf(jtfSenha.getPassword()));
        
        int pk_id_operador = controllerOperador.getValidarOperadorController(modelOperador);
        
        if (pk_id_operador != -1){
            OperadorSingleton.getInstance().setNome(modelOperador.getOp_nome());
            
            OperadorSingleton.getInstance().setPk_id_operador(pk_id_operador);

            boolean loginAllowed = controllerOperador.loginAllowed(pk_id_operador);
            
            
            if (loginAllowed){
                modelSessao.setFk_id_operador(pk_id_operador);
                modelSessao.setSes_login_times(Timestamp.valueOf(LocalDateTime.now()));
                controllerSessao.salvarSessaoController(modelSessao);
                modelOperador = controllerOperador.retornarOperadorController(pk_id_operador);
                OperadorSingleton.getInstance().setNome(modelOperador.getOp_nome());
                OperadorSingleton.getInstance().setPerfil(modelOperador.getOp_perfil());
                String unidade = modelOperador.getOp_unidade();
                
                if (unidade.equals("RU - JEQUIE")){
                    unidade = "tbl_produto_rujee";
                }else if (unidade.equals("RU - VIT. CONQUISTA")){
                    unidade = "tbl_produto_ruvdc";
                }else{
                    JOptionPane.showMessageDialog(this,"tbl_produto não localizada");
                }
                
                OperadorSingleton.getInstance().setUnidade(unidade);

                new view.form_Principal().setVisible(true);
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(this,"Usuário logado em outro caixa");
            }  
        }else{
            JOptionPane.showMessageDialog(this,"Usuário ou Senha Invalidos", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER ){            
            modelOperador.setOp_login(jtfLogin.getText());
            modelOperador.setOp_senha(String.valueOf(jtfSenha.getPassword()));

            int pk_id_operador = controllerOperador.getValidarOperadorController(modelOperador);

            if (pk_id_operador != -1){
                OperadorSingleton.getInstance().setNome(modelOperador.getOp_nome());
                OperadorSingleton.getInstance().setPerfil(modelOperador.getOp_perfil());
                OperadorSingleton.getInstance().setPk_id_operador(pk_id_operador);

                boolean loginAllowed = controllerOperador.loginAllowed(pk_id_operador);


                if (loginAllowed){
                    modelSessao.setFk_id_operador(pk_id_operador);
                    modelSessao.setSes_login_times(Timestamp.valueOf(LocalDateTime.now()));
                    controllerSessao.salvarSessaoController(modelSessao);
                    new view.form_Principal().setVisible(true);
                    this.dispose();
                }else {
                    JOptionPane.showMessageDialog(this,"Usuário logado em outro caixa");
                }  
            }else{
                JOptionPane.showMessageDialog(this,"Usuário ou Senha Invalidos", "Aviso", JOptionPane.WARNING_MESSAGE);
            }                
        }
    }//GEN-LAST:event_btnLoginKeyPressed

    private void jtfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSenhaKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER ){            
            modelOperador.setOp_login(jtfLogin.getText());
            modelOperador.setOp_senha(String.valueOf(jtfSenha.getPassword()));

            int pk_id_operador = controllerOperador.getValidarOperadorController(modelOperador);

            if (pk_id_operador != -1){
                OperadorSingleton.getInstance().setNome(modelOperador.getOp_nome());
                OperadorSingleton.getInstance().setPerfil(modelOperador.getOp_perfil());
                OperadorSingleton.getInstance().setPk_id_operador(pk_id_operador);

                boolean loginAllowed = controllerOperador.loginAllowed(pk_id_operador);


                if (loginAllowed){
                    modelSessao.setFk_id_operador(pk_id_operador);
                    modelSessao.setSes_login_times(Timestamp.valueOf(LocalDateTime.now()));
                    controllerSessao.salvarSessaoController(modelSessao);
                    new view.form_Principal().setVisible(true);
                    this.dispose();
                }else {
                    JOptionPane.showMessageDialog(this,"Usuário logado em outro caixa");
                }  
            }else{
                JOptionPane.showMessageDialog(this,"Usuário ou Senha Invalidos", "Aviso", JOptionPane.WARNING_MESSAGE);
            }                
        }
    }//GEN-LAST:event_jtfSenhaKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
      System.exit(0);
    }//GEN-LAST:event_jButton2KeyPressed

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
            java.util.logging.Logger.getLogger(form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables
}
