
import br.ufrn.imd.lp2.imagesegmentation.ImageInformation;
import br.ufrn.imd.lp2.testandolib.ImageTreatment;
import br.ufrn.imd.lp2.testandolib.TextTreatment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago
 */
public class TADManipulation {
    
    private ImageTreatment image = new ImageTreatment();
    
    public ArrayList sort(ArrayList<String> list){
        Collections.sort(list);
        return list;
    }
    
    public ArrayList addValue(ArrayList<Integer> list, int total){
        list.clear();
        for(int i =0; i < total; i++)
           list.add(0);       
        return list;
    }    
    
    
    public boolean checkName(ArrayList<String> list, String name){
        if(list.contains(name)){
            return true;
        }
        else{
            return false;
        }
    }
    

    public boolean checkRegion(ArrayList<String> list, Map<String, Integer[]> map, int region, ImageInformation seg){
        Iterator<String> it = list.iterator();
        Integer[] coordenates;
        for(int i =0; i < list.size(); i++){
            coordenates = map.get(list.get(i));
            if(region == image.defineRegion(coordenates[0], coordenates[1], seg))
                return true;
            
        }
        return false;
    }
    
    
}



