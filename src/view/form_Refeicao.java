/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.AlunosSingleton;
import DAO.OperadorSingleton;
import model.Model_Vendas;
import controller.ControllerProdutos;
import controller.ControllerVendaProduto;
import controller.ControllerVendas;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Model_Alunos;
import model.Model_Produtos;
import model.Model_VendaProduto;
import util.Datas;
//import model.Model_Vendas;


/**
 *
 * @author Misael Modesto
 */
public class form_Refeicao extends javax.swing.JFrame {
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ControllerVendas controllerVendas = new ControllerVendas();
    ControllerVendaProduto controllerVendaProduto = new ControllerVendaProduto();
    Model_Produtos modelProdutos = new Model_Produtos();
    Model_VendaProduto modelVendaProduto = new Model_VendaProduto();
    Model_Alunos modelAlunos = new Model_Alunos();
    Datas datas = new Datas();
    Model_Vendas Model_Vendas = new Model_Vendas();
    ArrayList<Model_VendaProduto> listaModelVendasProdutos = new ArrayList<>();  

    /**
     * Creates new form form_Refeicao
     */
    public form_Refeicao() {
        initComponents();
        TxtAluno.setText(AlunosSingleton.getInstance().getNome());
        TxtPerfil.setText(AlunosSingleton.getInstance().getPerfil());
        }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form_Login1 = new view.form_Login();
        jFrame1 = new javax.swing.JFrame();
        pagamento = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVendas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbCafe = new javax.swing.JButton();
        jbSuco = new javax.swing.JButton();
        jbMingau = new javax.swing.JButton();
        jbpaofresco = new javax.swing.JButton();
        jbBatataDoce = new javax.swing.JButton();
        jbAipim = new javax.swing.JButton();
        jbBananaTerra = new javax.swing.JButton();
        btInhame = new javax.swing.JButton();
        btBoloDoce = new javax.swing.JButton();
        btBoloSalgado = new javax.swing.JButton();
        btCuscuz = new javax.swing.JButton();
        btLele = new javax.swing.JButton();
        btPaoForno = new javax.swing.JButton();
        btCaldoDiverso = new javax.swing.JButton();
        btSopaVegetariana = new javax.swing.JButton();
        btSopa = new javax.swing.JButton();
        btVegetarianos = new javax.swing.JButton();
        btOvosMechidos = new javax.swing.JButton();
        btFrutas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jlSoma = new javax.swing.JLabel();
        btnPagamento = new javax.swing.JButton();
        jlPagamento = new javax.swing.JLabel();
        jrdDinheiro = new javax.swing.JRadioButton();
        jrdDebito = new javax.swing.JRadioButton();
        jrdCredito = new javax.swing.JRadioButton();
        jrdPix = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtAluno = new javax.swing.JLabel();
        TxtPerfil = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Produto", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtVendas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jtVendas);
        if (jtVendas.getColumnModel().getColumnCount() > 0) {
            jtVendas.getColumnModel().getColumn(0).setMinWidth(50);
            jtVendas.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtVendas.getColumnModel().getColumn(0).setMaxWidth(50);
            jtVendas.getColumnModel().getColumn(1).setMinWidth(227);
            jtVendas.getColumnModel().getColumn(1).setPreferredWidth(227);
            jtVendas.getColumnModel().getColumn(1).setMaxWidth(227);
            jtVendas.getColumnModel().getColumn(2).setMinWidth(100);
            jtVendas.getColumnModel().getColumn(2).setPreferredWidth(100);
            jtVendas.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbCafe.setBackground(new java.awt.Color(255, 102, 0));
        jbCafe.setText("Café");
        jbCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCafeActionPerformed(evt);
            }
        });

        jbSuco.setBackground(new java.awt.Color(255, 102, 0));
        jbSuco.setText("Suco");
        jbSuco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSucoActionPerformed(evt);
            }
        });

        jbMingau.setBackground(new java.awt.Color(255, 102, 0));
        jbMingau.setText("Mingau");
        jbMingau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMingauActionPerformed(evt);
            }
        });

        jbpaofresco.setBackground(new java.awt.Color(0, 102, 153));
        jbpaofresco.setText("Pães Frescos");
        jbpaofresco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpaofrescoActionPerformed(evt);
            }
        });

        jbBatataDoce.setBackground(new java.awt.Color(0, 102, 51));
        jbBatataDoce.setText("Batata Doce");
        jbBatataDoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBatataDoceActionPerformed(evt);
            }
        });

        jbAipim.setBackground(new java.awt.Color(0, 102, 51));
        jbAipim.setText("Aipim");
        jbAipim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAipimActionPerformed(evt);
            }
        });

        jbBananaTerra.setBackground(new java.awt.Color(0, 102, 51));
        jbBananaTerra.setText("Banana da Terra");
        jbBananaTerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBananaTerraActionPerformed(evt);
            }
        });

        btInhame.setBackground(new java.awt.Color(0, 102, 51));
        btInhame.setText("Inhame");
        btInhame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInhameActionPerformed(evt);
            }
        });

        btBoloDoce.setBackground(new java.awt.Color(0, 102, 51));
        btBoloDoce.setText("Bolo Doce");
        btBoloDoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBoloDoceActionPerformed(evt);
            }
        });

        btBoloSalgado.setBackground(new java.awt.Color(0, 102, 51));
        btBoloSalgado.setText("Bolo Salgado");
        btBoloSalgado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBoloSalgadoActionPerformed(evt);
            }
        });

        btCuscuz.setBackground(new java.awt.Color(0, 102, 51));
        btCuscuz.setText("Cuscuz");
        btCuscuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCuscuzActionPerformed(evt);
            }
        });

        btLele.setBackground(new java.awt.Color(0, 102, 51));
        btLele.setText("Lelê");
        btLele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLeleActionPerformed(evt);
            }
        });

        btPaoForno.setBackground(new java.awt.Color(0, 102, 51));
        btPaoForno.setText("Pão de Forno");
        btPaoForno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPaoFornoActionPerformed(evt);
            }
        });

        btCaldoDiverso.setBackground(new java.awt.Color(204, 153, 0));
        btCaldoDiverso.setText("Caldos Diversos");
        btCaldoDiverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCaldoDiversoActionPerformed(evt);
            }
        });

        btSopaVegetariana.setBackground(new java.awt.Color(204, 153, 0));
        btSopaVegetariana.setText("Sopa Vegetariana");
        btSopaVegetariana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSopaVegetarianaActionPerformed(evt);
            }
        });

        btSopa.setBackground(new java.awt.Color(204, 153, 0));
        btSopa.setText("Sopa");
        btSopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSopaActionPerformed(evt);
            }
        });

        btVegetarianos.setBackground(new java.awt.Color(0, 102, 102));
        btVegetarianos.setText("Vegetarianos");
        btVegetarianos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVegetarianosActionPerformed(evt);
            }
        });

        btOvosMechidos.setBackground(new java.awt.Color(0, 102, 102));
        btOvosMechidos.setText("Proteina");
        btOvosMechidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOvosMechidosActionPerformed(evt);
            }
        });

        btFrutas.setBackground(new java.awt.Color(102, 0, 102));
        btFrutas.setText("Frutas");
        btFrutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFrutasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btFrutas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSopa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPaoForno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btBoloSalgado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbBananaTerra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbpaofresco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbSuco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbBatataDoce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btInhame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCuscuz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCaldoDiverso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVegetarianos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbMingau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAipim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btBoloDoce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSopaVegetariana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btOvosMechidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jbCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSuco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMingau, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbpaofresco, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jbAipim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbBatataDoce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbBananaTerra, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btInhame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btBoloDoce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btBoloSalgado, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btCuscuz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPaoForno, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btCaldoDiverso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSopaVegetariana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSopa, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btVegetarianos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btOvosMechidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_excluir.png"))); // NOI18N
        jButton20.setText("Excluir");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jlSoma.setBackground(new java.awt.Color(255, 255, 255));
        jlSoma.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlSoma.setForeground(new java.awt.Color(255, 0, 0));
        jlSoma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/24x24/_recibo.png"))); // NOI18N
        btnPagamento.setText("Pagamento");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });

        jlPagamento.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlPagamento.setForeground(new java.awt.Color(0, 102, 102));
        jlPagamento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        pagamento.add(jrdDinheiro);
        jrdDinheiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jrdDinheiro.setText("Dinheiro");

        pagamento.add(jrdDebito);
        jrdDebito.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jrdDebito.setText("Debito");

        pagamento.add(jrdCredito);
        jrdCredito.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jrdCredito.setText("Credito");

        pagamento.add(jrdPix);
        jrdPix.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jrdPix.setText("PIX");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrdDinheiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrdPix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrdCredito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrdDebito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPagamento)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(jlSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrdDinheiro)
                    .addComponent(jrdPix)
                    .addComponent(jrdCredito)
                    .addComponent(jrdDebito))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(btnPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        TxtAluno.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        TxtAluno.setText("Teste");

        TxtPerfil.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        TxtPerfil.setText("Teste");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMingauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMingauActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(3);
        //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();
    }//GEN-LAST:event_jbMingauActionPerformed

    private void jbCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCafeActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(1);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();
        
    }//GEN-LAST:event_jbCafeActionPerformed

    private void jbSucoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSucoActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(2);
        //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal();
        desconto();
    }//GEN-LAST:event_jbSucoActionPerformed

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        
        // Verificar se pelo menos um RadioButton está selecionado
        if (!jrdDinheiro.isSelected() && !jrdPix.isSelected() && !jrdDebito.isSelected() && !jrdCredito.isSelected()) {
            JOptionPane.showMessageDialog(this, "Informar Forma de Pagamento!.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return; // Impede a execução do código subsequente se nenhum RadioButton estiver selecionado
        }       
        int codigoVenda = 0;  
        String formPagamento = null;    
        
        String total = jlSoma.getText();
        total = total.replace(",",".");
        Double totalFormatado = Double.parseDouble(total);        
        
        listaModelVendasProdutos = new ArrayList<>();
        
        if (AlunosSingleton.getInstance().getPerfil().equals("Consumidor Externo")){
          Model_Vendas.setFk_operador(OperadorSingleton.getInstance().getPk_id_operador());
          Model_Vendas.setFk_aluno(1);
        }else{
            Model_Vendas.setFk_operador(OperadorSingleton.getInstance().getPk_id_operador());
            Model_Vendas.setFk_aluno(AlunosSingleton.getInstance().getPk_id_Aluno());
        }     
           
        try {
            Model_Vendas.setVen_data(datas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception ex) {
            Logger.getLogger(form_Refeicao.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jrdDinheiro.isSelected()){
            formPagamento = "Dinheiro";
        }else if(jrdPix.isSelected()){
            formPagamento = "PIX";
        }else if(jrdDebito.isSelected()){
            formPagamento = "Debito";
        }else if(jrdCredito.isSelected()){
            formPagamento = "Credito";
        }         
        
        Model_Vendas.setVen_desconto(AlunosSingleton.getInstance().getPerfil());
        Model_Vendas.setVen_formpagamento(formPagamento);
        Model_Vendas.setVen_valor_Bruto(totalFormatado);
        Model_Vendas.setVen_valor_Liquido(calcularDesconto(Model_Vendas.getVen_valor_Bruto(), Model_Vendas.getVen_desconto()));
        Model_Vendas.setVen_hora(datas.retornarHora());
        
        //Salvar Venda
        codigoVenda = controllerVendas.salvarVendasController(Model_Vendas);
        
        if(codigoVenda>0){
            JOptionPane.showMessageDialog(this, "Venda Salva com Sucesso", "Atenção", JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Erro salvar Venda", "Atenção", JOptionPane.ERROR_MESSAGE);            
        }
        
        int cont = jtVendas.getRowCount();
        for (int i =0; i < cont; i++){
            //Salvar Produtos Banco
            modelVendaProduto = new Model_VendaProduto();
            modelVendaProduto.setFk_produto((int) jtVendas.getValueAt(i, 0));
            modelVendaProduto.setFk_venda(codigoVenda);
            modelVendaProduto.setVen_pro_valor((double) jtVendas.getValueAt(i, 2));
            listaModelVendasProdutos.add(modelVendaProduto);
        }
        
        controllerVendaProduto.salvarVendaProdutoController(listaModelVendasProdutos);
        
        form_Perfil formPerfil = new form_Perfil();
        this.dispose();      

        formPerfil.setVisible(true);
        
    }//GEN-LAST:event_btnPagamentoActionPerformed

    private void jbpaofrescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpaofrescoActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(4);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal();
        desconto();
    }//GEN-LAST:event_jbpaofrescoActionPerformed

    private void jbBatataDoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBatataDoceActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(5);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();        
    }//GEN-LAST:event_jbBatataDoceActionPerformed

    private void jbAipimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAipimActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(6);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal();  
        desconto();
    }//GEN-LAST:event_jbAipimActionPerformed

    private void jbBananaTerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBananaTerraActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(7);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();        
    }//GEN-LAST:event_jbBananaTerraActionPerformed

    private void btInhameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInhameActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(8);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();
    }//GEN-LAST:event_btInhameActionPerformed

    private void btBoloDoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBoloDoceActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(9);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();
    }//GEN-LAST:event_btBoloDoceActionPerformed

    private void btBoloSalgadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBoloSalgadoActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(10);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();
    }//GEN-LAST:event_btBoloSalgadoActionPerformed

    private void btCuscuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCuscuzActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(11);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();
    }//GEN-LAST:event_btCuscuzActionPerformed

    private void btLeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLeleActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(12);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();
    }//GEN-LAST:event_btLeleActionPerformed

    private void btPaoFornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPaoFornoActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(13);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal();
        desconto();
    }//GEN-LAST:event_btPaoFornoActionPerformed

    private void btCaldoDiversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCaldoDiversoActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(14);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();
    }//GEN-LAST:event_btCaldoDiversoActionPerformed

    private void btSopaVegetarianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSopaVegetarianaActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(15);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();
    }//GEN-LAST:event_btSopaVegetarianaActionPerformed

    private void btSopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSopaActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(16);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();
    }//GEN-LAST:event_btSopaActionPerformed

    private void btVegetarianosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVegetarianosActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(17);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();
    }//GEN-LAST:event_btVegetarianosActionPerformed

    private void btOvosMechidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOvosMechidosActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(18);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();
    }//GEN-LAST:event_btOvosMechidosActionPerformed

    private void btFrutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFrutasActionPerformed
        modelProdutos = controllerProdutos.retornarprodutoController(19);
         //Add Linha Tabela  
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        int cont = 0;
        for (int i = 0; i < cont; i++) {
            modelo.setRowCount(0);            
        }
        modelo.addRow(new Object[]{
        modelProdutos.getIdproduto(),
        modelProdutos.getProNome(),
        modelProdutos.getProValor()
        }); 
        somarValorTotal(); 
        desconto();
    }//GEN-LAST:event_btFrutasActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if(jtVendas.getSelectedRow() != -1){
            DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
            modelo.removeRow(jtVendas.getSelectedRow());           
        }else{
            JOptionPane.showMessageDialog(this, "Nengum item selecionado");
        }       
    }//GEN-LAST:event_jButton20ActionPerformed

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
            java.util.logging.Logger.getLogger(form_Refeicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Refeicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Refeicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Refeicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Refeicao().setVisible(true);
            }
        });
    }
    
    public static Double calcularDesconto(Double pValorTotal, String pPerfil) {
        Double valorLiquido = null;
        if (pPerfil.equalsIgnoreCase("PRAE")){
            valorLiquido = 2.00; 
        } else if(pPerfil.equalsIgnoreCase("CAA")){
            valorLiquido = pValorTotal / 2;
        }else{
            valorLiquido = pValorTotal;
        }
         return valorLiquido;   
        }
            
    private void desconto(){
        double desconto = 0;    
        String total = jlSoma.getText();
        total = total.replace(",",".");
        Double totalFormatado = Double.parseDouble(total);
        String pPerfil = AlunosSingleton.getInstance().getPerfil();
        if (pPerfil.equalsIgnoreCase("PRAE")){
            desconto = 2.00;  
        }else if(pPerfil.equalsIgnoreCase("CAA")){
            desconto = totalFormatado /2;
        }else{
            desconto = totalFormatado;
        }
        DecimalFormat df = new DecimalFormat("#.00");
        String descontoFormatado = df.format(desconto);
        jlPagamento.setText(descontoFormatado);
    }
    
    private void somarValorTotal(){
        double soma = 0, valor;
        int cont = jtVendas.getRowCount();
        
        for (int i = 0; i < cont; i++) {
            valor = (double) jtVendas.getValueAt(i, 2);
            soma = soma + valor;
        }
        DecimalFormat df = new DecimalFormat("#.00");
        String somaFormatado = df.format(soma);
        jlSoma.setText(somaFormatado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TxtAluno;
    private javax.swing.JLabel TxtPerfil;
    private javax.swing.JButton btBoloDoce;
    private javax.swing.JButton btBoloSalgado;
    private javax.swing.JButton btCaldoDiverso;
    private javax.swing.JButton btCuscuz;
    private javax.swing.JButton btFrutas;
    private javax.swing.JButton btInhame;
    private javax.swing.JButton btLele;
    private javax.swing.JButton btOvosMechidos;
    private javax.swing.JButton btPaoForno;
    private javax.swing.JButton btSopa;
    private javax.swing.JButton btSopaVegetariana;
    private javax.swing.JButton btVegetarianos;
    private javax.swing.JButton btnPagamento;
    private view.form_Login form_Login1;
    private javax.swing.JButton jButton20;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAipim;
    private javax.swing.JButton jbBananaTerra;
    private javax.swing.JButton jbBatataDoce;
    private javax.swing.JButton jbCafe;
    private javax.swing.JButton jbMingau;
    private javax.swing.JButton jbSuco;
    private javax.swing.JButton jbpaofresco;
    private javax.swing.JLabel jlPagamento;
    private javax.swing.JLabel jlSoma;
    private javax.swing.JRadioButton jrdCredito;
    private javax.swing.JRadioButton jrdDebito;
    private javax.swing.JRadioButton jrdDinheiro;
    private javax.swing.JRadioButton jrdPix;
    private javax.swing.JTable jtVendas;
    private javax.swing.ButtonGroup pagamento;
    // End of variables declaration//GEN-END:variables
}
