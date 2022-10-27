package Module5;

import lombok.Getter;
import lombok.Setter;

public class Pawan {
    @Getter
    @Setter
    String name = "Pawan";
    @Getter
    @Setter
    String designation = "Develpoer";

    String getDesignation() {
        return name + "  designation is " + designation;

    }
}