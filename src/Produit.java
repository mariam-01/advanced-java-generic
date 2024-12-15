public class Produit {

    private long id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nombreEnStock;

    public Produit() {
    }

    public Produit(long id, String marque, String nom, int nombreEnStock, String description, double prix) {
        this.id = id;
        this.marque = marque;
        this.nom = nom;
        this.nombreEnStock = nombreEnStock;
        this.description = description;
        this.prix = prix;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public int getNombreEnStock() {
        return nombreEnStock;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNombreEnStock(int nombreEnStock) {
        this.nombreEnStock = nombreEnStock;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", nombreEnStock=" + nombreEnStock +
                '}';
    }
}
