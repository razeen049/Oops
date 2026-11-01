import java.util.HashMap;
import java.util.Scanner;

public class count {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter sentence: ");
        String a= sc.nextLine();
        String[] b =a.split(" ");
        HashMap<String,Integer> c=new HashMap<>();
        for (String i:b){
            if(c.containsKey(i)){
                int s=c.get(i);
                c.put(i,s+1);
            }
            else {
                c.put(i,1);
            }

        }
        System.out.println(c);

    }
}