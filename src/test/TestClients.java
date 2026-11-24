package test;

import clients.Client;

public class TestClients {
    public static void main(String[] args) {
        // Test du constructeur par défaut
        Client c1 = new Client();
        c1.afficherInfos();

        // Test du constructeur d'initialisation
        Client c2 = new Client(
                "Dupont", "Paul", "ABC123", "0601020304", 2000
        );
        c2.afficherInfos();
        System.out.println("Âge : " + c2.calculerAge(2026) + " ans");

        // Test du constructeur de copie
        Client c3 = new Client(c2);
        c3.afficherInfos();
        System.out.println("Âge de la copie : " + c3.calculerAge(2026) + " ans");
    }
}