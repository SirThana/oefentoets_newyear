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


//    @Override
//    public boolean isLegaal(){
//        if(this.instructie == null && instructie.isNederlandstalig() == false){
//            return false;
//        }
//        return true;
//
//    }

    @Override
    public boolean isLegaal(){
    if(this.instructie == null) {
    return false;
    } else if(instructie.isNederlandstalig() == false) {
        return false;
    }
        return true;

    }



    @Override
    public String toString(){

        String a = "Naam: " + super.getNaam() + " \n" + "Prijs: " + super.getEURO() + super.getPrijs()
                + "\n " + "Instructies: " + instructie + "\n Legaal: " + this.isLegaal();
        return a;
    }

    public Instructie getInstructie() {
        return instructie;
    }
}
