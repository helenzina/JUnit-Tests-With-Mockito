import java.util.ArrayList;
import java.util.List;

public class Product {

    public List<String> breakupString(String product) throws Exception {
        List<String> list= new ArrayList<>();
        list.add(product.substring(0, 2));
        list.add(product.substring(3, 8));
        list.add(product.substring(9));
        return list;
    }

}
