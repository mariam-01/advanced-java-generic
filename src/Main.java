import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MetierProduitImpl metier = new MetierProduitImpl();

        int choix;

        do {
            printMenu();
            choix = scanner.nextInt();
            scanner.nextLine(); // to handle the newline character after the number input

            switch (choix) {
                case 1 -> ajouterUnProduit(scanner, metier);
                case 2 -> afficherTousLesProduits(metier);
                case 3 -> rechercherUnProduit(scanner, metier);
                case 4 -> supprimerUnProduit(scanner, metier);
                case 0 -> System.out.println("Au revoir !");
                default -> System.out.println("Choix invalide.");
            }
        } while (choix != 0);

        scanner.close();
    }

    public static void printMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Ajouter un produit");
        System.out.println("2. Afficher la liste des produits");
        System.out.println("3. Rechercher un produit");
        System.out.println("4. Supprimer un produit");
        System.out.println("0. Quitter");
        System.out.print("Choix: ");
    }

    public static void ajouterUnProduit(Scanner scanner, MetierProduitImpl metier) {
        System.out.print("Entrez id du produit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Entrez le nom du produit: ");
        String nom = scanner.nextLine();

        System.out.print("Entrez la marque du produit: ");
        String marque = scanner.nextLine();

        System.out.print("Entrez la description du produit: ");
        String description = scanner.nextLine();

        System.out.print("Entrez la quantité du produit: ");
        int quantite = scanner.nextInt();

        System.out.print("Entrez le prix du produit: ");
        double prix = scanner.nextDouble();

        Produit produit = new Produit(id, nom, marque, quantite, description, prix);
        metier.add(produit);
        System.out.println("Produit ajouté avec succès.");
    }

    public static void afficherTousLesProduits(MetierProduitImpl metier) {
        List<Produit> produits = metier.getAll();
        if (produits.isEmpty()) {
            System.out.println("Aucun produit disponible.");
        } else {
            produits.forEach(System.out::println);
        }
    }

    public static void supprimerUnProduit(Scanner scanner, MetierProduitImpl metier) {
        System.out.print("Entrez l'ID du produit à supprimer: ");
        int id = scanner.nextInt();
        metier.delete(id);
        System.out.println("Produit supprimé.");
    }

    public static void rechercherUnProduit(Scanner scanner, MetierProduitImpl metier) {
        System.out.print("Entrez l'ID du produit à rechercher: ");
        int id = scanner.nextInt();
        Produit produit = metier.findById(id);
        if (produit != null) {
            System.out.println("Produit trouvé: " + produit);
        } else {
            System.out.println("Aucun produit trouvé ");
        }
    }
}