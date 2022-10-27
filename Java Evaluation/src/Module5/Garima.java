package Module5;

import lombok.Getter;
import lombok.Setter;

public class Garima {
    @Getter
    @Setter
    String name = "Garima";
    @Getter
    @Setter
    String designation = "Backend Develpoer";

    String getDesignation() {
        return name + "  designation is " + designation;
    }

}