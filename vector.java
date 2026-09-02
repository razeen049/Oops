class vec implements Cloneable{
    private double i;
    private double j;
    private double k;
    public vec(double i, double j, double k){
        this.i=i;
        this.j=j;
        this.k=k;
    }
    public double dot(vec a){
        double x=this.i*a.i;
        double y=this.j*a.j;
        double z=this.k*a.k;
        return   x+y+z;
    }
    public vec cross(vec a){
 double x=this.j*a.k-a.j*this.k;
double z=this.i*a.j-a.i*this.j;
double y=a.i*this.k-this.i*a.k;
return new vec(x,y,z);

    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        vec cloned=(vec) super.clone();
        return cloned;

    }
    @Override
    public String toString(){
        return " i :"+this.i+" j :" +this.j+" k: "+this.k;

    }
    @Override
    public boolean equals(Object obj){

        if(this==obj) return true;
        if ((obj==null||this.getClass()!=obj.getClass())) return false;
        vec other =(vec) obj;
        return this.i==other.i&&this.j==other.j&&this.k==other.k;
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(i,j,k);
    }



}

public class vector {
   public static void main(String[] args) throws CloneNotSupportedException {
       vec v1 =new vec(4,6,9);
       vec v2=new vec(9,4,2);
       vec v3 =(vec) v1.clone();
       System.out.println(v1.equals(v3));
       System.out.println(v1.dot(v2));
       System.out.println(v1.cross(v2));


    }
}