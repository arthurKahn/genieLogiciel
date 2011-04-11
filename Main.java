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
public class Main {

    /**
     * @param args the command line arguments
     */

    public static ArrayList initialisation(){

        ArrayList listeStations = null;
        
        Station s1 = new Station("numero1",10,5);
        listeStations.add(s1);
        Station s2 = new Station("numero2",10,7);
        listeStations.add(s2);
        Station s3 = new Station("numero3",12,10);
        listeStations.add(s3);
        Station s4 = new Station("numero4",9,6);
        listeStations.add(s4);
        Station s5 = new Station("numero5",7,8);
        listeStations.add(s5);
        Station s6 = new Station("numero6",7,2);
        listeStations.add(s6);
        Station s7 = new Station("numero7",4,4);
        listeStations.add(s7);
        Station s8 = new Station("numero8",5,9);
        listeStations.add(s8);
		Station s9 = new Station("numero9",8,12);
        listeStations.add(s9);
		

        Voie v1_2 = new Voie(s1,s2,2);

        Voie v2_1 = new Voie(s2,s1,2);
        Voie v2_3 = new Voie(s2,s3,3);
        Voie v2_4 = new Voie(s2,s4,1);
        Voie v2_5 = new Voie(s2,s5,2);

        Voie v3_2 = new Voie(s3,s2,3);
        Voie v3_9 = new Voie(s3,s9,5);

        Voie v4_2 = new Voie(s4,s2,1);
        Voie v4_7 = new Voie(s4,s7,3);

        Voie v5_2 = new Voie(s5,s2,2);
        Voie v5_8 = new Voie(s5,s8,3);
        
        Voie v6_7 = new Voie(s6,s7,2);

        Voie v7_4 = new Voie(s7,s4,3);
        Voie v7_6 = new Voie(s7,s6,3);
        Voie v7_8 = new Voie(s7,s8,5);

        Voie v8_5 = new Voie(s8,s5,3);
        Voie v8_7 = new Voie(s8,s7,5);
        Voie v8_9 = new Voie(s8,s9,4);

        Voie v9_3 = new Voie(s9,s3,5);
        Voie v9_8 = new Voie(s9,s8,4);

        s1.ajouterVoie(v1_2);

        s2.ajouterVoie(v2_1);
        s2.ajouterVoie(v2_3);
        s2.ajouterVoie(v2_4);
        s2.ajouterVoie(v2_5);

        s3.ajouterVoie(v3_2);
        s3.ajouterVoie(v3_9);

        s4.ajouterVoie(v4_2);
        s4.ajouterVoie(v4_7);

        s5.ajouterVoie(v5_2);
        s5.ajouterVoie(v5_8);

        s6.ajouterVoie(v6_7);

        s7.ajouterVoie(v7_4);
        s7.ajouterVoie(v7_6);
        s7.ajouterVoie(v7_8);

        s8.ajouterVoie(v8_5);
        s8.ajouterVoie(v8_7);
        s8.ajouterVoie(v8_9);

        s9.ajouterVoie(v9_3);
        s9.ajouterVoie(v9_8);

        return listeStations;
    }
    public static void initialiserLigne(ArrayList<Station> listeStation){
		
        Ligne l1Aller = new Ligne("Ligne 1 vers 8", 1);
        Ligne l1Retour = new Ligne("Ligne 8 vers 1", 1);
        Ligne l2Aller = new Ligne("Ligne 3 vers 7", 1);
        Ligne l2Retour = new Ligne("Ligne 7 vers 3", 1);
        Ligne l3Aller = new Ligne("Ligne 3 vers 6", 1);
        Ligne l3Retour = new Ligne("Ligne 6 vers 3", 1);

        l1Aller.ajouterStation(listeStation.get(0));
        l1Aller.ajouterStation(listeStation.get(1));
        l1Aller.ajouterStation(listeStation.get(4));
        l1Aller.ajouterStation(listeStation.get(7));
        l1Retour.ajouterStation(listeStation.get(7));
        l1Retour.ajouterStation(listeStation.get(4));
        l1Retour.ajouterStation(listeStation.get(1));
        l1Retour.ajouterStation(listeStation.get(0));

        l2Aller.ajouterStation(listeStation.get(2));
        l2Aller.ajouterStation(listeStation.get(1));
        l2Aller.ajouterStation(listeStation.get(3));
        l2Aller.ajouterStation(listeStation.get(6));
        l2Retour.ajouterStation(listeStation.get(6));
        l2Retour.ajouterStation(listeStation.get(3));
        l2Retour.ajouterStation(listeStation.get(1));
        l2Retour.ajouterStation(listeStation.get(2));

        l3Aller.ajouterStation(listeStation.get(2));
        l3Aller.ajouterStation(listeStation.get(8));
        l3Aller.ajouterStation(listeStation.get(7));
        l3Aller.ajouterStation(listeStation.get(6));
        l3Aller.ajouterStation(listeStation.get(5));
        l3Retour.ajouterStation(listeStation.get(5));
        l3Retour.ajouterStation(listeStation.get(6));
        l3Retour.ajouterStation(listeStation.get(7));
        l3Retour.ajouterStation(listeStation.get(8));

        l3Retour.ajouterStation(listeStation.get(2));
}	


    public static void main(String[] args) {
		ArrayList<Station> listeStations = new ArrayList<Station>();
		listeStations = initialisation();
		initialisationLigne(listeStations);
	}	   
}
