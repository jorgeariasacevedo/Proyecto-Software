
package IU;

import BEAN.Repartidor;
import DAO.RepartidorDAO;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SelRepartidor extends javax.swing.JDialog {

    RepartidorDAO repDAO;
    DefaultTableModel dtm;
    Repartidor rep;
    
    public SelRepartidor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        repDAO = new RepartidorDAO();
        initComponents();
        rep =new Repartidor();
        dtm =(DefaultTableModel)this.tblRepartidor.getModel();
        this.llenaTablaRep(false, "");
    }
    
    public Repartidor getDeli() {
        return rep;
    }

     private void llenaTablaRep (boolean sw, String cad){
        this.dtm.setRowCount(0);
        Vector <Repartidor> listDeli = this.repDAO.ListaItem(sw, cad);
        for(int i= 0; i<listDeli.size();i++){
            Vector vec = new Vector();
            vec.addElement(listDeli.get(i).getDniRepartidor());
            vec.addElement(listDeli.get(i).getNombRepartidor());
            vec.addElement(listDeli.get(i).getTelefono());
            vec.addElement(listDeli.get(i).getDireccion());
            vec.addElement(listDeli.get(i).getDistrito());
            vec.addElement(listDeli.get(i).getSueldo());
            
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
        txtBuscarRepartidor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepartidor = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("BUSCAR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 50, 70, 20);

        txtBuscarRepartidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarRepartidorKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscarRepartidor);
        txtBuscarRepartidor.setBounds(190, 50, 240, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("SELECCIONAR REPARTIDOR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 20, 160, 20);

        tblRepartidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI_Repartidor", "NombreRepartidor", "Telefono", "Direccion", "Distrito", "Sueldo"
            }
        ));
        tblRepartidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRepartidorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRepartidor);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 90, 510, 170);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(150, 40, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food_delivery_meal_order_icon_142268.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 0, 80, 80);

        setSize(new java.awt.Dimension(603, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarRepartidorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarRepartidorKeyReleased
        if(this.txtBuscarRepartidor.getText().isEmpty()){
            this.llenaTablaRep(false,"");
        }else{
            this.llenaTablaRep(true,this.txtBuscarRepartidor.getText());
        }
    }//GEN-LAST:event_txtBuscarRepartidorKeyReleased

    private void tblRepartidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRepartidorMouseClicked
        int i;
        i=this.tblRepartidor.getSelectedRow();
        this.rep.setDniRepartidor(dtm.getValueAt(i, 0).toString());
        this.dispose();
    }//GEN-LAST:event_tblRepartidorMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SelRepartidor dialog = new SelRepartidor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRepartidor;
    private javax.swing.JTextField txtBuscarRepartidor;
    // End of variables declaration//GEN-END:variables
}
