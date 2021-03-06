
package IU;


import BEAN.Repartidor;
import DAO.RepartidorDAO;
import UTIL.dbBean;
import UTIL.util;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

public class frmRepartidor extends javax.swing.JFrame {

    RepartidorDAO repDao;
    DefaultTableModel dtmrep;
    String idRep;
    
    
    public frmRepartidor() {
        repDao=new RepartidorDAO();
        initComponents();
        
        dtmrep = (DefaultTableModel)this.tblRepartidor.getModel();
        llenaTblRepartidor(false, "");
    }

    private void llenaTblRepartidor(boolean sw, String cad){
        Vector<Repartidor> listProd = this.repDao.ListaItem(sw, cad);
        dtmrep.setRowCount(0);
        for(int i= 0;i<listProd.size();i++){
            Vector vRep = new Vector();
            vRep.addElement(listProd.get(i).getDniRepartidor());
            vRep.addElement(listProd.get(i).getNombRepartidor());
            vRep.addElement(listProd.get(i).getTelefono());
            vRep.addElement(listProd.get(i).getDireccion());
            vRep.addElement(listProd.get(i).getDistrito());
            vRep.addElement(listProd.get(i).getSueldo());
            dtmrep.addRow(vRep);
        }
    }

    private void limpia(){
        this.txtDNIrepartidor.setText("");
        this.txtNomRepartidor.setText("");
        this.txtTelefonoRepartidor.setText("");
        this.txtDireccionRepartidor.setText("");
        this.txtDistritoRepartidor.setText("");
        this.txtSueldoRepartidor.setText("");
    }
    private boolean validaGuardar(){
        boolean sw = false;
        if(this.txtDNIrepartidor.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Debe registrar su DNI de repartidor");
        }else{
           if(this.txtNomRepartidor.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe registrar su nombre y apellido del repartidor");
            }else{
               if(this.txtTelefonoRepartidor.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe registrar el telefono del repartidor");
                }else{  
                try{
                Double.parseDouble(this.txtTelefonoRepartidor.getText());
                sw = true;
                }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Debe registrar un datos numerico para el telefono del repartidor");
                this.txtTelefonoRepartidor.setText("");
                e.printStackTrace();
                }
                }
                if(this.txtDireccionRepartidor.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe registrar la direccion del repartidor");
                }else{
                   if(this.txtDistritoRepartidor.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Debe registrar el distrito del repartidor");
                    }else{
                       if(this.txtSueldoRepartidor.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Debe registrar el sueldo del repartidor");
                    }else{  
                    try{
                    Double.parseDouble(this.txtSueldoRepartidor.getText());
                    sw = true;
                    }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "Debe registrar un datos numerico para el sueldo del repartidor");
                    this.txtSueldoRepartidor.setText("");
                    e.printStackTrace();
                    }
                    }
                       
                   }
               }
           } 
        }
        return sw;
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
        btnRegistrarRepartidor.setText("Registrar repartidor");
        btnRegistrarRepartidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRepartidorActionPerformed(evt);
            }
        });
        jPanel10.add(btnRegistrarRepartidor);
        btnRegistrarRepartidor.setBounds(350, 150, 170, 40);

        jLabel26.setText("Direccion");
        jPanel10.add(jLabel26);
        jLabel26.setBounds(380, 20, 70, 20);
        jPanel10.add(txtDistritoRepartidor);
        txtDistritoRepartidor.setBounds(450, 50, 160, 20);
        jPanel10.add(txtSueldoRepartidor);
        txtSueldoRepartidor.setBounds(450, 80, 90, 20);

        jLabel29.setText("DATOS DEL REPARTIDOR");
        jPanel10.add(jLabel29);
        jLabel29.setBounds(10, 0, 150, 14);

        jLabel30.setText("DNI repartidor");
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
        btnLimpiar.setBounds(40, 120, 120, 40);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tugurio.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel10.add(btnEliminar);
        btnEliminar.setBounds(40, 160, 120, 40);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit-symbol-1_icon-icons.com_70162.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel10.add(btnSalir);
        btnSalir.setBounds(570, 160, 120, 40);

        btnReporteProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder-documents01-1622837_121952.png"))); // NOI18N
        btnReporteProd.setText("Reporte");
        btnReporteProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteProdActionPerformed(evt);
            }
        });
        jPanel10.add(btnReporteProd);
        btnReporteProd.setBounds(180, 120, 170, 70);

        getContentPane().add(jPanel10);
        jPanel10.setBounds(30, 280, 710, 220);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("BUSCAR REPARTIDOR");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 140, 14);

        jLabel2.setText("Buscar");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 20, 70, 20);

        txtBuscarRepartidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarRepartidorKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscarRepartidor);
        txtBuscarRepartidor.setBounds(240, 20, 220, 20);

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
        jScrollPane1.setBounds(40, 50, 530, 120);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(200, 10, 40, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 50, 580, 200);

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel22.setText("REPARTIDORES");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(300, 10, 160, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food_delivery_meal_order_icon_142268.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(660, 20, 70, 80);

        setSize(new java.awt.Dimension(771, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarRepartidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRepartidorActionPerformed
        Repartidor rep = new Repartidor();
        util u = new util();
        String proc= "";

        if(this.btnRegistrarRepartidor.getText().equals("Registrar repartidor")){
                proc = "insert";
        }else if(this.btnRegistrarRepartidor.getText().equals("Actualizar repartidor")){
                proc = "update";
        }
        
        if(validaGuardar() == true){
        rep.setDniRepartidor(this.txtDNIrepartidor.getText());
        rep.setNombRepartidor(this.txtNomRepartidor.getText());
        rep.setTelefono(Integer.parseInt(this.txtTelefonoRepartidor.getText()));
        rep.setDireccion(this.txtDireccionRepartidor.getText());
        rep.setDistrito(this.txtDistritoRepartidor.getText());
        rep.setSueldo(Double.parseDouble(this.txtSueldoRepartidor.getText()));
        this.repDao.procesaItem(rep, proc);
        limpia();
        }
        
        llenaTblRepartidor(false, "");
    }//GEN-LAST:event_btnRegistrarRepartidorActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpia();
        this.btnRegistrarRepartidor.setText("Registrar repartidor");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int i;
        if(this.tblRepartidor.getSelectedRow()>=0){
            i=this.tblRepartidor.getSelectedRow();
            dtmrep.removeRow(i);
        }
        Repartidor rep = new Repartidor();
        util u = new util();
        String proc= "";
        proc = "delete";
        rep.setDniRepartidor(this.txtDNIrepartidor.getText());
        rep.setNombRepartidor(this.txtNomRepartidor.getText());
        rep.setNombRepartidor(this.txtTelefonoRepartidor.getText());
        rep.setDireccion(this.txtDireccionRepartidor.getText());
        rep.setDistrito(this.txtDistritoRepartidor.getText());
        rep.setSueldo(Double.parseDouble(this.txtSueldoRepartidor.getText()));
        this.repDao.procesaItem(rep, proc);
        limpia();
        llenaTblRepartidor(false, "");
        this.btnRegistrarRepartidor.setText("Registrar producto");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarRepartidorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarRepartidorKeyReleased
        if(this.txtBuscarRepartidor.getText().isEmpty()){
            llenaTblRepartidor(false, "");
        }else{
            llenaTblRepartidor(true, this.txtBuscarRepartidor.getText());
        }
    }//GEN-LAST:event_txtBuscarRepartidorKeyReleased

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
        
        this.btnRegistrarRepartidor.setText("Actualizar repartidor");
    }//GEN-LAST:event_tblRepartidorMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReporteProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteProdActionPerformed
        try{
            String r = "src/REPORTES/repRepartidor.jasper";
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
                new frmRepartidor().setVisible(true);
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
