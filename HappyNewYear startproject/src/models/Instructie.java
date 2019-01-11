package models;


/**
 * @author Martijn Zijl
 * Deze class maakt de isntructies aan van meerdere andere classes
 */

public class Instructie {
    /**
     * Dit zijn de attributen van class instructie
     */
    private boolean nederlandstalig;
    private int minimumLeeftijd;
    private String omschrijving;

    /**
     * Dit is de constructor van class instructie
     * @param nederlandstalig
     * @param minimumLeeftijd
     * @param omschrijving
     */
    public Instructie(boolean nederlandstalig, int minimumLeeftijd, String omschrijving) {
        this.nederlandstalig = nederlandstalig;
        this.minimumLeeftijd = minimumLeeftijd;
        this.omschrijving = omschrijving;
    }



    public boolean isNederlandstalig() {
        return nederlandstalig;
    }

    public int getLeeftijd() {
        return minimumLeeftijd;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    @Override
    public String toString() {
        return "Nederlandstalig=" + nederlandstalig + ", leeftijd=" + minimumLeeftijd + ", omschrijving=" + omschrijving;
    }
}


