/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoProduto;
import fatec.poo.model.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Ingrid
 */
public class GuiProduto extends javax.swing.JFrame {

    /**
     * Creates new form GuiProduto
     */
    public GuiProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tBoxPrecoUnit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tBoxDescricao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tBoxQtdeDisponivel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tBoxCodigo = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        tBoxEstoqueMinimo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tBoxPrecoUnit.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("C??digo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Descri????o");

        tBoxDescricao.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Pre??o Unit??rio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Qtde. Dispon??vel");

        tBoxQtdeDisponivel.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Estoque M??nimo");

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        tBoxEstoqueMinimo.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tBoxQtdeDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tBoxPrecoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tBoxEstoqueMinimo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tBoxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tBoxDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tBoxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tBoxDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tBoxQtdeDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tBoxPrecoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(tBoxEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("","");
        conexao.setCaminho("C:\\Users\\Aluno - Gti-Ads\\Desktop\\prjPOOFabioIngridMatheusJ\\src\\fatec\\poo\\aplicacao\\BDControleVendas.accdb");
                
        daoProduto = new DaoProduto(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if(!validaNumero(tBoxCodigo.getText())){
            JOptionPane.showMessageDialog(null, "C??digo Inv??lido!");
            tBoxCodigo.setText("");
            tBoxCodigo.requestFocus();
        }else{
            produto = null;
            produto = daoProduto.consultar(Integer.parseInt(tBoxCodigo.getText()));

            if (produto == null){
                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
            }
            else{
               tBoxDescricao.setText(produto.getDescricao());
               tBoxQtdeDisponivel.setText(String.valueOf(produto.getQtdeDisponivel()));
               tBoxPrecoUnit.setText(String.valueOf(produto.getPrecoUnit()));
               tBoxEstoqueMinimo.setText(String.valueOf(produto.getEstoqueMin()));
               
               btnConsultar.setEnabled(false);
               btnIncluir.setEnabled(false);
               btnAlterar.setEnabled(true);
               btnExcluir.setEnabled(true);
            }
            tBoxCodigo.setEnabled(false);
            tBoxDescricao.setEnabled(true);
            tBoxDescricao.requestFocus();
            tBoxQtdeDisponivel.setEnabled(true);
            tBoxPrecoUnit.setEnabled(true);
            tBoxEstoqueMinimo.setEnabled(true);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        produto = new Produto(Integer.parseInt(tBoxCodigo.getText()),tBoxDescricao.getText());
        
        produto.setQtdeDisponivel(Integer.parseInt(tBoxQtdeDisponivel.getText()));
        produto.setPrecoUnit(Double.parseDouble(tBoxPrecoUnit.getText()));
        produto.setEstoqueMin(Integer.parseInt(tBoxEstoqueMinimo.getText()));
        
        daoProduto.inserir(produto);
        
        tBoxCodigo.setText("");
        tBoxDescricao.setText("");
        tBoxQtdeDisponivel.setText("");
        tBoxPrecoUnit.setText("");
        tBoxEstoqueMinimo.setText("");
        
        btnIncluir.setEnabled(false);
        btnConsultar.setEnabled(true);
        tBoxCodigo.setEnabled(true);
        tBoxDescricao.setEnabled(false);
        tBoxQtdeDisponivel.setEnabled(false);
        tBoxPrecoUnit.setEnabled(false);
        tBoxEstoqueMinimo.setEnabled(false);
        
        tBoxCodigo.requestFocus();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Altera????o?")== 0){//Sim
            produto = new Produto(Integer.parseInt(tBoxCodigo.getText()), tBoxDescricao.getText());
            produto.setQtdeDisponivel(Integer.parseInt(tBoxQtdeDisponivel.getText()));
            produto.setPrecoUnit(Double.parseDouble(tBoxPrecoUnit.getText()));
            produto.setEstoqueMin(Integer.parseInt(tBoxEstoqueMinimo.getText()));
                        
            daoProduto.alterar(produto);
            
            tBoxCodigo.setText("");
            tBoxDescricao.setText("");
            tBoxQtdeDisponivel.setText("");
            tBoxPrecoUnit.setText("");
            tBoxEstoqueMinimo.setText("");
        
            tBoxCodigo.setEnabled(true);
            tBoxDescricao.setEnabled(false);
            tBoxQtdeDisponivel.setEnabled(false);
            tBoxPrecoUnit.setEnabled(false);
            tBoxEstoqueMinimo.setEnabled(false);
            
            tBoxCodigo.requestFocus();
            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(JOptionPane.showConfirmDialog(null,"Confirma Exclus??o?") == 0){
            daoProduto.excluir(produto);
            
            tBoxCodigo.setText("");
            tBoxDescricao.setText("");
            tBoxQtdeDisponivel.setText("");
            tBoxPrecoUnit.setText("");
            tBoxEstoqueMinimo.setText("");
            
            tBoxCodigo.setEnabled(true);
            tBoxDescricao.setEnabled(false);
            tBoxQtdeDisponivel.setEnabled(false);
            tBoxPrecoUnit.setEnabled(false);
            tBoxEstoqueMinimo.setEnabled(false);
            
            tBoxCodigo.requestFocus();
            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed
    
    public boolean validaNumero(String num){
        boolean r=false;
        try {
            Integer.parseInt(num);
            r=true;
        }
        catch (NumberFormatException e) {

        }
        return r;
    }
    
    private DaoProduto daoProduto=null;
    private Produto produto =null;
    private Conexao conexao=null;
    
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
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tBoxCodigo;
    private javax.swing.JTextField tBoxDescricao;
    private javax.swing.JTextField tBoxEstoqueMinimo;
    private javax.swing.JTextField tBoxPrecoUnit;
    private javax.swing.JTextField tBoxQtdeDisponivel;
    // End of variables declaration//GEN-END:variables
}
