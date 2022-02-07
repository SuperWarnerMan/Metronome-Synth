/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.warneriveris.metronome.gui;

import com.warneriveris.metronome.controls.Controller;

/**
 *
 * @author Warner Iveris
 */
public class MainFrame extends javax.swing.JFrame {

    private static final MainFrame mainFrame = new MainFrame();
    
    public static MainFrame instance(){
        return mainFrame;
    }
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
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

        DisplayPanel = new javax.swing.JPanel();
        DisplayLabel = new javax.swing.JLabel();
        ControlPanel = new javax.swing.JPanel();
        slowerBtn = new javax.swing.JButton();
        pausePlayBtn = new javax.swing.JButton();
        fasterBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("M E T R O N O M E");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 153, 153));
        setBounds(new java.awt.Rectangle(0, 0, 100, 65));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(80, 65));
        setMinimumSize(new java.awt.Dimension(80, 65));
        setPreferredSize(new java.awt.Dimension(250, 150));
        setResizable(false);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0};
        layout.rowHeights = new int[] {0, 5, 0};
        getContentPane().setLayout(layout);

        DisplayPanel.setOpaque(false);

        DisplayLabel.setFont(new java.awt.Font("Avenir Next Condensed", 1, 60)); // NOI18N
        DisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DisplayLabel.setText("120");
        DisplayLabel.setFocusable(false);
        DisplayLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DisplayLabel.setMaximumSize(new java.awt.Dimension(120, 65));
        DisplayLabel.setMinimumSize(new java.awt.Dimension(120, 65));
        DisplayLabel.setName(""); // NOI18N
        DisplayLabel.setPreferredSize(new java.awt.Dimension(120, 65));
        DisplayPanel.add(DisplayLabel);
        DisplayLabel.getAccessibleContext().setAccessibleName("DisplayLabel");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        getContentPane().add(DisplayPanel, gridBagConstraints);

        ControlPanel.setOpaque(false);

        slowerBtn.setText("-");
        slowerBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        slowerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slowerBtnActionPerformed(evt);
            }
        });
        ControlPanel.add(slowerBtn);

        pausePlayBtn.setText("PLAY");
        pausePlayBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pausePlayBtn.setSelected(true);
        pausePlayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausePlayBtnActionPerformed(evt);
            }
        });
        ControlPanel.add(pausePlayBtn);

        fasterBtn.setText("+");
        fasterBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fasterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fasterBtnActionPerformed(evt);
            }
        });
        ControlPanel.add(fasterBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(ControlPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pausePlayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausePlayBtnActionPerformed
        Controller.instance().stopPlay();
    }//GEN-LAST:event_pausePlayBtnActionPerformed

    private void slowerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slowerBtnActionPerformed
        Controller.instance().decrement();
    }//GEN-LAST:event_slowerBtnActionPerformed

    private void fasterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fasterBtnActionPerformed
        Controller.instance().increment();
    }//GEN-LAST:event_fasterBtnActionPerformed

    public void setDisplay(int tempo){
        String text = Integer.toString(tempo);
        DisplayLabel.setText(text);
    }
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JLabel DisplayLabel;
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JButton fasterBtn;
    private javax.swing.JButton pausePlayBtn;
    private javax.swing.JButton slowerBtn;
    // End of variables declaration//GEN-END:variables
}
