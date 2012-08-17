package bbct.gui;

import bbct.data.BaseballCardIO;

/**
 *
 * TODO: JavaDoc
 *
 * @author codeguru <codeguru@users.sourceforge.net>
 */
public class MainPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
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

        bbct.gui.MenuPanel menuPanel = new bbct.gui.MenuPanel();
        bbct.gui.AddCardsPanel addCardsPanel = new AddCardsPanel(this.bcio);
        bbct.gui.FindCardsPanel findCardsPanel = new FindCardsPanel();
        bbct.gui.FindCardsByYearPanel findCardsByYearPanel = new FindCardsByYearPanel(this.bcio);
        bbct.gui.FindCardsByNumberPanel findCardsByNumberPanel = new FindCardsByNumberPanel(this.bcio);
        bbct.gui.FindCardsByYearAndNumberPanel findCardsByYearAndNumberPanel = new FindCardsByYearAndNumberPanel(this.bcio);
        bbct.gui.FindCardsByPlayerNamePanel findCardsByPlayerNamePanel = new FindCardsByPlayerNamePanel(this.bcio);
        bbct.gui.AboutPanel aboutPanel = new bbct.gui.AboutPanel();

        setLayout(new java.awt.CardLayout());
        add(menuPanel, "menuPanel");
        add(addCardsPanel, "addCardsPanel");
        add(findCardsPanel, "findCardsPanel");
        add(findCardsByYearPanel, "findCardsByYear");
        add(findCardsByNumberPanel, "findCardsByNumber");
        add(findCardsByYearAndNumberPanel, "findCardsByYearAndNumber");
        add(findCardsByPlayerNamePanel, "findCardsByPlayerName");
        add(aboutPanel, "aboutPanel");
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private BaseballCardIO bcio = null;
}
