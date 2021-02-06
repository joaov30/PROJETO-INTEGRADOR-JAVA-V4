
package Interfaces;

import Classes.Tecnico;
import Dao.DaoTecnico;
import javax.swing.JOptionPane;




public class FrmLogin extends javax.swing.JFrame {

   
    public FrmLogin() {
        initComponents();
        setLocationRelativeTo(null);
       
    }
    
    Tecnico tec=new Tecnico();
    DaoTecnico daot= new DaoTecnico();
    
    private void passa_dados(){
       tec.setUsuario(txtusu.getText());
       tec.setSenha(txtsenha.getText());
    }
    
    private void limpar(){
    txtusu.setText("");
    txtsenha.setText("");
}   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsenha = new javax.swing.JTextField();
        txtusu = new javax.swing.JTextField();
        foto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Acesso ao Sistema");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 310, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuário");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 60, 20));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        txtsenha.setBackground(new java.awt.Color(102, 102, 102));
        txtsenha.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txtsenha.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 280, 30));

        txtusu.setBackground(new java.awt.Color(102, 102, 102));
        txtusu.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txtusu.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 280, 30));

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/hardwarecore_icon.png"))); // NOI18N
        jPanel1.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 20, 420, 210));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton1.setText("Ir");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        passa_dados();
        daot.login(tec); 
        if(daot.status==1){
            new FrmPrincipal().setVisible(true);
            limpar();
        }else{
            JOptionPane.showMessageDialog(null,"Verifique!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel foto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtsenha;
    private javax.swing.JTextField txtusu;
    // End of variables declaration//GEN-END:variables
}
