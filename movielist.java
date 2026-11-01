import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

class movielist implements Cloneable, Iterable<movie>{
    private movie[] movies;
    private int count;
    public movielist(int cap){
        movies=new movie[cap];
        count=0;
    }

    public boolean add(String title,int rating){
        if (search(title)!=-1) return false;
        if(isfull()) increase();

        movies[count++]=new movie(title,rating);
        return true;
    }

    public boolean add(movie m ){
        if (m == null) return false;
        if(search(m.getTitle())!=-1){return false;}
        if (isfull()){increase();}
        movies[count++]=m;
        return true;
    }
    public boolean remove(String title){
        int a=search(title);
        if (a==-1) return false;
        for (int i=a;i<count-1;i++){
            movies[i]=movies[i+1];
        }
        movies[--count]=null;
        return true;

    }
    public int search(String title){
        for (int i=0;i<count;i++){
            if(movies[i].getTitle().equals(title)){
                return i;
            }
        }
        return -1;
    }
    public movie get(int index){
        return movies[index];
    }
    public int size(){
        return count;
    }
    public boolean isempty(){
        return count==0;
    }
    public boolean isfull(){
        return count==movies.length;
    }
    public void increase(){
        movie[] extra =new movie[movies.length*2];
        for (int i=0;i<count;i++ ){
            extra[i]=movies[i];
        }
        movies=extra;
    }
    @Override
    public String toString(){
        if (isempty()) return "Empty";
        StringBuilder s=new StringBuilder();
        for (int i=0;i<count;i++){
            s.append(movies[i]).append("\n");
        }
        return s.toString();
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        movielist cloned=(movielist) super.clone();
        cloned.movies=new movie[movies.length];
for (int i=0;i<count;i++){
    cloned.movies[i]=(movie) this.movies[i].clone();
}
return cloned;
    }


    @Override
   public Iterator<movie> iterator(){
        return new Iterator<movie>(){
            private int index=0;
            @Override
            public boolean hasNext(){
                return index<count;
            }
            @Override
            public movie next(){
                if (!hasNext()) throw new NoSuchElementException();
                return (movies[index++]);
            }

        };
    }
}