package IU;

import BEAN.Cab_venta;
import DAO.Cab_ventaDAO;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class FrmMantenimientoVenta extends javax.swing.JFrame {

    Cab_ventaDAO cab_ventaDao;
    DefaultTableModel dtmVenta;
    int idVenta;

    public FrmMantenimientoVenta() {
        initComponents();
        cab_ventaDao = new Cab_ventaDAO();
        dtmVenta = (DefaultTableModel)this.tblVentas.getModel();
        llenaTblVentas(false, "");
    }
    
    private void llenaTblVentas (boolean sw, String cad){
        Vector<Cab_venta> listVenta = this.cab_ventaDao.ListaItem(sw, cad);
        dtmVenta.setRowCount(0);
        for(int i=0; i<listVenta.size(); i++){
            Vector vVenta = new Vector();
            vVenta.add(0, listVenta.get(i).getIdVenta());
            vVenta.add(1, listVenta.get(i).getDniClif());
            vVenta.add(2, listVenta.get(i).getFechaVenta());
            vVenta.add(3, listVenta.get(i).getEstado());
            vVenta.add(4, listVenta.get(i).getIdDeliveryf());
            vVenta.add(5, listVenta.get(i).getDniVendedor());
            vVenta.add(6, listVenta.get(i).getDniRepartidorf());
            vVenta.add(7, listVenta.get(i).getIdPagof());
            
            dtmVenta.addRow(vVenta);
        }
        
        
    }

    private void limpiaG(){
        this.txtIdVenta.setText("");
        this.txtDniCliente.setText("");
        this.txtFecha.setText("");
        this.txtEstado.setText("");
        this.txtIdDelivery.setText("");
        this.txtDniVendedor.setText("");
        this.txtDniRepartidor.setText("");
        this.txtIdPago.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarVenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdVenta = new javax.swing.JTextField();
        txtDniCliente = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtIdDelivery = new javax.swing.JTextField();
        txtDniVendedor = new javax.swing.JTextField();
        txtDniRepartidor = new javax.swing.JTextField();
        txtIdPago = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("MANTENIMIENTO Y BUSQUEDA DE VENTAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 20, 230, 14);

        jLabel2.setText("Búsqueda de venta");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 50, 100, 14);

        txtBuscarVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarVentaKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscarVenta);
        txtBuscarVenta.setBounds(190, 50, 240, 20);

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdVenta", "DNI Cliente", "Fecha", "Estado", "IdDelivery", "DNI Vendedor", "DNI Repartidor", "IdPago"
            }
        ));
        tblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVentas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 90, 670, 120);

        jLabel3.setText("ID VENTA:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 250, 60, 14);

        jLabel4.setText("ID PAGO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 380, 60, 14);

        jLabel5.setText("DNI CLIENTE: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 290, 70, 14);

        jLabel6.setText("FECHA:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 330, 37, 14);

        jLabel7.setText("ESTADO:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 380, 44, 14);

        jLabel8.setText("ID DELIVERY:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 250, 65, 14);

        jLabel9.setText("DNI VENDEDOR:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 300, 79, 14);

        jLabel10.setText("DNI REPARTIDOR:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(410, 340, 90, 14);
        getContentPane().add(txtIdVenta);
        txtIdVenta.setBounds(150, 250, 120, 20);
        getContentPane().add(txtDniCliente);
        txtDniCliente.setBounds(150, 290, 120, 20);

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFecha);
        txtFecha.setBounds(150, 330, 120, 20);

        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEstado);
        txtEstado.setBounds(150, 370, 120, 20);
        getContentPane().add(txtIdDelivery);
        txtIdDelivery.setBounds(530, 250, 110, 20);
        getContentPane().add(txtDniVendedor);
        txtDniVendedor.setBounds(530, 300, 110, 20);
        getContentPane().add(txtDniRepartidor);
        txtDniRepartidor.setBounds(530, 340, 110, 20);
        getContentPane().add(txtIdPago);
        txtIdPago.setBounds(530, 380, 110, 20);

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(180, 430, 130, 30);

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(430, 430, 100, 30);

        setSize(new java.awt.Dimension(749, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtBuscarVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarVentaKeyReleased
        if(this.txtBuscarVenta.getText().isEmpty()){
            llenaTblVentas(false, "");
        }else{
            llenaTblVentas(true, this.txtBuscarVenta.getText());
        }
    }//GEN-LAST:event_txtBuscarVentaKeyReleased

    private void tblVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentasMouseClicked
        int fil;
        fil = this.tblVentas.getSelectedRow();
        this.idVenta = Integer.parseInt(dtmVenta.getValueAt(fil, 0).toString());
        this.txtIdVenta.setText(dtmVenta.getValueAt(fil, 0).toString());
        this.txtDniCliente.setText(dtmVenta.getValueAt(fil, 1).toString());
        this.txtFecha.setText(dtmVenta.getValueAt(fil, 2).toString());
        this.txtEstado.setText(dtmVenta.getValueAt(fil, 3).toString());
        this.txtIdDelivery.setText(dtmVenta.getValueAt(fil, 4).toString());
        this.txtDniVendedor.setText(dtmVenta.getValueAt(fil, 5).toString());
        this.txtDniRepartidor.setText(dtmVenta.getValueAt(fil, 6).toString());
        this.txtIdPago.setText(dtmVenta.getValueAt(fil, 7).toString());
       
        
    }//GEN-LAST:event_tblVentasMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Cab_venta cab_venta = new Cab_venta();
        String proc = "";
        if(this.btnActualizar.getText().equals("Actualizar")){
            proc = "update";
        }
        cab_venta.setIdVenta(Integer.parseInt(this.txtIdVenta.getText()));
        cab_venta.setDniClif(this.txtDniCliente.getText());
        cab_venta.setFechaVenta(this.txtFecha.getText());
        cab_venta.setEstado(this.txtEstado.getText());
        cab_venta.setIdDeliveryf(Integer.parseInt(this.txtIdDelivery.getText()));
        cab_venta.setDniVendedor(this.txtDniVendedor.getText());
        cab_venta.setDniRepartidorf(this.txtDniRepartidor.getText());
        cab_venta.setIdPagof(Integer.parseInt(this.txtIdPago.getText()));
        this.cab_ventaDao.procesaItem(cab_venta, proc);
        limpiaG();
        this.llenaTblVentas(false, "");
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMantenimientoVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMantenimientoVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtBuscarVenta;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtDniRepartidor;
    private javax.swing.JTextField txtDniVendedor;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdDelivery;
    private javax.swing.JTextField txtIdPago;
    private javax.swing.JTextField txtIdVenta;
    // End of variables declaration//GEN-END:variables
}
