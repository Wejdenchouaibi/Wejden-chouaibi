class Responsable extends Employe {
    private double prime;

    public Responsable(String identifiant, String nom, String adresse, int nbrHeures, double prime) {
        super(identifiant, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbrHeures * 10;
        if (nbrHeures > 160) {
            salaire += (nbrHeures - 160) * 10 * 0.20; // 20% pour heures sup
        }
        return salaire + prime;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Prime: " + prime);
    }
}