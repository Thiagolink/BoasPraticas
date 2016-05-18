package br.ufrn.imd.lp2.testandolib;



import br.ufrn.imd.lp2.imagesegmentation.ImageInformation;
import br.ufrn.imd.lp2.imagesegmentation.ImageSegmentation;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * Classe para realizar segmentação de imagens.
 * 
 * @author Thiago Oliveira
 */
public class ImageTreatment {
    
    public ImageTreatment(){
        
    }
      
    public static int darken(BufferedImage image, int x, int y){

        int dataBuffInt = image.getRGB(x,y); 

        Color c = new Color(dataBuffInt);
        int r = c.getRed()/2;
        int g = c.getGreen()/2;
        int b = c.getBlue()/2;
        int color = (r << 16) | (g << 8) | b;
        
        return color;
        
    }
    
    
    public int defineRegion(int x, int y, ImageInformation seg){
        int[] markedpixels   = seg.getSegmentedImageMap();
        int aux = 0;
        int count = 0;
        for(int j = 0; j < seg.getHeight(); j++){
            for(int i = 0; i < seg.getWidth(); i++){
                if(x == i && y == j)
                    aux= count;
                count++;
            }
        }
        System.out.println(aux);
        
        return markedpixels[aux];
    }
    
    
    public ImageIcon whitening(ImageInformation seg, int region, ArrayList<Integer> list){
        BufferedImage img    = seg.getRegionMarkedImage();
        int count            = 0;
        int[] markedpixels   = seg.getSegmentedImageMap();

        
        if(list.get(region) == 1)
            list.set(region, 0);
        else
            list.set(region, 1);
        
        for(int j = 0; j < seg.getHeight(); j++){
            for(int i = 0; i < seg.getWidth(); i++){
                int aux = markedpixels[count];
                if(list.get(aux) != 1)
                    img.setRGB(i, j, darken(img, i, j));
                count++;
            }
        }           
        ImageIcon icc = new ImageIcon(img);
        
        
        return icc;
    }
    

    public static int returnColor(int label, int numRegions){
       
       int reason = 255 / numRegions;
       int g      = (label * reason) % 255;
       int r      = (label * reason) % 255;
       int b      = (label * reason) % 255;
       int color  = (r << 16) | (g << 8) | b;
       
       return color;
   
   }


    public ImageIcon colorSegmentation(ImageInformation seg) {
        BufferedImage img    = seg.getRegionMarkedImage();
        int count            = 0;
        int[] markedpixels   = seg.getSegmentedImageMap();
        
        for(int j = 0; j < seg.getHeight(); j++){
            for(int i = 0; i < seg.getWidth(); i++){
               img.setRGB(i, j, returnColor(markedpixels[count],seg.getTotalRegions()));
               count++;
            }
        }
        ImageIcon icc = new ImageIcon(img);
        return icc;
    }

    
    public ImageInformation imageSegmentation(String filename, double blur, int color, int size){
        ImageInformation seg = ImageSegmentation.performSegmentation(filename, blur, color, size);
        return seg;
    }
    

    public ImageIcon originalImage(String filename){
        ImageIcon icc = new ImageIcon(filename);
        return icc;
    }
    
    
    public int totalRegions(ImageInformation seg){
        return seg.getTotalRegions();
    }
    

    public ImageIcon markedImage(ImageInformation seg){
        ImageIcon icc        = new ImageIcon(seg.getRegionMarkedImage());
        return icc;
    }
    
    public String getScaledImage(String filename, int w, int h) throws IOException{
        File file = new File(filename);
        BufferedImage icc = ImageIO.read(file);
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(icc, 0, 0, w, h, null);
        g2.dispose();
        
        
        String aux = System.getProperty("user.dir")+"\\imgs\\";
        for(int i =0; i<100; i++){
            File f = new File(aux+"model"+i+".jpg");
            String aux2 = aux+"model"+i+".jpg";
            if(!(f.exists() && !f.isDirectory())){
                aux = aux2;
                break;
            }
        }
        File outputfile = new File(aux);
        System.err.append(aux);
        ImageIO.write(resizedImg, "jpg", outputfile);
        
        return aux;
        
    }
    
    
}
