public class tar {
    static void main(String[] args) {
        int[] a={1,3,6,8};
        int t=3;
        int d=0;
        boolean q=false;
        for (int i=0;i<a.length;i++){
            if(t==a[i]){
                d=i;
                q=true;

                break;
            }
        }
        if (q){
            System.out.println("Target found at index: "+d);
        }


    }
}