class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(String identifiant, String nom, String adresse, int nbrHeures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbrHeures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbrHeures * 5;
        if (nbrHeures > 180) {
            salaire += (nbrHeures - 180) * 5 * 0.15; // 15% pour heures sup
        }
        return salaire;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Numéro de caisse: " + numeroDeCaisse);
    }
}
