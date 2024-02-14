import java.util.ArrayList;
import java.util.List;

public class Stack{

    List<String> items;
    int top=-1;

    public Stack(){
        items= new ArrayList<>();
    }

    public void push(String example){
        if (top!=items.size()){
            items.add(example);
            top++;
        }
    }

    public String pop() throws Exception{
        if (top>0){
            items.remove(top);
            top--;
        }
        return items.get(top);
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

}
