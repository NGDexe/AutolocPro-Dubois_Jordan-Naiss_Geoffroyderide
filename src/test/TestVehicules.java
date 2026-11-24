package test;

import vehicules.Vehicule;
import java.util.Scanner;

public class TestVehicules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test du constructeur par défaut
        Vehicule v1 = new Vehicule();
        v1.afficherInfos();

        // Saisie avant la création du deuxième véhicule
        System.out.print("Marque : ");
        String marque = scanner.nextLine();

        System.out.print("Modèle : ");
        String modele = scanner.nextLine();

        // Test du constructeur d'initialisation
        Vehicule v2 = new Vehicule("AB-123-CD", marque, modele, 35.0);
        v2.afficherInfos();

        // Test du trajet
        v2.rouler(250);
        System.out.print("Après 250 km : ");
        v2.afficherInfos();

        // Test du constructeur de copie
        Vehicule v3 = new Vehicule(v2);
        v3.afficherInfos();




        System.out.println("Même objet : " + (v2 == v3));
        System.out.println("Même immatriculation : " + v2.equals(v3));
        System.out.println("Même hashCode : " + (v2.hashCode() == v3.hashCode()));

        System.out.println("Nombre de véhicules : " + Vehicule.getCompteurVehicules());

// Tableau de trois véhicules, parcouru avec une boucle for-each
        Vehicule[] vehicules = {v1, v2, v3};

        for (Vehicule v : vehicules) {
            System.out.println(v);
        }




        v2.setKilometrage(500);
        v2.setTarifJournalier(50.0);

        v2.setKilometrage(-100);
        v2.setTarifJournalier(-20.0);

        System.out.println("Kilométrage après refus : " + v2.getKilometrage());
        System.out.println("Tarif après refus : " + v2.getTarifJournalier());

        scanner.close();
    }
}