/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scubase3;

/**
 *
 * @author nathan
 */
public class ScubaFrame extends javax.swing.JFrame {

    private final ScubaModel model;
    private final ScubaController controller;

    /**
     * Creates new form ScubaFrame
     *
     * @param controller the ScubaController
     */
    public ScubaFrame(ScubaController controller) {
        this.controller = controller;
        this.model = controller.getModel();
        initComponents();
    }
    
    public ScubaController getController() {
        return controller;
    }

    /**
     * Updates dynamic state dependant components. Must be called after state
     * change.
     */
    public void update() {
        sInputPanel.update();
        sOutputPanel.update();
        sTablePanel.update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        sInputPanel = new scubase3.panels.ScubaInputPanel();
        sOutputPanel = new scubase3.panels.ScubaOutputPanel();
        sTablePanel = new scubase3.panels.ScubaTablePanel();
        sMenuBar = new javax.swing.JMenuBar();
        calculations = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dive Calculator Version 0.1 PRERELEASE");
        setMinimumSize(new java.awt.Dimension(650, 450));
        setPreferredSize(new java.awt.Dimension(650, 450));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        sInputPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(sInputPanel, gridBagConstraints);

        sOutputPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(sOutputPanel, gridBagConstraints);

        sTablePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(sTablePanel, gridBagConstraints);

        calculations.setText("File");
        sMenuBar.add(calculations);

        jMenu2.setText("Edit");
        sMenuBar.add(jMenu2);

        setJMenuBar(sMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu calculations;
    private javax.swing.JMenu jMenu2;
    private scubase3.panels.ScubaInputPanel sInputPanel;
    private javax.swing.JMenuBar sMenuBar;
    private scubase3.panels.ScubaOutputPanel sOutputPanel;
    private scubase3.panels.ScubaTablePanel sTablePanel;
    // End of variables declaration//GEN-END:variables
}