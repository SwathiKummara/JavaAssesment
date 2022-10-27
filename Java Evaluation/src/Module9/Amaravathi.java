package Module9;

public class Amaravathi {
    String cm = "Jagan";
   String capital = "Amaravathi";
    String state = "Andrapradesh";
    int dist = 26;
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
