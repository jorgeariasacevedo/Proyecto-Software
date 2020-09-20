
package IU;

import BEAN.Producto;
import DAO.ProductoDAO;
import UTIL.dbBean;
import UTIL.util;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class frmProductoRopa extends javax.swing.JFrame {

    ProductoDAO proDao;
    DefaultTableModel dtmpro;
    String idPro;
    private Connection dbCon;
    public frmProductoRopa() {
        
        proDao=new ProductoDAO();
        initComponents();
        
        dtmpro = (DefaultTableModel)this.tblProducto.getModel();
        llenaTblProducto(false, "");
    }
    
    private void llenaTblProducto(boolean sw, String cad){
        Vector<Producto> listProd = this.proDao.ListaItem(sw, cad);
        dtmpro.setRowCount(0);
        for(int i= 0;i<listProd.size();i++){
            Vector vProd = new Vector();
            vProd.addElement(listProd.get(i).getIdProducto());
            vProd.addElement(listProd.get(i).getModelo());
            vProd.addElement(listProd.get(i).getTipo());
            vProd.addElement(listProd.get(i).getDetalle());
            vProd.addElement(listProd.get(i).getColor());
            vProd.addElement(listProd.get(i).getTalla());
            vProd.addElement(listProd.get(i).getPreciounitario());
            vProd.addElement(listProd.get(i).getStock());
            dtmpro.addRow(vProd);
        }
    }

    private void limpia(){
        this.txtIdProducto.setText("");
        this.txtModelo.setText("");
        this.txtTipoRopa.setText("");
        this.txtDetalleRopa.setText("");
        this.txtColorRopa.setText("");
        this.txtTallaRopa.setText("");
        this.txtPrecioProducto.setText("");
        this.txtStock.setText("");
    }
    
    private boolean validaGuardar(){
        boolean sw = false;
        if(this.txtIdProducto.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Debe registrar su producto");
        }else{
            if(this.txtPrecioProducto.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe registrar el precio de producto");
            }else{
            try{
            Double.parseDouble(this.txtPrecioProducto.getText());
            sw = true;
            }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe registrar un datos numerico para el precio de producto");
            this.txtPrecioProducto.setText("");
            e.printStackTrace();
            }
            }
        }
        return sw;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtTipoRopa = new javax.swing.JTextField();
        txtDetalleRopa = new javax.swing.JTextField();
        btnRegistrarProducto = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtColorRopa = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtTallaRopa = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnReporteProd = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel8.setLayout(null);

        jLabel6.setText("Color");
        jPanel8.add(jLabel6);
        jLabel6.setBounds(340, 20, 70, 20);

        jLabel15.setText("Modelo");
        jPanel8.add(jLabel15);
        jLabel15.setBounds(20, 50, 70, 20);

        jLabel16.setText("Tipo");
        jPanel8.add(jLabel16);
        jLabel16.setBounds(20, 80, 70, 20);
        jPanel8.add(txtIdProducto);
        txtIdProducto.setBounds(90, 20, 90, 24);
        jPanel8.add(txtModelo);
        txtModelo.setBounds(90, 50, 130, 24);
        jPanel8.add(txtTipoRopa);
        txtTipoRopa.setBounds(90, 80, 130, 24);
        jPanel8.add(txtDetalleRopa);
        txtDetalleRopa.setBounds(90, 110, 180, 24);

        btnRegistrarProducto.setText("Registrar producto");
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });
        jPanel8.add(btnRegistrarProducto);
        btnRegistrarProducto.setBounds(210, 140, 160, 40);

        jLabel19.setText("Detalle");
        jPanel8.add(jLabel19);
        jLabel19.setBounds(20, 110, 70, 20);
        jPanel8.add(txtColorRopa);
        txtColorRopa.setBounds(410, 20, 90, 24);

        jLabel20.setText("Talla");
        jPanel8.add(jLabel20);
        jLabel20.setBounds(340, 50, 70, 20);

        jLabel21.setText("Stock ");
        jPanel8.add(jLabel21);
        jLabel21.setBounds(340, 110, 70, 20);
        jPanel8.add(txtTallaRopa);
        txtTallaRopa.setBounds(410, 50, 90, 24);

        jLabel17.setText("IdProducto");
        jPanel8.add(jLabel17);
        jLabel17.setBounds(20, 20, 70, 20);
        jPanel8.add(txtStock);
        txtStock.setBounds(410, 110, 90, 24);
        jPanel8.add(txtPrecioProducto);
        txtPrecioProducto.setBounds(410, 80, 90, 24);

        jLabel23.setText("Precio");
        jPanel8.add(jLabel23);
        jLabel23.setBounds(340, 80, 70, 20);

        jLabel24.setText("DATOS DEL PRODUCTO");
        jPanel8.add(jLabel24);
        jLabel24.setBounds(10, 0, 150, 16);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel8.add(btnLimpiar);
        btnLimpiar.setBounds(10, 140, 80, 40);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel8.add(btnEliminar);
        btnEliminar.setBounds(10, 190, 80, 40);

        btnReporteProd.setText("Reporte");
        btnReporteProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteProdActionPerformed(evt);
            }
        });
        jPanel8.add(btnReporteProd);
        btnReporteProd.setBounds(240, 190, 90, 30);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel8.add(btnSalir);
        btnSalir.setBounds(440, 190, 80, 40);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(70, 240, 540, 240);

        jPanel9.setLayout(null);

        jLabel18.setText("BUSQUEDA DEL PRODUCTO");
        jPanel9.add(jLabel18);
        jLabel18.setBounds(0, 0, 180, 16);

        jLabel14.setText("Buscar producto");
        jPanel9.add(jLabel14);
        jLabel14.setBounds(110, 20, 110, 20);

        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyReleased(evt);
            }
        });
        jPanel9.add(txtBuscarProducto);
        txtBuscarProducto.setBounds(220, 20, 160, 24);

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_Producto", "modelo", "tipo", "detalle", "color", "talla", "preciounitario", "stock"
            }
        ));
        tblProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducto);

        jPanel9.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 500, 110);

        getContentPane().add(jPanel9);
        jPanel9.setBounds(70, 50, 540, 170);

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel22.setText("MANTENIMIENTO DE PRODUCTOS");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(180, 10, 360, 30);

        setSize(new java.awt.Dimension(703, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
        Producto pro = new Producto();
        util u = new util();
        String proc= "";

        if(this.btnRegistrarProducto.getText().equals("Registrar producto")){
                proc = "insert";
        }else if(this.btnRegistrarProducto.getText().equals("Actualizar producto")){
                proc = "update";
        }
        if(validaGuardar() == true){
        pro.setIdProducto(this.txtIdProducto.getText());
        pro.setModelo(this.txtModelo.getText());
        pro.setTipo(this.txtTipoRopa.getText());
        pro.setDetalle(this.txtDetalleRopa.getText());
        pro.setColor(this.txtColorRopa.getText());
        pro.setTalla(this.txtTallaRopa.getText());
        pro.setPreciounitario(Double.parseDouble(this.txtPrecioProducto.getText()));
        pro.setStock(Integer.parseInt(this.txtStock.getText()));
        this.proDao.procesaItem(pro, proc);
        limpia();
        }
        
        
        llenaTblProducto(false, "");
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    private void txtBuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyReleased
        if(this.txtBuscarProducto.getText().isEmpty()){
            llenaTblProducto(false, "");
        }else{
            llenaTblProducto(true, this.txtBuscarProducto.getText());
        }
    }//GEN-LAST:event_txtBuscarProductoKeyReleased

    private void tblProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductoMouseClicked
        int fil;
        fil = this.tblProducto.getSelectedRow();
        //this.idP Integer.parseInt(dtm.getValueAt(fil, 0).toString());
        this.txtIdProducto.setText(dtmpro.getValueAt(fil, 0).toString());
        this.txtModelo.setText(dtmpro.getValueAt(fil, 1).toString());
        this.txtTipoRopa.setText(dtmpro.getValueAt(fil, 2).toString());
        this.txtDetalleRopa.setText(dtmpro.getValueAt(fil, 3).toString());
        this.txtColorRopa.setText(dtmpro.getValueAt(fil, 4).toString());
        this.txtTallaRopa.setText(dtmpro.getValueAt(fil, 5).toString());
        this.txtPrecioProducto.setText(dtmpro.getValueAt(fil, 6).toString());
        this.txtStock.setText(dtmpro.getValueAt(fil, 7).toString());
        
        this.btnRegistrarProducto.setText("Actualizar producto");
        //this.jPanel8.setSelectedIndex(1);
    }//GEN-LAST:event_tblProductoMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpia();
        this.btnRegistrarProducto.setText("Registrar producto");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        /*int i;
        if(this.tblProducto.getSelectedRow()>=0){
            i=this.tblProducto.getSelectedRow();
            dtmpro.removeRow(i);
        }*/
        Producto pro = new Producto();
        util u = new util();
        String proc= "";
        proc = "delete";
        pro.setIdProducto(this.txtIdProducto.getText());
        pro.setModelo(this.txtModelo.getText());
        pro.setTipo(this.txtTipoRopa.getText());
        pro.setDetalle(this.txtDetalleRopa.getText());
        pro.setColor(this.txtColorRopa.getText());
        pro.setTalla(this.txtTallaRopa.getText());
        pro.setPreciounitario(Double.parseDouble(this.txtPrecioProducto.getText()));
        pro.setStock(Integer.parseInt(this.txtStock.getText()));
        this.proDao.procesaItem(pro, proc);
        limpia();
        llenaTblProducto(false, "");
        this.btnRegistrarProducto.setText("Registrar producto");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnReporteProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteProdActionPerformed
      try{
             String r = "src/REPORTES/repProducto.jasper";
            dbBean db = new dbBean();
            db.connectRep(r,null,false);
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(JRException ex){
                ex.printStackTrace();
        }
    }//GEN-LAST:event_btnReporteProdActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductoRopa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JButton btnReporteProd;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtColorRopa;
    private javax.swing.JTextField txtDetalleRopa;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTallaRopa;
    private javax.swing.JTextField txtTipoRopa;
    // End of variables declaration//GEN-END:variables
}
