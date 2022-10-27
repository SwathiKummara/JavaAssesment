package Module1;

import lombok.Getter;
import lombok.Setter;
import org.apache.juneau.annotation.Beanc;

import java.util.Arrays;

public class Product {
    private @Getter @Setter String  name;
    private @Getter @Setter int price;
    private @Getter @Setter String color;
    private @Getter @Setter String[] sellerNames;

    @Beanc(properties = "name, price, color, sellerNames")
    public Product(String name, int price, String color, String[] sellerNames) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.sellerNames = sellerNames;
    }


    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", color=" + color + ", sellerNames="
                + Arrays.toString(sellerNames) + "]";
    }

}
