/*
 * MovePanel.java
 *
 * Created on February 19, 2006, 3:35 PM
 */

package ika.gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author  jenny
 */
public class MovePanel extends javax.swing.JPanel {
    
    private double hor = 0d;
    private double ver = 0d;
    
    public boolean showMoveDialog(Frame frame) {
        // fill GUI with values
        this.horNumberField.setDoubleValue(this.hor);
        this.horNumberField.setDoubleValue(this.ver);
                 
        String title = "Move Selected Features";
        Icon icon = ika.app.ApplicationInfo.getApplicationIcon();
        Object[] options = { "OK", "Cancel" };
        int resID = JOptionPane.showOptionDialog(frame,
                                   this,
                                   title,
                                   JOptionPane.YES_NO_OPTION,
                                   JOptionPane.PLAIN_MESSAGE,
                                   icon,
                                   options,
                                   options[0]);
        if (resID == JOptionPane.CANCEL_OPTION
                || resID == JOptionPane.CLOSED_OPTION
                || resID == 1)
            return false;
        
        // read settings from dialog
        this.hor = this.horNumberField.getDoubleValue();
        this.ver = this.verNumberField.getDoubleValue();
        return true;
    }
    
    /**
     * Creates new form MovePanel
     */
    public MovePanel() {
        initComponents();
    }

    public double getHor() {
        return hor;
    }

    public void setHor(double hor) {
        this.hor = hor;
    }

    public double getVer() {
        return ver;
    }

    public void setVer(double ver) {
        this.ver = ver;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        moveButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        horNumberField = new ika.gui.NumberField();
        verNumberField = new ika.gui.NumberField();

        setLayout(new java.awt.GridBagLayout());

        setNextFocusableComponent(horNumberField);
        jLabel1.setText("Horizontal:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(jLabel1, gridBagConstraints);

        jLabel2.setText("Vertical:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(jLabel2, gridBagConstraints);

        horNumberField.setMinimumSize(new java.awt.Dimension(100, 22));
        horNumberField.setPattern("#,##0.######");
        horNumberField.setPreferredSize(new java.awt.Dimension(150, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        add(horNumberField, gridBagConstraints);

        verNumberField.setMinimumSize(new java.awt.Dimension(100, 22));
        verNumberField.setPattern("#,##0.######");
        verNumberField.setPreferredSize(new java.awt.Dimension(150, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(verNumberField, gridBagConstraints);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ika.gui.NumberField horNumberField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.ButtonGroup moveButtonGroup;
    private ika.gui.NumberField verNumberField;
    // End of variables declaration//GEN-END:variables
    
}
