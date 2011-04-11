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
public class Ligne {
    private String nom;
    private int numero;
    private ArrayList<Station> listeStation;
    private int heureDepart; //En minutes

    public Ligne(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
        this.heureDepart = 360;
    }

    public void ajouterStation(Station s){
        this.listeStation.add(s);
    }

    public int getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(int heureDepart) {
        this.heureDepart = heureDepart;
    }

    public ArrayList<Station> getListeStation() {
        return listeStation;
    }

    public void setListeStation(ArrayList<Station> listeStation) {
        this.listeStation = listeStation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }




}
