class Produit {
    private String identifiant;
    private String libelle;
    private double prix;

    public Produit(String identifiant, String libelle, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.prix = prix;
    }

    public void afficherInfos() {
        System.out.println("Produit [ID: " + identifiant + ", Libellé: " + libelle + ", Prix: " + prix + "]");
    }
}