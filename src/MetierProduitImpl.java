import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {

    public static List<Produit> produits = new ArrayList<>();


    @Override
    public void add(Produit o) {
        produits.add(o);
    }

    @Override
    public List getAll() {
        return produits;
    }

    @Override
    public Produit findById(long id) {
        return produits.stream()
                .filter(produit -> produit.getId() == id)
                .findAny()
                .orElse(null);
    }


    @Override
    public void delete(long id) {
        if (!produits.removeIf(produit -> produit.getId() == id))
            System.out.println("Aucun produit trouvé");
    }
}
