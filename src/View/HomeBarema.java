package View;

import Controller.BaremaController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HomeBarema extends javax.swing.JFrame {
    
    BaremaController baremaController;
    
    public HomeBarema() {
        initComponents();
        baremaController = new BaremaController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        atividadeTxt = new javax.swing.JTextField();
        idTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        horasTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        limiteTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        grupoComboBox = new javax.swing.JComboBox<>();
        msgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 600));
        setPreferredSize(new java.awt.Dimension(950, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(113, 163, 208));
        jPanel1.setForeground(new java.awt.Color(9, 85, 110));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Barema");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 6, 650, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 70));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Horas:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 140, 40));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("Nº Atividade:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 140, 40));
        getContentPane().add(atividadeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 660, 120));
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setText("Atividade:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 90, 40));
        getContentPane().add(horasTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 140, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setText("Grupo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 140, 40));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 650, 40));
        getContentPane().add(limiteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 140, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setText("Limite:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 140, 40));

        grupoComboBox.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        grupoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grupo I", "Grupo II", "Grupo III" }));
        grupoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(grupoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 140, -1));

        msgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msgLabel.setText("Mensagem");
        getContentPane().add(msgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 540, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grupoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoComboBoxActionPerformed

    }//GEN-LAST:event_grupoComboBoxActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String cadastrarBarema = null;
        try {
            cadastrarBarema = baremaController.cadastrarBarema(Integer.parseInt(idTxt.getText()), atividadeTxt.getText(), horasTxt.getText(), limiteTxt.getText(), String.valueOf(grupoComboBox.getSelectedItem()));
        } catch (SQLException ex) {
            Logger.getLogger(HomeBarema.class.getName()).log(Level.SEVERE, null, ex);
        }
        msgLabel.setText(cadastrarBarema);
    }//GEN-LAST:event_btnSalvarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeBarema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField atividadeTxt;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> grupoComboBox;
    private javax.swing.JTextField horasTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField limiteTxt;
    private javax.swing.JLabel msgLabel;
    // End of variables declaration//GEN-END:variables
}
