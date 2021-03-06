/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoinmobiliaria;

import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class VentanaInmobiliaria extends javax.swing.JFrame {

    /**
     * Creates new form ventanaInmobiliaria
     *
     */
    private Inmobiliaria inmobiliaria;

    public VentanaInmobiliaria() {
        initComponents();
        inmobiliaria = new Inmobiliaria();
        rbtnCasa.setSelected(true);     
        txtPrecioAlquiler.setVisible(false);
        lblPrecioAlquilar.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDeBotones = new javax.swing.ButtonGroup();
        lblDireccion = new javax.swing.JLabel();
        lblCdadHabitaciones = new javax.swing.JLabel();
        lblPrecioBase = new javax.swing.JLabel();
        rbtnCasa = new javax.swing.JRadioButton();
        rbtnDepartamento = new javax.swing.JRadioButton();
        lblCdadInquilinos = new javax.swing.JLabel();
        chkBoxUsoComercial = new javax.swing.JCheckBox();
        chckGarage = new javax.swing.JCheckBox();
        lblPrecioAlquilar = new javax.swing.JLabel();
        txtCdadHabitaciones = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtPrecioAlquiler = new javax.swing.JTextField();
        txtPrecioBaseAlquiler = new javax.swing.JTextField();
        txtInquilinos = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        lblExpensas = new javax.swing.JLabel();
        txtExpensas = new javax.swing.JTextField();
        lstPropiedades = new javax.swing.JScrollPane();
        listadoPropiedades = new javax.swing.JList();
        txtPromedioAlquileres = new javax.swing.JTextField();
        txt3oMasHabitaciones = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDireccion.setText("Direccion");

        lblCdadHabitaciones.setText("Cantidad de Habitaciones");

        lblPrecioBase.setText("Precio Base Alquiler");

        grupoDeBotones.add(rbtnCasa);
        rbtnCasa.setText("Casa");
        rbtnCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCasaActionPerformed(evt);
            }
        });

        grupoDeBotones.add(rbtnDepartamento);
        rbtnDepartamento.setText("Departamento");
        rbtnDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDepartamentoActionPerformed(evt);
            }
        });

        lblCdadInquilinos.setText("Cantidad Inquilinos");

        chkBoxUsoComercial.setText("Uso Comercial");

        chckGarage.setText("Garage");

        lblPrecioAlquilar.setText("Precio a Alquilar");

        txtCdadHabitaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCdadHabitacionesKeyTyped(evt);
            }
        });

        txtPrecioBaseAlquiler.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioBaseAlquilerKeyTyped(evt);
            }
        });

        btnCargar.setText("CARGAR");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        lblExpensas.setText("Expensas");

        listadoPropiedades.setForeground(new java.awt.Color(0, 0, 0));
        lstPropiedades.setViewportView(listadoPropiedades);

        jLabel1.setText("Promedio Alquileres  2 Inquilinos:");

        jLabel2.setText("Casas con 3 o Mas Habitaciones");

        jButton1.setText("REPORTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblPrecioAlquilar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkBoxUsoComercial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCdadInquilinos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInquilinos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioAlquiler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(chckGarage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblExpensas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblPrecioBase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCdadHabitaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                        .addComponent(rbtnCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnDepartamento)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtExpensas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCdadHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrecioBaseAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt3oMasHabitaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPromedioAlquileres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(lstPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnCargar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnDepartamento)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDireccion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCdadHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCdadHabitaciones))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecioBaseAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecioBase)))
                            .addComponent(rbtnCasa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExpensas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblExpensas))
                        .addGap(21, 21, 21)
                        .addComponent(chkBoxUsoComercial)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCdadInquilinos)
                            .addComponent(txtInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(chckGarage)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecioAlquilar)
                            .addComponent(txtPrecioAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lstPropiedades, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargar)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPromedioAlquileres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3oMasHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:

        String direccion = txtDireccion.getText();
        int cantHabitaciones = Integer.parseInt(txtCdadHabitaciones.getText());
        float precio = Float.parseFloat(txtPrecioBaseAlquiler.getText());
        boolean usoComercial = chkBoxUsoComercial.isSelected();
        int cantInquilinos = Integer.parseInt(txtInquilinos.getText());
        if (rbtnCasa.isSelected()) {
            boolean garage = chckGarage.isSelected();
            Casa nuevaCasa = new Casa(garage, direccion, cantHabitaciones, precio, usoComercial, cantInquilinos);
            inmobiliaria.agregarPropiedad(nuevaCasa);
            txtPrecioAlquiler.setText("$ " + Float.toString(nuevaCasa.calculoAlquiler()));
        } else if (rbtnDepartamento.isSelected()) {
            float expensas = Float.parseFloat(txtExpensas.getText());
            Departamento nuevoDepartamento = new Departamento(expensas, direccion, cantHabitaciones, precio, usoComercial, cantHabitaciones);
            inmobiliaria.agregarPropiedad(nuevoDepartamento);
            txtPrecioAlquiler.setText("$ " + Float.toString(nuevoDepartamento.calculoAlquiler()));
        }
        listadoPropiedades.setListData(inmobiliaria.getPropiedades().toArray());
        txtPrecioAlquiler.setVisible(true);
        lblPrecioAlquilar.setVisible(true);
    }//GEN-LAST:event_btnCargarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txt3oMasHabitaciones.setText(Integer.toString(inmobiliaria.cantidadCasas3OMasHab()));
        txtPromedioAlquileres.setText("$ " + Float.toString(inmobiliaria.promedioAlquileres2Inquilinos()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbtnDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDepartamentoActionPerformed
        // TODO add your handling code here:

        chckGarage.setEnabled(false);
        lblExpensas.setEnabled(true);
        txtExpensas.setEnabled(true);

    }//GEN-LAST:event_rbtnDepartamentoActionPerformed

    private void rbtnCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCasaActionPerformed
        // TODO add your handling code here:
        lblExpensas.setEnabled(false);
        txtExpensas.setEnabled(false);
        chckGarage.setEnabled(true);
    }//GEN-LAST:event_rbtnCasaActionPerformed

    private void txtCdadHabitacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCdadHabitacionesKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if (Character.isDigit(car)) {

        } else {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo Puede Ingresar Numeros");
//getToolkit().beep();
        }
    }//GEN-LAST:event_txtCdadHabitacionesKeyTyped

    private void txtPrecioBaseAlquilerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioBaseAlquilerKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if (Character.isDigit(car)) {

        } else {
            evt.consume();
            JOptionPane.showMessageDialog(this, "solo Ingrese Numeros");
//getToolkit().beep();
        }
    }//GEN-LAST:event_txtPrecioBaseAlquilerKeyTyped

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
            java.util.logging.Logger.getLogger(VentanaInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInmobiliaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JCheckBox chckGarage;
    private javax.swing.JCheckBox chkBoxUsoComercial;
    private javax.swing.ButtonGroup grupoDeBotones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCdadHabitaciones;
    private javax.swing.JLabel lblCdadInquilinos;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblExpensas;
    private javax.swing.JLabel lblPrecioAlquilar;
    private javax.swing.JLabel lblPrecioBase;
    private javax.swing.JList listadoPropiedades;
    private javax.swing.JScrollPane lstPropiedades;
    private javax.swing.JRadioButton rbtnCasa;
    private javax.swing.JRadioButton rbtnDepartamento;
    private javax.swing.JTextField txt3oMasHabitaciones;
    private javax.swing.JTextField txtCdadHabitaciones;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtExpensas;
    private javax.swing.JTextField txtInquilinos;
    private javax.swing.JTextField txtPrecioAlquiler;
    private javax.swing.JTextField txtPrecioBaseAlquiler;
    private javax.swing.JTextField txtPromedioAlquileres;
    // End of variables declaration//GEN-END:variables
}
