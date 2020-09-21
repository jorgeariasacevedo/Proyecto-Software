package IU;

import BEAN.Tipo_pago;
import DAO.Tipo_pagoDAO;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SelTipo_pago extends javax.swing.JDialog {
    
    Tipo_pagoDAO TipoDAO;
    DefaultTableModel dtm;
    Tipo_pago Tipo;

    public SelTipo_pago(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        TipoDAO = new Tipo_pagoDAO();
        Tipo =new Tipo_pago();
        initComponents();
        dtm=(DefaultTableModel)this.tblTipo.getModel();
        this.llenaTablaTipo(false, "");
    }
    
     public Tipo_pago getTipo_pago() {
        return Tipo;
    }
    
    private void llenaTablaTipo(boolean sw, String cad){
        this.dtm.setRowCount(0);
        Vector <Tipo_pago> listTipo = this.TipoDAO.listaTipo(sw, cad);
        for(int i= 0; i<listTipo.size();i++){
            Vector vec = new Vector();
            vec.addElement(listTipo.get(i).getId_pago());
            vec.addElement(listTipo.get(i).getNombre());
            vec.addElement(listTipo.get(i).getNumero_cuenta());
            vec.addElement(listTipo.get(i).getPropietario());
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
        txtBuscTipo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTipo = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("SELECCIONAR TIPO DE PAGO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 160, 20);

        jLabel2.setText("BUSCAR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 40, 50, 20);

        txtBuscTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscTipoKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscTipo);
        txtBuscTipo.setBounds(150, 40, 210, 20);

        tblTipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_tipo", "nombre", "propietario", "numero_cuenta"
            }
        ));
        tblTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTipoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTipo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 90, 390, 190);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(110, 30, 40, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shoppaymentorderbuy-04_icon-icons.com_73886.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 10, 70, 70);

        setSize(new java.awt.Dimension(496, 348));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTipoMouseClicked
        int i;
        i=this.tblTipo.getSelectedRow();
        this.Tipo.setId_pago(Integer.parseInt(dtm.getValueAt(i, 0).toString()));
        this.dispose();
    }//GEN-LAST:event_tblTipoMouseClicked

    private void txtBuscTipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscTipoKeyReleased
        if(this.txtBuscTipo.getText().isEmpty()){
        llenaTablaTipo(false,"");
    }else{
         
        llenaTablaTipo(true,this.txtBuscTipo.getText());
        
    }
    }//GEN-LAST:event_txtBuscTipoKeyReleased

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTipo;
    private javax.swing.JTextField txtBuscTipo;
    // End of variables declaration//GEN-END:variables
}
