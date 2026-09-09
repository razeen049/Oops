import java.util.Arrays;

class points implements Cloneable{
    private int x;
    private int y;


    public points(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void increse(int a, int b){
        this.x+=a;
        this.y+=b;


    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString(){
        return " x : "+this.x+ " y: "+this.y;

    }
}


class arrpo implements Cloneable{
    private int value;
    private points[] arr;

    public arrpo(){
        this.value=0;
        this.arr=new points[]{new points(1,1),new points(2,2),new points(3,3)};


    }
public void inc(){
        this.value++;
        for (int i=0;i<arr.length;i++){
           this.arr[i].increse(1,1);

        }




    }
    @Override
    public Object clone() throws CloneNotSupportedException{

arrpo cloned=(arrpo) super.clone();
cloned.arr=new points[arr.length];
for (int i=0;i<arr.length;i++){
    cloned.arr[i]=(points) this.arr[i].clone();


}
return cloned;

    }
@Override
    public String toString(){
        return" "+ this.value +"\n"+ Arrays.toString(this.arr);

}

}
public class arrpoint  {
   public static void main(String[] args) throws CloneNotSupportedException {
        arrpo a=new arrpo();
       System.out.println(a.toString());
       arrpo b=(arrpo) a.clone();
       System.out.println(b.toString());
a.inc();
       System.out.println(a.toString());

       System.out.println(b.toString());
    }
}