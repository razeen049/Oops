import java.util.Random;

class dice{

    private int value;
    private int sides;
    private Random random =new Random();
    public dice(int sides){
        this.sides=sides;
        this.value=0;

    }
    public int roll(){
        value=random.nextInt(1,sides+1);
        return value;


    }
    public int getSides(){
        return this.sides;
    }

    public int getValue(){
        return this.value;
    }


}