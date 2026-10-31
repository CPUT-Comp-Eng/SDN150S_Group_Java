/**
rouxtronics
*/

package betaCrypto;
// Imports 

public class betaCrypto extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(betaCrypto.class.getName());
    private Converter converter = new Converter();
    
    public betaCrypto() {
        initComponents();
        jFromSelector.setModel(new javax.swing.DefaultComboBoxModel<>(converter.getCodes()));
        jToSelector.setModel(new javax.swing.DefaultComboBoxModel<>(converter.getCodes()));
        jFromSelector.setSelectedItem("BTC");
        jToSelector.setSelectedItem("USD");
        jConvertOutput.setEditable(false);
        getRootPane().setDefaultButton(jConvertButton);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitlePanel = new javax.swing.JPanel();
        jTitleLabel = new javax.swing.JLabel();
        jSelectorPanel = new javax.swing.JPanel();
        jToSelector = new javax.swing.JComboBox<>();
        jFromSelector = new javax.swing.JComboBox<>();
        jFromLabel = new javax.swing.JLabel();
        jToLabel = new javax.swing.JLabel();
        jInOutPanel = new javax.swing.JPanel();
        jAmountLabel = new javax.swing.JLabel();
        jConvertionLabel = new javax.swing.JLabel();
        jAmountInput = new javax.swing.JTextField();
        jConvertOutput = new javax.swing.JTextField();
        jZarLabel = new javax.swing.JLabel();
        jButtonPanel = new javax.swing.JPanel();
        jExitButton = new javax.swing.JButton();
        jConvertButton = new javax.swing.JButton();
        jResetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTitlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 30));

        jTitleLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitleLabel.setText("Crypto Currency Converter");

        javax.swing.GroupLayout jTitlePanelLayout = new javax.swing.GroupLayout(jTitlePanel);
        jTitlePanel.setLayout(jTitlePanelLayout);
        jTitlePanelLayout.setHorizontalGroup(
            jTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTitlePanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jTitleLabel)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jTitlePanelLayout.setVerticalGroup(
            jTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSelectorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jToSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jToSelector.addActionListener(this::jToSelectorActionPerformed);

        jFromSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jFromSelector.addActionListener(this::jFromSelectorActionPerformed);

        jFromLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jFromLabel.setText("From:");

        jToLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jToLabel.setText("To:");

        javax.swing.GroupLayout jSelectorPanelLayout = new javax.swing.GroupLayout(jSelectorPanel);
        jSelectorPanel.setLayout(jSelectorPanelLayout);
        jSelectorPanelLayout.setHorizontalGroup(
            jSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSelectorPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFromLabel)
                    .addComponent(jFromSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 160, Short.MAX_VALUE)
                .addGroup(jSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToLabel)
                    .addComponent(jToSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jSelectorPanelLayout.setVerticalGroup(
            jSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSelectorPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFromLabel)
                    .addComponent(jToLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jSelectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFromSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155))
        );

        jInOutPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jAmountLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jAmountLabel.setText("Amount:");

        jConvertionLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jConvertionLabel.setText("Conversion:");

        jConvertOutput.addActionListener(this::jConvertOutputActionPerformed);

        jZarLabel.setText("ZAR value: -");

        javax.swing.GroupLayout jInOutPanelLayout = new javax.swing.GroupLayout(jInOutPanel);
        jInOutPanel.setLayout(jInOutPanelLayout);
        jInOutPanelLayout.setHorizontalGroup(
            jInOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInOutPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jInOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAmountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jZarLabel)
                    .addComponent(jConvertOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jConvertionLabel))
                .addGap(31, 31, 31))
        );
        jInOutPanelLayout.setVerticalGroup(
            jInOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInOutPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jInOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAmountLabel)
                    .addComponent(jConvertionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jConvertOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jZarLabel)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButtonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jExitButton.setText("Exit");
        jExitButton.addActionListener(this::jExitButtonActionPerformed);

        jConvertButton.setText("Convert");
        jConvertButton.addActionListener(this::jConvertButtonActionPerformed);

        jResetButton.setText("Reset");
        jResetButton.addActionListener(this::jResetButtonActionPerformed);

        javax.swing.GroupLayout jButtonPanelLayout = new javax.swing.GroupLayout(jButtonPanel);
        jButtonPanel.setLayout(jButtonPanelLayout);
        jButtonPanelLayout.setHorizontalGroup(
            jButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButtonPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jResetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jConvertButton)
                .addGap(83, 83, 83)
                .addComponent(jExitButton)
                .addGap(51, 51, 51))
        );
        jButtonPanelLayout.setVerticalGroup(
            jButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jResetButton)
                    .addComponent(jConvertButton)
                    .addComponent(jExitButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSelectorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jInOutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSelectorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToSelectorActionPerformed

    private void jExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonActionPerformed
        // Exit Button Code
        int choice = javax.swing.JOptionPane.showConfirmDialog(this,
                "Exit the Converter?", "Confirm exit",
                javax.swing.JOptionPane.YES_NO_OPTION);
        if(choice == javax.swing.JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jExitButtonActionPerformed

    private void jResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetButtonActionPerformed
        // Reset Button Code
        jAmountInput.setText("");
        jConvertOutput.setText("");
        jFromSelector.setSelectedItem("ZAR");
        jToSelector.setSelectedItem("BTC");
        jAmountInput.requestFocusInWindow();
        jZarLabel.setText("ZAR value: -");
    }//GEN-LAST:event_jResetButtonActionPerformed

    private void jFromSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFromSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFromSelectorActionPerformed

    private void jConvertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConvertButtonActionPerformed
        // Convert Button Code
        
        String text = jAmountInput.getText().trim().replace(',', '.'); // comma

        // Check the input box is not empty
        if (text.isEmpty()) {
            showError("Please enter an amount.");
            return;
        }

        try {
            double amount = Double.parseDouble(text);

            // Check the amount is not negative
            if (amount < 0) {
                showError("Amount cannot be negative.");
                return;
            }

            String from = (String) jFromSelector.getSelectedItem();
            String to = (String) jToSelector.getSelectedItem();

            double result = converter.convert(amount, from, to);
            jConvertOutput.setText(String.format(java.util.Locale.US, "%,.6f", result) + " " + to); // More precesion 
            // Always show the Rand (ZAR) value as well
            double zarValue = converter.convert(amount, from, "ZAR");
            jZarLabel.setText("ZAR value: R " + String.format(java.util.Locale.US, "%,.2f", zarValue));

        } catch (NumberFormatException ex) {
            showError("Please enter a valid number, e.g. 0.5 or 100.");
        }
    }//GEN-LAST:event_jConvertButtonActionPerformed

    private void jConvertOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConvertOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConvertOutputActionPerformed

      private void showError(String msg) {
        javax.swing.JOptionPane.showMessageDialog(this, msg, "Input error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
    }
      public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new betaCrypto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAmountInput;
    private javax.swing.JLabel jAmountLabel;
    private javax.swing.JPanel jButtonPanel;
    private javax.swing.JButton jConvertButton;
    private javax.swing.JTextField jConvertOutput;
    private javax.swing.JLabel jConvertionLabel;
    private javax.swing.JButton jExitButton;
    private javax.swing.JLabel jFromLabel;
    private javax.swing.JComboBox<String> jFromSelector;
    private javax.swing.JPanel jInOutPanel;
    private javax.swing.JButton jResetButton;
    private javax.swing.JPanel jSelectorPanel;
    private javax.swing.JLabel jTitleLabel;
    private javax.swing.JPanel jTitlePanel;
    private javax.swing.JLabel jToLabel;
    private javax.swing.JComboBox<String> jToSelector;
    private javax.swing.JLabel jZarLabel;
    // End of variables declaration//GEN-END:variables
}
