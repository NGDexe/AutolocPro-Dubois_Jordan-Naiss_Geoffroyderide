package vehicules;

public class Vehicule {
    String immatriculation;
    String marque;
    String modele;
    int kilometrage;
    double tarifJournalier;
    boolean disponible;



    public Vehicule() {
        this.immatriculation = "N/A";
        this.marque = "N/A";
        this.modele = "N/A";
        this.kilometrage = 0;
        this.tarifJournalier = 0.0;
        this.disponible = true;

        System.out.println("Constructeur par défaut appelé");
    }


    public Vehicule(String immat, String marque, String modele, double tarif) {
        this.immatriculation = immat;
        this.marque = marque;
        this.modele = modele;
        this.tarifJournalier = tarif;
        this.kilometrage = 0;
        this.disponible = true;

        System.out.println("Constructeur d'initialisation appelé");
    }

    public Vehicule(Vehicule v) {
        if (v == null) {
            throw new IllegalArgumentException("Le véhicule à copier ne peut pas être null");
        }

        this.immatriculation = v.immatriculation;
        this.marque = v.marque;
        this.modele = v.modele;
        this.kilometrage = v.kilometrage;
        this.tarifJournalier = v.tarifJournalier;
        this.disponible = v.disponible;

        System.out.println("Constructeur de copie appelé");
    }


    public void rouler(int km) {
        this.kilometrage += km;
    }


    public void afficherInfos() {
        System.out.println(
                "Vehicule{immatriculation='" + this.immatriculation
                        + "', marque='" + this.marque
                        + "', modele='" + this.modele
                        + "', km=" + this.kilometrage
                        + ", tarif=" + this.tarifJournalier
                        + ", disponible=" + this.disponible
                        + "}"
        );
    }
}



