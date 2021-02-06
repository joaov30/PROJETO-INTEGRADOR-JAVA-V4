package Interfaces;
import Classes.Equipamento;
import Dao.DaoEquipamento;
import javax.swing.JOptionPane;


public class FrmEquipamento extends javax.swing.JFrame {

    
    Equipamento eq = new Equipamento();
    DaoEquipamento daoe =new DaoEquipamento();
    public FrmEquipamento() {
        initComponents();
        setLocationRelativeTo(null);
        des_campos();
        btsalva.setEnabled(false);
        bteditar.setEnabled(false);
        btbuscarnome.setEnabled(false);
        btbuscarcodigo.setEnabled(false);
    }

    private void hab_campos(){
        
        txtnome.setEnabled(true);
        txtmarca.setEnabled(true);   
        
}

private void des_campos(){
    txtcodigo.setEnabled(false);
    txtnome.setEnabled(false);
    txtmarca.setEnabled(false);   
    btbuscarcodigo.setEnabled(false);
    btbuscarnome.setEnabled(false);
}    
    
    
    
private void limpar(){
    txtcodigo.setText("");
    txtnome.setText("");
    txtmarca.setText("");   
    
}      
    
    private void passa_dados(){
       eq.setNome(txtnome.getText());
       eq.setMarca(txtmarca.getText());
       
   
    }
    
    private void mostra_dados(){
        txtcodigo.setText(String.valueOf(eq.getIdequipamento()));
        txtnome.setText(eq.getNome());
        txtmarca.setText(eq.getMarca());
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodigo = new java.awt.TextField();
        txtnome = new java.awt.TextField();
        txtmarca = new java.awt.TextField();
        voltar = new javax.swing.JButton();
        bteditar = new javax.swing.JButton();
        btconsulta = new javax.swing.JButton();
        btsalva = new javax.swing.JButton();
        btnovo = new javax.swing.JButton();
        btbuscarcodigo = new javax.swing.JButton();
        btbuscarnome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Equipamentos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Aldhabi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 100, -1));

        jLabel3.setFont(new java.awt.Font("Aldhabi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, 20));

        jLabel4.setFont(new java.awt.Font("Aldhabi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        txtcodigo.setBackground(new java.awt.Color(102, 102, 102));
        txtcodigo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 50, -1));

        txtnome.setBackground(new java.awt.Color(102, 102, 102));
        txtnome.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 170, -1));

        txtmarca.setBackground(new java.awt.Color(102, 102, 102));
        txtmarca.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 200, -1));

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel2.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 80, 20));

        bteditar.setText("Editar");
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });
        jPanel2.add(bteditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        btconsulta.setText("Consulta");
        btconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultaActionPerformed(evt);
            }
        });
        jPanel2.add(btconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        btsalva.setText("Salva");
        btsalva.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btsalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvaActionPerformed(evt);
            }
        });
        jPanel2.add(btsalva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 20));

        btnovo.setText("Novo Cadastro");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });
        jPanel2.add(btnovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        btbuscarcodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/images_1.jpg"))); // NOI18N
        btbuscarcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarcodigoActionPerformed(evt);
            }
        });
        jPanel2.add(btbuscarcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 20, 20));

        btbuscarnome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/images_1.jpg"))); // NOI18N
        btbuscarnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarnomeActionPerformed(evt);
            }
        });
        jPanel2.add(btbuscarnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 20, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 330, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        des_campos();
        btsalva.setEnabled(false);
        btconsulta.setEnabled(true);
        btnovo.setEnabled(true);
        limpar();
        bteditar.setEnabled(false);

    }//GEN-LAST:event_voltarActionPerformed

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
        eq.setIdequipamento(Integer.parseInt(txtcodigo.getText()));
        passa_dados();
        daoe.editar(eq);
        JOptionPane.showMessageDialog(null, "Dados Atualizados!");
        des_campos();
        limpar();
        bteditar.setEnabled(false);
        btnovo.setEnabled(true);
    }//GEN-LAST:event_bteditarActionPerformed

    private void btconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultaActionPerformed

        int resp = JOptionPane.showConfirmDialog( null,"Abrir Consulta?", "Consulta",JOptionPane.YES_NO_OPTION);
        if(resp==JOptionPane.YES_OPTION){
            btbuscarcodigo.setEnabled(true);
            btbuscarnome.setEnabled(true);
            txtcodigo.setEnabled(true);
            txtnome.setEnabled(true);
            btnovo.setEnabled(false);
        }else{
            btbuscarcodigo.setEnabled(false);
            btbuscarnome.setEnabled(false);
            txtcodigo.setEnabled(false);
            txtnome.setEnabled(false);
            bteditar.setEnabled(false);
            btnovo.setEnabled(true);
        }
    }//GEN-LAST:event_btconsultaActionPerformed

    private void btsalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvaActionPerformed
        passa_dados();
        daoe.cadastrar(eq);
        JOptionPane.showMessageDialog(null, "Equipamento Cadastrado com sucesso! Nome: "+eq.getNome());
        des_campos();
        btsalva.setEnabled(false);
        btconsulta.setEnabled(true);
        limpar();
        bteditar.setEnabled(false);
    }//GEN-LAST:event_btsalvaActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        limpar();
        hab_campos();
        btsalva.setEnabled(true);
        btconsulta.setEnabled(false);
    }//GEN-LAST:event_btnovoActionPerformed

    private void btbuscarcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarcodigoActionPerformed
        eq.setIdequipamento(Integer.parseInt(txtcodigo.getText()));
        daoe.buscarcod(eq);
        mostra_dados();
        hab_campos();
        bteditar.setEnabled(true);
    }//GEN-LAST:event_btbuscarcodigoActionPerformed

    private void btbuscarnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarnomeActionPerformed

        eq.setNome(txtnome.getText());
        daoe.buscarnome(eq);
        mostra_dados();
        hab_campos();
        bteditar.setEnabled(true);
    }//GEN-LAST:event_btbuscarnomeActionPerformed

 
    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(FrmEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEquipamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscarcodigo;
    private javax.swing.JButton btbuscarnome;
    private javax.swing.JButton btconsulta;
    private javax.swing.JButton bteditar;
    private javax.swing.JButton btnovo;
    private javax.swing.JButton btsalva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.TextField txtcodigo;
    private java.awt.TextField txtmarca;
    private java.awt.TextField txtnome;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
