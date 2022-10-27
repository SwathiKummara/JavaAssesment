package Module2;


import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;

public class Pojotoxml {
    public static void main(String[] args) throws SerializeException {
        String sellerNames[] = {"Neon Enterprise", "ABC Software", "XYZ IT solutions"};
        Product product = new Product("MAcbookPro", 1000, "White", sellerNames);
        XmlSerializer xmlSerializer = XmlSerializer.DEFAULT_NS_SQ_READABLE;
        String xml = xmlSerializer.serialize(product);
        System.out.println(xml);

    }
}
