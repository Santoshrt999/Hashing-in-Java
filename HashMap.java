/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashconcept;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Santosh
 */
public class HashMap {

    public static void main(String[] args) {

        Map<MOv, Integer> hMap = new java.util.HashMap<>();
        //since u've already imported it.

        MOv m1 = new MOv("GOT", 5.5, 36.0, "Eng");
        MOv m2 = new MOv("Breakign bad", 9.0, 39.0, "Spanish");
        MOv m3 = new MOv("GOT", 3.0, 25.0, "Eng");
        MOv m4 = new MOv("Vampire diaries", 4.0, 44.0, "Tamil");
        MOv m5 = new MOv("Oarneg si the new black", 6.5, 57.0, "Malayalam");

        hMap.put(m1, 10);
        hMap.put(m2, 2);

        hMap.put(m3, 33);

        hMap.put(m4, 41);

        hMap.put(m5, 53);
        // System.out.println("Bucket1" + m1.hashCode() & 15);

        Set<MOv> mSet = hMap.keySet();
        Collections.synchronizedSet(mSet);
        for (MOv m : mSet) {
            System.out.println("keys " + m + "copies " + hMap.get(m));
        }

        for (Map.Entry<MOv, Integer> entry : hMap.entrySet()) {

            System.out.println("Movie details " + entry.getKey() + "values/copies " + entry.getValue());

        }

        Collections.synchronizedMap(hMap);

        ConcurrentHashMap<MOv, Integer> chm = new ConcurrentHashMap<MOv, Integer>();
        chm.put(m1, 10);
        chm.put(m2, 2);

        chm.put(m3, 33);

        chm.put(m4, 41);

        chm.put(m5, 53);

        Set<MOv> chmS = chm.keySet();
        System.out.println("concurrent Hash Map");
        for (MOv c : chmS) {
            System.out.println("details" + c + "values" + chm.get(c));
        }
    }

    class ABC extends Thread {

        int x = 99;

        public ABC(String tname) {
            setName(tname);//access the parent class methods
            start();// if you want to access multiple objects then it is better to use threads.

        }

        @Override
        public void run() {

            
            
            
            try {
                

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}

//        tMap.put(m3, 12);
//        
//        tMap.put(m4, 7);
//
//        tMap.put(m5, 10);
//        
//        tMap.put(m1, 8);
//
//        tMap.put(m2, 9);
//    System.out.println("tree set keys");
//    System.out.println(tset);
//        for (Map.Entry<MOv, Integer> entry : hMap.entrySet()) {
//            MOv key = entry.getKey(); //entry.getkey
//            Integer value = entry.getValue(); //entry.getValue
//            System.out.println("details" + key + "values " + value);
//        }
//
//  for (MOv m : tset) {
//
//            System.out.println("movie details " + m + "values" + tMap.values());
//        }

