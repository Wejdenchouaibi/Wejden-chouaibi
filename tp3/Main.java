public class Main {
    public static void main(String[] args) {

        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah 6");

        // 2. Création des employés
        carrefour.ajouterEmploye(new Caissier("E1", "Ahmed", "Tunis", 190, 1));
        carrefour.ajouterEmploye(new Caissier("E2", "Fatma", "Tunis", 170, 2));
        carrefour.ajouterEmploye(new Vendeur("E3", "Hedi", "Tunis", 0, 75));
        carrefour.ajouterEmploye(new Responsable("E4", "Sami", "Tunis", 180, 200));

        monoprix.ajouterEmploye(new Caissier("E5", "Amal", "Ariana", 185, 3));
        monoprix.ajouterEmploye(new Vendeur("E6", "Ali", "Ariana", 0, 50));
        monoprix.ajouterEmploye(new Vendeur("E7", "Nour", "Ariana", 0, 60));
        monoprix.ajouterEmploye(new Vendeur("E8", "Youssef", "Ariana", 0, 80));
        monoprix.ajouterEmploye(new Responsable("E9", "Salma", "Ariana", 175, 300));

        // 3. Affichage des caractéristiques des employés
        System.out.println("Employés de Carrefour :");
        carrefour.afficherDetails();

        System.out.println("\nEmployés de Monoprix :");
        monoprix.afficherDetails();

        // 4. Ajout des produits
        carrefour.ajouterProduit(new Produit("P1", "Lait", 1.2));
        carrefour.ajouterProduit(new Produit("P2", "Pain", 0.8));

        monoprix.ajouterProduit(new Produit("P3", "Fromage", 5.5));
        monoprix.ajouterProduit(new Produit("P4", "Eau", 0.5));

        // 5. Affichage des détails des magasins
        System.out.println("\nDétails de Carrefour :");
        carrefour.afficherDetails();

        System.out.println("\nDétails de Monoprix :");
        monoprix.afficherDetails();

        // 6. Calcul et affichage des salaires
        System.out.println("\nSalaires des employés de Carrefour :");
        for (Employe employe : carrefour.employes) {
            System.out.println(employe.nom + " : " + employe.calculerSalaire() + " DT");
        }

        System.out.println("\nSalaires des employés de Monoprix :");
        for (Employe employe : monoprix.employes) {
            System.out.println(employe.nom + " : " + employe.calculerSalaire() + " DT");
        }
    }
}