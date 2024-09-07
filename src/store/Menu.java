package store;
import javax.swing.*;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Venta");
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Productos = new javax.swing.JLabel();
        tpancito = new javax.swing.JLabel();
        tgalleta = new javax.swing.JLabel();
        tazucar = new javax.swing.JLabel();
        tcoca = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        precio4 = new javax.swing.JLabel();
        btSuma1 = new javax.swing.JButton();
        etCantidad1 = new javax.swing.JTextField();
        btResta1 = new javax.swing.JButton();
        btSuma2 = new javax.swing.JButton();
        etCantidad2 = new javax.swing.JTextField();
        btResta2 = new javax.swing.JButton();
        btSuma3 = new javax.swing.JButton();
        etCantidad3 = new javax.swing.JTextField();
        btResta3 = new javax.swing.JButton();
        btSuma4 = new javax.swing.JButton();
        etCantidad4 = new javax.swing.JTextField();
        btResta4 = new javax.swing.JButton();
        txtCantidad = new javax.swing.JLabel();
        txtCantidad1 = new javax.swing.JLabel();
        txtCantidad2 = new javax.swing.JLabel();
        txtCantidad3 = new javax.swing.JLabel();
        btcancelar = new javax.swing.JButton();
        btprocesar = new javax.swing.JButton();
        btCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Productos.setBackground(new java.awt.Color(102, 102, 102));
        Productos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Productos.setText("Productos");
        getContentPane().add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        tpancito.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tpancito.setText("Pan");
        getContentPane().add(tpancito, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        tgalleta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tgalleta.setText("Galleta");
        getContentPane().add(tgalleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        tazucar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tazucar.setText("Azucar");
        getContentPane().add(tazucar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        tcoca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tcoca.setText("Coca cola");
        getContentPane().add(tcoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));

        precio1.setBackground(new java.awt.Color(102, 102, 102));
        precio1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio1.setForeground(new java.awt.Color(102, 102, 102));
        precio1.setText("Q2");
        getContentPane().add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        precio2.setBackground(new java.awt.Color(102, 102, 102));
        precio2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio2.setForeground(new java.awt.Color(102, 102, 102));
        precio2.setText("Q3");
        getContentPane().add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        precio3.setBackground(new java.awt.Color(102, 102, 102));
        precio3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio3.setForeground(new java.awt.Color(102, 102, 102));
        precio3.setText("Q2.50");
        getContentPane().add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        precio4.setBackground(new java.awt.Color(102, 102, 102));
        precio4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio4.setForeground(new java.awt.Color(102, 102, 102));
        precio4.setText("Q6");
        getContentPane().add(precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        btSuma1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma1.setText("+");
        btSuma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma1ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 50, 30));

        etCantidad1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad1.setText("0");
        etCantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCantidad1ActionPerformed(evt);
            }
        });
        getContentPane().add(etCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 50, 30));

        btResta1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta1.setText("-");
        btResta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta1ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 50, 30));

        btSuma2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma2.setText("+");
        btSuma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma2ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 50, 30));

        etCantidad2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad2.setText("0");
        getContentPane().add(etCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 50, 30));

        btResta2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta2.setText("-");
        btResta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta2ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 50, 30));

        btSuma3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma3.setText("+");
        btSuma3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma3ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 50, 30));

        etCantidad3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad3.setText("0");
        getContentPane().add(etCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 50, 30));

        btResta3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta3.setText("-");
        btResta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta3ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 50, 30));

        btSuma4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma4.setText("+");
        btSuma4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma4ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 50, 30));

        etCantidad4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad4.setText("0");
        getContentPane().add(etCantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 50, 30));

        btResta4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta4.setText("-");
        btResta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta4ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 50, 30));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad.setText("Cantidad");
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txtCantidad1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad1.setText("Cantidad");
        getContentPane().add(txtCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        txtCantidad2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad2.setText("Cantidad");
        getContentPane().add(txtCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        txtCantidad3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad3.setText("Cantidad");
        getContentPane().add(txtCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        btcancelar.setBackground(new java.awt.Color(204, 204, 204));
        btcancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btcancelar.setText("Cancelar ");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 170, 51));

        btprocesar.setBackground(new java.awt.Color(204, 204, 204));
        btprocesar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btprocesar.setText("Procesar");
        btprocesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btprocesarActionPerformed(evt);
            }
        });
        getContentPane().add(btprocesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 170, 51));

        btCerrarSesion.setBackground(new java.awt.Color(204, 204, 204));
        btCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btCerrarSesion.setText("Cerrar sesión");
        btCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 170, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("OFERTA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jLabel2.setText("2x3");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        jLabel3.setText("Para todos los productos ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btResta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta1ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad1.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad1.setText(resultado);
    }//GEN-LAST:event_btResta1ActionPerformed

    private void btResta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta2ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad2.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad2.setText(resultado);
    }//GEN-LAST:event_btResta2ActionPerformed

    private void btResta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta3ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad3.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad3.setText(resultado);
    }//GEN-LAST:event_btResta3ActionPerformed

    private void btResta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta4ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad4.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad4.setText(resultado);
    }//GEN-LAST:event_btResta4ActionPerformed

    private void btSuma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma2ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad2.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad2.setText(resultado);
    }//GEN-LAST:event_btSuma2ActionPerformed

    private void btprocesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btprocesarActionPerformed
        // TODO add your handling code here:
        
        String cantidad1= etCantidad1.getText();
        int c1 = Integer.parseInt(cantidad1);
        String cantidad2= etCantidad2.getText();
        int c2 = Integer.parseInt(cantidad2);
        String cantidad3= etCantidad3.getText();
        int c3 = Integer.parseInt(cantidad3);
        String cantidad4= etCantidad4.getText();
        int c4 = Integer.parseInt(cantidad4);
        
        if(c1==0 && c2==0 && c3==0 && c4==0){
            JOptionPane.showMessageDialog(null, "No hay articulos para pagar");
        }else{
            if(c1<0|| c2<0 || c3<0 || c4<0){
            JOptionPane.showMessageDialog(null, "NO PUEDES INGRESAR CANTIDADES NEGATIVAS");
            }else{
                this.setVisible(false);
                VentanaDescripcion ventana3 = new VentanaDescripcion();
        
                ventana3.cantidades(cantidad1, cantidad2, cantidad3, cantidad4);
                ventana3.setVisible(true);
            }
        
        
        }
        
        
        
    }//GEN-LAST:event_btprocesarActionPerformed
    
    private void btSuma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma1ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad1.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad1.setText(resultado);
    }//GEN-LAST:event_btSuma1ActionPerformed

    private void btSuma3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma3ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad3.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad3.setText(resultado);
    }//GEN-LAST:event_btSuma3ActionPerformed

    private void btSuma4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma4ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad4.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad4.setText(resultado);
    }//GEN-LAST:event_btSuma4ActionPerformed

    private void etCantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etCantidad1ActionPerformed

    
    private void btCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarSesionActionPerformed
        // TODO add your handling code here:
        Login ventana1 = new Login();
        this.setVisible(false);
    }//GEN-LAST:event_btCerrarSesionActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        // TODO add your handling code here:
        etCantidad1.setText("0");
        etCantidad2.setText("0");
        etCantidad3.setText("0");
        etCantidad4.setText("0");
    }//GEN-LAST:event_btcancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    private int suma(int cantidad){
        cantidad = cantidad +1;        
        return cantidad;
    }
    private int resta(int cantidad){
        if(cantidad>0){
            cantidad = cantidad -1;
        }
        return cantidad;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Productos;
    private javax.swing.JButton btCerrarSesion;
    private javax.swing.JButton btResta1;
    private javax.swing.JButton btResta2;
    private javax.swing.JButton btResta3;
    private javax.swing.JButton btResta4;
    private javax.swing.JButton btSuma1;
    private javax.swing.JButton btSuma2;
    private javax.swing.JButton btSuma3;
    private javax.swing.JButton btSuma4;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btprocesar;
    private javax.swing.JTextField etCantidad1;
    private javax.swing.JTextField etCantidad2;
    private javax.swing.JTextField etCantidad3;
    private javax.swing.JTextField etCantidad4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel precio4;
    private javax.swing.JLabel tazucar;
    private javax.swing.JLabel tcoca;
    private javax.swing.JLabel tgalleta;
    private javax.swing.JLabel tpancito;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtCantidad1;
    private javax.swing.JLabel txtCantidad2;
    private javax.swing.JLabel txtCantidad3;
    // End of variables declaration//GEN-END:variables
}
