/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author fermi
 */
public class FrmComoJugar extends javax.swing.JFrame {

    public static FrmComoJugar createPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form FrmComoJugar
     */
    public FrmComoJugar() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 240, 173));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 240, 173), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 34)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(58, 162, 113));
        jLabel3.setText("Como jugar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(9, 17, 6));
        jLabel4.setText("- guardar datos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 300, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mm4.PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 400));

        btnSalir.setBackground(new java.awt.Color(58, 162, 113));
        btnSalir.setFont(new java.awt.Font("Algerian", 0, 26)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(247, 180, 93));
        btnSalir.setText("salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 140, 40));

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(9, 17, 6));
        jLabel5.setText("2. ingresar a partida");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 280, -1));

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(9, 17, 6));
        jLabel6.setText(" - INGRESAR datos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 330, -1));

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(9, 17, 6));
        jLabel7.setText("1. crear partida ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 280, -1));

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(9, 17, 6));
        jLabel8.setText(" - INGRESAR datos de la partida");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 330, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
