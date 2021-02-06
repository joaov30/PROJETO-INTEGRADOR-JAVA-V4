
package Interfaces;

import Classes.Cliente;
import Classes.Equipamento;
import Classes.OS;
import Classes.Tecnico;
import Dao.DaoCliente;
import Dao.DaoEquipamento;
import Dao.DaoOs;
import Dao.DaoTecnico;
import Gerais.ModalFrameUtil;
import java.util.List;
import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame {

    FrmCliente frmcli = null;
    FrmTecnico frmtec = null;
    FrmEquipamento frmeq= null;
    
    DaoEquipamento daoeq=new DaoEquipamento();
    DaoCliente daoc=new DaoCliente();
    DaoTecnico daot=new DaoTecnico();
    DaoOs daoos=new DaoOs();
    Tecnico tec=new Tecnico();
    Cliente cli=new Cliente();
    Equipamento eq=new Equipamento();
    OS os=new OS();
    
    Rel_tecnicos reltec = null;
    Rel_clientes relcli = null;
    Rel_equipamentos releq = null;
    
    String valorc, valort,valore;
    
    public FrmPrincipal() {
        initComponents();
       setLocationRelativeTo(null);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/8 bit 1.gif"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/8874157427e0ccaaa74497af41afdf86.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/hardwarecore_icon.png"))); // NOI18N
        jPanel2.add(jLabel3);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 310));

        jMenu1.setText("Cadastros");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bt_add_user.png"))); // NOI18N
        jMenuItem1.setText("Cadastrar Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bt_add_user.png"))); // NOI18N
        jMenuItem2.setText("Cadastrar Tecnicos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bt_add_user.png"))); // NOI18N
        jMenuItem3.setText("Cadastrar Equipamentos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Edit-Select-All-32.png"))); // NOI18N
        jMenuItem4.setText("Relatório Cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Edit-Select-All-32.png"))); // NOI18N
        jMenuItem5.setText("Telatório Técnico");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Edit-Select-All-32.png"))); // NOI18N
        jMenuItem6.setText("Relatório Equipamento");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(frmtec==null){
           ModalFrameUtil.showAsModal(new FrmTecnico(), this);
           setVisible(true);
        }
       else{
           frmtec.setVisible(true);
       }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       if(frmcli==null){
            ModalFrameUtil.showAsModal(new FrmCliente(), this);
            setVisible(true);
        }else{
            frmcli.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(frmeq==null){
           ModalFrameUtil.showAsModal(new FrmEquipamento(), this);
           setVisible(true);
        }
       else{
           frmeq.setVisible(true);
       }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(relcli==null){
           ModalFrameUtil.showAsModal(new Rel_clientes(), this);
           setVisible(true);
        }
       else{
           relcli.setVisible(true);
       }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
if(reltec==null){
           ModalFrameUtil.showAsModal(new Rel_tecnicos(), this);
           setVisible(true);
        }
       else{
           reltec.setVisible(true);
       }

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
if(releq==null){
           ModalFrameUtil.showAsModal(new Rel_equipamentos(), this);
           setVisible(true);
        }
       else{
           releq.setVisible(true);
       }
        
        
        
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
