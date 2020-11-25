package view;

import java.awt.Color;
import java.awt.Point;
import model.Canvas;

public class InternalFrame extends javax.swing.JInternalFrame {

    private String path;
    public static int CascadeH = 0;
    public static int CascadeW = 0;

    public InternalFrame(String path) {
        this.path = path;
        setLookAndFeel();
        initComponents();
        this.setVisible(true);
        this.setLocation(new Point(CascadeW, CascadeH));
        CascadeH += 20;
        CascadeW += 20;
        this.setMaximizable(true);
        this.setIconifiable(true);
        this.setClosable(true);
        this.setResizable(true);
        canvas.setBackground(new Color(240, 240, 240));
        canvas.setPath(path);
        if (canvas.loadImage()) {
            repaint();
        }
        canvas.getNameImageFile();
        this.setTitle(canvas.getNameImageFile());
    }

    public String getPath() {
        return this.path;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void ConverToBlackAndWhite(int threshold) {
        canvas.setThreshold(threshold);
        canvas.converToBlackAndWhite();
        this.setTitle(canvas.getNameImageFile() + " Threshold: " + canvas.getThreshold());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        canvas = new model.Canvas();

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jScrollPane.setViewportView(canvas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.Canvas canvas;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables

}
