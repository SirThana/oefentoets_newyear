package models;

public class Instructie {

    boolean nederlandstalig;
    int minimumLeeftijd;
    String omschrijving;

    Instructie(boolean nederlandstalig, int minimumLeeftijd, String omschrijving) {
        this.nederlandstalig = nederlandstalig;
        this.minimumLeeftijd = minimumLeeftijd;
        this.omschrijving = omschrijving;
    }

    boolean isNederlandstalig() {
        return nederlandstalig;
    }

    int getLeeftijd() {
        return minimumLeeftijd;
    }

    @Override
    public String toString() {
        return "Nederlandstalig=" + nederlandstalig + ", leeftijd=" + minimumLeeftijd + ", omschrijving=" + omschrijving;
    }
}


