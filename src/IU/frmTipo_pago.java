package IU;

import BEAN.Tipo_pago;
import DAO.Tipo_pagoDAO;
import UTIL.dbBean;
import UTIL.util;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

public class frmTipo_pago extends javax.swing.JFrame {
    Tipo_pagoDAO tipoDAO;
    DefaultTableModel dtm;
    int idtipo;
    

    public frmTipo_pago() {
        tipoDAO = new Tipo_pagoDAO();
        initComponents();

        dtm = (DefaultTableModel)this.tbltipo.getModel(); 
        llenaTblTipo_pago(false, "");
        
    }

  private void llenaTblTipo_pago(boolean sw, String cad){
        Vector<Tipo_pago> listTipo = this.tipoDAO.listaTipo(sw, cad);
        dtm.setRowCount(0);
        for(int i= 0;i<listTipo.size();i++){
            Vector vTipo = new Vector();
            vTipo.add(0, listTipo.get(i).getId_pago());
            vTipo.add(1, listTipo.get(i).getNombre());
            vTipo.add(2, listTipo.get(i).getPropietario());
            vTipo.add(3, listTipo.get(i).getNumero_cuenta());
            dtm.addRow(vTipo);
        }
        
    
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltipo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtide_pago = new javax.swing.JTextField();
        txtnombre_banco = new javax.swing.JTextField();
        txtpropietario = new javax.swing.JTextField();
        txtnum_cuenta = new javax.swing.JTextField();
        btngrabar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnReporteProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("MANTENIMIENTO Y ACTUALIZACIÓN TIPO DE PAGO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 290, 40);

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar);
        txtBuscar.setBounds(180, 60, 280, 30);

        tbltipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_pago", "nombre_banco", "propietario", "numero_cuenta"
            }
        ));
        tbltipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltipoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbltipo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 40, 620, 130);

        jLabel2.setText("Búsqueda");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 60, 60, 30);

        jLabel3.setText("ID_PAGO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 260, 120, 30);

        jLabel4.setText("NOMBRE DE BANCO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 330, 120, 30);

        jLabel5.setText("PROPIETARIO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 260, 120, 30);

        jLabel6.setText("NUMERO DE CUENTA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 340, 120, 30);

        txtide_pago.setEditable(false);
        getContentPane().add(txtide_pago);
        txtide_pago.setBounds(160, 270, 90, 20);

        txtnombre_banco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_bancoActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre_banco);
        txtnombre_banco.setBounds(160, 330, 90, 20);
        getContentPane().add(txtpropietario);
        txtpropietario.setBounds(490, 270, 90, 20);
        getContentPane().add(txtnum_cuenta);
        txtnum_cuenta.setBounds(500, 340, 90, 20);

        btngrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir (1).png"))); // NOI18N
        btngrabar.setText("GRABAR NUEVO");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });
        getContentPane().add(btngrabar);
        btngrabar.setBounds(20, 410, 150, 40);

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit-symbol-1_icon-icons.com_70162.png"))); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(480, 410, 120, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(140, 60, 40, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shoppaymentorderbuy-04_icon-icons.com_73886.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(510, 10, 80, 80);

        btnReporteProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder-documents01-1622837_121952.png"))); // NOI18N
        btnReporteProd.setText("Reporte");
        btnReporteProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporteProd);
        btnReporteProd.setBounds(240, 400, 140, 60);

        setSize(new java.awt.Dimension(652, 525));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
   if(this.txtBuscar.getText().isEmpty()){
            llenaTblTipo_pago(false, "");
        }else{
            llenaTblTipo_pago(true, this.txtBuscar.getText());
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tbltipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltipoMouseClicked
       int fil;
        fil = this.tbltipo.getSelectedRow();
        this.idtipo = Integer.parseInt(dtm.getValueAt(fil, 0).toString());
        this.txtide_pago.setText(dtm.getValueAt(fil, 0).toString());
        this.txtnombre_banco.setText(dtm.getValueAt(fil, 1).toString());
        this.txtpropietario.setText(dtm.getValueAt(fil, 2).toString());
        this.txtnum_cuenta.setText(dtm.getValueAt(fil, 3).toString());
        this.btngrabar.setText("Actualizar");
    }//GEN-LAST:event_tbltipoMouseClicked

    private void txtnombre_bancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_bancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_bancoActionPerformed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
       
        Tipo_pago Tipo = new Tipo_pago();
        util u = new util();
        String proc= "";
        if(valida() == true){
            if(this.btngrabar.getText().equals("GRABAR NUEVO")){
                idtipo = u.idNext("Tipo_pago", "id_pago");
                Tipo.setId_pago(idtipo);
                proc = "insert";
            }else if(this.btngrabar.getText().equals("Actualizar")){
                Tipo.setId_pago(idtipo);
                proc = "update";
            }
            Tipo.setNombre(this.txtnombre_banco.getText());
            Tipo.setPropietario(this.txtpropietario.getText());
            Tipo.setNumero_cuenta(Integer.parseInt(this.txtnum_cuenta.getText()));
            this.tipoDAO.procTipo(Tipo, proc); 
            limpiaG();
            this.llenaTblTipo_pago(false, "");
        }
    }//GEN-LAST:event_btngrabarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnReporteProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteProdActionPerformed
        try{
            String r = "src/REPORTES/repTipodePago.jasper";
            dbBean db = new dbBean();
            db.connectRep(r,null,false);
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(JRException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnReporteProdActionPerformed

    private boolean valida(){
        boolean sw = false;
        if(this.txtnombre_banco.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe registrar el noombre del banco");
        }else{
            if(this.txtpropietario.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe registrar el nombre del propietario");
            }else{
                if(this.txtnum_cuenta.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Debe registrar el número de cuenta");
                }else{
                    try{
                        Integer.parseInt(this.txtnum_cuenta.getText());
                        sw = true;
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(this, "Debe registrar un dato numerico para el número de cuenta");
                        this.txtnum_cuenta.setText("");
                        e.printStackTrace();
                    }
                }
            }
        }
        return sw;
    }
    
    
     private void limpiaG(){
        this.txtide_pago.setText("");
        this.txtnombre_banco.setText("");
        this.txtnum_cuenta.setText("");
        this.txtpropietario.setText("");
        this.btngrabar.setText("GRABAR NUEVO");
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
            java.util.logging.Logger.getLogger(frmTipo_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTipo_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTipo_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTipo_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTipo_pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporteProd;
    private javax.swing.JButton btngrabar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbltipo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtide_pago;
    private javax.swing.JTextField txtnombre_banco;
    private javax.swing.JTextField txtnum_cuenta;
    private javax.swing.JTextField txtpropietario;
    // End of variables declaration//GEN-END:variables
}
