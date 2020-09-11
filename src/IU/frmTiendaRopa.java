
package IU;

import BEAN.Cliente;
import BEAN.Delivery;
import BEAN.Producto;
import BEAN.Repartidor;
import BEAN.Tipo_pago;
import BEAN.Vendedor;
import DAO.ClienteDAO;
import DAO.DeliveryDAO;
import DAO.ProductoDAO;
import DAO.RepartidorDAO;
import DAO.Tipo_pagoDAO;
import DAO.VendedorDAO;
import UTIL.util;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class frmTiendaRopa extends javax.swing.JFrame {

    ClienteDAO cliDao;
    ProductoDAO proDao;
    VendedorDAO venDao;
    RepartidorDAO repDao;
    DeliveryDAO delDao;
    Tipo_pagoDAO tipDao;
    
    DefaultTableModel dtmpro;
    
    public frmTiendaRopa() {
        cliDao = new ClienteDAO();
        proDao=new ProductoDAO();
        venDao=new VendedorDAO();
        repDao=new RepartidorDAO();
        delDao=new DeliveryDAO();
        tipDao=new Tipo_pagoDAO();
        initComponents();
        
        dtmpro = (DefaultTableModel)this.tblproducto.getModel(); 
        llenaTblProducto(false, "");
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
        jButton2 = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtid_vendedor = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnpago = new javax.swing.JButton();
        txtid_pago = new javax.swing.JTextField();
        txtid_delivery = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel17 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblproducto = new javax.swing.JTable();
        jTextField57 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jTextField58 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jTextField59 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();

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
        txtdniCli.setBounds(90, 20, 90, 20);
        jPanel3.add(txtnombreCli);
        txtnombreCli.setBounds(90, 50, 180, 20);
        jPanel3.add(txtdireccionCli);
        txtdireccionCli.setBounds(90, 80, 280, 20);
        jPanel3.add(txttelefonoCli);
        txttelefonoCli.setBounds(90, 110, 90, 20);
        jPanel3.add(txtcorreoCli);
        txtcorreoCli.setBounds(90, 140, 160, 20);

        jLabel8.setText("DATOS DEL CLIENTE");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 0, 130, 14);

        jButton2.setText("Seleccionar");
        jPanel3.add(jButton2);
        jButton2.setBounds(300, 10, 90, 30);

        btnRegistrarCliente.setText("Nuevo");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarCliente);
        btnRegistrarCliente.setBounds(310, 140, 80, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 10, 400, 180);
        jPanel3.getAccessibleContext().setAccessibleName("CLIENTE");
        jPanel3.getAccessibleContext().setAccessibleDescription("");

        jPanel4.setLayout(null);

        jLabel9.setText("Codigo del repartidor");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(20, 150, 120, 20);

        jButton1.setText("Repartidor");
        jPanel4.add(jButton1);
        jButton1.setBounds(240, 140, 150, 40);
        jPanel4.add(txtid_vendedor);
        txtid_vendedor.setBounds(150, 30, 80, 20);

        jButton4.setText("Seleccionar delivery");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(240, 100, 150, 40);

        jButton5.setText("Vendedor");
        jPanel4.add(jButton5);
        jButton5.setBounds(240, 10, 150, 40);

        btnpago.setText("Seleccionar pago");
        btnpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagoActionPerformed(evt);
            }
        });
        jPanel4.add(btnpago);
        btnpago.setBounds(240, 60, 150, 40);
        jPanel4.add(txtid_pago);
        txtid_pago.setBounds(150, 70, 80, 20);
        jPanel4.add(txtid_delivery);
        txtid_delivery.setBounds(150, 110, 80, 20);
        jPanel4.add(jTextField10);
        jTextField10.setBounds(150, 150, 80, 20);

        jLabel11.setText("Codigo del vendedor");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(20, 30, 120, 20);

        jLabel12.setText("Codigo del pago");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(20, 70, 120, 20);

        jLabel13.setText("Codigo del delivery");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(20, 110, 120, 20);

        jLabel69.setText("DATOS DEL PEDIDO");
        jPanel4.add(jLabel69);
        jLabel69.setBounds(10, 0, 190, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox1);
        jComboBox1.setBounds(150, 30, 56, 20);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 200, 400, 190);

        jPanel17.setLayout(null);

        jLabel7.setText("PRODUCTOS PEDIDOS");
        jPanel17.add(jLabel7);
        jLabel7.setBounds(10, 0, 190, 14);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("MONTO DELIVERY");
        jPanel17.add(jLabel10);
        jLabel10.setBounds(-20, 380, 120, 20);

        jButton3.setText("Guardar pedido");
        jPanel17.add(jButton3);
        jButton3.setBounds(160, 370, 110, 40);

        jButton8.setText("Seleccionar");
        jPanel17.add(jButton8);
        jButton8.setBounds(160, 20, 110, 40);

        tblproducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "Precio", "Cantidad", "Monto"
            }
        ));
        jScrollPane3.setViewportView(tblproducto);

        jPanel17.add(jScrollPane3);
        jScrollPane3.setBounds(20, 210, 240, 120);
        jPanel17.add(jTextField57);
        jTextField57.setBounds(80, 20, 70, 20);

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel70.setText("Codigo");
        jPanel17.add(jLabel70);
        jLabel70.setBounds(10, 20, 60, 20);
        jPanel17.add(jTextField58);
        jTextField58.setBounds(80, 50, 50, 20);

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel71.setText("Precio");
        jPanel17.add(jLabel71);
        jLabel71.setBounds(10, 50, 60, 20);
        jPanel17.add(jTextField59);
        jTextField59.setBounds(80, 80, 50, 20);

        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel72.setText("Cantidad");
        jPanel17.add(jLabel72);
        jLabel72.setBounds(10, 80, 60, 20);

        jButton17.setText("Agregar");
        jPanel17.add(jButton17);
        jButton17.setBounds(100, 150, 110, 40);

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("MONTO TOTAL");
        jPanel17.add(jLabel54);
        jLabel54.setBounds(-20, 410, 120, 20);
        jPanel17.add(jTextField53);
        jTextField53.setBounds(100, 350, 50, 20);
        jPanel17.add(jTextField54);
        jTextField54.setBounds(100, 410, 50, 20);
        jPanel17.add(jTextField55);
        jTextField55.setBounds(100, 380, 50, 20);

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("Monto");
        jPanel17.add(jLabel65);
        jLabel65.setBounds(60, 350, 40, 20);

        jPanel1.add(jPanel17);
        jPanel17.setBounds(430, 0, 280, 450);

        jTabbedPane1.addTab("Recepcion del pedido", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(40, 20, 750, 500);

        setSize(new java.awt.Dimension(790, 633));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        Cliente cli = new Cliente();
        util u = new util();
        String proc= "";

        proc = "insert";
        cli.setDniCli(this.txtdniCli.getText());
        cli.setNombreCli(this.txtnombreCli.getText());
        cli.setDireccionCli(this.txtdireccionCli.getText());
        cli.setTelefonoCli(Integer.parseInt(this.txttelefonoCli.getText()));
        cli.setCorreoCli(this.txtcorreoCli.getText());
        this.cliDao.procesaItem(cli, proc);
        //limpiaG();
        this.llenaTblProducto(false, "");
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagoActionPerformed
        Tipo_pago Tipo =new Tipo_pago();
        SelTipo_pago dialog = new SelTipo_pago(new javax.swing.JFrame(),true);
        dialog.setVisible(true);
        Tipo= dialog.getTipo_pago();
        
        if (Tipo == null){
            this.txtid_pago.setText("");
           
        }else{
            this.txtid_pago.setText(String.valueOf(Tipo.getId_pago()));
            
        }
    }//GEN-LAST:event_btnpagoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Delivery Deli =new Delivery();
        SelDelivery dialog = new SelDelivery(new javax.swing.JFrame(),true);
        dialog.setVisible(true);
        Deli= dialog.getDeli();
        
        if (Deli == null){
            this.txtid_delivery.setText("");
           
        }else{
            this.txtid_delivery.setText(String.valueOf(Deli.getId_delivery()));
           
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTiendaRopa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnpago;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTable tblproducto;
    private javax.swing.JTextField txtcorreoCli;
    private javax.swing.JTextField txtdireccionCli;
    private javax.swing.JTextField txtdniCli;
    private javax.swing.JTextField txtid_delivery;
    private javax.swing.JTextField txtid_pago;
    private javax.swing.JTextField txtid_vendedor;
    private javax.swing.JTextField txtnombreCli;
    private javax.swing.JTextField txttelefonoCli;
    // End of variables declaration//GEN-END:variables

}
