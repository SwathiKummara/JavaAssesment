package Module1;

import org.apache.juneau.json.JsonParser;
import org.apache.juneau.parser.ParseException;


public class JsontoPOJO {
    public static void main(String[] args) throws ParseException {
        JsonParser jsonParser = JsonParser.DEFAULT;
        String jsonVal = "{\n"
                + "	\"color\": \"White\",\n"
                + "	\"name\": \"MAcbookPro\",\n"
                + "	\"price\": 1000,\n"
                + "	\"sellerNames\": [\n"
                + "		\"Neon Enterprise\",\n"
                + "		\"ABC Software\",\n"
                + "		\"XYZ IT solutions\"\n"
                + "	]\n"
                + "}";
        Product pro = jsonParser.parse(jsonVal, Product.class);
        System.out.println(pro);

    }
}
