/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gi_projet;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author goffe0052
 */
public class Itineraire {

    private Station stationDepart, stationArrivee;
    private int heureArrivee; //en min
    private ArrayList<Station> stationsIntermediaires;

    public Station distance(Point coordonneesUtilisateur, ArrayList<Station> listeStation) {
        int distance = Integer.MAX_VALUE;
        Station stationPlusProche = null;

        for (int i = 1; i < listeStation.size(); i++) {
            if (Math.abs(listeStation.get(i).getCoordX() - coordonneesUtilisateur.x) + Math.abs(listeStation.get(i).getCoordY() - coordonneesUtilisateur.y) < distance && listeStation.get(i).isEtat()) {
                distance = Math.abs(listeStation.get(i).getCoordX() - coordonneesUtilisateur.x) + Math.abs(listeStation.get(i).getCoordY() - coordonneesUtilisateur.y);
                stationPlusProche = listeStation.get(i);
            }
        }
        return stationPlusProche;
    }
}
