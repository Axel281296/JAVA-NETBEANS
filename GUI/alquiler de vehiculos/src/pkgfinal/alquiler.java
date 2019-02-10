/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgfinal;

import javax.swing.DefaultListModel;


/**
 *
 * @author User
 */
public class alquiler extends javax.swing.JFrame {
      private final java.util.ArrayList arrayarreglo;
     DefaultListModel modeloLista;
     
    public alquiler() {
        initComponents();
        modeloLista= new DefaultListModel();
        LISTA.setModel(modeloLista);
        arrayarreglo = new java.util.ArrayList();
    }
//declaracion de arreglo
   
    
   public void agregar(){
   arreglo unauto = new arreglo();
       
    String datos=jTextField1.getText();
    String dias= jTextField3.getText();
    String costo=COSTO.getText();
    String des=DES.getText();
    String iva=IVA.getText();
    String sub=SUB.getText();
    String to=TOTAL.getText();
    String tip=(String)BOX1.getSelectedItem();
    modeloLista.addElement(datos+" "+tip+"   "+dias+"   "+costo+"   "+des+"   "+iva+"   "+"   "+sub+"   "+to);
   
    unauto.setCliente(datos);
     unauto.setTipo(tip);
     unauto.setCostos(costo);
     unauto.setTiempo(dias);
     unauto.setDescuento(des);
     unauto.setIvas(iva);
     unauto.setSubt(sub);
     unauto.setTotal(to);
     arrayarreglo.add(unauto);
   }
   
    
   
       
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        TERMINAR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        DIAS = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        COSTO = new javax.swing.JTextField();
        DES = new javax.swing.JTextField();
        IVA = new javax.swing.JTextField();
        SUB = new javax.swing.JTextField();
        TOTAL = new javax.swing.JTextField();
        BOX1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LISTA = new javax.swing.JList<>();

        jButton4.setText("RENTADOS ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("ALQUILER DE VEHICULO");

        jButton2.setText("ALQUILAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TERMINAR.setText("SALIR");
        TERMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TERMINARActionPerformed(evt);
            }
        });

        jLabel2.setText("CLIENTE");

        jLabel3.setText("TIPO DE VEHICULO");

        jLabel4.setText("DIAS DE ALQUILER");

        jLabel5.setText("FECHA DE INGRESO");

        jLabel6.setText("COSTO TOTAL");

        jLabel7.setText("DESCUENTO");

        jLabel8.setText("IVA");

        jLabel9.setText("SUBTOTAL");

        jLabel10.setText("TOTAL");

        jButton3.setText("CALCULAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BOX1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUTOMOVIL", "CAMIONETA", "VANS", "CAMION" }));

        jButton5.setText("LIMPIAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        LISTA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(LISTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TERMINAR))
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(COSTO, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(DES)
                                    .addComponent(IVA)
                                    .addComponent(SUB)
                                    .addComponent(TOTAL)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DIAS)
                                        .addComponent(jTextField3)
                                        .addComponent(BOX1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(BOX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(DIAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(COSTO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(DES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(IVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(SUB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton2)
                            .addComponent(TERMINAR)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TERMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TERMINARActionPerformed
       System.exit(0);
    }//GEN-LAST:event_TERMINARActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      
       double dias,costo,descuento,iva,sub,total;
       
       dias= Double.parseDouble(this.DIAS.getText());
       int tipocar= BOX1.getSelectedIndex();
       switch(tipocar){
            case 0:
             
             costo=dias*90;
             if(dias>=3 && dias<11){
             descuento=costo*2/100;
             }
             else if(dias>10){
             descuento=costo*3/100;
             }
             else
             {
             descuento=0;
             }
             iva=(descuento+costo)*0.12;
             sub=descuento+costo;
             total=descuento+costo+iva;
             
             //TEXT
             this.COSTO.setText(String.valueOf(costo));  
             this.DES.setText(String.valueOf(descuento));
             this.IVA.setText(String.valueOf(iva));
             this.SUB.setText(String.valueOf(sub));
             this.TOTAL.setText(String.valueOf(total));
             break;    
            
            case 1:
             costo=dias*120;
             if(dias>=3 && dias<11){
             descuento=costo*2.5/100;
             }
             else if(dias>10){
             descuento=costo*3.5/100;
             }
             else
             {
             descuento=0;
             }
             iva=(descuento+costo)*0.12;
             sub=descuento+costo;
             total=descuento+costo+iva;
             
             //TEXT
             this.COSTO.setText(String.valueOf(costo));  
             this.DES.setText(String.valueOf(descuento));
             this.IVA.setText(String.valueOf(iva));
             this.SUB.setText(String.valueOf(sub));
             this.TOTAL.setText(String.valueOf(total));
                
            break;
            
            case 2:
             costo=dias*150;
             if(dias>=3 && dias<11){
             descuento=costo*3/100;
             }
             else if(dias>10){
             descuento=costo*4/100;
             }
             else
             {
             descuento=0;
             }
             iva=(descuento+costo)*0.12;
             sub=descuento+costo;
             total=descuento+costo+iva;
             
             //TEXT
             this.COSTO.setText(String.valueOf(costo));  
             this.DES.setText(String.valueOf(descuento));
             this.IVA.setText(String.valueOf(iva));
             this.SUB.setText(String.valueOf(sub));
             this.TOTAL.setText(String.valueOf(total));
             break;
             
            case 3:
             costo=dias*250;
             if(dias>=3.5 && dias<11){
             descuento=costo*3/100;
             }
             else if(dias>10){
             descuento=costo*4.5/100;
             }
             else
             {
             descuento=0;
             }
             iva=(descuento+costo)*0.12;
             sub=descuento+costo;
             total=descuento+costo+iva;
             
             //TEXT
             this.COSTO.setText(String.valueOf(costo));  
             this.DES.setText(String.valueOf(descuento));
             this.IVA.setText(String.valueOf(iva));
             this.SUB.setText(String.valueOf(sub));
             this.TOTAL.setText(String.valueOf(total));
                break;
       }
     
    

       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       agregar();
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    
        COSTO.setText(null);
        DES.setText(null);
        DIAS.setText(null);
        IVA.setText(null);
        SUB.setText(null);
        TOTAL.setText(null);
        jTextField1.setText(null);
        jTextField3.setText(null);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alquiler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BOX1;
    private javax.swing.JTextField COSTO;
    private javax.swing.JTextField DES;
    private javax.swing.JTextField DIAS;
    private javax.swing.JTextField IVA;
    private javax.swing.JList<String> LISTA;
    private javax.swing.JTextField SUB;
    private javax.swing.JButton TERMINAR;
    private javax.swing.JTextField TOTAL;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void setTiempo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
