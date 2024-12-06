class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur(String identifiant, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(identifiant, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * (tauxDeVente / 100);
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Taux de vente: " + tauxDeVente + "%");
    }
}
