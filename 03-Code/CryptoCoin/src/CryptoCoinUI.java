/*
Title: CryptoCoinUI
Description: Currency Converter GUI (Swing). Takes an amount, converts it
             between the selected currencies using Converter, and also
             shows the ZAR value.

Authors: Garison Pieters (222535164)
         Etienne G. Roux (260041637)
 */

public class CryptoCoinUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CryptoCoinUI.class.getName());
    private final Converter converter = new Converter();
    
    // Creates new form CryptoCoinUI
    public CryptoCoinUI() {
        initComponents();
        populateCurrencyComboBoxes();
        EndValueTF.setEditable(false); // Conversion bar is non-editable
    }
// Combo Boxes
    private void populateCurrencyComboBoxes() {
        FromValueCB.setModel(new javax.swing.DefaultComboBoxModel<>(converter.getCodes()));
        ToValueCB.setModel(new javax.swing.DefaultComboBoxModel<>(converter.getCodes()));
        FromValueCB.setSelectedItem("ZAR");
        ToValueCB.setSelectedItem("USD");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TitleLbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        AmountLbl = new javax.swing.JLabel();
        FromCurrencyLbl = new javax.swing.JLabel();
        ToCurrencyLbl = new javax.swing.JLabel();
        InsertedValueTF = new javax.swing.JTextField();
        FromValueCB = new javax.swing.JComboBox<>();
        ToValueCB = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        EndValueLbl = new javax.swing.JLabel();
        EndValueTF = new javax.swing.JTextField();
        jZarLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        ConvertBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(243, 246, 251));

        jPanel2.setBackground(new java.awt.Color(15, 42, 82));

        TitleLbl.setBackground(new java.awt.Color(255, 255, 255));
        TitleLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        TitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLbl.setText("Currency Converter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(TitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(TitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(213, 222, 234)));

        AmountLbl.setBackground(new java.awt.Color(255, 255, 255));
        AmountLbl.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        AmountLbl.setForeground(new java.awt.Color(31, 41, 55));
        AmountLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AmountLbl.setText("Amount");
        AmountLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        FromCurrencyLbl.setBackground(new java.awt.Color(255, 255, 255));
        FromCurrencyLbl.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        FromCurrencyLbl.setForeground(new java.awt.Color(31, 41, 55));
        FromCurrencyLbl.setText("From Currency");

        ToCurrencyLbl.setBackground(new java.awt.Color(255, 255, 255));
        ToCurrencyLbl.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ToCurrencyLbl.setForeground(new java.awt.Color(31, 41, 55));
        ToCurrencyLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ToCurrencyLbl.setText("To Currency");
        ToCurrencyLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        InsertedValueTF.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        InsertedValueTF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        InsertedValueTF.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(213, 222, 234)), javax.swing.BorderFactory.createEmptyBorder(2, 8, 2, 8)));
        InsertedValueTF.setOpaque(true);
        InsertedValueTF.addActionListener(this::InsertedValueTFActionPerformed);

        FromValueCB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        FromValueCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FromValueCB.setOpaque(true);
        FromValueCB.addActionListener(this::FromValueCBActionPerformed);

        ToValueCB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ToValueCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ToValueCB.setOpaque(true);
        ToValueCB.addActionListener(this::ToValueCBActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FromCurrencyLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(ToCurrencyLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AmountLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InsertedValueTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FromValueCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, 198, Short.MAX_VALUE)
                    .addComponent(ToValueCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(AmountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(InsertedValueTF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FromCurrencyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FromValueCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToCurrencyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToValueCB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(234, 242, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(37, 99, 235)));

        EndValueLbl.setBackground(new java.awt.Color(255, 255, 255));
        EndValueLbl.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        EndValueLbl.setForeground(new java.awt.Color(31, 41, 55));
        EndValueLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EndValueLbl.setText("Conversion");
        EndValueLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        EndValueTF.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        EndValueTF.setForeground(new java.awt.Color(15, 42, 82));
        EndValueTF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EndValueTF.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 99, 235)), javax.swing.BorderFactory.createEmptyBorder(0, 8, 0, 8)));
        EndValueTF.setOpaque(true);
        EndValueTF.addActionListener(this::EndValueTFActionPerformed);

        jZarLabel.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jZarLabel.setForeground(new java.awt.Color(21, 128, 61));
        jZarLabel.setText("ZAR value: -");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EndValueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EndValueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jZarLabel))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EndValueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(EndValueTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jZarLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(243, 246, 251));

        ConvertBtn.setBackground(new java.awt.Color(37, 99, 235));
        ConvertBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ConvertBtn.setForeground(new java.awt.Color(255, 255, 255));
        ConvertBtn.setText("Convert");
        ConvertBtn.setOpaque(true);
        ConvertBtn.addActionListener(this::ConvertBtnActionPerformed);

        ResetBtn.setBackground(new java.awt.Color(226, 232, 240));
        ResetBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(31, 41, 55));
        ResetBtn.setText("Reset");
        ResetBtn.setOpaque(true);
        ResetBtn.addActionListener(this::ResetBtnActionPerformed);

        ExitBtn.setBackground(new java.awt.Color(254, 226, 226));
        ExitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(185, 28, 28));
        ExitBtn.setText("Exit");
        ExitBtn.setOpaque(true);
        ExitBtn.addActionListener(this::ExitBtnActionPerformed);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConvertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConvertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertedValueTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertedValueTFActionPerformed
        // TODO add your handling code here:
        ConvertBtnActionPerformed(evt);
    }//GEN-LAST:event_InsertedValueTFActionPerformed

    private void FromValueCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromValueCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FromValueCBActionPerformed

    private void ToValueCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToValueCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToValueCBActionPerformed

    private void EndValueTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndValueTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndValueTFActionPerformed

//Convert Button
    private void ConvertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertBtnActionPerformed
        try {
            double amount = Double.parseDouble(InsertedValueTF.getText().trim());
            if (amount < 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Amount cannot be negative.");
                return;
            }

            String from = (String) FromValueCB.getSelectedItem();
            String to = (String) ToValueCB.getSelectedItem();

            double result = converter.convert(amount, from, to);
            EndValueTF.setText(String.format("%.8f %s", result, to));

            double zar = converter.convert(amount, from, "ZAR");
            jZarLabel.setText(String.format("ZAR value: R %.2f", zar));

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        }
 
    }//GEN-LAST:event_ConvertBtnActionPerformed

// Reset Button
    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
        InsertedValueTF.setText("");
        EndValueTF.setText("");
        jZarLabel.setText("ZAR value: -"); // Added
        FromValueCB.setSelectedItem("USD");
        ToValueCB.setSelectedItem("BTC");
        InsertedValueTF.requestFocus();
        
    }//GEN-LAST:event_ResetBtnActionPerformed

// Exit Button
    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        int choice = javax.swing.JOptionPane.showConfirmDialog(this,
                "Exit the Converter?", "Confirm exit",
                javax.swing.JOptionPane.YES_NO_OPTION);
        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitBtnActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new CryptoCoinUI().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel AmountLbl;
    javax.swing.JButton ConvertBtn;
    javax.swing.JLabel EndValueLbl;
    javax.swing.JTextField EndValueTF;
    javax.swing.JButton ExitBtn;
    javax.swing.JLabel FromCurrencyLbl;
    javax.swing.JComboBox<String> FromValueCB;
    javax.swing.JTextField InsertedValueTF;
    javax.swing.JButton ResetBtn;
    javax.swing.JLabel TitleLbl;
    javax.swing.JLabel ToCurrencyLbl;
    javax.swing.JComboBox<String> ToValueCB;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JPanel jPanel4;
    javax.swing.JPanel jPanel6;
    javax.swing.JLabel jZarLabel;
    // End of variables declaration//GEN-END:variables
}