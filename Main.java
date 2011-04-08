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

    public static void test1(){

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


        Voie v1 = new Voie(s1,s2,2);
        Voie v2 = new Voie(s2,s3,3);
        Voie v3 = new Voie(s2,s4,1);
        Voie v4 = new Voie(s2,s5,2);
        Voie v5 = new Voie(s5,s8,3);
        Voie v6 = new Voie(s4,s7,3);
        Voie v7 = new Voie(s6,s7,2);
        Voie v8 = new Voie(s7,s8,5);
        Voie v9 = new Voie(s8,s9,4);
        Voie v10 = new Voie(s9,s3,6);

        s1.ajouterVoie(v1);

        s2.ajouterVoie(v1);
        s2.ajouterVoie(v2);
        s2.ajouterVoie(v3);
        s2.ajouterVoie(v4);

        s3.ajouterVoie(v2);
        s3.ajouterVoie(v10);

        s4.ajouterVoie(v3);
        s4.ajouterVoie(v6);

        s5.ajouterVoie(v4);
        s5.ajouterVoie(v5);

        s6.ajouterVoie(v7);

        s7.ajouterVoie(v6);
        s7.ajouterVoie(v7);
        s7.ajouterVoie(v8);

        s8.ajouterVoie(v5);
        s8.ajouterVoie(v8);
        s8.ajouterVoie(v9);

        s9.ajouterVoie(v9);
        s9.ajouterVoie(v10);



    }
    public static void main(String[] args) {
        // TODO code application logic here

        test1();
    }




}
