import java.util.ArrayList;

public class dup {
    static void main(String[] args) {
        ArrayList<Integer> values=new ArrayList<>();
        ArrayList<Integer> dupl=new ArrayList<>();
        values.add(5);
        values.add(5);
        values.add(5);
        values.add(8);
        values.add(12);
        values.add(4);
        values.add(4);
        for (int i=0;i<values.size();i++){
            for (int b=i+1;b< values.size();b++){
                if(values.get(i).equals(values.get(b))){

                   if(!dupl.contains(values.get(i))){ dupl.add(values.get(i));}
                }
            }
        }
        System.out.println(dupl);

    }
}