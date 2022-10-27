package Module9;

public class Gandhinagar {
    String cm = "Bhupendrabhai Rajnikantbhai Patel";
   String capital = "Gandhinagar";
    String state = "Gujarath";
    int dist = 16;
    String getDetails(){
        return state + " CM is " + cm + ". " +"Capital is "+capital+ " it contains "+dist + " districts.";
    }

    public String getCm() {
        return cm;
    }

    public int getDist() {
        return dist;
    }

    public String getCapital() {
        return capital;
    }
}
