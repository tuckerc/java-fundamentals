package bitmap.transformer;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Bitmap {

  BufferedImage img = null;

  public void readBitmap(File path) {
      try {
      this.img = ImageIO.read(path);
    } catch (IOException e) {
        System.out.println("couldn't read file");
        e.printStackTrace();
    }
  }

   public void imageToFile(File path){
     try {
       ImageIO.write(this.img, "bmp", path);
     } catch (IOException e) {
       System.out.println("couldn't write file");
       e.printStackTrace();
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
      return "Image inverted successfully";
    }

  public String randomizeImage() {

    for (int x = 0; x < this.img.getWidth(); x++) {
      for (int y = 0; y < this.img.getHeight(); y++) {
        int rgba = img.getRGB(x, y);
        Color color = new Color(rgba, true);
        color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
        img.setRGB(x, y, color.getRGB());
      }
    }
    return "Image randomized successfully";
  }

  public String darkenImage() {

    for (int x = 0; x < this.img.getWidth(); x++) {
      for (int y = 0; y < this.img.getHeight(); y++) {
        int rgba = img.getRGB(x, y);
        Color color = new Color(rgba, true);
        color = new Color((int) (color.getRed() * 0.5), (int) (color.getGreen() * 0.5), (int) (color.getBlue() * 0.5));
        img.setRGB(x, y, color.getRGB());
      }
    }
    return "Image successfully darken";
  }

  public String lightenImage() {

    for (int x = 0; x < this.img.getWidth(); x++) {
      for (int y = 0; y < this.img.getHeight(); y++) {
        int rgba = img.getRGB(x, y);
        Color color = new Color(rgba, true);
        color = new Color((int) Math.min((color.getRed() * 1.5), 255), (int) Math.min((color.getGreen() * 1.5), 255), (int) Math.min((color.getBlue() * 1.5), 255));
        img.setRGB(x, y, color.getRGB());
      }
    }
    return "Image successfully darken";
  }

}







