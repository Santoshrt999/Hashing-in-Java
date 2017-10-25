/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashconcept;

/**
 *
 * @author Santosh
 */
public class MOv implements Comparable<MOv>{

    private String name;
    private double rating;
    private double season;
    private String lang;

    public MOv(String name, double rating, double season, String lang) {
        this.name = name;
        this.rating = rating;
        this.season = season;
        this.lang = lang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getSeason() {
        return season;
    }

    public void setSeason(double season) {
        this.season = season;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "MOv{" + "name=" + name + ", rating=" + rating + ", season=" + season + ", lang=" + lang + '}';
    }

    @Override
    public int compareTo(MOv t) {
        int result = this.getName().compareTo(t.getName());
        if(result==0){
        result = this.getLang().compareTo(t.getLang());
        
        }
        if(result==0){
        result = Double.compare(this.getRating(), t.getRating());
        }
        return result;
    }

}
