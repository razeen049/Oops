import java.util.Scanner;

class Point{
    private int pointA;
    private int pointB;
    public Point(){
        this.pointA=0;
        this.pointB=0;
    }
    public Point(int pointA,int pointB){
        this.pointA=pointA;
        this.pointB=pointB;
    }

    @Override
    public String toString() {
        return "(" + this.pointA + ", " + this.pointB + ")";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        return this.pointA == other.pointA && this.pointB == other.pointB;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(pointA, pointB);
    }

}
class Circle{
    private double radius;
    private Point center;

public Circle(){
    this.radius=1;
    this.center=new Point(0,0);
}
    public Circle(double radius,Point center){
        this.radius=radius;
        this.center=center;
    }

public void inputrad(){
    Scanner sc=new Scanner(System.in);
    this.radius= sc.nextInt();
    while (this.radius<=0){
        System.out.println("Enter valid input");
        this.radius= sc.nextInt();
    }


}
public Circle(Circle copy){
    this.center=copy.center;
    this.radius=copy.radius;

}
public double getpara(){
    return 2*Math.PI*this.radius;
}
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
public String toString(){
    return "Point of circle "+center+"radius"+this.radius+" area "+Math.PI*this.radius*this.radius+" para "+ 2*Math.PI*this.radius;

}
@Override
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || this.getClass() != obj.getClass()) {
        return false;
    }
    Circle other = (Circle) obj;
    return this.radius == other.radius && this.center.equals(other.center);
}
@Override
        public int hashCode(){
    return java.util.Objects.hash(radius,center);
    }


}



/*public class circle{
   public static void main(String[] args) {
        Point p1=new Point(3,6);
        Point p2 =new Point(9,3);
        Circle c1=new Circle(36.5,p1);

    }
}*/public class cir {
    public static void main(String[] args) {
        Point p1 = new Point(3, 6);
        Point p2 =new Point(3,6);
        Circle c1 = new Circle(36.5, p1);
        Circle c2 = new Circle(36.5, p1); // Same data

        System.out.println("Are circles equal? " + c1.equals(c2)+p1.equals(p2)); // True aayega
    }
}