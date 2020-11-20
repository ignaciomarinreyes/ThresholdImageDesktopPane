package view;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;

public class MainFrame extends javax.swing.JFrame {

    private InternalFrame internalFrame;
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
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        jMenuItem1 = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("ConvertToBlackAndWhite");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editJMenu.add(jMenuItem1);

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
            if (internalFrame != null) {
                internalFrame.dispose();
            }
            internalFrame = new InternalFrame(jFileChooserOpen.getSelectedFile().getAbsolutePath());
            jDesktopPane1.add(internalFrame);
        }
    }//GEN-LAST:event_openImageJMenuItemActionPerformed

    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Threshold Image is based on Swing from the Java Library."
                + "\nThe program thresholds an image from a given value. "
                + "\nVersion 1.0 - GitHub information: https://github.com/jesuslarez/ThresholdImage");
    }//GEN-LAST:event_aboutJMenuItemActionPerformed

    private void saveImageJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveImageJMenuItemActionPerformed
       /* int res = jFileChooserSave.showSaveDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            boolean saveImage = canvas.saveImage(jFileChooserSave.getSelectedFile().getAbsolutePath(), jFileChooserSave.getFileFilter().getDescription());
            System.out.println("saved: " + saveImage);
        }
        if (res == JFileChooser.CANCEL_OPTION) {

        }
        */
       
    }//GEN-LAST:event_saveImageJMenuItemActionPerformed

    private void exitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMenuItemActionPerformed
        int res = JOptionPane.showConfirmDialog(rootPane, "Are you sure you wanna exit?" , "Exit", JOptionPane.YES_OPTION);
        if (res == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitJMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JMenu editJMenu;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMenuItem1;
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
