
package Converter;

public class NewJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NewJFrame.class.getName());

    // Die hidden text langs to conversion values is sodat julle kan sien wat ek gebruik het
private final double[] exchangeRates = {
    0.0600,         // Rand na Doller
    16.6800,        // Doller na Rand
    0.00000075,     // Rand na Bitcoin
    1332940.0,      // Bitcoin na Rand
    0.0000129,      // Doller na Bitcoin
    77340.0,        // Bitcoin na Doller
    0.7911,         // Rand na DogeCoin
    1.2640,         // DogeCoin na Rand
    13.1850,        // Doller na DogeCoin
    0.0758,         // DogeCoin na Doller
    1020436.0,      // Bitcoin na DogeCoin
    0.00000098      // DogeCoin na Bitcoin
};

    public NewJFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pairSelector = new javax.swing.JComboBox<>();
        amountField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        resultDisplayLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pairSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ZAR to USD", "USD to ZAR", "ZAR to Bitcoin", "Bitcoin to ZAR", "USD to Bitcoin", "Bitcoin to USD", "ZAR to DogeCoin", "DogeCoin to ZAR", "USD to DogeCoin", "DogeCoin to USD", "Bitcoin to DogeCoin", "DogeCoin to Bitcoin", " " }));
        pairSelector.addActionListener(this::pairSelectorActionPerformed);

        jButton1.setText("Convert");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(pairSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(resultDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pairSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(137, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String rawInput = amountField.getText().trim();

    if (rawInput.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, 
                "Please enter an amount to convert.", 
                "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        double inputAmount = Double.parseDouble(rawInput);

        if (inputAmount < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                    "Amount cannot be negative.", 
                    "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        int selectedIndex = pairSelector.getSelectedIndex();
        double targetedRate = exchangeRates[selectedIndex];
        double conversionOutput = inputAmount * targetedRate;

        String selectedString = pairSelector.getSelectedItem().toString();
        String[] symbols = selectedString.split(" to ");
        String toCurrency = symbols[1];

        String formattedOutput;
        if (toCurrency.equalsIgnoreCase("Bitcoin")) {
            formattedOutput = String.format("%.8f", conversionOutput);
        } else if (toCurrency.equalsIgnoreCase("DogeCoin")) {
            formattedOutput = String.format("%.4f", conversionOutput);
        } else {
            formattedOutput = String.format("%.2f", conversionOutput);
        }

        resultDisplayLabel.setText("Result: " + inputAmount + " " + symbols[0] + " = " + formattedOutput + " " + toCurrency);

    } catch (NumberFormatException ex) {
        javax.swing.JOptionPane.showMessageDialog(this, 
                "Invalid format. Please enter numbers only.", 
                "Format Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pairSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pairSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pairSelectorActionPerformed


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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new NewJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> pairSelector;
    private javax.swing.JLabel resultDisplayLabel;
    // End of variables declaration//GEN-END:variables
}
