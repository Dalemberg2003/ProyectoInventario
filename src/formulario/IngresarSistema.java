package formulario;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

public class IngresarSistema extends javax.swing.JFrame {

    /*
     *SI SE CAMBIA EL TAMAÑO DEL FRAME EN DESIGN LAS MEDIDAS SON 817,427
     */
    ProductTester tester = ProductTester.getAdm();

    public IngresarSistema() {
        initComponents();
        setSize(817, 427);
        setLocationRelativeTo(null);
        setResizable(false);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_iniciar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        lbl_inventario = new javax.swing.JLabel();
        btn_mostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_iniciar.setBackground(new java.awt.Color(0, 51, 102));
        btn_iniciar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        btn_iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_add_40px_1.png"))); // NOI18N
        btn_iniciar.setText("Agregar Productos");
        btn_iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 270, 60));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_40px.png"))); // NOI18N
        btn_cerrar.setBorder(null);
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_50px.png"))); // NOI18N
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 0, 40, 40));

        btn_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_macos_minimize_40px.png"))); // NOI18N
        btn_minimizar.setBorder(null);
        btn_minimizar.setBorderPainted(false);
        btn_minimizar.setContentAreaFilled(false);
        btn_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_macos_minimize_50px.png"))); // NOI18N
        btn_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 0, 40, 40));

        lbl_inventario.setBackground(new java.awt.Color(255, 255, 255));
        lbl_inventario.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_inventario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_inventario.setText("Inventario");
        jPanel1.add(lbl_inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 40));

        btn_mostrar.setBackground(new java.awt.Color(0, 51, 102));
        btn_mostrar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_mostrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_show_property_40px_2.png"))); // NOI18N
        btn_mostrar.setText("Mostrar Productos");
        btn_mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 270, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //int x, y;
    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        //x = evt.getX();
        //y = evt.getY();
    }//GEN-LAST:event_formMouseEntered

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // int xx = evt.getXOnScreen();
        //int xy = evt.getYOnScreen();

        //this.setLocation(xx - x, xy - y);
    }//GEN-LAST:event_formMouseDragged

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        tester.getAdm();
        int numProductos = tester.PedirNumProductos();
        if (numProductos == 0) {
            JOptionPane.showMessageDialog(this, "No se requieren productos");
        } else {
            AgregarProductos inventario = new AgregarProductos(numProductos);
            inventario.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarActionPerformed

    int x, y;
    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xx = evt.getXOnScreen();
        int xy = evt.getYOnScreen();

        this.setLocation(xx - x, xy - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed

        if (tester.numeroProductList() == 0) {
            JOptionPane.showMessageDialog(this, "Inventario vacio");
        } else {
            MostrarProductos mostrar = new MostrarProductos();
            mostrar.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btn_mostrarActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_inventario;
    // End of variables declaration//GEN-END:variables
}
