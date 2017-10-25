/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashconcept;

import java.util.Comparator;

/**
 *
 * @author Santosh
 */
public class Ratignbased implements Comparator<MOv> {

    @Override
    public int compare(MOv t, MOv t1) {
        return (int) (t.getRating() - t1.getRating());//ascending order
        //return (int)//downcastdouble   (t1.getRating()-t.getRating());
    }

}
