package clients;

public class Client {
    String nom;
    String prenom;
    String numeroPermis;
    String telephone;
    int anneeNaissance;

    private static int compteurClients = 0;


    public Client() {
        this.nom = "N/A";
        this.prenom = "N/A";
        this.numeroPermis = "N/A";
        this.telephone = "N/A";
        this.anneeNaissance = 2000;

        System.out.println("Constructeur par défaut de Client appelé");
        compteurClients++;
    }

    public Client(String nom, String prenom, String numeroPermis,
                  String telephone, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroPermis = numeroPermis;
        this.telephone = telephone;
        this.anneeNaissance = anneeNaissance;

        System.out.println("Constructeur d'initialisation de Client appelé");
        compteurClients++;
    }

    public Client(Client c) {
        if (c == null) {
            throw new IllegalArgumentException("Le client à copier ne peut pas être null");
        }

        this.nom = c.nom;
        this.prenom = c.prenom;
        this.numeroPermis = c.numeroPermis;
        this.telephone = c.telephone;
        this.anneeNaissance = c.anneeNaissance;

        System.out.println("Constructeur de copie de Client appelé");
        compteurClients++;
    }


    public int calculerAge(int anneeCourante) {
        return anneeCourante - this.anneeNaissance;
    }



    public void afficherInfos() {
        System.out.println(
                "Client{nom='" + this.nom
                        + "', prenom='" + this.prenom
                        + "', numeroPermis='" + this.numeroPermis
                        + "', telephone='" + this.telephone
                        + "', anneeNaissance=" + this.anneeNaissance
                        + "}"
        );
    }

    public String getNom() {
        return nom;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getNumeroPermis() {
        return numeroPermis;
    }

    public String getPrenom() {
        return prenom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public static int getCompteurClients() {
        return compteurClients;
    }




    @Override
    public String toString() {
        return String.format(
                "%s %s - Permis : %s - Téléphone : %s - Naissance : %d",
                nom, prenom, numeroPermis, telephone, anneeNaissance
        );
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Client autre = (Client) obj;
        return this.numeroPermis.equals(autre.numeroPermis);
    }

    @Override
    public int hashCode() {
        return numeroPermis.hashCode();
    }
}