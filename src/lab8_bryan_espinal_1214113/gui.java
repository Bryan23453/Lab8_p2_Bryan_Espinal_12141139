/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_bryan_espinal_1214113;

import java.awt.Color;
import static java.awt.Color.white;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bryan
 */
public class gui extends javax.swing.JFrame {
Color col=white;
bina bin = new bina("./carros.cbm");
ArrayList <Carros> carr=new ArrayList();
    public gui() {
        initComponents();
        bin.cargarArchivo();
        for (Carros car : bin.getcar()) {
                corredor.addItem(String.valueOf(car.getNumero()));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        barrita = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        corredor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        largot = new javax.swing.JLabel();
        pistat = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        nompis = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        largo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        identi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        tipo = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barrita.setBackground(new java.awt.Color(204, 0, 204));
        barrita.setMaximum(1000);
        jPanel1.add(barrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 680, 80));

        tablita.setBackground(new java.awt.Color(204, 153, 255));
        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Corredor", "Distancia"
            }
        ));
        jScrollPane1.setViewportView(tablita);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 680, 360));

        jPanel1.add(corredor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 210, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Largo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        largot.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        largot.setForeground(new java.awt.Color(255, 255, 255));
        largot.setText("_______________");
        jPanel1.add(largot, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        pistat.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        pistat.setForeground(new java.awt.Color(255, 255, 255));
        pistat.setText("_______________");
        jPanel1.add(pistat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pista:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(77, 100, 255));
        jButton2.setText("Comenzar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 40));

        jButton1.setBackground(new java.awt.Color(79, 100, 255));
        jButton1.setText("Pausar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 90, 40));

        jLabel10.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre Pista");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, -1, -1));
        jPanel1.add(nompis, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 200, 30));

        jLabel11.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Largo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, -1, -1));
        jPanel1.add(largo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 200, 30));

        jLabel12.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Numero Identificador");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));
        jPanel1.add(identi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 170, 30));

        jLabel13.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre Corredor");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));
        jPanel1.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 170, 30));

        jButton3.setBackground(new java.awt.Color(185, 96, 245));
        jButton3.setText("Usar Pista");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 680, 200, 40));

        jButton4.setBackground(new java.awt.Color(185, 96, 245));
        jButton4.setText("Reiniciar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 730, 200, 40));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Color");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setBorderPainted(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 690, 170, 40));

        jButton6.setBackground(new java.awt.Color(185, 96, 245));
        jButton6.setText("Guardar");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 740, 170, 40));

        tipo.setBackground(new java.awt.Color(185, 96, 245));
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "McQueen", "Convertible", "Nascar" }));
        jPanel1.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 120, 30));

        jButton7.setBackground(new java.awt.Color(145, 90, 254));
        jButton7.setText("Agregar");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 90, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab8_bryan_espinal_1214113/imagen/fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 790));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab8_bryan_espinal_1214113/imagen/fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        col=JColorChooser.showDialog(this, "elija un color", col);
        jButton5.setBackground(col);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        boolean pass=true;
        for (Carros car : bin.getcar()) {
            if (Integer.parseInt(identi.getText())==car.getNumero()) {
                pass=false;
                break;
            }
        }
        if (pass ) {
            if (Integer.parseInt(identi.getText())>-1) {
                bin.cargarArchivo();
                bin.setcar(new Carros(nom.getText(),col,Integer.parseInt(identi.getText()),tipo.getSelectedIndex()));
                bin.escribirArchivo2();
                corredor.removeAllItems();
                for (Carros car : bin.getcar()) {
                    corredor.addItem(String.valueOf(car.getNumero()));
                }
                JOptionPane.showMessageDialog(this, "Agregado Exitosamente");
                nom.setText("");
                identi.setText("");
                jButton5.setBackground(white);
            }else{
                JOptionPane.showMessageDialog(this, "No Puede Tener un Corredor Con un identificador negativo");
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "No Puede Tener 2 Corredores Con El Misomo Nombre");
        }
            
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        bin.cargarArchivo();
        carr.add(bin.car.get(corredor.getSelectedIndex()));
        DefaultTableModel modelo2=new DefaultTableModel() ;
        modelo2.addColumn("Identificador");
        modelo2.addColumn("Corredor");
        modelo2.addColumn("Distancia");
        Object[] ob=new Object[3];
        Carros per = bin.car.get(corredor.getSelectedIndex());
        boolean pass=true;
            for (int i = 0; i < tablita.getRowCount(); i++) {
                int t=0;
                for (int j = 0; j < tablita.getColumnCount(); j++) {
                    if (t<3) {
                       ob[t]=tablita.getValueAt(i, j);  
                    }
                    t++;
                    
                }
                modelo2.addRow(ob);
            }
            ob[0]=per.getNumero();
            ob[1]=per.getNombre();
            ob[2]=per.getDistancia();
            modelo2.addRow(ob);
            tablita.setModel(modelo2);
            //JOptionPane.showMessageDialog(this, "No Puede volver a agregar a un corredor que ya participa");
                 
            
        
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        pistat.setText(nompis.getText());
        largot.setText(largo.getText());
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        DefaultTableModel modelo2=new DefaultTableModel() ;
        modelo2.addColumn("Identificador");
        modelo2.addColumn("Corredor");
        modelo2.addColumn("Distancia");
        tablita.setModel(modelo2);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        barrita.setMaximum(Integer.valueOf(largot.getText()));
        hilo h=new hilo(barrita ,carr,Integer.valueOf(largot.getText()),tablita);
        Thread proceso2 = new Thread(h);
        proceso2.start();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barrita;
    private javax.swing.JComboBox<String> corredor;
    private javax.swing.JTextField identi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField largo;
    private javax.swing.JLabel largot;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField nompis;
    private javax.swing.JLabel pistat;
    private javax.swing.JTable tablita;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
