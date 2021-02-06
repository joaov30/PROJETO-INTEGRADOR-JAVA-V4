
package Interfaces;

import Classes.Cliente;
import Dao.DaoCliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Rel_clientes extends javax.swing.JFrame {

   
    public Rel_clientes() {
        initComponents();
        setLocationRelativeTo(null);
        preenche();
        
    }

     public void preenche(){ 
         
      
        DefaultTableModel modelo=(DefaultTableModel)tbcli.getModel();
        modelo.setNumRows(0);
        
        DaoCliente dao=new DaoCliente();
        
        List<Cliente>clientes=dao.listacli();
        
        for(Cliente cli: clientes){
            
            modelo.addRow(new Object[]{
                cli.getIdcliente(),
                cli.getNome(),
                cli.getTelefone(),
                cli.getCep(),
               cli.getNumero() ,
            cli.getComplemento(),
            cli.getEmail()}); 
                    
        }
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcli = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Relatório de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 80));

        tbcli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Telefone", "Cep", "Numero", "Complemento", "email"
            }
        ));
        jScrollPane1.setViewportView(tbcli);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 650, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {


     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rel_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbcli;
    // End of variables declaration//GEN-END:variables
}
