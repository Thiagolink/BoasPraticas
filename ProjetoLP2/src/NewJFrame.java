
import br.ufrn.imd.lp2.imagesegmentation.ImageInformation;
import br.ufrn.imd.lp2.testandolib.ImageTreatment;
import br.ufrn.imd.lp2.testandolib.TextTreatment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago Oliveira
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    
    double blur_level;
    
    int color;
    
    int min_size;
    
    String filename;
    
    String filenameText;
    
    int mouseX1 = 0, mouseX2 = 0;
    
    int mouseY1 = 0, mouseY2 = 0;
   
    int[] markedPixels;
   
    ImageInformation seg;
   
    int width = 0 ;
    int height = 0;
       
   
    ImageTreatment image = new ImageTreatment(); 
    
   
    TextTreatment text = new TextTreatment();
    
   
    TADManipulation tad = new TADManipulation();
        
   
    ArrayList<String> list = new ArrayList<>();
    
   
    ArrayList<Integer> listInt = new ArrayList<>();
    
   
    ArrayList<String> listRegions = new ArrayList<>();
    
   
    Set<String> setRegionsNames = new HashSet<>();
    
   
    Map<String, Integer[]> map = new HashMap<>();
    

    
    
    
    public NewJFrame() {
        initComponents();
        initRegions();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Image = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("0.99");

        jTextField2.setText("50");

        jTextField3.setText("500");

        jButton1.setText("Segmentar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImageMouseClicked(evt);
            }
        });

        jButton2.setText("Mostrar Segmentação");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("BlurLevel");

        jLabel2.setText("CorLevel");

        jLabel3.setText("SizeLevel");

        jLabel4.setText("Número de Segmentações: ");

        jButton3.setText("Abrir Imagem");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jButton5.setText("Pesquisar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox1.setMaximumRowCount(4);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(jButton5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton4))
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGap(145, 145, 145)
                        .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 11, Short.MAX_VALUE)
                        .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        Image.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String aux = text.renameFileNameValue(filename);
            System.out.println(aux);
            File f = new File(aux);
         
            text.writeTextFileValue(filename, jTextField1.getText(), jTextField2.getText(), jTextField3.getText());
                
            blur_level = Double.parseDouble(jTextField1.getText());
            color      = Integer.parseInt(jTextField2.getText());
            min_size   = Integer.parseInt(jTextField3.getText());
            
            System.out.println(filename);
            seg        = image.imageSegmentation(filename, blur_level, color, min_size);
            Image.setIcon(image.markedImage(seg));
            
            setRegionsNames = text.nameAllRegions();
            
            
            
            jLabel4.setText("Número de Segmentações: " + image.totalRegions(seg));
                      
            listInt = tad.addValue(listInt, seg.getTotalRegions());
        }
        catch(NullPointerException erro){
            JOptionPane.showMessageDialog(null,"A segmentação não ocorreu, pois nenhuma imagem foi escolhida.", "Imagem",  JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"A segmentação não ocorreu, pois os valores não estão no formato correto.", "Valores",  JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            blur_level = Double.parseDouble(jTextField1.getText());
            color      = Integer.parseInt(jTextField2.getText());
            min_size   = Integer.parseInt(jTextField3.getText());
        
            Image.setIcon(image.colorSegmentation(seg));
            
        }
        catch(Exception NullPointerException){
            JOptionPane.showMessageDialog(null,"A segmentação não ocorreu, pois nenhuma imagem foi escolhida.", "Imagem",  JOptionPane.INFORMATION_MESSAGE);
            }
        }//GEN-LAST:event_jButton2ActionPerformed
        
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = new File("C:\\Users\\Thiago\\Desktop\\ProjetoLP2\\ProjetoLP2\\imgs");
        chooser.setCurrentDirectory(file);
        File f   = chooser.getSelectedFile();
        
        if(f.isDirectory() || f.getAbsolutePath().endsWith(".jpg")){
            filename = f.getAbsolutePath();    
            
            try {
                filename = image.getScaledImage(filename, 340, 414);
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            Image.setIcon(image.originalImage(filename));
        
            transformTextJList1(filename);
            listInt.clear();
        }
        else if (f.isDirectory() || !(f.getAbsolutePath().endsWith(".jpg"))){
            JOptionPane.showMessageDialog(null,"Arquivo não pode ser aberto, pois não é imagem", "Arquivo",  JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
    
    
    
    
    private void transformTextJList1(String filename){
        map = text.transformToMap(filename);
        list = text.transformToArrayList(filename);
        
        DefaultListModel model = new DefaultListModel();
        
        list = tad.sort(list);
     
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            model.addElement(it.next());
        }
        
        jList1.setModel(model);
    }
    
    
    
    private void transformTextJList2(String region) throws FileNotFoundException{
        listRegions = text.regionFile(region);
        
        DefaultListModel model = new DefaultListModel();
             
        Iterator<String> it = listRegions.iterator();
        while(it.hasNext()){
            model.addElement(it.next());
        }
        
        jList2.setModel(model);
    }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(mouseX1 == 0 || mouseY1 == 0)
            JOptionPane.showMessageDialog(null,"A área não pode ser registrada, pois não foi selecionada na imagem.", "Arquivo",  JOptionPane.INFORMATION_MESSAGE);
        else if(jTextField4.getText() == null)
            JOptionPane.showMessageDialog(null,"A área não pode ser registrada, pois não foi definido um nome.", "Arquivo",  JOptionPane.INFORMATION_MESSAGE);
        else if(tad.checkName(list, jTextField4.getText()))
            JOptionPane.showMessageDialog(null,"A área não pode ser registrada, pois já existe uma área com esse nome.", "Arquivo",  JOptionPane.INFORMATION_MESSAGE);
        else if(tad.checkRegion(list, map, image.defineRegion(mouseX1, mouseY1, seg), seg))
            JOptionPane.showMessageDialog(null,"A área não pode ser registrada, pois essa área já foi registrada.", "Arquivo",  JOptionPane.INFORMATION_MESSAGE);

        else{
            text.writeInTextFileRegions(filename, jTextField4.getText(), Integer.toString(mouseX1), Integer.toString(mouseY1), Integer.toString(mouseX2), Integer.toString(mouseY2));
        
            transformTextJList1(filename);
        }   
        
        mouseX1=0;
        mouseX2=0;
        mouseY1=0;
        mouseY2=0;
        initRegions();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImageMouseClicked
        if(mouseX1 == 0 && mouseY1 == 0){
            mouseX1 = evt.getX();
            mouseY1 = evt.getY();
            int region;
            region = image.defineRegion(mouseX1, mouseY1, seg);
            System.out.println(mouseX1+","+mouseY1+","+region);
        }
        else{
            mouseX2 = evt.getX();
            mouseY2 = evt.getY();
            int region;
            region = image.defineRegion(mouseX2, mouseY2, seg);
            System.out.println(mouseX2+","+mouseY2+","+region+"mouse2");
        }
    }//GEN-LAST:event_ImageMouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        JList theList = (JList) evt.getSource();
        if (evt.getClickCount() == 1) {
            int index = theList.locationToIndex(evt.getPoint());
            if (index >= 0) {
                Object o = theList.getModel().getElementAt(index);
                Integer coordenadas[] = map.get(o.toString());

                int region1 = image.defineRegion(coordenadas[0], coordenadas[1], seg);
                
                int region2;
                if (coordenadas[2] != 0 && coordenadas[3] != 0){
                    region2 = image.defineRegion(coordenadas[2], coordenadas[3], seg);
                    Image.setIcon(image.whitening(seg, region2, listInt));
                }
                //System.out.println("Double-clicked on: " + coordenadas[0] + " " + coordenadas[1]);
                //System.out.println("da área" + region);
                
                Image.setIcon(image.whitening(seg, region1, listInt));

          }
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        JList theList = (JList) evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = theList.locationToIndex(evt.getPoint());
            if (index >= 0) {
                Object o = theList.getModel().getElementAt(index);
                System.out.println(o.toString());
                filename = o.toString();
                
                
                blur_level = text.valueImagesBlur(filename, blur_level);
                jTextField1.setText(String.valueOf(blur_level).substring(0, 4));
                color      = text.valueImagesColor(filename, color);
                jTextField2.setText(String.valueOf(color));
                min_size   = text.valueImagesSize(filename, min_size);
                jTextField3.setText(String.valueOf(min_size));
                
                
                seg        = image.imageSegmentation(filename, blur_level, color, min_size);
                Image.setIcon(image.markedImage(seg));
                transformTextJList1(filename);
                listInt.clear();
                listInt = tad.addValue(listInt, seg.getTotalRegions());


             }
        }
        
    }//GEN-LAST:event_jList2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String selected = jComboBox1.getSelectedItem().toString();
        System.out.println(System.getProperty("user.dir")+"\\imgs");
        
        
        
        
        try {
            transformTextJList2(selected);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
   
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    private void initRegions(){
        try {
            setRegionsNames = text.nameAllRegions();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        jComboBox1.removeAllItems();
        Iterator<String> it = setRegionsNames.iterator();
        while(it.hasNext()){
            jComboBox1.addItem(it.next());
        }
        
        Iterator<String> ite = setRegionsNames.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
