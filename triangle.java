class point implements Cloneable{
    private int a;
    private int b;

    public point (){
        this.a=0;
        this.b=0;

    }
    public point(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }
    @Override
    public String toString(){
        return " x :"+ this.a+" y:"+this.b;
    }

    @Override
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (obj==null||this.getClass()!=obj.getClass()){
            return false;
        }
        point other =(point) obj;
        return this.a==other.a &&this.b==other.b;
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(a,b);
    }


}
class line implements Cloneable{
    private point start;
    private point end;


    public line(point a, point b){
        this.start=a;
        this.end=b;

    }

    public double length(){
        int dx=start.getA()-end.getA();
        int dy=start.getB()- end.getB();
        return Math.sqrt((dx*dx)+(dy*dy));

    }
    public int lengthsquared(){
        int dx=start.getA()-end.getA();
        int dy=start.getB()-end.getB();
        return dx*dx +dy*dy;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        line cloned=(line) super.clone();
        cloned.start=(point) this.start.clone();
        cloned.end=(point) this.end.clone();
return cloned;
    }
    @Override
    public String toString(){
        return "start" + start+"end "+ end;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)return  true;
        if(obj==null||this.getClass()!=obj.getClass()) return false;

        line other =(line) obj;
        return this.start.equals(other.start)&&this.end.equals(other.end);
    }
@Override
    public int hashCode(){
        return java.util.Objects.hash(start,end);
}



}

class joint implements Cloneable{

    private line l1;
    private line l2;
    private line l3;

    public joint(line a, line b, line c){
        this.l1=a;
        this.l2=b;
        this.l3 =c;

    }

    public double para(){

        return l1.length()+l2.length()+ l3.length();
    }

    public boolean right(){
        int s1= l1.lengthsquared();
        int s2 =l2.lengthsquared();
        int s3= l3.lengthsquared();
        if (s1==s2+s3||s2==s3+s1||s3==s1+s2){
            return true;
        }
        else return false;

    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        joint cloned =(joint) super.clone();
        cloned.l1=(line) this.l1.clone();
        cloned.l2=(line) this.l2.clone();
        cloned.l3=(line) this.l3.clone();
        return cloned;
    }
    @Override
    public String toString(){
        return l1+ "  " +l2 + "  "+l3;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null||this.getClass()!=obj.getClass()) return false;
        joint other=(joint) obj;
        return this.l1.equals(other.l1)&&this.l2.equals(other.l2)&&this.l3.equals(other.l3);

    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(l1,l2,l3);
    }



}
public class triangle {
public static void main(String[] args) throws CloneNotSupportedException {
        point p1 =new point(5,9);

        point p2 =new point(5,6);

        point p3= new point(9,3);





        line l1 =new line(p1,p2);

        line l2=new line(p1,p3);

        line l3 =new line(p2,p3);



        joint t1=new joint(l1,l2,l3);
        joint t2=(joint) t1.clone();
    System.out.println(t1.toString());

    System.out.println(t1.equals(t2));
    System.out.println(t1.right());
    System.out.println(p1.getA());
    System.out.println(t1.para());
    }
}