/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Santosh
 */
public class Movies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MOv m1 = new MOv("GOT", 5.5, 36.0, "Eng");
        MOv m2 = new MOv("Breakign bad", 9.0, 39.0, "Spanish");
        MOv m3 = new MOv("Friends", 3.0, 25.0, "Italian");
        MOv m4 = new MOv("Vampire diaries", 4.0, 44.0, "Tamil");
        MOv m5 = new MOv("Orange is the new black", 6.5, 57.0, "Malayalam");

        
        
        List<MOv> vec = new Vector<>();
        vec.add(m1);
        vec.add(m2);
        vec.add(m3);
        vec.add(m4);
        vec.add(m5);
        System.out.println("Vector");
        System.out.println("");
     for(MOv v: vec){
         System.out.println(v);
     }
        
        Collections.sort(vec, new Ratignbased());
        System.out.println("Vector after sorting ********************************");
        for(MOv v: vec){
         System.out.println(v);
     }
        
        
        
        
        
        System.out.println("***********************");
        List<MOv> mo = new ArrayList();
        mo.add(m1);
        mo.add(m2);
        mo.add(m3);
        mo.add(m4);
        mo.add(m5);

        System.out.println("Before sorting");
        for (MOv m : mo) {

            System.out.println(m);

        }

        System.out.println("Output generated based on sorting");

        //
     //Collections.sort() always contains the list you crested type and the "new class"
     
     Collections.sort(mo, new NameBasedcR());
        for (MOv m : mo) {

            System.out.println(m);

        }

        System.out.println("Rating based sort");//it depends on minus so, increaisng and decresaing value.

        Collections.sort(mo, new Ratignbased());
        for (MOv m : mo) {

            System.out.println(m);

        }
    }

}
