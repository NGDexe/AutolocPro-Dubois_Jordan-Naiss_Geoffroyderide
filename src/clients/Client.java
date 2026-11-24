package clients;

public class Client {
    String nom;
    String prenom;
    String numeroPermis;
    String telephone;
    int anneeNaissance;


    public Client() {
        this.nom = "N/A";
        this.prenom = "N/A";
        this.numeroPermis = "N/A";
        this.telephone = "N/A";
        this.anneeNaissance = 2000;

        System.out.println("Constructeur par défaut de Client appelé");
    }

    public Client(String nom, String prenom, String numeroPermis,
                  String telephone, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroPermis = numeroPermis;
        this.telephone = telephone;
        this.anneeNaissance = anneeNaissance;

        System.out.println("Constructeur d'initialisation de Client appelé");
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
}