package IU;

import BEAN.Delivery;
import DAO.DeliveryDAO;
import UTIL.util;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrMantenimientoDelivery extends javax.swing.JFrame {
    DeliveryDAO DeliDAO;
    DefaultTableModel dtm;
    int idDeli;
    
    public FrMantenimientoDelivery() {
        DeliDAO =new DeliveryDAO();
        initComponents();
        
        dtm = (DefaultTableModel)this.tblDelivery.getModel(); 
        llenaTblDelivery(false, "");
    }
    
       private void llenaTblDelivery(boolean sw, String cad){
        Vector<Delivery> listDeli = this.DeliDAO.listaDelivery(sw, cad);
        dtm.setRowCount(0);
        for(int i= 0;i<listDeli.size();i++){
            Vector vDeli = new Vector();
            vDeli.add(0, listDeli.get(i).getId_delivery());
            vDeli.add(1, listDeli.get(i).getTipo_del());
            vDeli.add(2, listDeli.get(i).getDestino());
            vDeli.add(3, listDeli.get(i).getPreciocaja());
            vDeli.add(4, listDeli.get(i).getAgencia());
            vDeli.add(5, listDeli.get(i).getProvincia());
            vDeli.add(6, listDeli.get(i).getDepartamento());
            vDeli.add(7, listDeli.get(i).getDistrito());
         
            dtm.addRow(vDeli);
        }
        
    
    }

  
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDelivery = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId_delivery = new javax.swing.JTextField();
        txttipo = new javax.swing.JTextField();
        txtpreciocaja = new javax.swing.JTextField();
        txtdestino = new javax.swing.JTextField();
        txtagencia = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtprovincia = new javax.swing.JTextField();
        txtdepartamento = new javax.swing.JTextField();
        txtdistrito = new javax.swing.JTextField();
        txtsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 45, 0, 414);

        jLabel1.setText("MANTENIMIENTO Y ACTUALIZACIÓN DELIVERY");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 270, 40);

        jLabel2.setText("Búsqueda");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 60, 60, 30);

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar);
        txtBuscar.setBounds(180, 60, 280, 30);

        tblDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_delivery", "tipo_del", "destino", "preciocaja", "agencia", "provincia", "departamento", "distrito"
            }
        ));
        tblDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDeliveryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDelivery);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 620, 130);

        jLabel3.setText("ID_DELIVEY");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 260, 70, 30);

        jLabel4.setText("DESTINO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 340, 70, 30);

        jLabel5.setText("TIPO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 310, 40, 20);

        jLabel6.setText("AGENCIA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 260, 60, 40);

        jLabel7.setText("PRECIO CAJA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 380, 90, 30);

        txtId_delivery.setEditable(false);
        getContentPane().add(txtId_delivery);
        txtId_delivery.setBounds(140, 270, 120, 20);
        getContentPane().add(txttipo);
        txttipo.setBounds(140, 300, 120, 20);
        getContentPane().add(txtpreciocaja);
        txtpreciocaja.setBounds(140, 380, 120, 20);
        getContentPane().add(txtdestino);
        txtdestino.setBounds(140, 340, 120, 20);
        getContentPane().add(txtagencia);
        txtagencia.setBounds(470, 270, 120, 20);

        btnGrabar.setText("GRABAR NUEVO");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabar);
        btnGrabar.setBounds(120, 480, 130, 30);

        jLabel8.setText("PROVINCIA");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(390, 310, 80, 20);

        jLabel9.setText("DEPARTAMENTO");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(380, 340, 90, 20);

        jLabel10.setText("DISTRITO");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(390, 380, 80, 20);
        getContentPane().add(txtprovincia);
        txtprovincia.setBounds(470, 310, 120, 20);
        getContentPane().add(txtdepartamento);
        txtdepartamento.setBounds(470, 350, 120, 20);
        getContentPane().add(txtdistrito);
        txtdistrito.setBounds(470, 380, 120, 20);

        txtsalir.setText("SALIR");
        txtsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalirActionPerformed(evt);
            }
        });
        getContentPane().add(txtsalir);
        txtsalir.setBounds(460, 480, 80, 30);

        setSize(new java.awt.Dimension(696, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if(this.txtBuscar.getText().isEmpty()){
            llenaTblDelivery(false, "");
        }else{
            llenaTblDelivery(true, this.txtBuscar.getText());
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        Delivery Deli = new Delivery();
        util u = new util();
        String proc= "";
        if(valida() == true){
            if(this.btnGrabar.getText().equals("GRABAR NUEVO")){
                idDeli = u.idNext("Delivery", "id_delivery");
                Deli.setId_delivery(idDeli);
                proc = "insert";
            }else if(this.btnGrabar.getText().equals("Actualizar")){
                Deli.setId_delivery(idDeli);
                proc = "update";
            }
            Deli.setAgencia(this.txtagencia.getText());
            Deli.setTipo_del(this.txttipo.getText());
            Deli.setDestino(this.txtdestino.getText());
            Deli.setPreciocaja(Integer.parseInt(this.txtpreciocaja.getText()));
            Deli.setProvincia(this.txtprovincia.getText());
            Deli.setDepartamento(this.txtdepartamento.getText());
            Deli.setDistrito(this.txtdistrito.getText());
            this.DeliDAO.procDeli(Deli, proc); 
            limpiaG();
            this.llenaTblDelivery(false, "");
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void tblDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDeliveryMouseClicked
        int fil;
        fil = this.tblDelivery.getSelectedRow();
        this.idDeli = Integer.parseInt(dtm.getValueAt(fil, 0).toString());
        this.txtId_delivery.setText(dtm.getValueAt(fil, 0).toString());
        this.txttipo.setText(dtm.getValueAt(fil, 1).toString());
        this.txtdestino.setText(dtm.getValueAt(fil, 2).toString());
        this.txtpreciocaja.setText(dtm.getValueAt(fil, 3).toString());
        this.txtagencia.setText(dtm.getValueAt(fil, 4).toString());
        this.txtprovincia.setText(dtm.getValueAt(fil, 5).toString());
        this.txtdepartamento.setText(dtm.getValueAt(fil, 6).toString());
        this.txtdistrito.setText(dtm.getValueAt(fil, 7).toString());
        this.btnGrabar.setText("Actualizar");
    }//GEN-LAST:event_tblDeliveryMouseClicked

    private void txtsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalirActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalirActionPerformed

    
     private boolean valida(){
        boolean sw = false;
        if(this.txtdestino.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe registrar un destino");
        }else{
            if(this.txttipo.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe registrar el tipo de delivery");
            }else{
                if(this.txtpreciocaja.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Debe registrar el precio de la caja");
                }else{
                   sw=true;
                }
            }
        }
        return sw;
    }
    
    private void limpiaG(){
        this.txtId_delivery.setText("");
        this.txtagencia.setText("");
        this.txtdepartamento.setText("");
        this.txtdistrito.setText("");
        this.txtpreciocaja.setText("");
        this.txttipo.setText("");
        this.txtprovincia.setText("");
        this.txtdestino.setText("");
        this.btnGrabar.setText("GRABAR NUEVO");
    }
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(FrMantenimientoDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMantenimientoDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMantenimientoDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMantenimientoDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMantenimientoDelivery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDelivery;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtId_delivery;
    private javax.swing.JTextField txtagencia;
    private javax.swing.JTextField txtdepartamento;
    private javax.swing.JTextField txtdestino;
    private javax.swing.JTextField txtdistrito;
    private javax.swing.JTextField txtpreciocaja;
    private javax.swing.JTextField txtprovincia;
    private javax.swing.JButton txtsalir;
    private javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables
}
