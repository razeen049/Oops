class rec{
    private int length;
    private int breadth;
    private point topleft;
    private point bottemright;

    public rec(){
        this.length=1;
        this.breadth=1;
        this.topleft=new point(0,0);
        this.bottemright=new point(1,1);

    }
    public rec(int l,int b, point a, point d){
        this.length=l;
        this.breadth=b;
        this.topleft=a;
        this.bottemright=d;

    }
public int getarea()
{
    return this.length*this.breadth;


}
    public int getpar()
    {
        return 2*(this.length*this.breadth);


    }




}