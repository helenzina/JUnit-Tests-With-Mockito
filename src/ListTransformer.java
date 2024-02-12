import java.util.ArrayList;
import java.util.List;

public class ListTransformer {
    public static List<String> transformList(List<String> inputList) {
        List<String> result = new ArrayList<>();
        for (String word : inputList) {
            result.add(word.toUpperCase());
        }
        return result;
    }
}