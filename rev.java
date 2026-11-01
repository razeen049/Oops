public class rev {
    static void main(String[] args) {
        int[] a={2,36,5,9};
        int c=a.length-1;
        int b=0;
        while (c>b){
            int t=a[b];
            a[b]=a[c];
            a[c]=t;
            b++;
            c--;

        }
        for (int i:a){
            System.out.print(i+" ");
        }

    }
}