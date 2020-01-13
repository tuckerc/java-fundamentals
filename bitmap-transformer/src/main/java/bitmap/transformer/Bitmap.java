package bitmap.transformer;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Bitmap {

  BufferedImage img = null;

  public String readBitmap(File path) {
      String goodRead = "Good Read";
      String badRead = "Bad Read";
      try {
      this.img = ImageIO.read(path);
      System.out.println(this.img);
      return goodRead;
    } catch (IOException e) {

    // e.printStackTrace();
          return badRead;
      //System.out.println("can't read file");
     // return badRead;

    }

   // System.out.println("image read successfully");
  }

   public void imageToFile(File path){
     try {

       ImageIO.write(this.img, "bmp", path);
     } catch (IOException e) {
       e.printStackTrace();
       System.out.println("can't read file");
     }

    }

    public String invertImage() {

      // http://www.java2s.com/Tutorials/Java/Graphics_How_to/Image/Convert_negative_image_to_positive.htm
      // used as a resource to develop this method
      for (int x = 0; x < this.img.getWidth(); x++) {
        for (int y = 0; y < this.img.getHeight(); y++) {
          int rgba = img.getRGB(x, y);
          Color color = new Color(rgba, true);
          color = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
          img.setRGB(x, y, color.getRGB());
        }
      }
      return "image inverted successfully";
    }

}







