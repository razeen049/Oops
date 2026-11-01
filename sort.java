import java.util.ArrayList;
import java.util.Collections;

public class sort {
    static void main(String[] args) {
        ArrayList<Integer> values=new ArrayList<>();
        values.add(5);
        values.add(-3);
        values.add(8);
        values.add(-1);
        ArrayList<Integer> value=new ArrayList<>();
        value.add(12);
        value.add(-7);
        value.add(4);
        values.addAll(value);
        Collections.sort(values);
        System.out.println(values);
    }
}