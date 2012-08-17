package bbct.gui;

import javax.swing.JFrame;

/**
 * TODO: JavaDoc
 *
 * @author codeguru <codeguru@users.sourceforge.net>
 */
public class EditCardPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditCardPanel
     */
    public EditCardPanel() {
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

        cardDetailsPanel = new CardDetailsPanel(false);

        setMinimumSize(new java.awt.Dimension(370, 350));
        setPreferredSize(new java.awt.Dimension(370, 350));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());
        add(cardDetailsPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        JFrame frame = (JFrame) this.getParent().getParent().getParent().getParent();

        frame.setTitle(GUIResources.EDIT_CARD_PANEL_TITLE);
    }//GEN-LAST:event_formComponentShown
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private bbct.gui.CardDetailsPanel cardDetailsPanel;
    // End of variables declaration//GEN-END:variables
}
