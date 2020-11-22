package view;

import java.awt.Point;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;

public class MainFrame extends javax.swing.JFrame {

    private InternalFrame internalFrameOriginal;
    private ArrayList<InternalFrame> internalFrameArray = new ArrayList<InternalFrame>();
    private final JFileChooser jFileChooserOpen;
    private final JFileChooser jFileChooserSave;
    private FileNameExtensionFilter fileNameExtensionFilterOpen;
    private FileNameExtensionFilter fileNameExtensionFilterSave;

    public MainFrame() {
        setLookAndFeel();
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        jFileChooserOpen = new JFileChooser();
        jFileChooserOpen.setAcceptAllFileFilterUsed(false);
        fileNameExtensionFilterOpen = new FileNameExtensionFilter("Images [.jpg, .png, .jpeg]", new String[]{"jpg", "png", "jpeg"});
        jFileChooserOpen.addChoosableFileFilter(fileNameExtensionFilterOpen);
        jFileChooserSave = new JFileChooser();
        jFileChooserSave.setAcceptAllFileFilterUsed(false);
        fileNameExtensionFilterSave = new FileNameExtensionFilter("jpg", new String[]{"jpg"});
        jFileChooserSave.addChoosableFileFilter(fileNameExtensionFilterSave);
        fileNameExtensionFilterSave = new FileNameExtensionFilter("png", new String[]{"png"});
        jFileChooserSave.addChoosableFileFilter(fileNameExtensionFilterSave);
        fileNameExtensionFilterSave = new FileNameExtensionFilter("jpeg", new String[]{"jpeg"});
        jFileChooserSave.addChoosableFileFilter(fileNameExtensionFilterSave);
        initComponents();
        this.setSize(1200, 900);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setTitle("Threshold Image - By Jesús Lárez & Ignacio Marín");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        mainFrameJMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        openImageJMenuItem = new javax.swing.JMenuItem();
        saveImageJMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitJMenuItem = new javax.swing.JMenuItem();
        editJMenu = new javax.swing.JMenu();
        convertJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jDesktopPane1ComponentResized(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        fileJMenu.setMnemonic('F');
        fileJMenu.setText("File");

        openImageJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openImageJMenuItem.setText("Open Image");
        openImageJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openImageJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(openImageJMenuItem);

        saveImageJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveImageJMenuItem.setText("Save Image");
        saveImageJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveImageJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(saveImageJMenuItem);
        fileJMenu.add(jSeparator1);

        exitJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitJMenuItem.setText("Exit");
        exitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(exitJMenuItem);

        mainFrameJMenuBar.add(fileJMenu);

        editJMenu.setMnemonic('e');
        editJMenu.setText("Edit");

        convertJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        convertJMenuItem.setText("Convert to black and white");
        convertJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertJMenuItemActionPerformed(evt);
            }
        });
        editJMenu.add(convertJMenuItem);

        mainFrameJMenuBar.add(editJMenu);

        helpJMenu.setMnemonic('H');
        helpJMenu.setText("Help");

        aboutJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        aboutJMenuItem.setText("About");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        mainFrameJMenuBar.add(helpJMenu);

        setJMenuBar(mainFrameJMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openImageJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openImageJMenuItemActionPerformed
        int res = jFileChooserOpen.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            if (internalFrameOriginal != null) {
                if (!internalFrameArray.isEmpty()) {
                    for (InternalFrame internalFrame : internalFrameArray) {
                        internalFrame.dispose();
                    }
                    internalFrameArray.clear();
                }
                internalFrameOriginal.dispose();
                InternalFrame.CascadeH = 0;
                InternalFrame.CascadeW = 0;
            }
            internalFrameOriginal = new InternalFrame(jFileChooserOpen.getSelectedFile().getAbsolutePath());
            jDesktopPane1.add(internalFrameOriginal);
        }
    }//GEN-LAST:event_openImageJMenuItemActionPerformed

    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        JOptionPane.showMessageDialog(rootPane, "ThresholdImageDesktopPane is based on Swing from the Java Library."
                + "\nThe program thresholds an image from a given value. "
                + "\nVersion 1.0 - GitHub information: https://github.com/jesuslarez/ThresholdImageDesktopPane");
    }//GEN-LAST:event_aboutJMenuItemActionPerformed

    private void saveImageJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveImageJMenuItemActionPerformed
        InternalFrame selectedFrame = (InternalFrame) jDesktopPane1.getSelectedFrame();
        if (internalFrameOriginal == null) {
            JOptionPane.showMessageDialog(rootPane, "You must load an image first");
        } else if (selectedFrame == null) {
            JOptionPane.showMessageDialog(rootPane, "You select an  InternalFrame first");
        } else if (selectedFrame != internalFrameOriginal) {
            int res = jFileChooserSave.showSaveDialog(null);
            if (res == JFileChooser.APPROVE_OPTION) {
                boolean saveImage = selectedFrame.getCanvas().saveImage(
                        jFileChooserSave.getSelectedFile().getAbsolutePath(),
                        jFileChooserSave.getFileFilter().getDescription());
            }
        } else if (internalFrameArray.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "You must convert and image to black and white first");
        } else {
            JOptionPane.showMessageDialog(rootPane, "You must select an InternalFrame different to the original Image");
        }


    }//GEN-LAST:event_saveImageJMenuItemActionPerformed

    private void exitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMenuItemActionPerformed
        int res = JOptionPane.showConfirmDialog(rootPane, "Are you sure you wanna exit?", "Exit", JOptionPane.YES_OPTION);
        if (res == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitJMenuItemActionPerformed

    private void convertJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertJMenuItemActionPerformed
        if (internalFrameOriginal == null) {
            JOptionPane.showMessageDialog(rootPane, "You must load an image first");
        } else {
            String res = JOptionPane.showInputDialog(rootPane, "Introduce a threshold value between 0 and 255");
            InternalFrame internalFrameConverted = null;
            if (res != null) {
                int value = 0;
                try {
                    value = Integer.parseInt(res);
                } catch (NumberFormatException numberFormatException) {
                    JOptionPane.showMessageDialog(rootPane, "The value must be numeric");
                    return;
                }
                if (value < 0 || value > 255) {
                    JOptionPane.showMessageDialog(rootPane, "The threshold value must be between 0 and 255!");
                } else {
                    internalFrameConverted = new InternalFrame(internalFrameOriginal.getPath());
                    internalFrameConverted.ConverToBlackAndWhite(value);
                    jDesktopPane1.add(internalFrameConverted);
                    internalFrameArray.add(internalFrameConverted);
                    try {
                        internalFrameConverted.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(InternalFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_convertJMenuItemActionPerformed

    private void jDesktopPane1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentResized
        if (internalFrameOriginal != null) {
            internalFrameOriginal.setLocation(0, 0);
            int x = 0;
            int y = 0;
            for (InternalFrame internalFrame : internalFrameArray) {
                internalFrame.setLocation(new Point(x, y));
                x += 20;
                y += 20;
            }
        }

    }//GEN-LAST:event_jDesktopPane1ComponentResized

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JMenuItem convertJMenuItem;
    private javax.swing.JMenu editJMenu;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar mainFrameJMenuBar;
    private javax.swing.JMenuItem openImageJMenuItem;
    private javax.swing.JMenuItem saveImageJMenuItem;
    // End of variables declaration//GEN-END:variables

    private static void setLookAndFeel() {
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
}
