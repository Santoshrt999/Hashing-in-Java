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
public class NameBasedcR implements Comparator<MOv> { //you always compare with the class having methods.

    @Override
    public int compare(MOv t, MOv t1) {
        return t1.getName().compareTo(t.getName());
    }

}
