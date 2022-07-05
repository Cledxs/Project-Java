/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import javax.swing.ImageIcon;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author CLAUDIO
 */
public class Ventana extends javax.swing.JFrame {
 DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Raiz");
 DefaultTreeModel modeloTree = new DefaultTreeModel(raiz);
 
 
    public Ventana() {
        cargarDatosDeModeloTree();
        initComponents();
    }
    private void eventosNodoSeleccionado (DefaultMutableTreeNode nodoSeleccionado){
        if(nodoSeleccionado.toString().equals("Rojo")){
            etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/mundo.jpg")));
        } else if (nodoSeleccionado.toString().equals("Azul") ){
           etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/mundos.jpg")));  
        }
    }
    private void cargarDatosDeModeloTree(){
     DefaultMutableTreeNode colores = new DefaultMutableTreeNode("Colores");
     DefaultMutableTreeNode negro = new DefaultMutableTreeNode("Negro");
     DefaultMutableTreeNode azul = new DefaultMutableTreeNode("Azul");
     DefaultMutableTreeNode rojo = new DefaultMutableTreeNode("Rojo");
     
     colores.add(negro);
     colores.add(azul);
     colores.add(rojo);
     
     DefaultMutableTreeNode deportes = new DefaultMutableTreeNode("Deportes");
     DefaultMutableTreeNode futbol = new DefaultMutableTreeNode("Futbol");
     DefaultMutableTreeNode futbolamericano = new DefaultMutableTreeNode("Futbol Americano");
     DefaultMutableTreeNode fulbito = new DefaultMutableTreeNode("Fulbito");
     
     futbol.add(futbolamericano);
     futbol.add(fulbito);
     
     DefaultMutableTreeNode tennis = new DefaultMutableTreeNode("Tennis");
     deportes.add(futbol);
     deportes.add(tennis);
     
     
     raiz.add(colores);
     raiz.add(deportes);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        etiquetaImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        arbol.setModel(modeloTree);
        TreeSelectionListener oyenteTree = new TreeSelectionListener(){
            @Override
            public void valueChanged(TreeSelectionEvent e){
                DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode)arbol.getLastSelectedPathComponent();
                eventosNodoSeleccionado (nodoSeleccionado);

            }

        };
        arbol.getSelectionModel().addTreeSelectionListener(oyenteTree);
        jScrollPane1.setViewportView(arbol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(etiquetaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(etiquetaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
