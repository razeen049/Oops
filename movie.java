class movie implements Cloneable{
    private String title;
    private int rating;
    public movie(){
        this.title=null;
        this.rating=0;

    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }
    public movie(String title,int
            rating){
        this.title=title;
        this.rating=rating;
    }

    public movie(movie other){
        this.title=other.title;
        this.rating=other.rating;
    }
    public String getTitle(){
        return this.title;
    }

    public int getRating(){
        return this.rating;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setRating(int rating){
        this.rating=rating;
    }
    public String toString(){
        return "title ="+title+" rating ="+rating;

    }

}