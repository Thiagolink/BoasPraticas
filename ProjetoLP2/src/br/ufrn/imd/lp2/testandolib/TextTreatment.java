/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.lp2.testandolib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Thiago
 */
public class TextTreatment {
    
    
    
    public String renameFileNameRegions(String filename){
        if (filename.endsWith(".jpg")) {
            filename = filename.substring(0, filename.length() - 4);
            filename = filename + "regioes.txt";
        }
        return filename;
    }
    
    
    public String renameFileNameValue(String filename){
        if (filename.endsWith(".jpg")) {
            filename = filename.substring(0, filename.length() - 4);
            filename = filename + "valores.txt";
        }
        return filename;
    }
    
   
    
    private void createTextFileRegions(String filename){
        filename = renameFileNameRegions(filename);
        try{
            Formatter saida = new Formatter(filename);
            saida.close();
            JOptionPane.showMessageDialog(null,"Arquivo '"+filename+"' criado!","Arquivo", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Arquivo nao pode ser gerado!", "Arquivo",  JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    private void createTextFileValue(String filename){
        filename = renameFileNameValue(filename);
        try{
            Formatter saida = new Formatter(filename);
            saida.close();
            JOptionPane.showMessageDialog(null,"Arquivo '"+filename+"' criado!","Arquivo", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Arquivo nao pode ser gerado!", "Arquivo",  JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    
    
    public void writeInTextFileRegions(String filename, String word, String mouseX1, String mouseY1, String mouseX2, String mouseY2){
        filename = renameFileNameRegions(filename);
        File file = new File(filename);
        if (file.exists()){
            try{
                FileWriter writer = new FileWriter(filename, true);
                PrintWriter saveFile = new PrintWriter(writer);
                writer.write(word);
                writer.write(System.getProperty("line.separator"));
                writer.write(mouseX1);
                writer.write(System.getProperty("line.separator"));
                writer.write(mouseY1);
                writer.write(System.getProperty("line.separator"));
                writer.write(mouseX2);
                writer.write(System.getProperty("line.separator"));
                writer.write(mouseY2);
                writer.write(System.getProperty("line.separator"));
                writer.close();
                
            }
            catch(Exception erro) {
                JOptionPane.showMessageDialog(null,"writeInTextFile","Arquivo...", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        else{
            createTextFileRegions(filename);
            try{
                FileWriter writer = new FileWriter(filename, true);
                PrintWriter saveFile = new PrintWriter(writer);
                writer.write(word);
                writer.write(System.getProperty("line.separator"));
                writer.write(mouseX1);
                writer.write(System.getProperty("line.separator"));
                writer.write(mouseY1);
                writer.write(System.getProperty("line.separator"));
                writer.write(mouseX2);
                writer.write(System.getProperty("line.separator"));
                writer.write(mouseY2);
                writer.write(System.getProperty("line.separator"));
                writer.close();
                
            }
            catch(Exception erro) {
                JOptionPane.showMessageDialog(null,"writeInTextFile", "Arquivo", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    
    public void writeTextFileValue(String filename, String blur, String color, String size) throws FileNotFoundException{
        filename = renameFileNameValue(filename);
        File file = new File(filename);
        if (file.exists()){
            clearFile(filename);
            try{
                FileWriter writer = new FileWriter(filename, true);
                PrintWriter saveFile = new PrintWriter(writer);
                writer.write(blur);
                writer.write(System.getProperty("line.separator"));
                writer.write(color);
                writer.write(System.getProperty("line.separator"));
                writer.write(size);
                writer.write(System.getProperty("line.separator"));
                writer.close();
                
            }
            catch(Exception erro) {
                JOptionPane.showMessageDialog(null,"writeInTextFile","Arquivo...", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        else{
            createTextFileValue(filename);
            try{
                FileWriter writer = new FileWriter(filename, true);
                PrintWriter saveFile = new PrintWriter(writer);
                writer.write(blur);
                writer.write(System.getProperty("line.separator"));
                writer.write(color);
                writer.write(System.getProperty("line.separator"));
                writer.write(size);
                writer.write(System.getProperty("line.separator"));
                writer.close();
                                
            }
            catch(Exception erro) {
                JOptionPane.showMessageDialog(null,"writeInTextFile", "Arquivo", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    
    public void clearFile(String filename) throws FileNotFoundException{
        PrintWriter writer = new PrintWriter(filename);
        writer.print("");
        writer.close();
    }
    
    
    public double valueImagesBlur(String filename, double blur){
        filename = renameFileNameValue(filename);
        
        try{
            Scanner s = new Scanner(new File(filename));
            while (s.hasNext()){
                blur = Float.parseFloat(s.next());
                s.next();
                s.next();
            }
            s.close();
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "Transform",  JOptionPane.INFORMATION_MESSAGE);
        }
        return blur;
    }
    
    public int valueImagesColor(String filename, int color){
        filename = renameFileNameValue(filename);
        
        try{
            Scanner s = new Scanner(new File(filename));
            while (s.hasNext()){
                s.next();
                color = Integer.parseInt(s.next());
                s.next();
            }
            s.close();
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "Transform",  JOptionPane.INFORMATION_MESSAGE);
        }
        return color;
    }
    
        
    public int valueImagesSize(String filename, int size){
        filename = renameFileNameValue(filename);
        
        try{
            Scanner s = new Scanner(new File(filename));
            while (s.hasNext()){
                s.next();
                s.next();
                size = Integer.parseInt(s.next());
            }
            s.close();
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "Transform",  JOptionPane.INFORMATION_MESSAGE);
        }
        return size;
    }

    
    
    public Map transformToMap(String filename){
        filename = renameFileNameRegions(filename);
        String name;
        int X1,X2, Y1, Y2;
        
        Map<String, Integer[]> map = new HashMap<>();

        
        try{
            Scanner s = new Scanner(new File(filename));
            while (s.hasNext()){
                name = s.next();
                X1 = Integer.parseInt(s.next());
                Y1 = Integer.parseInt(s.next());
                X2 = Integer.parseInt(s.next());
                Y2 = Integer.parseInt(s.next());
                map.put(name, new Integer[]{ X1, Y1, X2, Y2});
            }
            s.close();
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "Transform",  JOptionPane.INFORMATION_MESSAGE);
        }
        return map;
    }
    
    
    public ArrayList transformToArrayList(String filename){
        filename = renameFileNameRegions(filename);
        ArrayList<String> list = new ArrayList<>();
        
        
        try{
            Scanner s = new Scanner(new File(filename));
            while (s.hasNext()){
                list.add(s.next());
                s.next();
                s.next();
                s.next();
                s.next();
            }
            s.close();
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "transformtoArrayList",  JOptionPane.INFORMATION_MESSAGE);
        }
        return list;
    }
    
    
    public Set<String> nameAllRegions() throws FileNotFoundException{
        File folder = new File(System.getProperty("user.dir")+"\\imgs");
        File[] listOfFiles = folder.listFiles();
        Set<String> names = new HashSet<>();

        
        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];
            if (file.isFile() && file.getName().endsWith("regioes.txt")) {
                Scanner s = new Scanner(file);
                while (s.hasNext()){
                        names.add(s.next());
                        s.next();
                        s.next();
                        s.next();
                        s.next();
                    }
                    
                
                s.close();
            } 
        }
        
        return names;
    }
    
    
   
    public ArrayList<String> regionFile(String region) throws FileNotFoundException{
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listaux = new ArrayList<>();
        File folder = new File("C:\\Users\\Thiago\\Desktop\\ProjetoLP2\\ProjetoLP2\\imgs");
        File[] listOfFiles = folder.listFiles();
        
        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];
            if (file.isFile() && file.getName().endsWith("regioes.txt")) {
                listaux = transformToArrayList(file.getAbsolutePath());
                if(listaux.contains(region)){
                    String aux = file.getAbsolutePath();
                    aux = aux.substring(0, aux.length() - 11);
                    aux = aux +".jpg";
                    list.add(aux);
                }
            } 
        }     

        return list;
    }
}
