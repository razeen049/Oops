import java.util.ArrayList;

public class arr {
    static void main(String[] args) {
        ArrayList<Integer> values=new ArrayList<>();
        values.add(5);
        values.add(-3);
        values.add(8);
        values.add(-1);
        values.add(12);
        values.add(-7);
        values.add(4);
       for (int i=0;i<values.size();i++){

           if(values.get(i)<0){
               values.remove(i);
               i--;
           }

       }
        System.out.println(values);
    }
}