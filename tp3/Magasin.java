import java.util.ArrayList;
import java.util.List;

class Magasin {
    private int id;
    private String nom;
    private String adresse;
    private List<Produit> produits;
    protected List<Employe> employes;

    public Magasin(int id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.produits = new ArrayList<>();
        this.employes = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void ajouterEmploye(Employe employe) {
        if (employes.size() < 20) {
            employes.add(employe);
        } else {
            System.out.println("Capacité maximale d'employés atteinte !");
        }
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void afficherDetails() {
        System.out.println("Magasin [ID: " + id + ", Nom: " + nom + ", Adresse: " + adresse + "]");
        System.out.println("Produits :");
        for (Produit produit : produits) {
            produit.afficherInfos();
        }
        System.out.println("Employés :");
        for (Employe employe : employes) {
            employe.afficherInfos();
        }
    }
}
