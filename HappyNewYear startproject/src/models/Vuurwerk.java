package models;

public class Vuurwerk extends Product {
    private Instructie instructie;

    public Vuurwerk(String naam, double prijs, Instructie instructie) {
        super(naam, prijs);
        this.instructie = instructie;
    }


    public Vuurwerk(String naam,double prijs){
        super(naam,prijs);
    }


    @Override
    public boolean isLegaal(boolean Legaal){
        if(Legaal = true){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String a = " ";
        return a;
    }


}
