package Module1;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;

public class PojotoJson {
    public static void main(String[] args) throws SerializeException {
        JsonSerializer jsonSerializer =	JsonSerializer.DEFAULT_READABLE;
        String sellerNames[] = {"Neon Enterprise", "ABC Software", "XYZ IT solutions"};
        Product product = new Product("MAcbookPro", 1000, "White", sellerNames);
        String json = jsonSerializer.serialize(product);
        System.out.println(json);

    }
}
