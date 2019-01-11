package models;

public class Vuurpijl extends Vuurwerk{

    private double hoogte;
    private int[] kleurverhouding;


    public Vuurpijl(String naam, double prijs, Instructie instructie,double hoogte,int[] kleurverhouding) {
        super(naam, prijs, instructie);
        this.hoogte = hoogte;
        this.kleurverhouding = kleurverhouding;
    }

    @Override
    public boolean isLegaal(){
        if(super.getInstructie().getLeeftijd() <= 16) {
            return false;
        }
        return true;

    }
}
