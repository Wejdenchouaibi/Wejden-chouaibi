public class Main {
    public static void main(String[] args) {
        Produit produit1 = new Produit("P01", "Chaise", 45.99);
        Produit produit2 = new Produit("P01", "Chaise", 45.99);
        Produit produit3 = new Produit("P02", "Table", 89.99);

        System.out.println("Produit 1 est identique à Produit 2 ? " + produit1.comparer(produit2)); // true
        System.out.println("Produit 1 est identique à Produit 3 ? " + produit1.comparer(produit3)); // false

        System.out.println("Produit 2 est identique à Produit 3 ? " + Produit.comparer(produit2, produit3)); // false
        System.out.println("Produit 1 est identique à Produit 2 ? " + Produit.comparer(produit1, produit2)); // true
    }
}