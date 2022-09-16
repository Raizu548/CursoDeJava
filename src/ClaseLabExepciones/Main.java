package ClaseLabExepciones;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args){

        BufferedImage imagen = null;

        try {
            imagen = ImageIO.read(new File("src/excepciones/imagen.png"));
            System.out.println("LA IMAGEN EXISTE");
        } catch (IOException e){
            // TODO: handle exception
            System.out.println("NO SE ENCUENTRA LA MAGEN");
        }
    }
}
