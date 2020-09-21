
package IU;

import BEAN.Cliente;
import DAO.ClienteDAO;
import UTIL.util;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//aa//
public class frmCliente extends javax.swing.JFrame {

    ClienteDAO clieDao;
    DefaultTableModel dtm;
    
    
    public frmCliente() {
        initComponents();
        clieDao = new ClienteDAO();
        
        dtm = (DefaultTableModel)this.tblClieBusca.getModel();
        llenaTblCliente(false, "");        
                
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblClieBusca = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtFechaClie = new javax.swing.JTextField();
        btnRegistrarClie = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("MANTENIMIENTO DE CLIENTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 320, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("BUSQUEDA DEL CLIENTE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 140, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 60, 30, 30);

        txtBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarClienteMouseClicked(evt);
            }
        });
        txtBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarClienteKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscarCliente);
        txtBuscarCliente.setBounds(200, 60, 270, 30);

        tblClieBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Apellidos", "Nombres", "Dirección", "Teléfono", "Correo", "Fecha Nacimiento"
            }
        ));
        tblClieBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClieBuscaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblClieBusca);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 110, 580, 130);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("DATOS DEL CLIENTE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 270, 120, 14);

        jLabel5.setText("DNI:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 300, 22, 14);

        jLabel6.setText("Apellidos:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 340, 60, 14);

        jLabel7.setText("Nombres:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 380, 60, 14);

        jLabel8.setText("Dirección:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 420, 47, 14);

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        getContentPane().add(txtDni);
        txtDni.setBounds(110, 300, 130, 20);
        getContentPane().add(txtApellidos);
        txtApellidos.setBounds(110, 340, 130, 20);
        getContentPane().add(txtNombres);
        txtNombres.setBounds(110, 380, 130, 20);
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(110, 430, 130, 20);

        jLabel9.setText("Teléfono:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 290, 46, 14);

        jLabel10.setText("Correo:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 330, 37, 14);

        jLabel11.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 370, 100, 14);
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(400, 290, 140, 20);
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(400, 330, 140, 20);
        getContentPane().add(txtFechaClie);
        txtFechaClie.setBounds(430, 370, 110, 20);

        btnRegistrarClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir (1).png"))); // NOI18N
        btnRegistrarClie.setText("Registrar");
        btnRegistrarClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClieActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarClie);
        btnRegistrarClie.setBounds(310, 420, 120, 40);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tugurio.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(440, 420, 100, 40);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escoba.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(310, 460, 120, 40);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit-symbol-1_icon-icons.com_70162.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(440, 460, 100, 40);

        jLabel12.setBackground(new java.awt.Color(153, 153, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/objetivo.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(530, 10, 70, 70);

        setSize(new java.awt.Dimension(648, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void llenaTblCliente(boolean sw, String cad){
        Vector<Cliente> listEmpl = this.clieDao.listaCliente(sw, cad);
        dtm.setRowCount(0);
        for(int i=0; i<listEmpl.size();i++){
            Vector vClie = new Vector();
            vClie.addElement(listEmpl.get(i).getDniCli());
            vClie.addElement(listEmpl.get(i).getApellidoCli());
            vClie.addElement(listEmpl.get(i).getNombreCli());
            vClie.addElement(listEmpl.get(i).getDireccionCli());
            vClie.addElement(listEmpl.get(i).getTelefonoCli());
            vClie.addElement(listEmpl.get(i).getCorreoCli());
            vClie.addElement(listEmpl.get(i).getFecha_nac_clie());
            dtm.addRow(vClie);
        }
    }
     private void limpia(){
        this.txtDni.setText("");
        this.txtApellidos.setText("");
        this.txtNombres.setText("");
        this.txtDireccion.setText("");
        this.txtTelefono.setText("");
        this.txtCorreo.setText("");
        this.txtFechaClie.setText("");
    }
    private void txtBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarClienteMouseClicked

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpia();
        this.btnRegistrarClie.setText("Registrar cliente");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClieActionPerformed
        Cliente clie = new Cliente();
      
        String proc = "";
     
            if(this.btnRegistrarClie.getText().equals("Registrar")){
                proc = "insert";
            }else if(this.btnRegistrarClie.getText().equals("Actualizar")){
                proc = "update";
            }
          if(valida()== true){
            clie.setDniCli(this.txtDni.getText());
            clie.setApellidoCli(this.txtApellidos.getText());
            clie.setNombreCli(this.txtNombres.getText());
            clie.setDireccionCli(this.txtDireccion.getText());
            clie.setTelefonoCli(Integer.parseInt(this.txtTelefono.getText()));
            clie.setCorreoCli(this.txtCorreo.getText());
            clie.setFecha_nac_clie(this.txtFechaClie.getText());
            this.clieDao.procesaCliente(clie, proc);
           
            limpia();
        }
       llenaTblCliente(false, "");

     

    }//GEN-LAST:event_btnRegistrarClieActionPerformed

    private boolean valida(){

       boolean sw = false;
       if(this.txtApellidos.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Debe registrar Apellidos");
       }else{
           if(this.txtNombres.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Debe registrar Nombres");
           }else{
               if(this.txtDireccion.getText().isEmpty()){
                   JOptionPane.showMessageDialog(this, "Debe registrar Direccion");
                }else{
                    if(this.txtTelefono.getText().isEmpty()){
                       JOptionPane.showMessageDialog(this, "Debe registrar numero de telefono");
                    }else{
                        try{
                            Integer.parseInt(this.txtTelefono.getText());
                            sw = true;
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(this, "Debe registrar un dato tipo numérico");
                            this.txtTelefono.setText("");
                            e.printStackTrace();
                           
                        }if(this.txtFechaClie.getText().isEmpty()){
                               JOptionPane.showMessageDialog(this, "Debe registrar fecha de nacimiento");
                           }                    
                    }
                }
            }
        }

       return sw;
    }
    
    private void txtBuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClienteKeyReleased
        if(this.txtBuscarCliente.getText().isEmpty()){
            llenaTblCliente(false,"");
        }else{
            llenaTblCliente(true, this.txtBuscarCliente.getText());
        }
    }//GEN-LAST:event_txtBuscarClienteKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int i;
        if(this.tblClieBusca.getSelectedRow()>0){
            i = this.tblClieBusca.getSelectedRow();
            dtm.removeRow(i);
        }
        limpia();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblClieBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClieBuscaMouseClicked
        int fil;
        fil = this.tblClieBusca.getSelectedRow();
        this.txtDni.setText(dtm.getValueAt(fil, 0).toString());
        this.txtApellidos.setText(dtm.getValueAt(fil, 1).toString());
        this.txtNombres.setText(dtm.getValueAt(fil, 2).toString());
        this.txtDireccion.setText(dtm.getValueAt(fil, 3).toString());
        this.txtTelefono.setText(dtm.getValueAt(fil, 4).toString());
        this.txtCorreo.setText(dtm.getValueAt(fil, 5).toString());
        this.txtFechaClie.setText(dtm.getValueAt(fil, 6).toString());
        
        this.btnRegistrarClie.setText("Actualizar");
    }//GEN-LAST:event_tblClieBuscaMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarClie;
    private javax.swing.JButton btnSalir;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblClieBusca;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaClie;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
