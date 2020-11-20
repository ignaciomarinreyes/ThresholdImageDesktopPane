package model;

import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

public class UtilsPractica6 {

    static Mat umbralizar(Mat imagen_original, Integer umbral) {
    // crear dos imágenes en niveles de gris con el mismo
    // tamaño que la original
        Mat imagenGris = new Mat(imagen_original.rows(),
                imagen_original.cols(),
                CvType.CV_8U);
        Mat imagenUmbralizada = new Mat(imagen_original.rows(),
                imagen_original.cols(),
                CvType.CV_8U);
        // convierte a niveles de grises la imagen original
        Imgproc.cvtColor(imagen_original,
                imagenGris,
                Imgproc.COLOR_BGR2GRAY);
        // umbraliza la imagen:
        // - píxeles con nivel de gris > umbral se ponen a 1
        // - píxeles con nivel de gris <= umbra se ponen a 0
        Imgproc.threshold(imagenGris,
                imagenUmbralizada,
                umbral,
                255,
                Imgproc.THRESH_BINARY);
        // se devuelve la imagen umbralizada
        return imagenUmbralizada;
    }
}
