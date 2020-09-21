package IU;

import BEAN.Vendedor;
import DAO.VendedorDAO;
import UTIL.dbBean;
import UTIL.util;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

public class frmVendedor extends javax.swing.JFrame {

    VendedorDAO repDao;
    DefaultTableModel dtmrep;
    String idRep;

    public frmVendedor() {
        repDao = new VendedorDAO();
        initComponents();

        dtmrep = (DefaultTableModel) this.tblRepartidor.getModel();
        llenaTblRepartidor(false, "");
    }

    private void llenaTblRepartidor(boolean sw, String cad) {
        Vector<Vendedor> listProd = this.repDao.ListaItem(sw, cad);
        dtmrep.setRowCount(0);
        for (int i = 0; i < listProd.size(); i++) {
            Vector vRep = new Vector();
            vRep.addElement(listProd.get(i).getDniVendedor());
            vRep.addElement(listProd.get(i).getNombVendedor());
            vRep.addElement(listProd.get(i).getTelefono());
            vRep.addElement(listProd.get(i).getDireccion());
            vRep.addElement(listProd.get(i).getDistrito());
            vRep.addElement(listProd.get(i).getSueldo());

            dtmrep.addRow(vRep);
        }
    }

    private void limpia() {
        this.txtDNIrepartidor.setText("");
        this.txtNomRepartidor.setText("");
        this.txtTelefonoRepartidor.setText("");
        this.txtDireccionRepartidor.setText("");
        this.txtDistritoRepartidor.setText("");
        this.txtSueldoRepartidor.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtDNIrepartidor = new javax.swing.JTextField();
        txtNomRepartidor = new javax.swing.JTextField();
        txtTelefonoRepartidor = new javax.swing.JTextField();
        txtDireccionRepartidor = new javax.swing.JTextField();
        btnRegistrarRepartidor = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtDistritoRepartidor = new javax.swing.JTextField();
        txtSueldoRepartidor = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnReporteProd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarRepartidor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepartidor = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel10.setLayout(null);

        jLabel23.setText("Distrito");
        jPanel10.add(jLabel23);
        jLabel23.setBounds(380, 50, 70, 20);

        jLabel24.setText("Nom y Apell");
        jPanel10.add(jLabel24);
        jLabel24.setBounds(20, 50, 80, 20);

        jLabel25.setText("Telefono");
        jPanel10.add(jLabel25);
        jLabel25.setBounds(20, 80, 70, 20);
        jPanel10.add(txtDNIrepartidor);
        txtDNIrepartidor.setBounds(110, 20, 90, 20);
        jPanel10.add(txtNomRepartidor);
        txtNomRepartidor.setBounds(110, 50, 250, 20);
        jPanel10.add(txtTelefonoRepartidor);
        txtTelefonoRepartidor.setBounds(110, 80, 90, 20);
        jPanel10.add(txtDireccionRepartidor);
        txtDireccionRepartidor.setBounds(450, 20, 250, 20);

        btnRegistrarRepartidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir (1).png"))); // NOI18N
        btnRegistrarRepartidor.setText("Registrar");
        btnRegistrarRepartidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRepartidorActionPerformed(evt);
            }
        });
        jPanel10.add(btnRegistrarRepartidor);
        btnRegistrarRepartidor.setBounds(390, 100, 120, 40);

        jLabel26.setText("Direccion");
        jPanel10.add(jLabel26);
        jLabel26.setBounds(380, 20, 70, 20);
        jPanel10.add(txtDistritoRepartidor);
        txtDistritoRepartidor.setBounds(450, 50, 160, 20);

        txtSueldoRepartidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoRepartidorActionPerformed(evt);
            }
        });
        jPanel10.add(txtSueldoRepartidor);
        txtSueldoRepartidor.setBounds(450, 80, 90, 20);

        jLabel29.setText("DATOS DEL VENDEDOR");
        jPanel10.add(jLabel29);
        jLabel29.setBounds(10, 0, 150, 14);

        jLabel30.setText("DNI");
        jPanel10.add(jLabel30);
        jLabel30.setBounds(20, 20, 80, 20);

        jLabel34.setText("Sueldo");
        jPanel10.add(jLabel34);
        jLabel34.setBounds(380, 80, 70, 20);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escoba.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel10.add(btnLimpiar);
        btnLimpiar.setBounds(550, 100, 110, 40);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tugurio.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel10.add(btnEliminar);
        btnEliminar.setBounds(390, 150, 110, 40);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit-symbol-1_icon-icons.com_70162.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel10.add(btnSalir);
        btnSalir.setBounds(540, 150, 110, 40);

        btnReporteProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder-documents01-1622837_121952.png"))); // NOI18N
        btnReporteProd.setText("Reporte");
        btnReporteProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteProdActionPerformed(evt);
            }
        });
        jPanel10.add(btnReporteProd);
        btnReporteProd.setBounds(80, 120, 160, 60);

        getContentPane().add(jPanel10);
        jPanel10.setBounds(20, 280, 710, 200);

        jPanel1.setLayout(null);

        jLabel1.setText("BUSCAR VENDEDOR");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 140, 14);

        jLabel2.setText("Buscar");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(168, 20, 70, 20);

        txtBuscarRepartidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarRepartidorKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscarRepartidor);
        txtBuscarRepartidor.setBounds(210, 20, 220, 20);

        tblRepartidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI repartidor", "Nombres y Apell", "Telefeno", "Direccion", "Distrito", "Sueldo"
            }
        ));
        tblRepartidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRepartidorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRepartidor);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 570, 120);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(130, 10, 40, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 10, 580, 200);

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel22.setText("Vendedores");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(300, 10, 160, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/10303manofficeworkerlightskintone_110631.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(650, 10, 70, 80);

        setSize(new java.awt.Dimension(771, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarRepartidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRepartidorActionPerformed
        Vendedor rep = new Vendedor();
        util u = new util();
        String proc = "";
        if (valida() == true) {
            if (this.btnRegistrarRepartidor.getText().equals("Registrar")) {
                proc = "insert";
            } else if (this.btnRegistrarRepartidor.getText().equals("Actualizar")) {
                proc = "update";
                this.btnRegistrarRepartidor.setText("Registrar");
            }

            rep.setDniVendedor(this.txtDNIrepartidor.getText());
            rep.setNombVendedor(this.txtNomRepartidor.getText());
            rep.setTelefono(Integer.parseInt(this.txtTelefonoRepartidor.getText()));
            rep.setDireccion(this.txtDireccionRepartidor.getText());
            rep.setDistrito(this.txtDistritoRepartidor.getText());
            rep.setSueldo(Double.parseDouble(this.txtSueldoRepartidor.getText()));
            this.repDao.procesaItem(rep, proc);
            limpia();
            llenaTblRepartidor(false, "");
        }
    }//GEN-LAST:event_btnRegistrarRepartidorActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpia();
        this.btnRegistrarRepartidor.setText("Registrar");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int i;
        if (this.tblRepartidor.getSelectedRow() >= 0) {
            i = this.tblRepartidor.getSelectedRow();
            dtmrep.removeRow(i);
        }
        Vendedor rep = new Vendedor();
        util u = new util();
        String proc = "";
        proc = "delete";
        rep.setDniVendedor(this.txtDNIrepartidor.getText());
        rep.setNombVendedor(this.txtNomRepartidor.getText());
        rep.setTelefono(Integer.parseInt(this.txtTelefonoRepartidor.getText()));
        rep.setDireccion(this.txtDireccionRepartidor.getText());
        rep.setDistrito(this.txtDistritoRepartidor.getText());
        rep.setSueldo(Double.parseDouble(this.txtSueldoRepartidor.getText()));
        this.repDao.procesaItem(rep, proc);
        limpia();
        llenaTblRepartidor(false, "");
        this.btnRegistrarRepartidor.setText("Registrar");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarRepartidorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarRepartidorKeyReleased
        if (this.txtBuscarRepartidor.getText().isEmpty()) {
            llenaTblRepartidor(false, "");
        } else {
            llenaTblRepartidor(true, this.txtBuscarRepartidor.getText());
        }
    }//GEN-LAST:event_txtBuscarRepartidorKeyReleased
    private boolean valida() {
        boolean sw = false;
        if (this.txtDNIrepartidor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe poner un DNI");
        } else {
            if (this.txtNomRepartidor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe poner una nombre");
            } else {
                if (this.txtDireccionRepartidor.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe registrar la dirección");
                } else {
                    if (this.txtDistritoRepartidor.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Debe registrar el distrito");
                    } else {
                        if (this.txtTelefonoRepartidor.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Debe registrar el telefono");
                        } else {
                            if (this.txtSueldoRepartidor.getText().isEmpty()) {
                                JOptionPane.showMessageDialog(this, "Debe registrar el sueldo");
                            } else {

                                try {
                                    Integer.parseInt(this.txtTelefonoRepartidor.getText());
                                    sw = true;
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(this, "Debe registrar un dato numerico para el telefono");
                                    this.txtTelefonoRepartidor.setText("");
                                    e.printStackTrace();
                                }
                             
                            }
                        }
                    }
                }
            }
        }
        return sw;
    }

    private void tblRepartidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRepartidorMouseClicked
        int fil;
        fil = this.tblRepartidor.getSelectedRow();
        //this.idP Integer.parseInt(dtm.getValueAt(fil, 0).toString());
        this.txtDNIrepartidor.setText(dtmrep.getValueAt(fil, 0).toString());
        this.txtNomRepartidor.setText(dtmrep.getValueAt(fil, 1).toString());
        this.txtTelefonoRepartidor.setText(dtmrep.getValueAt(fil, 2).toString());
        this.txtDireccionRepartidor.setText(dtmrep.getValueAt(fil, 3).toString());
        this.txtDistritoRepartidor.setText(dtmrep.getValueAt(fil, 4).toString());
        this.txtSueldoRepartidor.setText(dtmrep.getValueAt(fil, 5).toString());

        this.btnRegistrarRepartidor.setText("Actualizar");
    }//GEN-LAST:event_tblRepartidorMouseClicked

    private void txtSueldoRepartidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoRepartidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoRepartidorActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReporteProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteProdActionPerformed
        try{
            String r = "src/REPORTES/repVendedor.jasper";
            dbBean db = new dbBean();
            db.connectRep(r,null,false);
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(JRException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnReporteProdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarRepartidor;
    private javax.swing.JButton btnReporteProd;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRepartidor;
    private javax.swing.JTextField txtBuscarRepartidor;
    private javax.swing.JTextField txtDNIrepartidor;
    private javax.swing.JTextField txtDireccionRepartidor;
    private javax.swing.JTextField txtDistritoRepartidor;
    private javax.swing.JTextField txtNomRepartidor;
    private javax.swing.JTextField txtSueldoRepartidor;
    private javax.swing.JTextField txtTelefonoRepartidor;
    // End of variables declaration//GEN-END:variables
}
