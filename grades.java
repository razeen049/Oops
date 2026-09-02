import java.util.Scanner;

class number{
    private String name;
    private int score1;
    private int score2;
    public number(String name){
        this.name=name;
    }
    public void printname(){
        System.out.println(this.name);

    }
    public void inputgrades(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first num");
        this.score1=sc.nextInt();
        this.score2=sc.nextInt();
    }
    public int aver(){
        return (this.score1+this.score2)/2;
    }
    public String getname(){
        return name;
    }
    public String toString(){
        return ("Student name"+name+"score of two subject "+this.score1+","+this.score2+"Average :"+(this.score1+this.score2)/2);
    }


}
public class grades {
    static void main(String[] args) {
        number s1 =new number("Razeen");
        s1.inputgrades();
        System.out.println(s1.toString());


    }
}