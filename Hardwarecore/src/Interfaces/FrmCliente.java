package Interfaces;

import Classes.Cliente;
import Dao.DaoCliente;
import javax.swing.JOptionPane;


public class FrmCliente extends javax.swing.JFrame {
    
    Cliente cli = new Cliente();
    DaoCliente dao =new DaoCliente();
    
    public FrmCliente() {
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
        txttelefone.setEnabled(true);   
        txtcep.setEnabled(true);
        txtemail.setEnabled(true); 
        txtcomplemento.setEnabled(true); 
        txtrua.setEnabled(true); 
        txtbairro.setEnabled(true); 
        txtestado.setEnabled(true); 
        txtcidade.setEnabled(true); 
        txtnumero.setEnabled(true);
}

private void des_campos(){
    txtcodigo.setEnabled(false);
    txtnome.setEnabled(false);
    txttelefone.setEnabled(false);   
    txtcep.setEnabled(false);
    txtemail.setEnabled(false); 
    txtcomplemento.setEnabled(false); 
    txtrua.setEnabled(false); 
    txtbairro.setEnabled(false); 
    txtestado.setEnabled(false); 
    txtcidade.setEnabled(false);
    txtnumero.setEnabled(false);
    btbuscarcodigo.setEnabled(false);
    btbuscarnome.setEnabled(false);
}    
    
    
    
private void limpar(){
    txtcodigo.setText("");
    txtnome.setText("");
    txttelefone.setText("");   
    txtemail.setText("");
    txtcep.setText("");
    txtcomplemento.setText(""); 
    txtrua.setText("");  
    txtbairro.setText("");  
    txtestado.setText("");  
    txtcidade.setText("");  
    txtnumero.setText("");
}      
    
    private void passa_dados(){
       cli.setNome(txtnome.getText());
       cli.setTelefone(txttelefone.getText());
       cli.setCep(txtcep.getText());
       cli.setEmail(txtemail.getText()); 
       cli.setNumero(Integer.parseInt(txtnumero.getText()));
       cli.setComplemento(txtcomplemento.getText());
   
    }
    
    private void mostra_dados(){
        txtcodigo.setText(String.valueOf(cli.getIdcliente()));
        txtnome.setText(cli.getNome());
        txttelefone.setText(cli.getTelefone());
        txtcep.setText(cli.getCep());
        txtemail.setText(cli.getEmail());    
        txtnumero.setText(String.valueOf(cli.getNumero()));
        txtcomplemento.setText(cli.getComplemento());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnome = new java.awt.TextField();
        txttelefone = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcomplemento = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        txtrua = new java.awt.TextField();
        jLabel9 = new javax.swing.JLabel();
        txtbairro = new java.awt.TextField();
        txtcep = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcidade = new java.awt.TextField();
        jLabel11 = new javax.swing.JLabel();
        txtestado = new java.awt.TextField();
        btsalva = new javax.swing.JButton();
        bteditar = new javax.swing.JButton();
        btnovo = new javax.swing.JButton();
        btconsulta = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtnumero = new java.awt.TextField();
        btbuscarnome = new javax.swing.JButton();
        btbuscarcodigo = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        txtcodigo.setBackground(new java.awt.Color(102, 102, 102));
        txtcodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        jPanel2.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 50, -1));
        txtcodigo.getAccessibleContext().setAccessibleName("");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        txtnome.setBackground(new java.awt.Color(102, 102, 102));
        txtnome.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, -1));

        txttelefone.setBackground(new java.awt.Color(102, 102, 102));
        txttelefone.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txttelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, -1));
        txttelefone.getAccessibleContext().setAccessibleName("");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        txtemail.setBackground(new java.awt.Color(102, 102, 102));
        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 150, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("cep");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Complemento");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        txtcomplemento.setBackground(new java.awt.Color(102, 102, 102));
        txtcomplemento.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtcomplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 190, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rua");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        txtrua.setBackground(new java.awt.Color(102, 102, 102));
        txtrua.setForeground(new java.awt.Color(255, 255, 255));
        txtrua.setName(""); // NOI18N
        jPanel2.add(txtrua, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 190, 20));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bairro");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        txtbairro.setBackground(new java.awt.Color(102, 102, 102));
        txtbairro.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtbairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 190, -1));

        txtcep.setBackground(new java.awt.Color(102, 102, 102));
        txtcep.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cidade");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        txtcidade.setBackground(new java.awt.Color(102, 102, 102));
        txtcidade.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 150, -1));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Estado");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        txtestado.setBackground(new java.awt.Color(102, 102, 102));
        txtestado.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 150, -1));

        btsalva.setBackground(new java.awt.Color(255, 255, 255));
        btsalva.setText("Salvar");
        btsalva.setBorder(null);
        btsalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvaActionPerformed(evt);
            }
        });
        jPanel2.add(btsalva, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 90, 30));

        bteditar.setBackground(new java.awt.Color(255, 255, 255));
        bteditar.setText("Editar");
        bteditar.setBorder(null);
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });
        jPanel2.add(bteditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 90, 30));

        btnovo.setBackground(new java.awt.Color(255, 255, 255));
        btnovo.setText("Novo Cadastro");
        btnovo.setBorder(null);
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });
        jPanel2.add(btnovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 90, 30));

        btconsulta.setBackground(new java.awt.Color(255, 255, 255));
        btconsulta.setText("Consulta");
        btconsulta.setBorder(null);
        btconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultaActionPerformed(evt);
            }
        });
        jPanel2.add(btconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 90, 30));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Número");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        txtnumero.setBackground(new java.awt.Color(102, 102, 102));
        txtnumero.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 90, -1));

        btbuscarnome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/images_1.jpg"))); // NOI18N
        btbuscarnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarnomeActionPerformed(evt);
            }
        });
        jPanel2.add(btbuscarnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 20, 20));

        btbuscarcodigo.setBackground(new java.awt.Color(255, 255, 255));
        btbuscarcodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/images_1.jpg"))); // NOI18N
        btbuscarcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarcodigoActionPerformed(evt);
            }
        });
        jPanel2.add(btbuscarcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 20, 20));

        voltar.setBackground(new java.awt.Color(255, 255, 255));
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel2.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 390, 430));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Clientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
        cli.setIdcliente(Integer.parseInt(txtcodigo.getText()));
        passa_dados();
        dao.editar(cli);
        JOptionPane.showMessageDialog(null, "Dados Atualizados!");
        des_campos();
        limpar();
        bteditar.setEnabled(false);
        btnovo.setEnabled(true);
    }//GEN-LAST:event_bteditarActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        limpar();
        hab_campos();
        btsalva.setEnabled(true);
        btconsulta.setEnabled(false);
    }//GEN-LAST:event_btnovoActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed

    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btsalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvaActionPerformed
       passa_dados();
        dao.cadastrar(cli);
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso! Nome: "+cli.getNome());
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

    private void btbuscarcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarcodigoActionPerformed
        cli.setIdcliente(Integer.parseInt(txtcodigo.getText()));
        dao.buscarcod(cli);
        mostra_dados();
        hab_campos();
        bteditar.setEnabled(true);
    }//GEN-LAST:event_btbuscarcodigoActionPerformed

    private void btbuscarnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarnomeActionPerformed
        
        cli.setNome(txtnome.getText());
        dao.buscarnome(cli);
        mostra_dados();
        hab_campos();
        bteditar.setEnabled(true);
    }//GEN-LAST:event_btbuscarnomeActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        des_campos();
        btsalva.setEnabled(false);
        btconsulta.setEnabled(true);
        btnovo.setEnabled(true);
        limpar();
        bteditar.setEnabled(false);
        
    }//GEN-LAST:event_voltarActionPerformed

    public static void main(String aemails[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.TextField txtbairro;
    private javax.swing.JFormattedTextField txtcep;
    private java.awt.TextField txtcidade;
    private java.awt.TextField txtcodigo;
    private java.awt.TextField txtcomplemento;
    private java.awt.TextField txtemail;
    private java.awt.TextField txtestado;
    private java.awt.TextField txtnome;
    private java.awt.TextField txtnumero;
    private java.awt.TextField txtrua;
    private java.awt.TextField txttelefone;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
