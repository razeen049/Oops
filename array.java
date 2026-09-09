import java.util.Arrays;

class ar implements Cloneable{
    private int value;
    private int[] arr;

    public ar(){
        this.value=0;
        this.arr=new int[]{1,2,3,4,5};
    }
    public void inc() {
        this.value++;
        for (int a = 0; a < this.arr.length; a++) {
            this.arr[a] = this.arr[a] + 1;

        }

    }
@Override
    public String toString(){

        return "value = "+ this.value+" array = "+ Arrays.toString(this.arr);

}
@Override
    public Object clone() throws CloneNotSupportedException{
        ar cloned =(ar) super.clone();
        cloned.arr=this.arr.clone();
        return  cloned;

}
}
public class array {
    static void main(String[] args) throws CloneNotSupportedException {
        ar a1=new ar();
        System.out.println(a1.toString());
        ar a2=(ar) a1.clone();
        a2.inc();
        System.out.println(a2.toString());
        System.out.println(a1.toString());
    }
}