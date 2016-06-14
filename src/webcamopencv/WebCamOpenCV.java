/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcamopencv;

import org.opencv.core.Core;

/**
 *
 * @author plata
 */
public class WebCamOpenCV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       
        System.loadLibrary("opencv_java310");
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME); // load native library of opencv

        Ventana v = new Ventana();
        v.setVisible(true);
        v.setSize(600, 600);
        

    }

}
