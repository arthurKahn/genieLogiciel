/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gi_projet;

/**
 *
 * @author goffe0052
 */
public class Voie {

    private Station stationDepart, stationArrivee;
    private int duree; //En minutes
    private boolean statut;

    public Voie(Station stationDepart, Station stationArrivee, int duree) {
        this.stationDepart = stationDepart;
        this.stationArrivee = stationArrivee;
        this.duree = duree;
        this.statut = true;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Station getStationArrivee() {
        return stationArrivee;
    }

    public void setStationArrivee(Station stationArrivee) {
        this.stationArrivee = stationArrivee;
    }

    public Station getStationDepart() {
        return stationDepart;
    }

    public void setStationDepart(Station stationDepart) {
        this.stationDepart = stationDepart;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }




}
