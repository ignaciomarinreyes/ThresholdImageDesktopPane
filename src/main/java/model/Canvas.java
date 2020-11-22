package model;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

public class Canvas extends JPanel {

    private String path = null;
    private BufferedImage image = null;
    private int threshold = 128;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
        g.drawImage(image, 0, 0, null);

    }

    public boolean loadImage() {
        try {
            image = ImageIO.read(new File(path));
            if (image.getWidth() > 1024 || image.getHeight() > 768) {
                return false;
            }
            this.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
        } catch (IOException ex) {
            Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    public boolean saveImage(String path, String format){
        try {
            ImageIO.write(image, format , new File(path + "."+ format));
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public void converToBlackAndWhite() {

        Mat mat = UtilsPractica6.umbralizar(Imgcodecs.imread(path), threshold);
        image = (BufferedImage) HighGui.toBufferedImage(mat);
    }
}
