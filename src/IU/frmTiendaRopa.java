
package IU;

import BEAN.Cab_venta;
import BEAN.Cliente;
import BEAN.Delivery;
import BEAN.Detalle_Venta;
import BEAN.Producto;
import BEAN.Repartidor;
import BEAN.Tipo_pago;
import BEAN.Vendedor;
import DAO.Cab_ventaDAO;
import DAO.ClienteDAO;
import DAO.DeliveryDAO;
import DAO.Detalle_VentaDAO;
import DAO.ProductoDAO;
import DAO.RepartidorDAO;
import DAO.Tipo_pagoDAO;
import DAO.VendedorDAO;
import UTIL.dbBean;
import UTIL.util;
import java.sql.Connection;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class frmTiendaRopa extends javax.swing.JFrame {
private Connection dbCon;
    ClienteDAO cliDao;
    ProductoDAO proDao;
    VendedorDAO venDao;
    RepartidorDAO repDao;
    DeliveryDAO delDao;
    Tipo_pagoDAO tipDao;
    Cab_ventaDAO cabDao;
    Detalle_VentaDAO detDao;
    
    int idCliente;
    int idVenta;
    Cliente clie;
    
    DefaultTableModel dtmpro;
    
    public frmTiendaRopa() {
        cliDao = new ClienteDAO();
        proDao=new ProductoDAO();
        venDao=new VendedorDAO();
        repDao=new RepartidorDAO();
        delDao=new DeliveryDAO();
        tipDao=new Tipo_pagoDAO();
        cabDao=new Cab_ventaDAO();
        detDao=new Detalle_VentaDAO();
        initComponents();
        clie=new Cliente();
        dtmpro = (DefaultTableModel)this.tblMostrarProducto.getModel(); 
        //llenaTblProducto(false, "");
    }
    
    private void llenaTblProducto(boolean sw, String cad){
        Vector<Producto> listProd = this.proDao.ListaItem(sw, cad);
        dtmpro.setRowCount(0);
        for(int i= 0;i<listProd.size();i++){
            Vector vProd = new Vector();
            vProd.add(0, listProd.get(i).getIdProducto());
            vProd.add(1, listProd.get(i).getModelo());
            vProd.add(2, listProd.get(i).getTipo());
            vProd.add(3, listProd.get(i).getDetalle());
            vProd.add(4, listProd.get(i).getColor());
            vProd.add(5, listProd.get(i).getTalla());
            vProd.add(6, listProd.get(i).getPreciounitario());
            dtmpro.addRow(vProd);
        }
    }
    private boolean validaAgregar(){
        boolean sw = false;
        if(this.txtCodigoProducto.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Debe registrar su producto");
        }else{
            if(this.txtCantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe registrar la cantidad de productos");
            }else{
            try{
            Integer.parseInt(this.txtCantidad.getText());
            sw = true;
            }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe registrar un datos numerico para la cantidad de productos");
            this.txtCantidad.setText("");
            e.printStackTrace();
            }
            }
        }
        return sw;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdniCli = new javax.swing.JTextField();
        txtnombreCli = new javax.swing.JTextField();
        txtdireccionCli = new javax.swing.JTextField();
        txttelefonoCli = new javax.swing.JTextField();
        txtcorreoCli = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnSeleccionarCliente = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        txtcodigo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnSeleccionarRepartidor = new javax.swing.JButton();
        txtDNIVendedor = new javax.swing.JTextField();
        btnSeleccionarDelivery = new javax.swing.JButton();
        btnVendedor = new javax.swing.JButton();
        btnPago = new javax.swing.JButton();
        txtid_pago = new javax.swing.JTextField();
        txtid_delivery = new javax.swing.JTextField();
        txtCodigoRepartidor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnGuardarPedido = new javax.swing.JButton();
        btnSeleccionarProducto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMostrarProducto = new javax.swing.JTable();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        txtDescripProducto = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        txtcodf = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel3.setLayout(null);

        jLabel1.setText("Correo");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 140, 70, 20);

        jLabel2.setText("DNI Cliente");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 20, 70, 20);

        jLabel3.setText("Nombres");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 50, 70, 20);

        jLabel4.setText("Direccion");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 80, 70, 20);

        jLabel5.setText("Telefono");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 110, 70, 20);
        jPanel3.add(txtdniCli);
        txtdniCli.setBounds(90, 20, 90, 24);
        jPanel3.add(txtnombreCli);
        txtnombreCli.setBounds(90, 50, 180, 24);
        jPanel3.add(txtdireccionCli);
        txtdireccionCli.setBounds(90, 80, 220, 24);
        jPanel3.add(txttelefonoCli);
        txttelefonoCli.setBounds(90, 110, 90, 24);
        jPanel3.add(txtcorreoCli);
        txtcorreoCli.setBounds(90, 140, 130, 24);

        jLabel8.setText("DATOS DEL CLIENTE");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 0, 130, 16);

        btnSeleccionarCliente.setText("Seleccionar");
        btnSeleccionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnSeleccionarCliente);
        btnSeleccionarCliente.setBounds(240, 10, 110, 40);

        btnRegistrarCliente.setText("Nuevo");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarCliente);
        btnRegistrarCliente.setBounds(240, 130, 110, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 40, 370, 180);
        jPanel3.getAccessibleContext().setAccessibleName("CLIENTE");
        jPanel3.getAccessibleContext().setAccessibleDescription("");

        txtcodigo.setLayout(null);

        jLabel9.setText("DNI repartidor");
        txtcodigo.add(jLabel9);
        jLabel9.setBounds(10, 150, 120, 20);

        btnSeleccionarRepartidor.setText("Repartidor");
        btnSeleccionarRepartidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarRepartidorActionPerformed(evt);
            }
        });
        txtcodigo.add(btnSeleccionarRepartidor);
        btnSeleccionarRepartidor.setBounds(210, 140, 150, 40);

        txtDNIVendedor.setEditable(false);
        txtcodigo.add(txtDNIVendedor);
        txtDNIVendedor.setBounds(120, 30, 80, 24);

        btnSeleccionarDelivery.setText("Seleccionar delivery");
        btnSeleccionarDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarDeliveryActionPerformed(evt);
            }
        });
        txtcodigo.add(btnSeleccionarDelivery);
        btnSeleccionarDelivery.setBounds(210, 100, 150, 40);

        btnVendedor.setText("Vendedor");
        btnVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendedorActionPerformed(evt);
            }
        });
        txtcodigo.add(btnVendedor);
        btnVendedor.setBounds(210, 20, 150, 40);

        btnPago.setText("Seleccionar pago");
        btnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoActionPerformed(evt);
            }
        });
        txtcodigo.add(btnPago);
        btnPago.setBounds(210, 60, 150, 40);
        txtcodigo.add(txtid_pago);
        txtid_pago.setBounds(120, 70, 80, 24);
        txtcodigo.add(txtid_delivery);
        txtid_delivery.setBounds(120, 110, 80, 24);

        txtCodigoRepartidor.setEditable(false);
        txtcodigo.add(txtCodigoRepartidor);
        txtCodigoRepartidor.setBounds(120, 150, 80, 24);

        jLabel11.setText("DNI vendedor");
        txtcodigo.add(jLabel11);
        jLabel11.setBounds(10, 30, 120, 20);

        jLabel12.setText("Codigo del pago");
        txtcodigo.add(jLabel12);
        jLabel12.setBounds(10, 70, 120, 20);

        jLabel13.setText("Codigo del delivery");
        txtcodigo.add(jLabel13);
        jLabel13.setBounds(10, 110, 120, 20);

        jLabel69.setText("DATOS DEL PEDIDO");
        txtcodigo.add(jLabel69);
        jLabel69.setBounds(10, 0, 190, 16);

        jPanel1.add(txtcodigo);
        txtcodigo.setBounds(20, 240, 370, 230);

        jPanel17.setLayout(null);

        jLabel7.setText("PRODUCTOS PEDIDOS");
        jPanel17.add(jLabel7);
        jLabel7.setBounds(10, 0, 190, 16);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("MONTO DELIVERY");
        jPanel17.add(jLabel10);
        jLabel10.setBounds(-10, 400, 120, 20);

        btnGuardarPedido.setText("Guardar pedido");
        btnGuardarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPedidoActionPerformed(evt);
            }
        });
        jPanel17.add(btnGuardarPedido);
        btnGuardarPedido.setBounds(200, 370, 117, 40);

        btnSeleccionarProducto.setText("Seleccionar");
        btnSeleccionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarProductoActionPerformed(evt);
            }
        });
        jPanel17.add(btnSeleccionarProducto);
        btnSeleccionarProducto.setBounds(180, 10, 110, 40);

        tblMostrarProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "Descripcion", "Color", "Precio", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(tblMostrarProducto);

        jPanel17.add(jScrollPane3);
        jScrollPane3.setBounds(10, 180, 310, 150);
        jPanel17.add(txtCodigoProducto);
        txtCodigoProducto.setBounds(90, 20, 70, 24);

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel70.setText("Codigo");
        jPanel17.add(jLabel70);
        jLabel70.setBounds(20, 20, 60, 20);
        jPanel17.add(txtPrecio);
        txtPrecio.setBounds(90, 110, 50, 24);

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel71.setText("Color");
        jPanel17.add(jLabel71);
        jLabel71.setBounds(20, 80, 60, 20);
        jPanel17.add(txtCantidad);
        txtCantidad.setBounds(90, 140, 50, 24);

        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel72.setText("Descripcion");
        jPanel17.add(jLabel72);
        jLabel72.setBounds(10, 50, 70, 20);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel17.add(btnAgregar);
        btnAgregar.setBounds(170, 130, 110, 40);

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("MONTO TOTAL");
        jPanel17.add(jLabel54);
        jLabel54.setBounds(10, 430, 100, 20);
        jPanel17.add(jTextField53);
        jTextField53.setBounds(120, 340, 50, 24);
        jPanel17.add(jTextField54);
        jTextField54.setBounds(120, 430, 50, 24);
        jPanel17.add(jTextField55);
        jTextField55.setBounds(120, 400, 50, 24);

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("Monto");
        jPanel17.add(jLabel65);
        jLabel65.setBounds(70, 340, 40, 20);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fecha");
        jPanel17.add(jLabel6);
        jLabel6.setBounds(50, 460, 60, 20);
        jPanel17.add(jTextField1);
        jTextField1.setBounds(120, 460, 50, 24);

        jButton1.setText("Generar Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton1);
        jButton1.setBounds(200, 420, 110, 40);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("IGV");
        jPanel17.add(jLabel14);
        jLabel14.setBounds(80, 370, 30, 20);
        jPanel17.add(jTextField2);
        jTextField2.setBounds(120, 370, 50, 24);
        jPanel17.add(txtDescripProducto);
        txtDescripProducto.setBounds(90, 50, 170, 24);

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel73.setText("Cantidad");
        jPanel17.add(jLabel73);
        jLabel73.setBounds(20, 140, 60, 20);
        jPanel17.add(txtColor);
        txtColor.setBounds(90, 80, 170, 24);

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel74.setText("Precio");
        jPanel17.add(jLabel74);
        jLabel74.setBounds(20, 110, 60, 20);

        jPanel1.add(jPanel17);
        jPanel17.setBounds(410, 10, 330, 490);

        txtcodf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodfActionPerformed(evt);
            }
        });
        jPanel1.add(txtcodf);
        txtcodf.setBounds(230, 10, 110, 24);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número de boleta:", "Número de Factura:" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(20, 10, 190, 20);

        jTabbedPane1.addTab("Recepcion del pedido", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 30, 750, 540);

        setSize(new java.awt.Dimension(790, 660));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
            frmCliente x  = new frmCliente();
            x.setVisible(true);
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoActionPerformed
        Tipo_pago Tipo =new Tipo_pago();
        SelTipo_pago dialog = new SelTipo_pago(new javax.swing.JFrame(),true);
        dialog.setVisible(true);
        Tipo= dialog.getTipo_pago();
        
        if (Tipo == null){
            this.txtid_pago.setText("");
           
        }else{
            this.txtid_pago.setText(String.valueOf(Tipo.getId_pago()));
            
        }
    }//GEN-LAST:event_btnPagoActionPerformed

    private void btnSeleccionarDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarDeliveryActionPerformed
        Delivery Deli =new Delivery();
        SelDelivery dialog = new SelDelivery(new javax.swing.JFrame(),true);
        dialog.setVisible(true);
        Deli= dialog.getDeli();
        
        if (Deli == null){
            this.txtid_delivery.setText("");
        }else{
            this.txtid_delivery.setText(String.valueOf(Deli.getId_delivery()));
        }
    }//GEN-LAST:event_btnSeleccionarDeliveryActionPerformed

    private void btnSeleccionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarProductoActionPerformed
        Producto pro =new Producto();
        SelProducto dialog = new SelProducto(new javax.swing.JFrame(),true);
        dialog.setVisible(true);
        pro= dialog.getDeli();
        if (pro == null){
            this.txtCodigoProducto.setText("");
        }else{
            this.txtCodigoProducto.setText(String.valueOf(pro.getIdProducto()));
            this.txtDescripProducto.setText(String.valueOf(pro.getDetalle()));
            this.txtColor.setText(String.valueOf(pro.getColor()));
            this.txtPrecio.setText(String.valueOf(pro.getPreciounitario()));
        }
    }//GEN-LAST:event_btnSeleccionarProductoActionPerformed

    private void btnSeleccionarRepartidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarRepartidorActionPerformed
        Repartidor rep =new Repartidor();
        SelRepartidor dialog = new SelRepartidor(new javax.swing.JFrame(),true);
        dialog.setVisible(true);
        rep= dialog.getDeli();
        
        if (rep == null){
            this.txtCodigoRepartidor.setText("");
        }else{
            this.txtCodigoRepartidor.setText(String.valueOf(rep.getDniRepartidor()));
        }
    }//GEN-LAST:event_btnSeleccionarRepartidorActionPerformed

    private void btnVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendedorActionPerformed
        Vendedor ven = new Vendedor();
        dlgVendedor dialog = new dlgVendedor(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        ven = dialog.getVend();

        if(ven == null){
            this.txtDNIVendedor.setText("");
        }else{
            this.txtDNIVendedor.setText(String.valueOf(ven.getDniVendedor()));
        }
  
    }//GEN-LAST:event_btnVendedorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String r = "src/REPORTES/repFactura.jasper";
          
            dbBean db = new dbBean();
           HashMap map= new HashMap();
           
            map.put("parameter1",this.txtcodf.getText() );
            map.put("nombre",this.txtnombreCli.getText() );
            map.put("direccion",this.txtdireccionCli.getText() );
            map.put("telefono",this.txttelefonoCli.getText() );
            map.put("correo",this.txtcorreoCli.getText() );
            db.connectRep(r,map,true);
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(JRException ex){
                ex.printStackTrace();
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcodfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodfActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnSeleccionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeleccionarClienteActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Vector vec= new Vector();
        if(validaAgregar() == true){
        vec.addElement(this.txtCodigoProducto.getText());
        vec.addElement(this.txtDescripProducto.getText());
        vec.addElement(this.txtColor.getText());
        vec.addElement(this.txtPrecio.getText());
        vec.addElement(this.txtCantidad.getText());
        
        dtmpro.addRow(vec);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPedidoActionPerformed
        Cab_venta cv=new Cab_venta();
        //det_venta dv=new det_venta();
        util u=new util();
        int cant, idDel, idPag;
        String fech, idCli, idProd, idVen, idRep;
        double prec;
        
        //if(this.btnGrabar.getText().equals("Grabar")){

        //if(validaGrabar() == true){
        idVenta=u.idNext("Cab_venta","idVenta");
        idCli=this.txtdniCli.getText();
        idDel=Integer.parseInt(this.txtid_delivery.getText());
        idVen=this.txtDNIVendedor.getText();
        idRep=this.txtCodigoRepartidor.getText();
        idPag=Integer.parseInt(this.txtid_pago.getText());
        fech=u.obtenerFecha();
        
        cv.setIdVenta(idVenta);
        cv.setDniClif(idCli);
        cv.setFechaVenta(fech);
        cv.setEstado("No entregado");
        cv.setIdDeliveryf(idDel);
        cv.setDniVendedor(idVen);
        cv.setDniRepartidorf(idRep);
        cv.setIdPagof(idPag);
        
        this.cabDao.procesaItem(cv, "insert");
        
        for(int i=0;i<this.tblMostrarProducto.getRowCount();i++){
            Detalle_Venta dv=new Detalle_Venta();
            
            //idProd=dtmpro.getValueAt(i, 0).toString();
            idProd=dtmpro.getValueAt(i, 0).toString();
            prec=Double.parseDouble(dtmpro.getValueAt(i, 3).toString());
            cant=Integer.parseInt(dtmpro.getValueAt(i, 4).toString());
            
            dv.setIdVentaf(idVenta);
            dv.setCodProducto(idProd);
            dv.setPrecio(prec);
            dv.setCantidad(cant);
            
            this.detDao.procesaItem(dv, "insert");
        }
        
        
        
    }//GEN-LAST:event_btnGuardarPedidoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTiendaRopa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGuardarPedido;
    private javax.swing.JButton btnPago;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnSeleccionarCliente;
    private javax.swing.JButton btnSeleccionarDelivery;
    private javax.swing.JButton btnSeleccionarProducto;
    private javax.swing.JButton btnSeleccionarRepartidor;
    private javax.swing.JButton btnVendedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTable tblMostrarProducto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtCodigoRepartidor;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDNIVendedor;
    private javax.swing.JTextField txtDescripProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtcodf;
    private javax.swing.JPanel txtcodigo;
    private javax.swing.JTextField txtcorreoCli;
    private javax.swing.JTextField txtdireccionCli;
    private javax.swing.JTextField txtdniCli;
    private javax.swing.JTextField txtid_delivery;
    private javax.swing.JTextField txtid_pago;
    private javax.swing.JTextField txtnombreCli;
    private javax.swing.JTextField txttelefonoCli;
    // End of variables declaration//GEN-END:variables

}
