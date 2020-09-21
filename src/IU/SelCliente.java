package IU;

import BEAN.Cliente;
import DAO.ClienteDAO;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SelCliente extends javax.swing.JDialog {
    ClienteDAO clieDao;
    DefaultTableModel dtm;
    Cliente clie;
 
    public SelCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        clieDao = new ClienteDAO();
        clie = new Cliente();
        dtm = (DefaultTableModel)this.tblClieBusca.getModel();
        this.llenaTblCliente(false, "");
        
    }
    
    public Cliente getClie(){
        return clie;
    }
    
    public void llenaTblCliente(boolean sw, String cad){
        Vector<Cliente> listEmpl = this.clieDao.listaCliente(sw, cad);
        this.dtm.setRowCount(0);
        for(int i=0; i<listEmpl.size();i++){
            Vector vClie = new Vector();
            vClie.addElement(listEmpl.get(i).getDniCli());
            vClie.addElement(listEmpl.get(i).getApellidoCli());
            vClie.addElement(listEmpl.get(i).getNombreCli());
            vClie.addElement(listEmpl.get(i).getDireccionCli());
            vClie.addElement(listEmpl.get(i).getTelefonoCli());
            vClie.addElement(listEmpl.get(i).getCorreoCli());
            vClie.addElement(listEmpl.get(i).getFecha_nac_clie());
            this.dtm.addRow(vClie);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscClie = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblClieBusca = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("SELECCIONAR CLIENTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 30, 140, 30);

        jLabel2.setText("Buscar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 70, 32, 14);

        txtBuscClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscClieActionPerformed(evt);
            }
        });
        txtBuscClie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscClieKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscClie);
        txtBuscClie.setBounds(200, 70, 210, 20);

        tblClieBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Apellidos", "Nombres", "Dirección", "Teléfono", "Correo", "Fecha Nacimiento"
            }
        ));
        tblClieBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClieBuscaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblClieBusca);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 110, 580, 130);

        setSize(new java.awt.Dimension(653, 325));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscClieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscClieActionPerformed

    private void txtBuscClieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscClieKeyReleased
        if(this.txtBuscClie.getText().isEmpty()){
            llenaTblCliente(false, "");
        }else{
            llenaTblCliente(true, this.txtBuscClie.getText());
        }
    }//GEN-LAST:event_txtBuscClieKeyReleased

    private void tblClieBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClieBuscaMouseClicked
        int i;
        i = this.tblClieBusca.getSelectedRow();
        this.clie.setDniCli(dtm.getValueAt(i, 0).toString());
        this.clie.setApellidoCli(dtm.getValueAt(i, 1).toString());
        this.clie.setNombreCli(dtm.getValueAt(i, 2).toString());
        this.clie.setDireccionCli(dtm.getValueAt(i, 3).toString());
        this.clie.setTelefonoCli(Integer.parseInt(dtm.getValueAt(i, 4).toString()));
        this.clie.setCorreoCli(dtm.getValueAt(i, 5).toString());
        this.clie.setFecha_nac_clie(dtm.getValueAt(i, 6).toString());
        this.dispose();

    }//GEN-LAST:event_tblClieBuscaMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblClieBusca;
    private javax.swing.JTextField txtBuscClie;
    // End of variables declaration//GEN-END:variables
}
