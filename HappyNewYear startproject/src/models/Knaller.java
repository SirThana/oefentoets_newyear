package models;

public class Knaller extends Vuurwerk {

    private int aantalKnallen;
    private int decibel;

    public Knaller(String naam, double prijs,int aantalKnallen,int decibel, Instructie instructie) {
        super(naam, prijs, instructie);
        this.aantalKnallen = aantalKnallen;
        this.decibel = decibel;
    }

    public int getAantalKnallen() {
        return aantalKnallen;
    }

    @Override
    public boolean isLegaal(){
        if(this.decibel > 120){
            return false;
        }

        return true;
    }

    @Override
    public String toString(){
        String a = "Naam: " + super.naam + "\nPrijs: " + super.prijs + "\nInstructie: " + super.getInstructie()
                + "\nLegaal: " + this.isLegaal() + "\n Aantal knallen: " + this.getAantalKnallen()
                 + "\nDecibel: " + this.decibel;
        return a;

        }
    }
