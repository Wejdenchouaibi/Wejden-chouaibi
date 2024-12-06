import java.util.ArrayList;
import java.util.List;

// Classe Employe (Parent)
abstract class Employe {
    protected String identifiant;
    protected String nom;
    protected String adresse;
    protected int nbrHeures;

    public Employe(String identifiant, String nom, String adresse, int nbrHeures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
    }

    // Méthode abstraite pour calculer le salaire
    public abstract double calculerSalaire();

    public void afficherInfos() {
        System.out.println("ID: " + identifiant + ", Nom: " + nom + ", Adresse: " + adresse + ", Heures: " + nbrHeures);
    }
}
