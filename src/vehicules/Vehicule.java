package vehicules;

public class Vehicule {
    String immatriculation;
    String marque;
    String modele;
    int kilometrage;
    double tarifJournalier;
    boolean disponible;


    private static int compteurVehicules = 0;
    public static final String DEVISE = "EUR";



    public Vehicule() {
        this.immatriculation = "N/A";
        this.marque = "N/A";
        this.modele = "N/A";
        this.kilometrage = 0;
        this.tarifJournalier = 0.0;
        this.disponible = true;

        System.out.println("Constructeur par défaut appelé");
        compteurVehicules++;
    }


    public Vehicule(String immat, String marque, String modele, double tarif) {
        this.immatriculation = immat;
        this.marque = marque;
        this.modele = modele;
        this.tarifJournalier = tarif;
        this.kilometrage = 0;
        this.disponible = true;

        System.out.println("Constructeur d'initialisation appelé");
        compteurVehicules++;
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
        compteurVehicules++;
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

    public String getImmatriculation() {
        return immatriculation;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public double getTarifJournalier() {
        return tarifJournalier;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public String getModele() {
        return modele;
    }

    public String getMarque() {
        return marque;
    }


    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setTarifJournalier(double tarifJournalier) {
        if (tarifJournalier < 0) {
            System.out.println("Erreur : le tarif ne peut pas être négatif.");
            return;
        }
        this.tarifJournalier = tarifJournalier;
    }

    public void setKilometrage(int kilometrage) {
        if (kilometrage < 0) {
            System.out.println("Erreur : le kilométrage ne peut pas être négatif.");
            return;
        }
        this.kilometrage = kilometrage;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }


    public static int getCompteurVehicules() {
        return compteurVehicules;
    }


    @Override
    public String toString() {
        return String.format(
                "[%s] %s %s - %d km - %.2f %s/jour - %s",
                immatriculation, marque, modele, kilometrage,
                tarifJournalier, DEVISE,
                disponible ? "DISPONIBLE" : "INDISPONIBLE"
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Vehicule autre = (Vehicule) obj;
        return this.immatriculation.equals(autre.immatriculation);
    }


    @Override
    public int hashCode() {
        return immatriculation.hashCode();
    }
}



