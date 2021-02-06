
package Interfaces;

import Classes.Tecnico;
import Dao.DaoTecnico;
import javax.swing.JOptionPane;

public class FrmTecnico extends javax.swing.JFrame {

        Tecnico tec =new Tecnico();
        DaoTecnico daot=new DaoTecnico();
    
    public FrmTecnico() {
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
        txtrg.setEnabled(true);   
        txtcpf.setEnabled(true);
        txtusuario.setEnabled(true); 
        txtsenha.setEnabled(true); 
        
}

private void des_campos(){
    txtcodigo.setEnabled(false);
    txtnome.setEnabled(false);
    txtrg.setEnabled(false);   
    txtcpf.setEnabled(false);
    txtusuario.setEnabled(false); 
    txtsenha.setEnabled(false);
    btbuscarcodigo.setEnabled(false);
    btbuscarnome.setEnabled(false);
}    
    
    
    
private void limpar(){
    txtcodigo.setText("");
    txtnome.setText("");
    txtrg.setText("");   
    txtusuario.setText("");
    txtcpf.setText("");
    txtsenha.setText(""); 
}      
    
    private void passa_dados(){
       
       tec.setNome(txtnome.getText());
       tec.setRg(txtrg.getText());
       tec.setCpf(txtcpf.getText());
       tec.setUsuario(txtusuario.getText()); 
       tec.setSenha(txtsenha.getText());

   
    }
    
    private void mostra_dados(){
        txtcodigo.setText(String.valueOf(tec.getIdtecnico()));
        txtnome.setText(tec.getNome());
        txtrg.setText(tec.getRg());
        txtcpf.setText(tec.getCpf());
        txtusuario.setText(tec.getUsuario());    
        txtsenha.setText(tec.getSenha());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new java.awt.TextField();
        txtnome = new java.awt.TextField();
        txtusuario = new java.awt.TextField();
        txtsenha = new java.awt.TextField();
        txtrg = new javax.swing.JFormattedTextField();
        txtcpf = new javax.swing.JFormattedTextField();
        btnovo = new javax.swing.JButton();
        btsalva = new javax.swing.JButton();
        btconsulta = new javax.swing.JButton();
        bteditar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        btbuscarnome = new javax.swing.JButton();
        btbuscarcodigo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Tecnico");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Aldhabi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Aldhabi", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Aldhabi", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cpf");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Aldhabi", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rg");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Aldhabi", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Aldhabi", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtcodigo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 40, -1));

        txtnome.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, -1));

        txtusuario.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 150, -1));

        txtsenha.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 150, -1));

        try {
            txtrg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 150, -1));

        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, -1));

        btnovo.setText("Novo Cadastro");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });
        jPanel2.add(btnovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        btsalva.setText("Salva");
        btsalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvaActionPerformed(evt);
            }
        });
        jPanel2.add(btsalva, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        btconsulta.setText("Consulta");
        btconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultaActionPerformed(evt);
            }
        });
        jPanel2.add(btconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        bteditar.setText("Editar");
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });
        jPanel2.add(bteditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        voltar.setText("voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel2.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 80, -1));

        btbuscarnome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon-busca.png"))); // NOI18N
        btbuscarnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarnomeActionPerformed(evt);
            }
        });
        jPanel2.add(btbuscarnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 20, 20));

        btbuscarcodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon-busca.png"))); // NOI18N
        btbuscarcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarcodigoActionPerformed(evt);
            }
        });
        jPanel2.add(btbuscarcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 20, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 310, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        limpar();
        hab_campos();
        btsalva.setEnabled(true);
        btconsulta.setEnabled(false);
    }//GEN-LAST:event_btnovoActionPerformed

    private void btsalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvaActionPerformed
        passa_dados();
        daot.cadastrar(tec);
        JOptionPane.showMessageDialog(null, "Tecnico Cadastrado com sucesso! Nome: "+tec.getNome());
        des_campos();
        btsalva.setEnabled(false);
        btconsulta.setEnabled(true);
        limpar();
        bteditar.setEnabled(false);
    }//GEN-LAST:event_btsalvaActionPerformed

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

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
        tec.setIdtecnico(Integer.parseInt(txtcodigo.getText()));
        passa_dados();
        daot.editar(tec);
        JOptionPane.showMessageDialog(null, "Dados Atualizados!");
        des_campos();
        limpar();
        bteditar.setEnabled(false);
        btnovo.setEnabled(true);
    }//GEN-LAST:event_bteditarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        des_campos();
        btsalva.setEnabled(false);
        btconsulta.setEnabled(true);
        btnovo.setEnabled(true);
        limpar();
        bteditar.setEnabled(false);

    }//GEN-LAST:event_voltarActionPerformed

    private void btbuscarnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarnomeActionPerformed

        tec.setNome(txtnome.getText());
        daot.buscarnome(tec);
        mostra_dados();
        hab_campos();
        bteditar.setEnabled(true);
    }//GEN-LAST:event_btbuscarnomeActionPerformed

    private void btbuscarcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarcodigoActionPerformed
        tec.setIdtecnico(Integer.parseInt(txtcodigo.getText()));
        daot.buscarcod(tec);
        mostra_dados();
        hab_campos();
        bteditar.setEnabled(true);
    }//GEN-LAST:event_btbuscarcodigoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTecnico().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.TextField txtcodigo;
    private javax.swing.JFormattedTextField txtcpf;
    private java.awt.TextField txtnome;
    private javax.swing.JFormattedTextField txtrg;
    private java.awt.TextField txtsenha;
    private java.awt.TextField txtusuario;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
