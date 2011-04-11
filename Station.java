/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gi_projet;

import java.util.ArrayList;

/**
 *
 * @author goffe0052
 */
public class Station {
    private String nom;
    private int coordX, coordY;
    private boolean etat;
    private int tempsArret; //En minutes
    private ArrayList<Voie> listeVoies;

    public Station(String nom, int coordX, int coordY){
        this.nom = nom;
        this.coordX = coordX;
        this.coordY = coordY;
        this.etat = true; //Par défaut
        this.tempsArret = 1; //Par défaut
        listeVoies = null;
    }

    

    public void ajouterVoie(Voie v){
        this.listeVoies.add(v);
    }
    
    public ArrayList getListeVoies() {
        return listeVoies;
    }

    public void setListeVoies(ArrayList listeVoies) {
        this.listeVoies = listeVoies;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTempsArret() {
        return tempsArret;
    }

    public void setTempsArret(int tempsArret) {
        this.tempsArret = tempsArret;
    }




}
