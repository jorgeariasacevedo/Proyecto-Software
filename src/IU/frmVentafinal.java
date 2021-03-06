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

//aadsad//
public class frmVentafinal extends javax.swing.JFrame {

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

    //jujuujujujju
    public frmVentafinal() {
        initComponents();
        cliDao = new ClienteDAO();
        proDao = new ProductoDAO();
        venDao = new VendedorDAO();
        repDao = new RepartidorDAO();
        delDao = new DeliveryDAO();
        tipDao = new Tipo_pagoDAO();
        cabDao = new Cab_ventaDAO();
        detDao = new Detalle_VentaDAO();

        clie = new Cliente();
        dtmpro = (DefaultTableModel) this.tblMostrarProducto.getModel();

    }

    private void llenaTblProducto(boolean sw, String cad) {
        Vector<Producto> listProd = this.proDao.ListaItem(sw, cad);
        dtmpro.setRowCount(0);
        for (int i = 0; i < listProd.size(); i++) {
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

    private boolean validaAgregar() {
        boolean sw = false;
        if (this.txtCodigoProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe registrar su producto");
        } else {
            if (this.txtCantidad.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe registrar la cantidad de productos");
            } else {
                try {
                    Integer.parseInt(this.txtCantidad.getText());
                    sw = true;
                } catch (NumberFormatException e) {
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
        txtDniCli = new javax.swing.JTextField();
        txtNombreCli = new javax.swing.JTextField();
        txtDireccionCli = new javax.swing.JTextField();
        txtTelefonoCli = new javax.swing.JTextField();
        txtCorreoCli = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnSeleccionarCliente = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtApellidoClie = new javax.swing.JTextField();
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
        btnSalir = new javax.swing.JButton();
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
        txtmonto = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtdelivery = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtIGV = new javax.swing.JTextField();
        txtDescripProducto = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtcodf = new javax.swing.JTextField();
        txtboletafactura = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(null);

        jLabel1.setText("Correo");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 170, 70, 20);

        jLabel2.setText("DNI Cliente");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 20, 70, 20);

        jLabel3.setText("Nombres");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 80, 70, 20);

        jLabel4.setText("Direccion");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 110, 70, 20);

        jLabel5.setText("Telefono");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 140, 70, 20);
        jPanel3.add(txtDniCli);
        txtDniCli.setBounds(90, 20, 90, 20);
        jPanel3.add(txtNombreCli);
        txtNombreCli.setBounds(90, 80, 180, 20);
        jPanel3.add(txtDireccionCli);
        txtDireccionCli.setBounds(90, 110, 220, 20);
        jPanel3.add(txtTelefonoCli);
        txtTelefonoCli.setBounds(90, 140, 90, 20);
        jPanel3.add(txtCorreoCli);
        txtCorreoCli.setBounds(90, 170, 130, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("DATOS DEL CLIENTE");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 0, 130, 14);

        btnSeleccionarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSeleccionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/select_ok_accept_15254 (1).png"))); // NOI18N
        btnSeleccionarCliente.setText("Seleccionar");
        btnSeleccionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnSeleccionarCliente);
        btnSeleccionarCliente.setBounds(230, 0, 140, 40);

        btnRegistrarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir (1).png"))); // NOI18N
        btnRegistrarCliente.setText("Nuevo");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarCliente);
        btnRegistrarCliente.setBounds(250, 140, 110, 40);

        jLabel6.setText("Apellidos");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 50, 50, 14);
        jPanel3.add(txtApellidoClie);
        txtApellidoClie.setBounds(90, 50, 180, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 40, 410, 200);
        jPanel3.getAccessibleContext().setAccessibleName("CLIENTE");
        jPanel3.getAccessibleContext().setAccessibleDescription("");

        txtcodigo.setBackground(new java.awt.Color(255, 204, 204));
        txtcodigo.setLayout(null);

        jLabel9.setText("DNI repartidor");
        txtcodigo.add(jLabel9);
        jLabel9.setBounds(10, 150, 120, 20);

        btnSeleccionarRepartidor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSeleccionarRepartidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food_delivery_meal_order_icon_142268 (1).png"))); // NOI18N
        btnSeleccionarRepartidor.setText("Repartidor");
        btnSeleccionarRepartidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarRepartidorActionPerformed(evt);
            }
        });
        txtcodigo.add(btnSeleccionarRepartidor);
        btnSeleccionarRepartidor.setBounds(210, 140, 190, 40);

        txtDNIVendedor.setEditable(false);
        txtcodigo.add(txtDNIVendedor);
        txtDNIVendedor.setBounds(120, 30, 80, 20);

        btnSeleccionarDelivery.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSeleccionarDelivery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/613deliverytruck_100957 (1).png"))); // NOI18N
        btnSeleccionarDelivery.setText("Seleccionar delivery");
        btnSeleccionarDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarDeliveryActionPerformed(evt);
            }
        });
        txtcodigo.add(btnSeleccionarDelivery);
        btnSeleccionarDelivery.setBounds(210, 100, 190, 40);

        btnVendedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/10303manofficeworkerlightskintone_110631 (1).png"))); // NOI18N
        btnVendedor.setText("Vendedor");
        btnVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendedorActionPerformed(evt);
            }
        });
        txtcodigo.add(btnVendedor);
        btnVendedor.setBounds(210, 20, 190, 40);

        btnPago.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shoppaymentorderbuy-23_icon-icons.com_73884.png"))); // NOI18N
        btnPago.setText("Seleccionar pago");
        btnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoActionPerformed(evt);
            }
        });
        txtcodigo.add(btnPago);
        btnPago.setBounds(210, 60, 190, 40);

        txtid_pago.setEditable(false);
        txtcodigo.add(txtid_pago);
        txtid_pago.setBounds(120, 70, 80, 20);

        txtid_delivery.setEditable(false);
        txtcodigo.add(txtid_delivery);
        txtid_delivery.setBounds(120, 110, 80, 20);

        txtCodigoRepartidor.setEditable(false);
        txtcodigo.add(txtCodigoRepartidor);
        txtCodigoRepartidor.setBounds(120, 150, 80, 20);

        jLabel11.setText("DNI vendedor");
        txtcodigo.add(jLabel11);
        jLabel11.setBounds(10, 30, 120, 20);

        jLabel12.setText("Codigo del pago");
        txtcodigo.add(jLabel12);
        jLabel12.setBounds(10, 70, 120, 20);

        jLabel13.setText("Codigo del delivery");
        txtcodigo.add(jLabel13);
        jLabel13.setBounds(10, 110, 120, 20);

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel69.setText("DATOS DEL PEDIDO");
        txtcodigo.add(jLabel69);
        jLabel69.setBounds(10, 0, 190, 14);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        txtcodigo.add(btnSalir);
        btnSalir.setBounds(40, 190, 90, 50);

        jPanel1.add(txtcodigo);
        txtcodigo.setBounds(0, 240, 410, 260);

        jPanel17.setBackground(new java.awt.Color(255, 204, 204));
        jPanel17.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("PRODUCTOS PEDIDOS");
        jPanel17.add(jLabel7);
        jLabel7.setBounds(10, 0, 190, 14);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("MONTO DELIVERY");
        jPanel17.add(jLabel10);
        jLabel10.setBounds(-20, 420, 120, 20);

        btnGuardarPedido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir (1).png"))); // NOI18N
        btnGuardarPedido.setText("Guardar pedido");
        btnGuardarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPedidoActionPerformed(evt);
            }
        });
        jPanel17.add(btnGuardarPedido);
        btnGuardarPedido.setBounds(170, 390, 150, 50);

        btnSeleccionarProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSeleccionarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/select_ok_accept_15254 (1).png"))); // NOI18N
        btnSeleccionarProducto.setText("Seleccionar");
        btnSeleccionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarProductoActionPerformed(evt);
            }
        });
        jPanel17.add(btnSeleccionarProducto);
        btnSeleccionarProducto.setBounds(180, 0, 140, 40);

        tblMostrarProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "Descripcion", "Color", "Precio", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(tblMostrarProducto);

        jPanel17.add(jScrollPane3);
        jScrollPane3.setBounds(10, 200, 310, 150);
        jPanel17.add(txtCodigoProducto);
        txtCodigoProducto.setBounds(90, 20, 70, 20);

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel70.setText("Codigo");
        jPanel17.add(jLabel70);
        jLabel70.setBounds(20, 20, 60, 20);
        jPanel17.add(txtPrecio);
        txtPrecio.setBounds(90, 110, 50, 20);

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel71.setText("Color");
        jPanel17.add(jLabel71);
        jLabel71.setBounds(20, 80, 60, 20);
        jPanel17.add(txtCantidad);
        txtCantidad.setBounds(90, 140, 50, 20);

        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel72.setText("Descripcion");
        jPanel17.add(jLabel72);
        jLabel72.setBounds(10, 50, 70, 20);

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir (1).png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel17.add(btnAgregar);
        btnAgregar.setBounds(210, 110, 110, 40);

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("MONTO TOTAL");
        jPanel17.add(jLabel54);
        jLabel54.setBounds(0, 450, 100, 20);
        jPanel17.add(txtmonto);
        txtmonto.setBounds(110, 360, 50, 20);
        jPanel17.add(txtTotal);
        txtTotal.setBounds(110, 450, 50, 20);
        jPanel17.add(txtdelivery);
        txtdelivery.setBounds(110, 420, 50, 20);

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("Monto");
        jPanel17.add(jLabel65);
        jLabel65.setBounds(60, 360, 40, 20);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("IGV");
        jPanel17.add(jLabel14);
        jLabel14.setBounds(70, 390, 30, 20);
        jPanel17.add(txtIGV);
        txtIGV.setBounds(110, 390, 50, 20);
        jPanel17.add(txtDescripProducto);
        txtDescripProducto.setBounds(90, 50, 170, 20);

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel73.setText("Cantidad");
        jPanel17.add(jLabel73);
        jLabel73.setBounds(20, 140, 60, 20);
        jPanel17.add(txtColor);
        txtColor.setBounds(90, 80, 170, 20);

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel74.setText("Precio");
        jPanel17.add(jLabel74);
        jLabel74.setBounds(20, 110, 60, 20);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel17.add(btnEliminar);
        btnEliminar.setBounds(210, 152, 110, 40);

        jPanel1.add(jPanel17);
        jPanel17.setBounds(430, 10, 330, 510);

        txtcodf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodfActionPerformed(evt);
            }
        });
        jPanel1.add(txtcodf);
        txtcodf.setBounds(230, 10, 110, 20);

        txtboletafactura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número de boleta:", "Número de Factura:" }));
        txtboletafactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtboletafacturaActionPerformed(evt);
            }
        });
        jPanel1.add(txtboletafactura);
        txtboletafactura.setBounds(20, 10, 190, 20);

        jLabel16.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 0, 390, 30);

        jTabbedPane1.addTab("Recepcion del pedido", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 0, 770, 540);

        setSize(new java.awt.Dimension(804, 591));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        frmCliente x = new frmCliente();
        x.setVisible(true);
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoActionPerformed
        Tipo_pago Tipo = new Tipo_pago();
        SelTipo_pago dialog = new SelTipo_pago(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        Tipo = dialog.getTipo_pago();

        if (Tipo == null) {
            this.txtid_pago.setText("");

        } else {
            this.txtid_pago.setText(String.valueOf(Tipo.getId_pago()));

        }
    }//GEN-LAST:event_btnPagoActionPerformed

    private void btnSeleccionarDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarDeliveryActionPerformed
        Delivery Deli = new Delivery();
        SelDelivery dialog = new SelDelivery(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        Deli = dialog.getDeli();

        if (Deli == null) {
            this.txtid_delivery.setText("");
        } else {
            this.txtid_delivery.setText(String.valueOf(Deli.getId_delivery()));
            this.txtdelivery.setText(String.valueOf(Deli.getPreciocaja()));
        }
    }//GEN-LAST:event_btnSeleccionarDeliveryActionPerformed

    private void btnSeleccionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarProductoActionPerformed
        Producto pro = new Producto();
        SelProducto dialog = new SelProducto(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        pro = dialog.getDeli();
        if (pro == null) {
            this.txtCodigoProducto.setText("");
        } else {
            this.txtCodigoProducto.setText(String.valueOf(pro.getIdProducto()));
            this.txtDescripProducto.setText(String.valueOf(pro.getDetalle()));
            this.txtColor.setText(String.valueOf(pro.getColor()));
            this.txtPrecio.setText(String.valueOf(pro.getPreciounitario()));
        }
    }//GEN-LAST:event_btnSeleccionarProductoActionPerformed

    private void btnSeleccionarRepartidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarRepartidorActionPerformed
        Repartidor rep = new Repartidor();
        SelRepartidor dialog = new SelRepartidor(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        rep = dialog.getDeli();

        if (rep == null) {
            this.txtCodigoRepartidor.setText("");
        } else {
            this.txtCodigoRepartidor.setText(String.valueOf(rep.getDniRepartidor()));
        }
    }//GEN-LAST:event_btnSeleccionarRepartidorActionPerformed

    private void btnVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendedorActionPerformed
        Vendedor ven = new Vendedor();
        SelVendedor dialog = new SelVendedor(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        ven = dialog.getVend();

        if (ven == null) {
            this.txtDNIVendedor.setText("");
        } else {
            this.txtDNIVendedor.setText(String.valueOf(ven.getDniVendedor()));
        }

    }//GEN-LAST:event_btnVendedorActionPerformed

// HEAD

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String r = "src/REPORTES/repFactura.jasper";

            dbBean db = new dbBean();
            HashMap map = new HashMap();

            map.put("parameter1", this.txtcodf.getText());
            map.put("nombre", this.txtNombreCli.getText());
            map.put("direccion", this.txtDireccionCli.getText());
            map.put("telefono", this.txtTelefonoCli.getText());
            map.put("correo", this.txtCorreoCli.getText());
            db.connectRep(r, map, true);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (JRException ex) {
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
        Cliente cli = new Cliente();
        SelCliente dialog = new SelCliente(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        cli = dialog.getClie();
        if (cli == null) {
            this.txtDniCli.setText("");
            this.txtApellidoClie.setText("");
            this.txtNombreCli.setText("");
            this.txtDireccionCli.setText("");
            this.txtTelefonoCli.setText("");
            this.txtCorreoCli.setText("");
        } else {
            this.txtDniCli.setText(cli.getDniCli());
            this.txtApellidoClie.setText(cli.getApellidoCli());
            this.txtNombreCli.setText(cli.getNombreCli());
            this.txtDireccionCli.setText(cli.getDireccionCli());
            this.txtTelefonoCli.setText(String.valueOf(cli.getTelefonoCli()));
            this.txtCorreoCli.setText(cli.getCorreoCli());
        }
    }//GEN-LAST:event_btnSeleccionarClienteActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        double a;
        double b;

        Vector vec = new Vector();
        if (validaAgregar() == true) {
            vec.addElement(this.txtCodigoProducto.getText());
            vec.addElement(this.txtDescripProducto.getText());
            vec.addElement(this.txtColor.getText());
            vec.addElement(this.txtPrecio.getText());
            vec.addElement(this.txtCantidad.getText());
            a = Double.parseDouble(this.txtPrecio.getText()) * Integer.parseInt(this.txtCantidad.getText());
            if (txtmonto.getText().isEmpty() == true) {
                this.txtmonto.setText(Double.toString(a));
            } else {
                b = Double.parseDouble(this.txtmonto.getText());
                this.txtmonto.setText(Double.toString(Double.parseDouble(this.txtmonto.getText()) + a));
            }
           if (this.txtboletafactura.getSelectedIndex() == 0) {
                    this.txtIGV.setText("0");
                } else {
                   this.txtIGV.setText(Double.toString(Double.parseDouble(txtmonto.getText()) * 0.18));
                }
            
            
            if (txtdelivery.getText().isEmpty() == true) {
                this.txtTotal.setText(Double.toString(Double.parseDouble(this.txtIGV.getText()) + Double.parseDouble(this.txtmonto.getText())));
            } else {
                this.txtTotal.setText(Double.toString(Double.parseDouble(this.txtdelivery.getText()) + Double.parseDouble(this.txtIGV.getText()) + Double.parseDouble(this.txtmonto.getText())));
            }
            dtmpro.addRow(vec);
        }
        this.txtCodigoProducto.setText("");
        this.txtDescripProducto.setText("");
        this.txtColor.setText("");
        this.txtPrecio.setText("");
        this.txtPrecio.setText("");
        this.txtCantidad.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPedidoActionPerformed
        Cab_venta cv = new Cab_venta();
        //det_venta dv=new det_venta();

        util u = new util();
        int cant, idDel, idPag;
        String fech, idCli, idProd, idVen, idRep;
        double prec;

        //if(this.btnGrabar.getText().equals("Grabar")){
        //if(validaGrabar() == true){
        idVenta = u.idNext("Cab_venta", "idVenta");
        idCli = this.txtDniCli.getText();
        idDel = Integer.parseInt(this.txtid_delivery.getText());
        idVen = this.txtDNIVendedor.getText();
        idRep = this.txtCodigoRepartidor.getText();
        idPag = Integer.parseInt(this.txtid_pago.getText());
        fech = u.obtenerFecha();

        cv.setIdVenta(idVenta);
        cv.setDniClif(idCli);
        cv.setFechaVenta(fech);
        cv.setEstado("No entregado");
        cv.setIdDeliveryf(idDel);
        cv.setDniVendedor(idVen);
        cv.setDniRepartidorf(idRep);
        cv.setIdPagof(idPag);

        this.cabDao.procesaItem(cv, "insert");

        for (int i = 0; i < this.tblMostrarProducto.getRowCount(); i++) {
            Detalle_Venta dv = new Detalle_Venta();

            //idProd=dtmpro.getValueAt(i, 0).toString();
            idProd = dtmpro.getValueAt(i, 0).toString();
            prec = Double.parseDouble(dtmpro.getValueAt(i, 3).toString());
            cant = Integer.parseInt(dtmpro.getValueAt(i, 4).toString());

            dv.setIdVentaf(idVenta);
            dv.setCodProducto(idProd);
            dv.setPrecio(prec);
            dv.setCantidad(cant);
            this.txtcodf.setText(Integer.toString(idVenta));
            this.detDao.procesaItem(dv, "insert");

        }
        int response = JOptionPane.showConfirmDialog(this, "¿Quieres generar un comprobante de pago?", "Comprobante", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {
                String r = "src/REPORTES/repFactura.jasper";

                dbBean db = new dbBean();
                HashMap map = new HashMap();

                map.put("parameter1", this.txtcodf.getText());

                map.put("nombre", this.txtNombreCli.getText()+" "+this.txtApellidoClie.getText());
                map.put("direccion", this.txtDireccionCli.getText());
                map.put("telefono", this.txtTelefonoCli.getText());
                map.put("correo", this.txtCorreoCli.getText());
                map.put("monto", this.txtmonto.getText());
                map.put("IGV", this.txtIGV.getText());
                map.put("dni", this.txtDniCli.getText());
                map.put("montototal", this.txtTotal.getText());
                if (this.txtboletafactura.getSelectedIndex() == 0) {
                    map.put("factura o boleta", "BOLETA");
                } else {
                    map.put("factura o boleta", "FACTURA");
                }

                db.connectRep(r, map, true);
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (JRException ex) {
                ex.printStackTrace();
            }

        } else {
            dispose();
        }
    }//GEN-LAST:event_btnGuardarPedidoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int i;
        if (this.tblMostrarProducto.getSelectedRow() >= 0) {
            i = this.tblMostrarProducto.getSelectedRow();
            dtmpro.removeRow(i);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtboletafacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtboletafacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtboletafacturaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentafinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarPedido;
    private javax.swing.JButton btnPago;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionarCliente;
    private javax.swing.JButton btnSeleccionarDelivery;
    private javax.swing.JButton btnSeleccionarProducto;
    private javax.swing.JButton btnSeleccionarRepartidor;
    private javax.swing.JButton btnVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTable tblMostrarProducto;
    private javax.swing.JTextField txtApellidoClie;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtCodigoRepartidor;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCorreoCli;
    private javax.swing.JTextField txtDNIVendedor;
    private javax.swing.JTextField txtDescripProducto;
    private javax.swing.JTextField txtDireccionCli;
    private javax.swing.JTextField txtDniCli;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtNombreCli;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTelefonoCli;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JComboBox<String> txtboletafactura;
    private javax.swing.JTextField txtcodf;
    private javax.swing.JPanel txtcodigo;
    private javax.swing.JTextField txtdelivery;
    private javax.swing.JTextField txtid_delivery;
    private javax.swing.JTextField txtid_pago;
    private javax.swing.JTextField txtmonto;
    // End of variables declaration//GEN-END:variables

}
