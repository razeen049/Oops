class player{
    private String name;
    private dice[] Dice;
    private int total;

    public player (String name,int count ,int sides){
        this.name=name;
        this.Dice=new dice[count];

        for (int a=0;a<count;a++){
            this.Dice[a]=new dice(sides);

        }
        this.total=0;

    }

public void roll(){
total=0;
        for (int b=0;b< Dice.length;b++){
            total+=Dice[b].roll();
        }


}

public int getTotal(){
        return this.total;
}

public void rollagain(int index){
        this.total-=Dice[index].getValue();
        this.total+=Dice[index].roll();
}



}