import java.util.Iterator;
import java.util.NoSuchElementException;

class polygon implements Cloneable ,Iterable<point>{
    private point[] points;
    private int count;
    public polygon(int cap){
        if (cap<=0) cap=5;
        points =new point[cap];
        count=0;
    }
    public boolean add(int x,int y){
        return add(new point(x, y));

    }
    public boolean add(point p ){
        if(search(p.getX(),p.getY())!=-1) return false;
        if(isfull()) increase();
        points[count++]=p;

        return true;

    }
    public boolean delete(int x, int y){
        if (search(x, y)==-1) return false;
        int a=search(x,y);
        for (int i=a;i<count-1;i++){
            points[i]=points[i+1];
        }
        points[--count]=null;

        return true;
    }
    public int search(int x,int y){
        for (int i=0;i<count;i++){
            if(points[i].getX()==x&&points[i].getY()==y) return i;



        }
        return -1;
    }
    public point get(int index){
        return points[index];
    }
    public void increase(){
        point[] big=new point[points.length*2];
        for (int i=0;i<count;i++){
            big[i]=points[i];
        }
        points=big;

    }
    public boolean isfull(){
        if (count==points.length) return true;
        return false;
    }
@Override
    public Iterator<point> iterator(){
        return new Iterator<point>() {
           int index =0;
           @Override
            public boolean hasNext(){
               if (index<count) return true;
               return false;
           }
           @Override
            public point next(){
               if(!hasNext()) throw new NoSuchElementException();
               return points[index++];
           }
        };


}


}