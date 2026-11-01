import java.util.HashMap;
import java.util.Scanner;

public class machine {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> machine=new HashMap<>();
        machine.put("Apple", 50);
        machine.put("Banana", 30);
        machine.put("Orange", 40);
        System.out.println("Press 1:Add 2:Remove 3:Check 4:Display 5:Exit");
        int a = sc.nextInt();
while (a!=5){
    if(a==4){
        System.out.println(machine);
    }
    else {
        System.out.println("Enter the product: ");
        String b= sc.next();
        int c=machine.get(b);
        if (a==1){
            System.out.println("How much you want to add:");
            int add= sc.nextInt();
            int res=c+add;
            machine.put(b,res);
            System.out.println(b +" = "+ machine.get(b));


        } else if (a==2){
            System.out.println("How much you want to remove:");
            int add= sc.nextInt();
            int res=c-add;
            machine.put(b,res);
            System.out.println(b +" = "+ machine.get(b));

        }
        else  if (a==3){
            System.out.println(b +" = "+ machine.get(b));


        }



    }
    System.out.println("Press 1:Add 2:Remove 3:Check 4:Display 5:Exit");
     a = sc.nextInt();
}
    }
}