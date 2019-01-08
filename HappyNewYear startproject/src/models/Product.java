package models;

public class Product {
    /**
     * Symbool voor Euro-teken
     */
    public static final String EURO = "\u20AC";

    protected String naam;
    protected double prijs;

    @Override
    public String toString() {
        return "Naam: " + naam + "\n"
                + "  Prijs: " + EURO + String.format("%.2f", prijs);
    }
}
