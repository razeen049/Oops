class rat{
    private int n;
    private int d;
    public rat(){
        this.n=0;
        this.d=1;


    }
    public rat(int a ,int b){
        if(b==0){
            throw new IllegalArgumentException("Denominator is zero");
        }
        int x=Math.abs(a);
        int y=Math.abs(b);

        int g=gcd(x,y);
        if(b<0){
            a=-a;
            b=-b;
        }

        this.n=a/g;
        this.d=b/g;


    }
    private int gcd(int a, int b){
        if(b==0) return a;

        return gcd(b,a%b);
    }
    public rat add(rat r){

        int x=this.n*r.d+this.d*r.n;
        int y=this.d*r.d;

        return new rat(x,y);


    }
    @Override
    public String toString(){

        return "numenator :"+this.n+" denominator: "+this.d;

    }




}

public class rational {
    public static void main(String[] args) {
        rat r1 =new rat(4,8);
        rat r2=new rat(0,1);
       System.out.println(r1.toString());

    }
}