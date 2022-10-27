package Module5;

import lombok.Getter;
import lombok.Setter;

public class Swathi {
    int id = 1;
  @Setter @Getter String designation = "Intern";
 @Setter @Getter   String name = "Swathi";

    String getDesignation(){
        return  name + "  designation is  " + designation;

    }
}
