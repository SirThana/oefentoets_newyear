package models;

public class Vuurpijl extends Vuurwerk{

    private double hoogte;
    private int[] kleurverhouding;


    public Vuurpijl(String naam, double prijs, double hoogte,int[] kleurverhouding,Instructie instructie) {
        super(naam, prijs, instructie);
        this.kleurverhouding = kleurverhouding;
        this.hoogte = hoogte;
        if(correcteKleurverhouding(this.kleurverhouding) == false){
            this.kleurverhouding[0] = 100;
            this.kleurverhouding[1] = 0;
            this.kleurverhouding[2] = 0;

        }
    }

    @Override
    public boolean isLegaal(){
        if(super.getInstructie() != null) {

            if (super.getInstructie().getMinimumLeeftijd() < 16) {
                return false;
            }

        }
        return true;
    }

    public void setKleur(int getal){
        this.kleurverhouding[0] = getal;
    }

    public int[] getKleurverhouding(){
        return this.kleurverhouding;
    }



    public boolean correcteKleurverhouding(int[] kleurverhouding){
        double max = kleurverhouding[0] + kleurverhouding[1] + kleurverhouding[2];

        if(max != 100){
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        String a =  "Naam: " + super.naam + "\n Prijs: " + super.prijs + "\n Instructie: " + "\nLegaal: " +
                this.isLegaal() + "\n Hoogte: " + this.hoogte;
    return a;
    }






}

