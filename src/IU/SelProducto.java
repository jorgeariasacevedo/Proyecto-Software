
package IU;

import BEAN.Producto;
import DAO.ProductoDAO;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SelProducto extends javax.swing.JDialog {

    ProductoDAO ProDAO;
    DefaultTableModel dtm;
    Producto pro;
    public SelProducto(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        ProDAO = new ProductoDAO();
        initComponents();
        pro =new Producto();
        dtm =(DefaultTableModel)this.tblProducto.getModel();
        this.llenaTablaPro(false, "");
        
    }
    public Producto getDeli() {
        return pro;
    }
    
    private void llenaTablaPro (boolean sw, String cad){
        this.dtm.setRowCount(0);
        Vector <Producto> listDeli = this.ProDAO.ListaItem(sw, cad);
        for(int i= 0; i<listDeli.size();i++){
            Vector vec = new Vector();
            vec.addElement(listDeli.get(i).getIdProducto());
            vec.addElement(listDeli.get(i).getModelo());
            vec.addElement(listDeli.get(i).getTipo());
            vec.addElement(listDeli.get(i).getDetalle());
            vec.addElement(listDeli.get(i).getColor());
            vec.addElement(listDeli.get(i).getTalla());
            vec.addElement(listDeli.get(i).getPreciounitario());
            vec.addElement(listDeli.get(i).getStock());
            
            this.dtm.addRow(vec);
        }   
    }
    private void closeDialog(java.awt.event.WindowEvent evt) {                             
        setVisible(false);
        dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("SELECCIONAR PRODUCTO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 20, 160, 20);

        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscarProducto);
        txtBuscarProducto.setBounds(230, 50, 240, 20);

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdProducto", "Modelo", "Tipo", "Detalle", "Color", "Talla", "PrecioUnitario", "Stock"
            }
        ));
        tblProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducto);
        if (tblProducto.getColumnModel().getColumnCount() > 0) {
            tblProducto.getColumnModel().getColumn(6).setHeaderValue("PrecioUnitario");
            tblProducto.getColumnModel().getColumn(7).setHeaderValue("Stock");
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 660, 180);

        jLabel3.setText("BUSCAR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 50, 60, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Processing_icon-icons.com_54803.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 10, 70, 70);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(190, 40, 40, 30);

        setSize(new java.awt.Dimension(693, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyReleased
        if(this.txtBuscarProducto.getText().isEmpty()){
        llenaTablaPro(false,"");
    }else{
        llenaTablaPro(true,this.txtBuscarProducto.getText());
        }
    }//GEN-LAST:event_txtBuscarProductoKeyReleased

    private void tblProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductoMouseClicked
        int i;
        i=this.tblProducto.getSelectedRow();
        this.pro.setIdProducto(dtm.getValueAt(i, 0).toString());
        this.pro.setDetalle(dtm.getValueAt(i, 3).toString());
        this.pro.setColor(dtm.getValueAt(i, 4).toString());
        this.pro.setPreciounitario(Double.parseDouble(dtm.getValueAt(i, 6).toString()));
        this.dispose();
    }//GEN-LAST:event_tblProductoMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtBuscarProducto;
    // End of variables declaration//GEN-END:variables
}
