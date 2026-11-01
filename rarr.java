import java.util.ArrayList;

public class rarr {
    static void main(String[] args) {
        ArrayList<Integer> values=new ArrayList<>();
        values.add(5);
        values.add(-3);
        values.add(8);
        values.add(-1);
        int s=0;
        int e=values.size()-1;
        while (s<e){
            int t= values.get(s);
            values.set(s, values.get(e));
            values.set(e,t);
            s++;
            e--;


        }
        System.out.println(values);

    }
}