package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;

public class MainFrame extends javax.swing.JFrame {

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
        canvas.setBackground(new Color(240, 240, 240));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        convertToBlackAndWhiteJButton.setVisible(false);
        setThresholdJButton.setVisible(false);
        thresholdJLabel.setVisible(false);
        menuJPanel.setVisible(false);
        this.setTitle("Threshold Image - By Jesús Lárez & Ignacio Marín");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas = new model.Canvas();
        initialMessageJLabel = new javax.swing.JLabel();
        menuJPanel = new javax.swing.JPanel();
        setThresholdJButton = new javax.swing.JButton();
        thresholdJLabel = new javax.swing.JLabel();
        convertToBlackAndWhiteJButton = new javax.swing.JButton();
        mainFrameJMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        openImageJMenuItem = new javax.swing.JMenuItem();
        saveImageJMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        initialMessageJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        initialMessageJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        initialMessageJLabel.setText("Please load an image");

        menuJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        menuJPanel.setForeground(new java.awt.Color(240, 240, 240));

        setThresholdJButton.setText("Set threshold");
        setThresholdJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setThresholdJButtonActionPerformed(evt);
            }
        });

        thresholdJLabel.setText("Threshold: 128");

        convertToBlackAndWhiteJButton.setText("Convert black and white");
        convertToBlackAndWhiteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertToBlackAndWhiteJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuJPanelLayout = new javax.swing.GroupLayout(menuJPanel);
        menuJPanel.setLayout(menuJPanelLayout);
        menuJPanelLayout.setHorizontalGroup(
            menuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuJPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(menuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuJPanelLayout.createSequentialGroup()
                        .addComponent(setThresholdJButton)
                        .addGap(18, 18, 18)
                        .addComponent(thresholdJLabel))
                    .addComponent(convertToBlackAndWhiteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        menuJPanelLayout.setVerticalGroup(
            menuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuJPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(menuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thresholdJLabel)
                    .addComponent(setThresholdJButton))
                .addGap(18, 18, 18)
                .addComponent(convertToBlackAndWhiteJButton)
                .addContainerGap(12, Short.MAX_VALUE))
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
            .addComponent(initialMessageJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(555, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(initialMessageJLabel)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openImageJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openImageJMenuItemActionPerformed
        int res = jFileChooserOpen.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            canvas.setPath(jFileChooserOpen.getSelectedFile().getAbsolutePath());
            if (canvas.loadImage()) {
                int width = canvas.getImage().getWidth();
                int height = canvas.getImage().getHeight();
                this.setSize(new Dimension(width + 50, height + 300));
                initialMessageJLabel.setVisible(false);
                convertToBlackAndWhiteJButton.setVisible(true);
                setThresholdJButton.setVisible(true);
                thresholdJLabel.setVisible(true);
                menuJPanel.setVisible(true);
                repaint();

            } else {
                JOptionPane.showMessageDialog(rootPane, "The image dimensions  must not be higher than 1024x768");
            }

        }
        if (res == JFileChooser.CANCEL_OPTION) {

        }
    }//GEN-LAST:event_openImageJMenuItemActionPerformed

    private void convertToBlackAndWhiteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertToBlackAndWhiteJButtonActionPerformed
        canvas.converToBlackAndWhite();
        repaint();
    }//GEN-LAST:event_convertToBlackAndWhiteJButtonActionPerformed

    private void setThresholdJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setThresholdJButtonActionPerformed
        String res = JOptionPane.showInputDialog(rootPane, "Introduce a threshold value between 0 and 255");
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
                canvas.setThreshold(Integer.parseInt(res));
                thresholdJLabel.setText("Threshold: " + res);
            }

        }

    }//GEN-LAST:event_setThresholdJButtonActionPerformed

    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Threshold Image is based on Swing from the Java Library."
                + "\nThe program thresholds an image from a given value. "
                + "\nVersion 1.0 - GitHub information: https://github.com/jesuslarez/ThresholdImage");
    }//GEN-LAST:event_aboutJMenuItemActionPerformed

    private void saveImageJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveImageJMenuItemActionPerformed
        int res = jFileChooserSave.showSaveDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            boolean saveImage = canvas.saveImage(jFileChooserSave.getSelectedFile().getAbsolutePath(), jFileChooserSave.getFileFilter().getDescription());
            System.out.println("saved: " + saveImage);
        }
        if (res == JFileChooser.CANCEL_OPTION) {

        }
    }//GEN-LAST:event_saveImageJMenuItemActionPerformed

    private void exitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMenuItemActionPerformed
        int res = JOptionPane.showConfirmDialog(rootPane, "Are you sure you wanna exit?" , "Exit", JOptionPane.YES_OPTION);
        if (res == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitJMenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem;
    private model.Canvas canvas;
    private javax.swing.JButton convertToBlackAndWhiteJButton;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JLabel initialMessageJLabel;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar mainFrameJMenuBar;
    private javax.swing.JPanel menuJPanel;
    private javax.swing.JMenuItem openImageJMenuItem;
    private javax.swing.JMenuItem saveImageJMenuItem;
    private javax.swing.JButton setThresholdJButton;
    private javax.swing.JLabel thresholdJLabel;
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
