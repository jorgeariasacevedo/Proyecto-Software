package IU;

import BEAN.Delivery;
import DAO.DeliveryDAO;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SelDelivery extends javax.swing.JDialog {
    DeliveryDAO DeliDAO;
    DefaultTableModel dtm;
    Delivery Deli;

    
    public SelDelivery(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        DeliDAO = new DeliveryDAO();
        initComponents();
        Deli =new Delivery();
        dtm =(DefaultTableModel)this.tblDeli.getModel();
        this.llenaTablaDeli(false, "");
    }
    
    public Delivery getDeli() {
        return Deli;
    }
    
     private void llenaTablaDeli (boolean sw, String cad){
        this.dtm.setRowCount(0);
        Vector <Delivery> listDeli = this.DeliDAO.listaDelivery(sw, cad);
        for(int i= 0; i<listDeli.size();i++){
            Vector vec = new Vector();
            vec.addElement(listDeli.get(i).getId_delivery());
            vec.addElement(listDeli.get(i).getTipo_del());
            vec.addElement(listDeli.get(i).getDestino());
            vec.addElement(listDeli.get(i).getPreciocaja());
            vec.addElement(listDeli.get(i).getAgencia());
            vec.addElement(listDeli.get(i).getProvincia());
            vec.addElement(listDeli.get(i).getDepartamento());
            vec.addElement(listDeli.get(i).getDistrito());
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscDelivery = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeli = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("SELECCIONAR DELIVERY");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 140, 20);

        jLabel2.setText("BUSCAR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 40, 60, 20);

        txtBuscDelivery.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscDeliveryKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscDelivery);
        txtBuscDelivery.setBounds(130, 40, 280, 20);

        tblDeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_delivery", "tipo_del", "destino", "preciocaja", "agencia", "provincia", "departamento", "distrito"
            }
        ));
        tblDeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDeliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDeli);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 70, 440, 210);

        setSize(new java.awt.Dimension(528, 352));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscDeliveryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscDeliveryKeyReleased
                                       
    if(this.txtBuscDelivery.getText().isEmpty()){
        llenaTablaDeli(false,"");
    }else{
         
        llenaTablaDeli(true,this.txtBuscDelivery.getText());
        
        }

    }//GEN-LAST:event_txtBuscDeliveryKeyReleased

    private void tblDeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDeliMouseClicked
        int i;
        i=this.tblDeli.getSelectedRow();
        this.Deli.setId_delivery(Integer.parseInt(dtm.getValueAt(i, 0).toString()));
        this.dispose();
    }//GEN-LAST:event_tblDeliMouseClicked

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeli;
    private javax.swing.JTextField txtBuscDelivery;
    // End of variables declaration//GEN-END:variables
}
