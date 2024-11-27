package dev.Lovelace.EventPro.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Proveedor extends javax.swing.JFrame {

    /**
     * Creates new form Proveedor
     */
    public Proveedor() {
        initComponents();
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
    btnCancelar = new javax.swing.JButton();
    btnAgregar = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtNombre = new javax.swing.JLabel();
    txtNombre2 = new javax.swing.JTextField();
    txtIdentidad = new javax.swing.JLabel();
    txtIdentidad2 = new javax.swing.JTextField();
    txtCorreo = new javax.swing.JLabel();
    txtCorreo2 = new javax.swing.JTextField();
    txtTelefono = new javax.swing.JLabel();
    txtDirección = new javax.swing.JLabel();
    txtDetalle = new javax.swing.JLabel();
    txtDirección2 = new javax.swing.JTextField();
    txtTelefono2 = new javax.swing.JTextField();
    txtDetalle2 = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(244, 247, 237));

    btnCancelar.setBackground(new java.awt.Color(134, 238, 96));
    btnCancelar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
    btnCancelar.setForeground(new java.awt.Color(51, 51, 51));
    btnCancelar.setText("Cancelar");
    btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    btnAgregar.setBackground(new java.awt.Color(134, 238, 96));
    btnAgregar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
    btnAgregar.setForeground(new java.awt.Color(51, 51, 51));
    btnAgregar.setText("Agregar");
    btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedor-icon.drawio.png"))); // NOI18N
    jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel2.setBackground(new java.awt.Color(51, 51, 51));
    jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(102, 102, 102));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("Nuevo Proveedor");

    txtNombre.setBackground(new java.awt.Color(51, 51, 51));
    txtNombre.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
    txtNombre.setForeground(new java.awt.Color(102, 102, 102));
    txtNombre.setText("Nombre del Proveedor(Empresa)");

    txtNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 238, 96)));

    txtIdentidad.setBackground(new java.awt.Color(51, 51, 51));
    txtIdentidad.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
    txtIdentidad.setForeground(new java.awt.Color(102, 102, 102));
    txtIdentidad.setText("Identidad Fiscla(RUC):");

    txtIdentidad2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 238, 96)));

    txtCorreo.setBackground(new java.awt.Color(51, 51, 51));
    txtCorreo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
    txtCorreo.setForeground(new java.awt.Color(102, 102, 102));
    txtCorreo.setText("correo:");

    txtCorreo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 238, 96)));

    txtTelefono.setBackground(new java.awt.Color(51, 51, 51));
    txtTelefono.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
    txtTelefono.setForeground(new java.awt.Color(102, 102, 102));
    txtTelefono.setText("Teléfono:");

    txtDirección.setBackground(new java.awt.Color(51, 51, 51));
    txtDirección.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
    txtDirección.setForeground(new java.awt.Color(102, 102, 102));
    txtDirección.setText("Dirección:");

    txtDetalle.setBackground(new java.awt.Color(51, 51, 51));
    txtDetalle.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
    txtDetalle.setForeground(new java.awt.Color(102, 102, 102));
    txtDetalle.setText("Detalle(máximo 255 caracteristicas)");

    txtDirección2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 238, 96)));

    txtTelefono2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 238, 96)));

    txtDetalle2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 238, 96)));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(178, 178, 178))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(35, 35, 35)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(txtNombre)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(txtDetalle)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(txtDetalle2, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtNombre2, javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtIdentidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtIdentidad)
                  .addComponent(txtTelefono)
                  .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtCorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtDirección)
                  .addComponent(txtDirección2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(39, 39, 39))))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(55, 55, 55)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtNombre)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtIdentidad)
          .addComponent(txtCorreo))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtIdentidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtCorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtTelefono)
          .addComponent(txtDirección))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtDirección2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(9, 9, 9)
        .addComponent(txtDetalle)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtDetalle2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(26, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedor().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAgregar;
  private javax.swing.JButton btnCancelar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel txtCorreo;
  private javax.swing.JTextField txtCorreo2;
  private javax.swing.JLabel txtDetalle;
  private javax.swing.JTextField txtDetalle2;
  private javax.swing.JLabel txtDirección;
  private javax.swing.JTextField txtDirección2;
  private javax.swing.JLabel txtIdentidad;
  private javax.swing.JTextField txtIdentidad2;
  private javax.swing.JLabel txtNombre;
  private javax.swing.JTextField txtNombre2;
  private javax.swing.JLabel txtTelefono;
  private javax.swing.JTextField txtTelefono2;
  // End of variables declaration//GEN-END:variables
}