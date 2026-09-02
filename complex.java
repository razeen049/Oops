class com implements Cloneable{
    private int real;
    private int img;
    private static int objcounter=0;
    public com(){
        this.real=0;
        this.img=0;
        objcounter++;
    }
    public com(int r,int i){
        this.real=r;
        this.img=i;
        objcounter++;
    }
    public int getReal(){
        return this.real;
    }
    public int getImg(){
        return this.img;
    }
    @Override
    public String toString(){
        return "real no :"+ this.real+"  complex no: "+this.img;
    }
    public com add(com a){
        int x=this.real+a.real;
        int i=this.img+a.img;
        return new com(x,i);
    }
    public com mul(com b){
        int r=this.real*b.real-this.img*b.img;
        int i=this.real*b.img+this.img*b.real;
        return new com(r,i);
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        com cloned=(com) super.clone();
        return cloned;

    }
    @Override
    public boolean equals(Object obj){
if(this==obj) return  true;
if (obj==null||this.getClass()!=obj.getClass()) return false;
com other =(com) obj;
return this.real==other.real&&this.img==other.img;

    }
    public int hashCode(){
        return java.util.Objects.hash(real,img);
    }


}
public class complex {
   public static void main(String[] args) throws CloneNotSupportedException {
        com c1=new com(6,9);
    com c2=new com(3,5);
       System.out.println(c1.add(c2));
       System.out.println(c1.mul(c2));
com c3=(com) c1.clone();
com c4 =(com) c2.clone();
       System.out.println(c3.toString());
       System.out.println(c1.equals(c3));

   }

}