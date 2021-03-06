package scubase3.panels;

import java.awt.Color;
import javax.swing.SwingUtilities;
import scubase3.Const;
import scubase3.ScubaController;
import scubase3.ScubaFrame;
import scubase3.ScubaModel;

/**
 *
 * @author liu1028, eden0021, mitc0341, craw0117, kris0068
 */
public final class ScubaInputPanel extends javax.swing.JPanel {

    private ScubaController controller;

    private int inputFlags;
    private double partialPressure;
    private double fractionOxygen;
    private double depth;

    /**
     * Creates new form ScubaInputPanel
     */
    public ScubaInputPanel() {

        initComponents();
    }

    /**
     * Updates dynamic components - must be called after state change.
     */
    public void update() {
        //hacky workaround for netbeans gui editor
        if (controller == null) {
            ScubaFrame topFrame = (ScubaFrame) SwingUtilities.getAncestorOfClass(ScubaFrame.class, this);
            controller = topFrame.getController();
        }

        ScubaModel model = controller.getModel();

        inputFlags = model.getInputFlags();

        partialPressure = model.getPartialPressure();
        fractionOxygen = model.getFractionOxygen();
        depth = model.getDepth();

        partialPressureSpinner.setValue(partialPressure);
        fractionOxygenSpinner.setValue(fractionOxygen);
        depthSpinner.setValue(depth);

        //check flags to display each input
        boolean showPartialInput = (inputFlags & Const.FLAG_O2_PRESSURE) == Const.FLAG_O2_PRESSURE;
        partialPressurePanel.setVisible(showPartialInput);

        boolean showOxygenInput = (inputFlags & Const.FLAG_FRAC_OXYGEN) == Const.FLAG_FRAC_OXYGEN;
        fractionOxygenPanel.setVisible(showOxygenInput);

        boolean showDepthInput = (inputFlags & Const.FLAG_DEPTH) == Const.FLAG_DEPTH;
        depthPanel.setVisible(showDepthInput);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        inputSelectGroup = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        inputToolBar = new javax.swing.JToolBar();
        eadSelect = new javax.swing.JToggleButton();
        modSelect = new javax.swing.JToggleButton();
        bestMixSelect = new javax.swing.JToggleButton();
        partialPressureSelect = new javax.swing.JToggleButton();
        smodSelect = new javax.swing.JToggleButton();
        partialPressurePanel = new javax.swing.JPanel();
        partialPressureLabel = new javax.swing.JLabel();
        partialPressureSpinner = new javax.swing.JSpinner();
        partialPressureHelpLabel = new javax.swing.JLabel();
        fractionOxygenPanel = new javax.swing.JPanel();
        fractionOxygenLabel = new javax.swing.JLabel();
        fractionOxygenSpinner = new javax.swing.JSpinner();
        fractionOxygenHelpLabel = new javax.swing.JLabel();
        depthPanel = new javax.swing.JPanel();
        depthLabel = new javax.swing.JLabel();
        depthSpinner = new javax.swing.JSpinner();
        depthHelpLabel = new javax.swing.JLabel();
        inputCalculate = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 15));

        jMenu1.setText("jMenu1");

        setMinimumSize(new java.awt.Dimension(320, 312));
        setPreferredSize(new java.awt.Dimension(320, 312));
        setLayout(new java.awt.GridBagLayout());

        inputToolBar.setBorder(null);
        inputToolBar.setFloatable(false);
        inputToolBar.setRollover(true);

        inputSelectGroup.add(eadSelect);
        eadSelect.setSelected(true);
        eadSelect.setText("EAD");
        eadSelect.setToolTipText("Equivalent Air Depth");
        eadSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eadSelect.setFocusable(false);
        eadSelect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eadSelect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eadSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eadSelectActionPerformed(evt);
            }
        });
        inputToolBar.add(eadSelect);

        inputSelectGroup.add(modSelect);
        modSelect.setText("MOD");
        modSelect.setToolTipText("Maximum Operating Depth");
        modSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modSelect.setFocusable(false);
        modSelect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modSelect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        modSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modSelectActionPerformed(evt);
            }
        });
        inputToolBar.add(modSelect);

        inputSelectGroup.add(bestMixSelect);
        bestMixSelect.setText("Best Mix");
        bestMixSelect.setToolTipText("Fraction of Oxygen");
        bestMixSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bestMixSelect.setFocusable(false);
        bestMixSelect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bestMixSelect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bestMixSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestMixSelectActionPerformed(evt);
            }
        });
        inputToolBar.add(bestMixSelect);

        inputSelectGroup.add(partialPressureSelect);
        partialPressureSelect.setText("PP");
        partialPressureSelect.setToolTipText("Partial Pressure of oxygen (PPO2)");
        partialPressureSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        partialPressureSelect.setFocusable(false);
        partialPressureSelect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        partialPressureSelect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        partialPressureSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partialPressureSelectActionPerformed(evt);
            }
        });
        inputToolBar.add(partialPressureSelect);

        inputSelectGroup.add(smodSelect);
        smodSelect.setText("SMOD");
        smodSelect.setToolTipText("Standard Max Operating Depth");
        smodSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        smodSelect.setFocusable(false);
        smodSelect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        smodSelect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        smodSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smodSelectActionPerformed(evt);
            }
        });
        inputToolBar.add(smodSelect);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        add(inputToolBar, gridBagConstraints);

        partialPressurePanel.setAlignmentX(0.0F);
        partialPressurePanel.setAlignmentY(0.0F);
        partialPressurePanel.setLayout(new javax.swing.BoxLayout(partialPressurePanel, javax.swing.BoxLayout.Y_AXIS));

        partialPressureLabel.setText("Partial Pressure (Pg)");
        partialPressurePanel.add(partialPressureLabel);

        partialPressureSpinner.setModel(new javax.swing.SpinnerNumberModel(1.1d, 1.1d, 1.6d, 0.01d));
        partialPressureSpinner.setAlignmentX(0.0F);
        partialPressureSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(partialPressureSpinner, "0.0"));
        partialPressureSpinner.setMaximumSize(new java.awt.Dimension(250, 24));
        partialPressureSpinner.setMinimumSize(new java.awt.Dimension(100, 25));
        partialPressureSpinner.setPreferredSize(new java.awt.Dimension(250, 24));
        partialPressureSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                partialPressureSpinnerStateChanged(evt);
            }
        });
        partialPressurePanel.add(partialPressureSpinner);
        javax.swing.JSpinner.NumberEditor pEditor = (javax.swing.JSpinner.NumberEditor)partialPressureSpinner.getEditor();
        java.text.DecimalFormat pFormat = pEditor.getFormat();
        pFormat.setMinimumFractionDigits(2);

        partialPressureHelpLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        partialPressureHelpLabel.setText("1.1 - 1.6 bar");
        partialPressurePanel.add(partialPressureHelpLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(partialPressurePanel, gridBagConstraints);

        fractionOxygenPanel.setAlignmentX(0.0F);
        fractionOxygenPanel.setAlignmentY(0.0F);
        fractionOxygenPanel.setLayout(new javax.swing.BoxLayout(fractionOxygenPanel, javax.swing.BoxLayout.Y_AXIS));

        fractionOxygenLabel.setText("Oxygen Percent (Fg)");
        fractionOxygenPanel.add(fractionOxygenLabel);

        fractionOxygenSpinner.setModel(new javax.swing.SpinnerNumberModel(0.32d, 0.0d, 1.0d, 0.01d));
        fractionOxygenSpinner.setAlignmentX(0.0F);
        fractionOxygenSpinner.setMaximumSize(new java.awt.Dimension(250, 24));
        fractionOxygenSpinner.setMinimumSize(new java.awt.Dimension(100, 25));
        fractionOxygenSpinner.setPreferredSize(new java.awt.Dimension(250, 24));
        fractionOxygenSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fractionOxygenSpinnerStateChanged(evt);
            }
        });
        fractionOxygenPanel.add(fractionOxygenSpinner);
        javax.swing.JSpinner.NumberEditor oEditor = (javax.swing.JSpinner.NumberEditor)fractionOxygenSpinner.getEditor();
        java.text.DecimalFormat oFormat = oEditor.getFormat();
        oFormat.setMinimumFractionDigits(2);

        fractionOxygenHelpLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        fractionOxygenHelpLabel.setText("e.g. 0.32 = 32%");
        fractionOxygenPanel.add(fractionOxygenHelpLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(fractionOxygenPanel, gridBagConstraints);

        depthPanel.setAlignmentX(0.0F);
        depthPanel.setAlignmentY(0.0F);
        depthPanel.setLayout(new javax.swing.BoxLayout(depthPanel, javax.swing.BoxLayout.Y_AXIS));

        depthLabel.setText("Depth (m)");
        depthPanel.add(depthLabel);

        depthSpinner.setModel(new javax.swing.SpinnerNumberModel(33.0d, 0.0d, 100.0d, 0.1d));
        depthSpinner.setAlignmentX(0.0F);
        depthSpinner.setMaximumSize(new java.awt.Dimension(250, 24));
        depthSpinner.setMinimumSize(new java.awt.Dimension(100, 25));
        depthSpinner.setPreferredSize(new java.awt.Dimension(250, 24));
        depthSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                depthSpinnerStateChanged(evt);
            }
        });
        depthPanel.add(depthSpinner);
        javax.swing.JSpinner.NumberEditor dEditor = (javax.swing.JSpinner.NumberEditor)depthSpinner.getEditor();
        java.text.DecimalFormat dFormat = dEditor.getFormat();
        dFormat.setMinimumFractionDigits(1);

        depthHelpLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        depthHelpLabel.setText("e.g. 33m");
        depthPanel.add(depthHelpLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(depthPanel, gridBagConstraints);

        inputCalculate.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        inputCalculate.setText("Calculate");
        inputCalculate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inputCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCalculateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(inputCalculate, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(filler2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void inputCalculateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_inputCalculateActionPerformed
    {//GEN-HEADEREND:event_inputCalculateActionPerformed
        controller.setCalcType(controller.getCalcType());

    }//GEN-LAST:event_inputCalculateActionPerformed

    private void partialPressureSelectActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_partialPressureSelectActionPerformed
    {//GEN-HEADEREND:event_partialPressureSelectActionPerformed
        controller.setCalcType("PP");
    }//GEN-LAST:event_partialPressureSelectActionPerformed

    private void eadSelectActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_eadSelectActionPerformed
    {//GEN-HEADEREND:event_eadSelectActionPerformed
        controller.setCalcType("EAD");
    }//GEN-LAST:event_eadSelectActionPerformed

    private void modSelectActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_modSelectActionPerformed
    {//GEN-HEADEREND:event_modSelectActionPerformed
        controller.setCalcType("MOD");
    }//GEN-LAST:event_modSelectActionPerformed

    private void bestMixSelectActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bestMixSelectActionPerformed
    {//GEN-HEADEREND:event_bestMixSelectActionPerformed
        controller.setCalcType("BM");
    }//GEN-LAST:event_bestMixSelectActionPerformed

    private void smodSelectActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_smodSelectActionPerformed
    {//GEN-HEADEREND:event_smodSelectActionPerformed
        controller.setCalcType("SMOD");
        controller.setPartialPressure(1.4);
    }//GEN-LAST:event_smodSelectActionPerformed

    private void partialPressureSpinnerStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_partialPressureSpinnerStateChanged
    {//GEN-HEADEREND:event_partialPressureSpinnerStateChanged
        controller.setPartialPressure((double) ((javax.swing.JSpinner) evt.getSource()).getValue());
        controller.setCalcType(controller.getCalcType());
    }//GEN-LAST:event_partialPressureSpinnerStateChanged

    private void fractionOxygenSpinnerStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_fractionOxygenSpinnerStateChanged
    {//GEN-HEADEREND:event_fractionOxygenSpinnerStateChanged
        controller.setFractionOxygen((double) ((javax.swing.JSpinner) evt.getSource()).getValue());
        controller.setCalcType(controller.getCalcType());
    }//GEN-LAST:event_fractionOxygenSpinnerStateChanged

    private void depthSpinnerStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_depthSpinnerStateChanged
    {//GEN-HEADEREND:event_depthSpinnerStateChanged
        controller.setDepth((double) ((javax.swing.JSpinner) evt.getSource()).getValue());
        controller.setCalcType(controller.getCalcType());
    }//GEN-LAST:event_depthSpinnerStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bestMixSelect;
    private javax.swing.JLabel depthHelpLabel;
    private javax.swing.JLabel depthLabel;
    private javax.swing.JPanel depthPanel;
    private javax.swing.JSpinner depthSpinner;
    private javax.swing.JToggleButton eadSelect;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel fractionOxygenHelpLabel;
    private javax.swing.JLabel fractionOxygenLabel;
    private javax.swing.JPanel fractionOxygenPanel;
    private javax.swing.JSpinner fractionOxygenSpinner;
    private javax.swing.JButton inputCalculate;
    private javax.swing.ButtonGroup inputSelectGroup;
    private javax.swing.JToolBar inputToolBar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JToggleButton modSelect;
    private javax.swing.JLabel partialPressureHelpLabel;
    private javax.swing.JLabel partialPressureLabel;
    private javax.swing.JPanel partialPressurePanel;
    private javax.swing.JToggleButton partialPressureSelect;
    private javax.swing.JSpinner partialPressureSpinner;
    private javax.swing.JToggleButton smodSelect;
    // End of variables declaration//GEN-END:variables
}
