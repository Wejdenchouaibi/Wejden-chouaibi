class Produit {
    private String identifiant;
    private String libelle;
    private double prix;


    public Produit(String identifiant, String libelle, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.prix = prix;
    }


    public String getIdentifiant() {
        return identifiant;
    }


    public String getLibelle() {
        return libelle;
    }


    public double getPrix() {
        return prix;
    }


    public boolean comparer(Produit autreProduit) {
        if (autreProduit == null) {
            return false;
        }
        return this.identifiant.equals(autreProduit.getIdentifiant()) &&
                this.libelle.equals(autreProduit.getLibelle()) &&
                this.prix == autreProduit.getPrix();
    }


    public static boolean comparer(Produit produit1, Produit produit2) {
        if (produit1 == null || produit2 == null) {
            return false;
        }
        return produit1.getIdentifiant().equals(produit2.getIdentifiant()) &&
                produit1.getLibelle().equals(produit2.getLibelle()) &&
                produit1.getPrix() == produit2.getPrix();
    }
}