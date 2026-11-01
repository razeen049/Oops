import java.util.Scanner;

public class prime {
    public static boolean p(int a){
        int sum=0;
        for (int i=1;i<=a;i++){
            if(a%i==0){

                sum+=1;
            }

        }
        if (sum==2){
            return true;
        }
        return false;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if (p(a)){
            System.out.println("prime");
        }
        else System.out.println("not");


    }
}