
public class PizzaCost2 extends javax.swing.JFrame {

    public PizzaCost2() {
        initComponents();
        final double labour = 1.5;
        final double heat = 0.75;
        final double toppings = 0.75;
        final double ingredients = 0.50;
        double inches, ingredientcost, toppingcount, toppingcost;
        final double totalcost;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CostButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        SizeField = new javax.swing.JTextField();
        ToppingsField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabourPrice = new javax.swing.JLabel();
        HeatPrice = new javax.swing.JLabel();
        ToppingPrice = new javax.swing.JLabel();
        BaseCostPrice = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TotalCostField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Size of Pizza:");

        jLabel2.setText("Enter number of toppings:");

        CostButton.setText("Calculate Cost");
        CostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostButtonActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");

        SizeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeFieldActionPerformed(evt);
            }
        });

        ToppingsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToppingsFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Labour Cost (Fixed)");

        jLabel4.setText("Heat/Utilities (Fixed)");

        jLabel5.setText("Toppings Cost");

        jLabel6.setText("Base Ingredient Cost");

        LabourPrice.setBackground(new java.awt.Color(0, 0, 0));
        LabourPrice.setForeground(new java.awt.Color(255, 255, 255));
        LabourPrice.setText("$1.50");
        LabourPrice.setOpaque(true);

        HeatPrice.setBackground(new java.awt.Color(0, 0, 0));
        HeatPrice.setForeground(new java.awt.Color(255, 255, 255));
        HeatPrice.setText("$0.75");
        HeatPrice.setOpaque(true);

        ToppingPrice.setBackground(new java.awt.Color(0, 0, 0));
        ToppingPrice.setForeground(new java.awt.Color(255, 255, 255));
        ToppingPrice.setText("$0.00");
        ToppingPrice.setOpaque(true);

        BaseCostPrice.setBackground(new java.awt.Color(0, 0, 0));
        BaseCostPrice.setForeground(new java.awt.Color(255, 255, 255));
        BaseCostPrice.setText("$0.00");
        BaseCostPrice.setOpaque(true);

        jLabel11.setText("Total Cost");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SizeField, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(ToppingsField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CostButton)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabourPrice)
                            .addComponent(HeatPrice)
                            .addComponent(ToppingPrice)
                            .addComponent(BaseCostPrice)
                            .addComponent(TotalCostField))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(SizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ToppingsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CostButton)
                    .addComponent(ResetButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LabourPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(HeatPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ToppingPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(BaseCostPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TotalCostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SizeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeFieldActionPerformed
        
    }//GEN-LAST:event_SizeFieldActionPerformed

    private void ToppingsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToppingsFieldActionPerformed
        
    }//GEN-LAST:event_ToppingsFieldActionPerformed

    private void CostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostButtonActionPerformed
        double inches = Double.parseDouble(SizeField.getText());
        double toppingcount = Double.parseDouble(ToppingsField.getText());
        double labour = 1.5;
        double heat = 0.75;
        double ingredients = 0;
        double toppings = 0.75;
        double ingredientcost = inches + ingredients;
        double toppingcost = toppingcount * toppings;
        double totalcost = ingredientcost + toppingcost + labour + heat;
        
        ToppingPrice.setText("$" + toppingcost);
        BaseCostPrice.setText("$" + ingredientcost);
        TotalCostField.setText("$" + totalcost);
        
        
    }//GEN-LAST:event_CostButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PizzaCost2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaCost2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaCost2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaCost2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaCost2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BaseCostPrice;
    private javax.swing.JButton CostButton;
    private javax.swing.JLabel HeatPrice;
    private javax.swing.JLabel LabourPrice;
    private javax.swing.JButton ResetButton;
    private javax.swing.JTextField SizeField;
    private javax.swing.JLabel ToppingPrice;
    private javax.swing.JTextField ToppingsField;
    private javax.swing.JTextField TotalCostField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
