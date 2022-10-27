package Module9;

public class Bangalore {
    String cm = "Basavaraj Bommai";
    String capital = "Benguluru";
    String state = "Karnataka";
    int dist = 31;
    String getDetails(){
        return state + " CM is " + cm + ". " +"Capital is "+capital+ " it contains "+dist + " districts.";
    }

    public String getCm() {
        return cm;
    }

    public String getCapital() {
        return capital;
    }

    public int getDist() {
        return dist;
    }
}
